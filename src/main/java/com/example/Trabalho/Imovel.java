package com.example.Trabalho;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "imoveis")
public class Imovel {

    @Id
    private String id;
    private String endereco;
    private String tipo_imovel;
    private double area;
    private double preco;

    // getters
    public String getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipoImovel() {
        return tipo_imovel;
    }

    public double getArea() {
        return area;
    }

    public double getPreco() {
        return preco;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipoImovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
