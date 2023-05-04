//Generated Spring Boot Service class
package com.lic.epgs.claim.service;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.repository.RemoveClaimMembersRepository;
import org.springframework.stereotype.Service;

@Service
public class RemoveClaimMembersService {

    private final RemoveClaimMembersRepository removeClaimMembersRepository;

    public RemoveClaimMembersService(RemoveClaimMembersRepository removeClaimMembersRepository) {
        this.removeClaimMembersRepository = removeClaimMembersRepository;
    }

    public ClaimResponseDto removeClaimMembers(Long batchId) {
        return removeClaimMembersRepository.removeClaimMembers(batchId);
    }
}