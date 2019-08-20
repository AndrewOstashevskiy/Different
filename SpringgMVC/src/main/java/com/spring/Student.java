package com.spring;

import com.spring.validation.PostCode;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.LinkedHashMap;


public class Student {

    @NotNull(message = "Age is required")
    private Long id;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;


    @PostCode(value = "LVV", message = "must start with LVV")
    @NotNull(message = "Is required")
    @Pattern(regexp = "^[A-Z0-9]{7}", message = "only 7 chars/digits")
    private String postalCode;

    private String country;
    private String[] skills;

    private String favLanguage;
    private LinkedHashMap<String, String> countryOptions;


    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BRA", "Brazil");
        countryOptions.put("UA", "Ukraine");
        countryOptions.put("UK", "Britan");
        countryOptions.put("ARG", "Argentina");
    }



    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
