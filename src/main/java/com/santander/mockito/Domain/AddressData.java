package com.santander.mockito.Domain;

public class AddressData {

    private final String uf;
    private final String city;

    public AddressData(String uf, String city) {
        this.uf = uf;
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }
}


