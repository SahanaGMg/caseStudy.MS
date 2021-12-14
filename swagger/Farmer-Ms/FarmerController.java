package com.cropdeal.farmer.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdeal.farmer.model.Farmer;
import com.cropdeal.farmer.repository.FarmerRepository;


@RestController 
@RequestMapping(value="/Farmer")
public class FarmerController {
  
  @Autowired 
  private FarmerRepository farmerrepository;
  
  @PostMapping("/addFarmer")
  public String saveFarmer(@RequestBody Farmer farmer ) {
	  farmerrepository.save(farmer);
	  return "Added farmer "+ farmer.getId();
	  
  }
  @GetMapping("/findAllFarmers")
  public List<Farmer> getFarmer(){
	  return farmerrepository.findAll();
	  
  }
  @GetMapping("/findAllFarmers/{id}")
  public Optional<Farmer> getFarmer(@PathVariable int id){
	  return farmerrepository.findById(id);
  }
  @DeleteMapping("/delete/{id}")
  public String deleteFarmer(@PathVariable int id){
	  farmerrepository.deleteById(id);
	  return " Delete farmer "+id;
  }
  
  
  }
 