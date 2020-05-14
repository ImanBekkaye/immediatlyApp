package com.immediatlyApp.repositories;

import com.immediatlyApp.models.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Long> {
}
