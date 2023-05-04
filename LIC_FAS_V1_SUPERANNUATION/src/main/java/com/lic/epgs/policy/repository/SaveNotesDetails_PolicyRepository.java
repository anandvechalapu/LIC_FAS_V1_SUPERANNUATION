package com.lic.epgs.policy.repository;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.NotesDetailsPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SaveNotesDetails_PolicyRepository extends JpaRepository<NotesDetailsPolicy, Long> {

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO notes_details_policy (policy_id, notes) VALUES (?1, ?2)", nativeQuery = true)
    PolicyResponseDto savePolicyNotes(Long policyId, String notes);

}