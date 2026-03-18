package com.lp.saas.saas_core.controller;

import com.lp.saas.saas_core.dto.UserCreateDTO;
import com.lp.saas.saas_core.model.User;
import com.lp.saas.saas_core.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid @RequestBody UserCreateDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public Page<User> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @Valid @RequestBody UserCreateDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) 
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}