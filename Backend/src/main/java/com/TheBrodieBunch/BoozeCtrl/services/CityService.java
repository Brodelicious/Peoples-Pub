package com.TheBrodieBunch.services;

import com.TheBrodieBunch.beans.City;
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
  public Integer addCity(City city){
    return cityDAO.save(city).getId();
  }
  
  // Read
  public City getById(Integer id){
    return cityDAO.getOne(id);
  }
  
  public Set<City> getAll(){
    List<City> cities = CityDAO.findAll();
  }

  // Update
  public void update(City city){
    if(getById(city.getId()) != null){
      cityDAO.save(city);
    }
  }

  // Delete
  @Transactional


}}
