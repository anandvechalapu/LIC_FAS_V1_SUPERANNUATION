package com.lic.epgs.policy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policy.entity.NotifyDomainPolicy;
import com.lic.epgs.policy.repository.NotifyDomainPolicyRepository;

@Service
public class NotifyDomainPolicyService {

	@Autowired
	private NotifyDomainPolicyRepository repository;

	public List<NotifyDomainPolicy> getAll() {
		return repository.findAll();
	}

	public Optional<NotifyDomainPolicy> getById(Long id) {
		return repository.findById(id);
	}

	public NotifyDomainPolicy save(NotifyDomainPolicy entity) {
		return repository.save(entity);
	}

	public NotifyDomainPolicy getByRandomInteger(Integer randomInteger) {
		return repository.findByRandomInteger(randomInteger);
	}

	public NotifyDomainPolicy getByTransactionStatus(String transactionStatus) {
		return repository.findByTransactionStatus(transactionStatus);
	}

	public NotifyDomainPolicy getByTransactionMessage(String transactionMessage) {
		return repository.findByTransactionMessage(transactionMessage);
	}

	public NotifyDomainPolicy getByZeroValueDeposit(Boolean zeroValueDeposit) {
		return repository.findByZeroValueDeposit(zeroValueDeposit);
	}

	public NotifyDomainPolicy getByChallanNumber(Long challanNumber) {
		return repository.findByChallanNumber(challanNumber);
	}

	public NotifyDomainPolicy getByCreatedDate(String createdDate) {
		return repository.findByCreatedDate(createdDate);
	}

}