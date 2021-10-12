package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;

public interface IConcernService {
	public Concern addConcern(Concern c);
	public Concern updateConcern(Concern c);
	public List<Concern> retrieveAllConcerns();
	public List<Concern> retrieveAllConcernsByParent(Parent p);
	public List<Concern> retrieveAllUnResolvedConcerns();
	public List<Concern> retrieveAllUnResolvedConcernsByParent(Parent p);

}
