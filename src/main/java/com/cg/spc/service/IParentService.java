package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;


public interface IParentService {
	public Parent addParent(Parent p);
	public Parent updateParent(Parent p);
	public List<Parent> retrieveParentListByClass(ClassId cid);
	public Parent retrieveParentByStudent(Student s);
	public Parent retrieveParentById(int i);

}
