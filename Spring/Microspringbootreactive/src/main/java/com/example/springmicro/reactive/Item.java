package com.example.springmicro.reactive;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Item {

  //write your code here
  String id;
  String name;
  String description;
  Double price;

  public Item() {

  }
     Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    Item ( String id, String name, String description, Double price) {
      super();
      this.id = id;
      this.name= name;
      this.description = description;
      this.price = price;
  }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
            Objects.equals(id, item.id) &&
            Objects.equals(name, item.name) &&
            Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    @Override
    public String toString() {
        return "Item{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            '}';
    }

}
