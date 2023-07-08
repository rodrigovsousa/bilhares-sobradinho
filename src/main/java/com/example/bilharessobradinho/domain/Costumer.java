package com.example.bilharessobradinho.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "costumer")
public class Costumer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @CPF
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Email
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "birthdayDate", nullable = true)
    private String birthdayDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        birthdayDate = birthdayDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Costumer costumer = (Costumer) o;
        return Objects.equals(id, costumer.id) &&
                Objects.equals(name, costumer.name) &&
                Objects.equals(lastName, costumer.lastName) &&
                Objects.equals(cpf, costumer.cpf) &&
                Objects.equals(email, costumer.email) &&
                Objects.equals(login, costumer.login) &&
                Objects.equals(password, costumer.password) &&
                Objects.equals(birthdayDate, costumer.birthdayDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, cpf, email, login, password, birthdayDate);
    }
}
