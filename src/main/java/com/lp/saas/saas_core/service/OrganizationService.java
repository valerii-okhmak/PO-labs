package com.lp.saas.saas_core.service;

import com.lp.saas.saas_core.dto.OrganizationCreateDTO;
import com.lp.saas.saas_core.exception.ResourceNotFoundException;
import com.lp.saas.saas_core.model.Organization;
import com.lp.saas.saas_core.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository repository;

    @Transactional
    public Organization create(OrganizationCreateDTO dto) {
        Organization org = new Organization();
        org.setName(dto.getName());
        org.setSubscriptionId(dto.getSubscriptionId());
        return repository.save(org);
    }

    @Transactional(readOnly = true)
    public Page<Organization> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Organization getById(Long id) {
        return repository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Організацію не знайдено, ID: " + id));
    }

    @Transactional
    public Organization update(Long id, OrganizationCreateDTO dto) {
        Organization org = getById(id); 
        org.setName(dto.getName());
        org.setSubscriptionId(dto.getSubscriptionId());
        return repository.save(org);
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Організацію не знайдено, ID: " + id);
        }
        repository.deleteById(id);
    }
}
