package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.Monitor;

public interface IMonitorRepository extends JpaRepository<Monitor, Integer>{

}