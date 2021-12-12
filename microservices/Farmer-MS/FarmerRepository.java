package com.cropdeal.farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdeal.farmer.model.Farmer;

public interface FarmerRepository extends MongoRepository<Farmer,Integer> {

}
