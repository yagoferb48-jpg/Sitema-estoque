package com.yago.estoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table (name = "Products")
public class Product {

   @Id 
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private BigDecimal price;
   private Integer quantity;
   private Integer minimumStock;

   public Product(){

   }

   public Long getId(){
      return id;
   }

   public void setId(long id){
      this.id = id;

   }

   public String getName(){
      return name;

   }

   public void setName(String name){
      this.name = name;
   }

   public BigDecimal getPrice(){
      return price;
   }

   public void  setPrice(BigDecimal price){
      this.price = price;
   }

   public Integer getQuantity(){
      return quantity;
   }

   public void setQuantity(Integer quantity){
      this.quantity = quantity;
   }

   public Integer getMinimumStock(){
      return minimumStock;
   }

   public void setMinimumStock(Integer minimumStock){
      this.minimumStock = minimumStock;
   }


}