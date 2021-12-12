package com.cropdeal.dealer.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdeal.dealer.model.Dealer;
import com.cropdeal.dealer.repository.DealerRepository;


@RestController

@RequestMapping("/dealer") 
public class DealerController {
	

	/*
	 * @RequestMapping("/dealer") public String check() { return
	 * "Hello-World-Dealer"; }
	 */
	 @Autowired 
	  private DealerRepository repository;

	  
	  @PostMapping("/addDealer")
	  public String saveDealer(@RequestBody Dealer dealer ) {
		  repository.save(dealer);
		  return "Added dealer "+ dealer.getId();
		  
	  }
	  @GetMapping(value="/findAllDealers")
	  public List<Dealer> getDealer(){
		  return repository.findAll();
		  
	  }
	  @GetMapping("/findAllDealers/{id}")
	  public Optional<Dealer> getDealer(@PathVariable int id){
		  return repository.findById(id);
	  }
	  @DeleteMapping("/delete/{id}")
	  public String deleteDealer(@PathVariable int id){
		  repository.deleteById(id);
		  return " Delete dealer "+id;
	  }
	  
	  @PutMapping("/updateDealer/{id}")
		public String saveFarmer(@RequestBody Dealer dealer) {
			repository.save(dealer);
			return "dealer updated with id:"+dealer.getId();
		}
		
	  
}
