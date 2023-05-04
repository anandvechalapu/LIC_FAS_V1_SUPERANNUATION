package com.lic.epgs.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.dtos.NoteDTO;
import com.lic.epgs.policy.service.GetNoteListPolicyService;

@RestController
public class GetNoteListPolicyController {

	@Autowired
	private GetNoteListPolicyService getNoteListPolicyService;
	
	@GetMapping("/policy/{policyId}/note")
    public ResponseEntity<NoteDTO> getNoteByPolicyId(@PathVariable Long policyId) {
        NoteDTO noteDTO = getNoteListPolicyService.getNoteByPolicyId(policyId);
        return ResponseEntity.status(HttpStatus.OK).body(noteDTO);
    }
    
    @GetMapping("/policy/{policyId}/notes")
    public ResponseEntity<List<NoteDTO>> getAllNotesByPolicyId(@PathVariable Long policyId) {
        List<NoteDTO> noteDTOList = getNoteListPolicyService.getAllNotesByPolicyId(policyId);
        return ResponseEntity.status(HttpStatus.OK).body(noteDTOList);
    }
}