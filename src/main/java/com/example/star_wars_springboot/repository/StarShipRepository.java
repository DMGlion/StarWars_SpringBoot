package com.example.star_wars_springboot.repository;

import com.example.star_wars_springboot.entities.StarShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StarShipRepository extends JpaRepository<StarShip, Integer>, JpaSpecificationExecutor {
}
