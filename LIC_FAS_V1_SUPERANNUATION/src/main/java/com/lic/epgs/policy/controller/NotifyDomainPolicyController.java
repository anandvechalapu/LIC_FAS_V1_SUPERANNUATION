package com.lic.epgs.policy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policy.entity.NotifyDomainPolicy;
import com.lic.epgs.policy.service.NotifyDomainPolicyService;

@RestController
@RequestMapping("/notifydomainpolicy")
public class NotifyDomainPolicyController {

	@Autowired
	private NotifyDomainPolicyService service;

	@GetMapping
	public List<NotifyDomainPolicy> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Optional<NotifyDomainPolicy> getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@PostMapping
	public NotifyDomainPolicy save(@RequestBody NotifyDomainPolicy entity) {
		return service.save(entity);
	}

	@PutMapping
	public NotifyDomainPolicy update(@RequestBody NotifyDomainPolicy entity) {
		return service.save(entity);
	}

	@GetMapping("/randominteger/{randomInteger}")
	public NotifyDomainPolicy getByRandomInteger(@PathVariable Integer randomInteger) {
		return service.getByRandomInteger(randomInteger);
	}

	@GetMapping("/transactionstatus/{transactionStatus}")
	public NotifyDomainPolicy getByTransactionStatus(@PathVariable String transactionStatus) {
		return service.getByTransactionStatus(transactionStatus);
	}

	@GetMapping("/transactionmessage/{transactionMessage}")
	public NotifyDomainPolicy getByTransactionMessage(@PathVariable String transactionMessage) {
		return service.getByTransactionMessage(transactionMessage);
	}

	@GetMapping("/zerovaluedeposit/{zeroValueDeposit}")
	public NotifyDomainPolicy getByZeroValueDeposit(@PathVariable Boolean zeroValueDeposit) {
		return service.getByZeroValueDeposit(zeroValueDeposit);
	}

	@GetMapping("/challannumber/{challanNumber}")
	public NotifyDomainPolicy getByChallanNumber(@PathVariable Long challanNumber) {
		return service.getByChallanNumber(challanNumber);
	}

	@GetMapping("/createddate/{createdDate}")
	public NotifyDomainPolicy getByCreatedDate(@PathVariable String createdDate) {
		return service.getByCreatedDate(createdDate);
	}

}