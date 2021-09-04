package com.TheBrodieBunch.controller;

import com.TheBrodieBunch.beans.*;
import com.TheBrodieBunch.services.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowCredentials="true")
@RequestMapping(path="/specials")
public class SpecialController{
  private SpecialService specialService;

  @Autowired
  public SpecialController(SpecialService s){
    specialService = s;
  }

  @GetMapping
  public ResponseEntity<Set<Special>> getAll(){
    Set<Special> specials = specialService.getAll();
  }

  @GetMapping(path="/{id}")
  public ResponseEntity<Special> getById(@PathVariable("id")){
    Special special = specialService.getById(id);
    if(special != null){
      return ResponseEntity.ok(special);
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<Special> add(@RequestBody Special special){
    Integer id = specialService.add(special);
    return ResponseEntity.created(URI.create("http://localhost:8080/BoozeCtrl/specials/" + id)).build();
  }

  @PutMapping(path="/{id}")
  public ResponseEntity<Void> update(@PathVariable("id") Integer id, @RequestBody Special special){
    if(special != null && id.equals(special.getId())){
      specialService.update(special);
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.badRequest().build();
  }

  @DeleteMapping(path="/{id}")
  public ResponseEntity<Void> delete(@PathVariable("id") Integer id, @RequestBody Special special){
    if(special != null && id.equals(special.getId())){
      specialService.delete(special);
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.badRequest().build();
  }
}
