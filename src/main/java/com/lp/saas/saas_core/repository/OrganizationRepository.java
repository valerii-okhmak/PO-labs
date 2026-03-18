package com.lp.saas.saas_core.repository;

import com.lp.saas.saas_core.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface OrganizationRepository extends JpaRepository<Organization, Long> {}

