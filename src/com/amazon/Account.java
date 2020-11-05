package com.amazon;

public class Account {
    // Attributes
    String userName;
    String password;
  //  AccountStatus status;
    String name;
    Address shippingAddress;
    String email;
    String phone;


    // Methods
    public Address getShippingAddress(){
        return shippingAddress;
    }

}
