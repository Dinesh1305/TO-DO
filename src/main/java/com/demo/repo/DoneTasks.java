package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.DoneTask;

public interface DoneTasks extends JpaRepository<DoneTask,Integer> {

}
