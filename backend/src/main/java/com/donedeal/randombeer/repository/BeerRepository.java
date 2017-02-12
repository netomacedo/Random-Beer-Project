package com.donedeal.randombeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donedeal.randombeer.model.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long>{

}
