package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.model.Tasks;
@Component
public interface TasksRepo  extends JpaRepository<Tasks,Integer>{

}
