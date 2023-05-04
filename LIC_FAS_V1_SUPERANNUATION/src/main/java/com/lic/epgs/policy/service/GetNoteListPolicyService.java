package com.lic.epgs.policy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.dtos.NoteDTO;
import com.lic.epgs.policy.repository.GetNoteListPolicyRepository;

@Service
public class GetNoteListPolicyService {
	
	@Autowired
	private GetNoteListPolicyRepository getNoteListPolicyRepository;
	
	public NoteDTO getNoteByPolicyId(Long policyId) {
		return getNoteListPolicyRepository.findByPolicyId(policyId);
	}
	
	public List<NoteDTO> getAllNotesByPolicyId(Long policyId) {
		return getNoteListPolicyRepository.findAllByPolicyId(policyId);
	}

}