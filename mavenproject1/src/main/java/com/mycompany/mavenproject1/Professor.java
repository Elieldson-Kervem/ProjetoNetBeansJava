/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Kervem-corp
 */
public class Professor{
    private  String idProfessor;
    private String email;
    private float salarioHora;
    
    public  Professor(String idProfessor,float salarioHora, String email   ){
    
    this.idProfessor=idProfessor;
    this.email=email;
    this.salarioHora=salarioHora;
    
    
    }
    public double calsuloSalarioProfessor(double valor) {
        double total = this.getValorHoraAula() * valor;
        return total;
    }

    public String getNomeProfessor() {
        return idProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.idProfessor = nomeProfessor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValorHoraAula() {
        return salarioHora;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.salarioHora = (float) valorHoraAula;
    }

    
}
