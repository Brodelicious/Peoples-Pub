package com.TheBrodieBunch.BoozeCtrl.beans;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table
public class City{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String name;

  public City(){
    id = -1;
    name = "";
  }
}
