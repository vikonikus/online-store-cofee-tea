package ru.store.online.model;

import ru.store.online.model.enumeration.Country;
import ru.store.online.model.enumeration.Manufactorer;
import ru.store.online.model.enumeration.Package;

import java.math.BigDecimal;

public abstract class Drink {

  private String name;
  private BigDecimal price;
  private Float weight;
  private Manufactorer manufactorer;
  private Country country;
  private Package aPackage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public Manufactorer getManufactorer() {
    return manufactorer;
  }

  public void setManufactorer(Manufactorer manufactorer) {
    this.manufactorer = manufactorer;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Package getaPackage() {
    return aPackage;
  }

  public void setaPackage(Package aPackage) {
    this.aPackage = aPackage;
  }
}
