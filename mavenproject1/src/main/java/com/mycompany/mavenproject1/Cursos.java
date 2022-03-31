/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kervem-corp
 */
public class Cursos {
   

public class Curso {
  private int cargaHoraria;
    private String nomeCurso;
    private String grade;
    private double valorCurso;
    private List<Turma> turma;
    /**
     * Default constructor
         * @param cargaHoraria
         * @param nomeCurso
         * @param grade
         * @param valorCurso
     */
    public Curso(int cargaHoraria, String nomeCurso, String grade, double valorCurso) {
        this.cargaHoraria = cargaHoraria;
        this.turma = new ArrayList<>();
        this.grade = grade;
        this.valorCurso = valorCurso;
        
        this.nomeCurso = nomeCurso;
    }

     public void setConteudo(String grade) {
        this.grade = grade;
    }

    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }
  

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getgrade() {
        return grade;
    }

    public double getValorCurso() {
        return valorCurso;
    }

    public List<Turma> getTurma() {
        return this.turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

   
    
}
}
