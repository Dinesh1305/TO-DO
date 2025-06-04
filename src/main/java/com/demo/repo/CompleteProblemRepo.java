package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.CompleteProblem;

public interface CompleteProblemRepo extends JpaRepository<CompleteProblem,String> {

}
