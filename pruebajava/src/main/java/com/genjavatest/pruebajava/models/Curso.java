package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Curso {
    
    public String nombreCurso;
    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    
    public Curso() {
    }

    public Curso(String nombreCurso, ArrayList<Alumno> listaAlumnos) {
        this.nombreCurso = nombreCurso;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Curso [nombreCurso=" + nombreCurso + ", listaAlumnos=" + listaAlumnos + "]";
    }   

}
