package com.cg.spc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;
import com.cg.spc.service.IConcernService;

@RestController
@RequestMapping("api/concern")
public class ConcernController {
	@Autowired
	private IConcernService concernService;
	
	public ConcernController(IConcernService concernService) {
		super();
		this.concernService = concernService;
	}

	@PostMapping("/addconcern")
	public Concern addConcern(@RequestBody Concern c) {
		return concernService.addConcern(c);
	}
	
	@PostMapping("/updateconcern")
	public Concern updateConcern(@RequestBody Concern c) {
		return concernService.updateConcern(c);
	}
	
	@GetMapping("/retrieveallconcerns")
	public List<Concern> retrieveAllConcerns(){
		return concernService.retrieveAllConcerns();
	}
	
	@PostMapping("/retrieveallconcernsbyparent")
	public List<Concern> retrieveAllConcernsByParent(@RequestBody Parent p){
		return concernService.retrieveAllConcernsByParent(p);
	}
	
	@GetMapping("/retrieveallunresolvedconcerns")
	public List<Concern> retrieveAllUnResolvedConcerns(){
		return concernService.retrieveAllUnResolvedConcerns();
	}
	
	@PostMapping("/retrieveallunresolvedconcernsbyparent")
	public List<Concern> retrieveAllUnResolvedConcernsByParent(@RequestBody Parent p){
		return concernService.retrieveAllUnResolvedConcernsByParent(p);
	}

}
