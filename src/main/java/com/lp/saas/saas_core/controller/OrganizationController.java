package com.lp.saas.saas_core.controller;

import com.lp.saas.saas_core.dto.*;
import com.lp.saas.saas_core.model.*;
import com.lp.saas.saas_core.service.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    public List<Organization> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Organization getById(@PathVariable Long id) { return service.getById(id); }
}

