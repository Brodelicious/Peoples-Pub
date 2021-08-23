package com.TheBrodieBunch.services;

import com.TheBrodieBunch.beans.*;
import com.TheBrodieBunch.data.*;

import java.util.*;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialService{
  private SpecialDAO specialDAO;

  @Autowired
  public SpecialService(SpecialDAO s){
    specialDAO = s;
  }

  // Create
  public Integer add(Special special){
    return specialDAO.save(special).getId();
  }
  
  // Read
  public Special getById(Integer id){
    return specialDAO.getOne(id);
  }
  
  public Set<Special> getAll(){
    List<Special> list = SpecialDAO.findAll();
    Set<Special> set = new HashSet<>();
    set.addAll(list);
    return set;
  }

  // Update
  public void update(City city){
    if(getById(city.getId()) != null){
      cityDAO.save(city);
    }
  }

  // Delete
  public void delete(Cite city){
    cityDAO.delete(city);
  }


}}

