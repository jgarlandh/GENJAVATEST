package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Alumno extends Persona{
    
    public String curso;
    ArrayList<Double> notas = new ArrayList<Double>();
    
    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, String curso, ArrayList<Double> notas) {
        super(nombre, apellido);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [curso=" + curso + ", notas=" + notas + "]";
    }
}
