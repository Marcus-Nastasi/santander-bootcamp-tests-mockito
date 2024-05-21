package com.santander.mockito.Domain;

public class AdressData {

    private final String uf;
    private final String city;
    private final String logradouro;
    private final String complement;
    private final String bairro;

    public AdressData(String uf, String city, String logradouro, String complement, String bairro) {
        this.uf = uf;
        this.city = city;
        this.logradouro = logradouro;
        this.complement = complement;
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplement() {
        return complement;
    }

    public String getBairro() {
        return bairro;
    }
}


