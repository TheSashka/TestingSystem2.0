package com.aleksandr.backend.repository;

import com.aleksandr.backend.model.VariantOfAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantOfAnswerRepository extends JpaRepository<VariantOfAnswer, Long> {
    VariantOfAnswer findById(Long id);
}
