package com.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Sender;

public interface SenderRepo extends JpaRepository<Sender, Integer>{

}
