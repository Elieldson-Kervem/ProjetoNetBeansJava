/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Kervem-corp
 */

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
//crindo turma
public class Turma {
      private String nomeTurma;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private final List<Professor> professor;

    /**
     * Default constructor
     * @param nomeTurma
     * @param dataInicio
     * @param dataTermino
     */
    public Turma(String nomeTurma,LocalDate dataInicio, LocalDate dataTermino) {    
        this.nomeTurma = nomeTurma;
       
        this.professor = new ArrayList<>();
         this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    

    public List<Professor> getProfessor() {
        return this.professor;
    }
    
}