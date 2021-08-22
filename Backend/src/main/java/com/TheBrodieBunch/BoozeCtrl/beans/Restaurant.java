package com.TheBrodieBunch.BoozeCtrl.beans;

import javax.persistence.*;

@Entity
@Table
public class Restaurant{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String address;
  @ManyToOne
  @JoinColumn(name = "neighborhood_id")
  private Neighborhood neighborhood;

  public Restaurant(){
    id = -1;
    name = "";
    address = "";
    neighborhood = new Neighborhood();
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Neighborhood getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(Neighborhood neighborhood) {
    this.neighborhood = neighborhood;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Restaurant that = (Restaurant) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (address != null ? !address.equals(that.address) : that.address != null) return false;
    return neighborhood != null ? neighborhood.equals(that.neighborhood) : that.neighborhood == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (neighborhood != null ? neighborhood.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Restaurant{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", neighborhood=" + neighborhood +
            '}';
  }
}
