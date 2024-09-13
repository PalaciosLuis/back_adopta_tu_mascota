package com.example.demo.request;


public class LoginRequest {

    private String tipo; // Puede ser DNI, DXE o CNI
    private String valor; // El valor ingresado para el tipo seleccionado
    private String password;

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


