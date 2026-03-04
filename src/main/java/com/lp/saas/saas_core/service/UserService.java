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
public class UserService {
    private final UserRepository repository;

    public User create(UserCreateDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setOrganizationId(dto.getOrganizationId());
        user.setRoleId(dto.getRoleId());
        return repository.save(user);
    }

    public List<User> getAll() { return repository.findAll(); }
    
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("User not found: " + id));
    }
}