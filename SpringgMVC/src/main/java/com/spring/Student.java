package com.spring;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private String favLnguage;
    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BRA", "Brazil");
        countryOptions.put("UA", "Ukraine");
        countryOptions.put("UK", "Britan");
        countryOptions.put("ARG", "Argentina");
    }

    public String getFavLnguage() {
        return favLnguage;
    }

    public void setFavLnguage(String favLnguage) {
        this.favLnguage = favLnguage;
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
}
