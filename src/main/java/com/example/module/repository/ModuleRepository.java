package com.example.module.repository;

import com.example.module.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ModuleRepository extends JpaRepository<Module, Integer> {

    void deleteById(Long id);

    Optional<Module> findById(Long id);
}
