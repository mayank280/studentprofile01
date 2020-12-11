package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repositary.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo sr;
	
	@RequestMapping(path = "/save")
	public String dataSave(@RequestBody Student st) {
		sr.save(st);
		return "Data Saved..";
		
	}

}
