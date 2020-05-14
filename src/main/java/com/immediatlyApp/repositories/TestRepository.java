package com.immediatlyApp.repositories;

import com.immediatlyApp.models.proba.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
