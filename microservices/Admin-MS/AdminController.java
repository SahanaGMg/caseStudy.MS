package com.cropdeal.admin.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cropdeal.admin.model.Crop;
import com.cropdeal.admin.model.Dealer;
import com.cropdeal.admin.model.Farmer;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	  @Autowired
	  private RestTemplate restTemplate;
	  
	  @RequestMapping("/admin") 
	  public String getDealer() {
		  return "Hello Admin"; 
		  }
	  
	  
	  //------------------------- Farmer----------------//
	  

	  @GetMapping("/getAllFarmers")
	  public List<Farmer> getAllFarmers() { 
		  return Arrays.asList(restTemplate.getForObject("http://localhost:8002/Farmer-MS/Farmer/findAllFarmers", Farmer[].class)); }
	  
	  
	  @PostMapping("/addFarmer")
	  public String addFarmer( @RequestBody Farmer farmer) { 
		  String message=restTemplate.postForObject("http://localhost:8002/Farmer-MS/Farmer/addFarmer",farmer,String.class); 
		  return message;
		  }
	  
	  @DeleteMapping("/deletefarmer/{id}") 
	  public Boolean deleteFarmerById(@PathVariable ("id") int farmerId) {
	  restTemplate.delete("http://localhost:8002/Farmer-MS/Farmer/delete/" + farmerId);
	  return true; }
	  
	 
	  
	  // --------------dealer------------------- //
	  
	  @RequestMapping(value = "/findAllDealer",method = RequestMethod.GET) 
	  public Dealer[] getAllDealer() { 
		  Dealer[] dealer=restTemplate.getForObject("http://localhost:8002/Dealer-MS/dealer/findAllDealers",Dealer[].class );
	      return dealer; 
	  }
	  
	  
	  @PostMapping("/addDealer")
	  public String addDealer( @RequestBody Dealer dealer) { 
		  String message=restTemplate.postForObject("http://localhost:8002/Dealer-MS/dealer/addDealer",dealer,String.class); 
		  return message;
		  }
	  
	  @DeleteMapping("/deleteDealer/{id}") 
	  public Boolean deleteDealerById(@PathVariable ("id") int dealerId) {
	  restTemplate.delete("http://localhost:8002/Dealer-MS/dealer/delete/" +dealerId);
	  return true; }
	  
	  
	  //--------crop-------------------------
	  
	  @PostMapping("/addCrop")
	  public String addCrop( @RequestBody Crop crop) { 
		  String message=restTemplate.postForObject("http://localhost:8002/Crop-MS/crop/addCrop",crop,String.class); 
		  return message;
		  }
	  
	  @RequestMapping(value = "/findAllCrops",method = RequestMethod.GET) 
	  public Crop[] getAllCrops() { 
		  Crop[] crop=restTemplate.getForObject("http://localhost:8002/Crop-MS/crop/findAllCrops",Crop[].class );
		  return crop;
	  }
	  
	  
}
    
    
	  


