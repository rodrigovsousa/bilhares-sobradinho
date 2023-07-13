package com.example.bilharessobradinho.domain;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Business implements Serializable {
    private String name;

    private String cnpj;
    private String endereco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String CNPJ) {
        this.cnpj = cnpj;
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
        if (o == null || getClass() != o.getClass()) return false; Business bussiness = (Business) o;
        return Objects.equals(name, bussiness.name) && Objects.equals(cnpj, bussiness.cnpj)
                && Objects.equals(endereco, bussiness.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cnpj, endereco);
    }
}
