package com.TheBrodieBunch.BoozeCtrl.services;

import com.TheBrodieBunch.BoozeCtrl.beans.Special;
import com.TheBrodieBunch.data.*;

@Service
public class SpecialService{
  private SpecialDAO specialDAO;

  @Autowired
  public SpecialService(SpecialDAO s){
    specialDAO = s;
  }

  // Create
  public Integer add(Special special){
    return special.getId();
  }

  // Read
  public Specaial getById(Integer id){
  }
  
  // Update
  
  // Delete
}
