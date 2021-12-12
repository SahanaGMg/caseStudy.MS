package com.cropdeal.dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdeal.dealer.model.Dealer;

public interface DealerRepository extends MongoRepository<Dealer,Integer> {

}
