package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Profesor extends Persona{
    
    public String materia;
    ArrayList<Curso> listadoCursos = new ArrayList<Curso>();
    
    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, String materia, ArrayList<Curso> listadoCursos) {
        super(nombre, apellido);
        this.materia = materia;
        this.listadoCursos = listadoCursos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public ArrayList<Curso> getListadoCursos() {
        return listadoCursos;
    }

    public void setListadoCursos(ArrayList<Curso> listadoCursos) {
        this.listadoCursos = listadoCursos;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [materia=" + materia + ", listadoCursos=" + listadoCursos + "]";
    }

    

    
    

}
