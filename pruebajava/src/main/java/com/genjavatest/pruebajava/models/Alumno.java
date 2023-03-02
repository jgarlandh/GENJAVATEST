package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Alumno extends Persona{
    
    ArrayList<Curso> cursoAlumno = new ArrayList<Curso>();
    ArrayList<Double> notas = new ArrayList<Double>();
    
    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, ArrayList<Curso> cursoAlumno, ArrayList<Double> notas) {
        super(nombre, apellido);
        this.cursoAlumno = cursoAlumno;
        this.notas = notas;
    }

    public ArrayList<Curso> getCursoAlumno() {
        return cursoAlumno;
    }

    public void setCursoAlumno(ArrayList<Curso> cursoAlumno) {
        this.cursoAlumno = cursoAlumno;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [cursoAlumno=" + cursoAlumno + ", notas=" + notas + "]";
    }
}
