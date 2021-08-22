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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    City city = (City) o;

    if (id != null ? !id.equals(city.id) : city.id != null) return false;
    return name != null ? name.equals(city.name) : city.name == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "City{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
