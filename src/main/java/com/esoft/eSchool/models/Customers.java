package com.esoft.eSchool.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Customers")
public class Customers{
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "custid")
 private int customerId;
 
 @Column(name = "custName", length=10)
 private String customerName;
 
 public int getCustomerId() {
 return customerId;
 }
 
 public void setCustomerId(int customerId) {
 this.customerId = customerId;
 }
 
 public String getCustomerName() {
 return customerName;
 }
 
 public void setCustomerName(String customerName) {
 this.customerName = customerName;
 }
 
}
