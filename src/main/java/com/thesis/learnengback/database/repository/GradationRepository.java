package com.thesis.learnengback.database.repository;

import com.thesis.learnengback.database.entity.Gradation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradationRepository extends JpaRepository<Gradation, Integer> {
}
