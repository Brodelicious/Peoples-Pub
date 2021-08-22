package com.TheBrodieBunch.BoozeCtrl.beans;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table
public class Neighborhood{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "city_id")
  private City city;

  public Neighborhood(){
    id = -1;
    name = "";
    city = new City();
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

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Neighborhood that = (Neighborhood) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return city != null ? city.equals(that.city) : that.city == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Neighborhood{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", city=" + city +
            '}';
  }
}
