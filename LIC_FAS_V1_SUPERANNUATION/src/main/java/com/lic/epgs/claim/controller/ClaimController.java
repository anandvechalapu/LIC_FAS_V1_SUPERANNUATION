package com.lic.epgs.claim.controller;

import com.lic.epgs.claim.dto.ClaimResponseDto;
import com.lic.epgs.claim.model.ClaimBatch;
import com.lic.epgs.claim.model.TempClaim;
import com.lic.epgs.claim.model.TempClaimMbr;
import com.lic.epgs.claim.model.TempClaimOnboarding;
import com.lic.epgs.claim.service.RemoveClaimMembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private RemoveClaimMembersService removeClaimMembersService;

    @PostMapping("/remove")
    public ClaimResponseDto removeClaimMembers(@RequestBody ClaimBatch claimBatch) {
        return removeClaimMembersService.removeClaimMembers(claimBatch.getId());
    }

    @GetMapping("/temp/claim")
    public TempClaim getTempClaim(@RequestParam Long batchId) {
        return new TempClaim(batchId);
    }

    @GetMapping("/temp/claim/onboarding")
    public TempClaimOnboarding getTempClaimOnboarding(@RequestParam Long batchId) {
        return new TempClaimOnboarding(batchId);
    }

    @GetMapping("/temp/claim/mbr")
    public TempClaimMbr getTempClaimMbr(@RequestParam Long batchId) {
        return new TempClaimMbr(batchId);
    }
}