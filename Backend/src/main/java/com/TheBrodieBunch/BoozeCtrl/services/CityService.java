package com.TheBrodieBunch.services;

import com.TheBrodieBunch.beans.*;
import com.TheBrodieBunch.data.*;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService{
  private CityDAO cityDAO;

  @Autowired
  public CityService(CityDAO c){
    cityDAO = c;
  }

  // Create
  public Integer add(City city){
    return cityDAO.save(city).getId();
  }
  
  // Read
  public City getById(Integer id){
    return cityDAO.getOne(id);
  }
  
  public Set<City> getAll(){
    List<City> list = CityDAO.findAll();
    Set<City> set = new HashSet<>();
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
