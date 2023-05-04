package com.lic.epgs.policy.service;

import com.lic.epgs.policy.dto.PolicyResponseDto;
import com.lic.epgs.policy.entity.NotesDetailsPolicy;
import com.lic.epgs.policy.repository.SaveNotesDetails_PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveNotesDetails_PolicyService {
    @Autowired
    SaveNotesDetails_PolicyRepository saveNotesDetails_policyRepository;

    public PolicyResponseDto savePolicyNotes(Long policyId, String notes) {
        NotesDetailsPolicy notesDetailsPolicy = new NotesDetailsPolicy();
        notesDetailsPolicy.setPolicyId(policyId);
        notesDetailsPolicy.setNotes(notes);
        PolicyResponseDto policyResponseDto = saveNotesDetails_policyRepository.savePolicyNotes(policyId, notes);
        return policyResponseDto;
    }
}