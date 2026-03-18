package com.lp.saas.saas_core.controller;

import com.lp.saas.saas_core.dto.*;
import com.lp.saas.saas_core.model.*;
import com.lp.saas.saas_core.service.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@RestController
@RequestMapping("/api/v1/organizations")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Organization create(@Valid @RequestBody OrganizationCreateDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public Page<Organization> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @GetMapping("/{id}")
    public Organization getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Organization update(@PathVariable Long id, @Valid @RequestBody OrganizationCreateDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) 
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}