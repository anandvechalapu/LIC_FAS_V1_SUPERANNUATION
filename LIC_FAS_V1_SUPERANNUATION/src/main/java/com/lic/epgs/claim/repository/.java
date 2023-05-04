@Repository
package com.lic.epgs.claim.repository;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.entity.ClaimBatchEntity;
import com.lic.epgs.claim.entity.TempClaimEntity;
import com.lic.epgs.claim.entity.TempClaimMbrEntity;
import com.lic.epgs.claim.entity.TempClaimOnboardingEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RemoveClaimMembersRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public ClaimResponseDto removeClaimMembers(Long batchId) {

        ClaimResponseDto responseDto = new ClaimResponseDto();
        try {
            //get ClaimBatchEntity
            ClaimBatchEntity claimBatchEntity = entityManager.find(ClaimBatchEntity.class, batchId);
            if (claimBatchEntity != null) {
                //set isActive field to false
                claimBatchEntity.setIsActive(false);
                entityManager.persist(claimBatchEntity);

                //get TempClaimEntity
                Query query = entityManager.createQuery("SELECT t FROM TempClaimEntity t WHERE t.batchId = :batchId");
                query.setParameter("batchId", batchId);
                List<TempClaimEntity> tempClaimEntityList = query.getResultList();

                if (tempClaimEntityList.size() > 0) {
                    //set isActive field of all associated TempClaimEntity objects to false
                    tempClaimEntityList.forEach(tempClaimEntity -> {
                        tempClaimEntity.setIsActive(false);
                        entityManager.persist(tempClaimEntity);
                    });

                    //get TempClaimOnboardingEntity
                    List<TempClaimOnboardingEntity> tempClaimOnboardingEntityList = entityManager.createQuery("SELECT t FROM TempClaimOnboardingEntity t WHERE t.batchId = :batchId").setParameter("batchId", batchId).getResultList();

                    //get TempClaimMbrEntity
                    List<TempClaimMbrEntity> tempClaimMbrEntityList = entityManager.createQuery("SELECT t FROM TempClaimMbrEntity t WHERE t.batchId = :batchId").setParameter("batchId", batchId).getResultList();

                    if (tempClaimOnboardingEntityList.size() > 0) {
                        //set isActive field of all associated TempClaimOnboardingEntity objects to false
                        tempClaimOnboardingEntityList.forEach(tempClaimOnboardingEntity -> {
                            tempClaimOnboardingEntity.setIsActive(false);
                            entityManager.persist(tempClaimOnboardingEntity);
                        });
                    }

                    if (tempClaimMbrEntityList.size() > 0) {
                        //set isActive field of all associated TempClaimMbrEntity objects to false
                        tempClaimMbrEntityList.forEach(tempClaimMbrEntity -> {
                            tempClaimMbrEntity.setIsActive(false);
                            entityManager.persist(tempClaimMbrEntity);
                        });
                    }
                    responseDto.setMessage(batchId + " is Deleted Successfully!!");
                } else {
                    responseDto.setMessage("Claims Not Found against " + batchId);
                }
            } else {
                responseDto.setMessage("Batch Not Found");
            }
        } catch (Exception ex) {
            responseDto.setMessage("Exception " + ex.getMessage());
            ex.printStackTrace();
        }
        return responseDto;
    }

}