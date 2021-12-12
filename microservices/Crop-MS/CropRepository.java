package com.cropdeal.crops.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdeal.crops.model.Crop;

public interface CropRepository extends MongoRepository<Crop,Integer> {

}
