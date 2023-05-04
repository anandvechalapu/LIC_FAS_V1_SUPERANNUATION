package com.lic.epgs.common.controller;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.common.model.CommonClaimAnuityCreationOptions;
import com.lic.epgs.common.service.CommonClaimAnuityCreationOptionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common/claim-anuity-creation-options")
public class CommonClaimAnuityCreationOptionsController {

    @Autowired
    private CommonClaimAnuityCreationOptionsService commonClaimAnuityCreationOptionsService;

    @GetMapping
    public ResponseEntity<List<CommonClaimAnuityCreationOptions>> findAllByStatusTrue() {
        List<CommonClaimAnuityCreationOptions> list = commonClaimAnuityCreationOptionsService.findAllByStatusTrue();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonClaimAnuityCreationOptions> findByIdAndStatusTrue(@PathVariable Long id) {
        Optional<CommonClaimAnuityCreationOptions> optional = commonClaimAnuityCreationOptionsService.findByIdAndStatusTrue(id);
        if (!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(optional.get());
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<CommonClaimAnuityCreationOptions> findByCodeAndStatusTrue(@PathVariable String code) {
        Optional<CommonClaimAnuityCreationOptions> optional = commonClaimAnuityCreationOptionsService.findByCodeAndStatusTrue(code);
        if (!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(optional.get());
    }

    @GetMapping("/description/{description}")
    public ResponseEntity<CommonClaimAnuityCreationOptions> findByDescriptionAndStatusTrue(@PathVariable String description) {
        Optional<CommonClaimAnuityCreationOptions> optional = commonClaimAnuityCreationOptionsService.findByDescriptionAndStatusTrue(description);
        if (!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(optional.get());
    }

    @GetMapping("/mandatory/{isMandatory}")
    public ResponseEntity<CommonClaimAnuityCreationOptions> findByIsMandatoryAndStatusTrue(@PathVariable Boolean isMandatory) {
        Optional<CommonClaimAnuityCreationOptions> optional = commonClaimAnuityCreationOptionsService.findByIsMandatoryAndStatusTrue(isMandatory);
        if (!optional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(optional.get());
    }

}