package com.santander.mockito.Domain;

public class Person {

    private final String name;
    private final String cpf;
    private final AddressData addressData;

    public Person(String name, String cpf, AddressData addressData) {
        this.name = name;
        this.cpf = cpf;
        this.addressData = addressData;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public AddressData getAddressData() {
        return addressData;
    }
}


