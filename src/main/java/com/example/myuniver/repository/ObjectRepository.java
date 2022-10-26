package com.example.myuniver.repository;

import com.example.myuniver.model.Objects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends JpaRepository<Objects, Long>, JpaSpecificationExecutor<Objects> {
}
