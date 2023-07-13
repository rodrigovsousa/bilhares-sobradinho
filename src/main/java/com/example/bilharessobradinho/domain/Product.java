package com.example.bilharessobradinho.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product")

public class Product implements Serializable {

    private String serial_Number;
    private String type;
    private String name;
    private String amount;

    public String getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(String serial_Number) {
        Serial_Number = serial_Number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getSerial_Number().equals(product.getSerial_Number()) &&
               getType().equals(product.getType()) && getName().equals(product.getName()) &&
               getAmount().equals(product.getAmount());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerial_Number(), getType(), getName(), getAmount());
    }
}

