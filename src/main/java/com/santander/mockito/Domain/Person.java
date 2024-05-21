package com.santander.mockito.Domain;

public class Person {

    private final String name;
    private final String cpf;
    private final AdressData adressData;

    public Person(String name, String cpf, AdressData adressData) {
        this.name = name;
        this.cpf = cpf;
        this.adressData = adressData;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public AdressData getAdressData() {
        return adressData;
    }
}


