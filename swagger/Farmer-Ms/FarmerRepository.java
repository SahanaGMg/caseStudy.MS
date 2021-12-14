package com.cropdeal.farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cropdeal.farmer.model.Farmer;
@Repository
public interface FarmerRepository extends MongoRepository<Farmer,Integer> {

}
