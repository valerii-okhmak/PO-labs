package com.lp.saas.saas_core.service;

import com.lp.saas.saas_core.dto.*;
import com.lp.saas.saas_core.exception.ResourceNotFoundException;
import com.lp.saas.saas_core.model.*;
import com.lp.saas.saas_core.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository repository;

    public Organization create(OrganizationCreateDTO dto) {
        Organization org = new Organization();
        org.setName(dto.getName());
        org.setSubscriptionId(dto.getSubscriptionId());
        return repository.save(org);
    }

    public List<Organization> getAll() { return repository.findAll(); }
    
    public Organization getById(Long id) {
        return repository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Organization not found: " + id));
    }
}
