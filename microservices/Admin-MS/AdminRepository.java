package com.cropdeal.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cropdeal.admin.model.Admin;
@Repository
public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
