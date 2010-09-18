package com.gardin.piazza.domain;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Represents a user that can have several roles: admin, author, reviewer,
 * meta-reviewer, chairman.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name="user")
public final class User {

    private int id;

    private String firstName;

    private String surname;

    private String email;

    private String password;

    private String institution;

    private String country;

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getID() {
        return id;
    }

    public String getInstitution() {
        return institution;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
