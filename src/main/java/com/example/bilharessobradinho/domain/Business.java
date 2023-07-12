package com.example.bilharessobradinho.domain;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;

@Entity

public class Business implements Serializable {
    private String name;
    private String CNPJ;
    private String endereco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bussiness bussiness = (Bussiness) o;
        return Objects.equals(name, bussiness.name) && Objects.equals(CNPJ, bussiness.CNPJ)
                && Objects.equals(endereco, bussiness.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, CNPJ, endereco);
    }
}
