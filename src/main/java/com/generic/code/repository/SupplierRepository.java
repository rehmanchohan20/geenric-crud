package com.generic.code.repository;

import com.generic.code.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="suppliers")
public interface SupplierRepository extends JpaRepository<Supplier, Long> {}