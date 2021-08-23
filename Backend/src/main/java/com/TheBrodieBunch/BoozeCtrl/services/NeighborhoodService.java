package com.TheBrodieBunch.services;

import com.TheBrodieBunch.beans.*;
import com.TheBrodieBunch.data.*;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeighborhoodService{
  private NeighborhoodDAO neighborhoodDAO;

  @Autowired
  public NeighborhoodService(NeighborhoodDAO n){
    neighborhoodDAO = n;
  }

  // Create
  public Integer add(Neighborhood neighborhood){
    return neighborhoodDAO.save(neighborhood).getId();
  }
  
  // Read
  public Neighborhood getById(Integer id){
    return neighborhoodDAO.getOne(id);
  }
  
  public Set<Neighborhood> getAll(){
    List<Neighborhood> list = neighborhoodDAO.findAll();
    Set<Neighborhood> set = new HashSet<>();
    set.addAll(list);
    return set;
  }

  // Update
  public void update(Neighborhood neighborhood){
    if(getById(neighborhood.getId()) != null){
      neighborhoodDAO.save(neighborhood);
    }
  }

  // Delete
  public void delete(Neighborhood neighborhood){
    neighborhoodDAO.delete(neighborhood);
  }


}}

