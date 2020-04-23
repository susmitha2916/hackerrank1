package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class Userdao {
	List<User> list = null;
	   public List<User> getAllUsers(){
		   list = new ArrayList<User>();
		   list.add(new User(11, "Anil", 33));
		   list.add(new User(12, "Banu", 31));
		   list.add(new User(13, "Murali", 23));
		   
		   return list;
	   }
}
