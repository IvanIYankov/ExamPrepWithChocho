package com.example.examprepwithchocho.repository;

import com.example.examprepwithchocho.model.entity.Category;
import com.example.examprepwithchocho.model.entity.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(CategoryNameEnum categoryNameEnum);
}
