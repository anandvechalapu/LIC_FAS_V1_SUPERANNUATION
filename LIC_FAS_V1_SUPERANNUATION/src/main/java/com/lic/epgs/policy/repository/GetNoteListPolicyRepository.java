package com.lic.epgs.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.dtos.NoteDTO;

@Repository
public interface GetNoteListPolicyRepository extends JpaRepository<NoteDTO, Long> {
	
    NoteDTO findByPolicyId(Long policyId);
    
    List<NoteDTO> findAllByPolicyId(Long policyId);

}