package com.TheBrodieBunch.BoozeCtrl.beans;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table
public class Special{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private Integer price;
  @ManyToOne
  @JoinColumn(name = "restaurant_id")
  private Restaurant restaurant;
  private Integer[] daysOffered = {0, 0, 0, 0, 0, 0, 0};
  private String starts;
  private String ends;

  public Special(){
    id = -1;
    name = "";
    price = 0;
    restaurant = new Restaurant();
    starts = "";
    ends = "";
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

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Restaurant getRestaurant() {
    return restaurant;
  }

  public void setRestaurant(Restaurant restaurant) {
    this.restaurant = restaurant;
  }

  public Integer[] getDaysOffered() {
    return daysOffered;
  }

  public void setDaysOffered(Integer[] daysOffered) {
    this.daysOffered = daysOffered;
  }

  public String getStarts() {
    return starts;
  }

  public void setStarts(String starts) {
    this.starts = starts;
  }

  public String getEnds() {
    return ends;
  }

  public void setEnds(String ends) {
    this.ends = ends;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Special special = (Special) o;

    if (id != null ? !id.equals(special.id) : special.id != null) return false;
    if (name != null ? !name.equals(special.name) : special.name != null) return false;
    if (price != null ? !price.equals(special.price) : special.price != null) return false;
    if (restaurant != null ? !restaurant.equals(special.restaurant) : special.restaurant != null) return false;
    // Probably incorrect - comparing Object[] arrays with Arrays.equals
    if (!Arrays.equals(daysOffered, special.daysOffered)) return false;
    if (starts != null ? !starts.equals(special.starts) : special.starts != null) return false;
    return ends != null ? ends.equals(special.ends) : special.ends == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (price != null ? price.hashCode() : 0);
    result = 31 * result + (restaurant != null ? restaurant.hashCode() : 0);
    result = 31 * result + Arrays.hashCode(daysOffered);
    result = 31 * result + (starts != null ? starts.hashCode() : 0);
    result = 31 * result + (ends != null ? ends.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Special{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", restaurant=" + restaurant +
            ", daysOffered=" + Arrays.toString(daysOffered) +
            ", starts='" + starts + '\'' +
            ", ends='" + ends + '\'' +
            '}';
  }
}
