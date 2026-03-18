package com.lp.saas.saas_core.service;

import com.lp.saas.saas_core.dto.*;
import com.lp.saas.saas_core.exception.ResourceNotFoundException;
import com.lp.saas.saas_core.model.*;
import com.lp.saas.saas_core.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    @Transactional
    public User create(UserCreateDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setOrganizationId(dto.getOrganizationId());
        user.setRoleId(dto.getRoleId());
        return repository.save(user);
    }

    @Transactional(readOnly = true)
    public Page<User> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Користувача не знайдено, ID: " + id));
    }

    @Transactional
    public User update(Long id, UserCreateDTO dto) {
        User user = getById(id); 
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setOrganizationId(dto.getOrganizationId());
        user.setRoleId(dto.getRoleId());
        return repository.save(user); 
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Користувача не знайдено, ID: " + id);
        }
        repository.deleteById(id);
    }
}