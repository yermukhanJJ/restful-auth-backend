package com.example.myuniver.repository;

import com.example.myuniver.model.Estimate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimateRepository extends JpaRepository<Estimate, Long>, JpaSpecificationExecutor<Estimate> {
}
