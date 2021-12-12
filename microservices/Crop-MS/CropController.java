package com.cropdeal.crops.resources;

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

import com.cropdeal.crops.model.Crop;
import com.cropdeal.crops.repository.CropRepository;



@RestController
@RequestMapping("/crop")
public class CropController {

	
	 @Autowired 
	  private CropRepository repository;
	  
	  @PostMapping("/addCrop")
	  public String saveCrop(@RequestBody Crop crop ) {
		  repository.save(crop);
		  return "Added crop "+ crop.getId();
		  
	  }
	  @GetMapping("findAllCrops")
	  public List<Crop> getCrop(){
		  return repository.findAll();
		  
	  }
	  @GetMapping("/findAllCrops/{id}")
	  public Optional<Crop> getCrop(@PathVariable int id){
		  return repository.findById(id);
	  }
	  @DeleteMapping("/delete/{id}")
	  public String deleteCrop(@PathVariable int id){
		  repository.deleteById(id);
		  return " Delete crop "+id;
	  }
	  
	  

}
