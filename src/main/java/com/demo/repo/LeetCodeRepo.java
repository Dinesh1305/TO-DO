package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Leetcode;

public interface LeetCodeRepo extends JpaRepository<Leetcode,String> {
void deleteByName(String name);
}
