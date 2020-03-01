package com.ahriknow.blog.dao;

import com.ahriknow.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryDao extends JpaRepository<Category, String>, JpaSpecificationExecutor<Category> {
}
