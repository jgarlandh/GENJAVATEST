package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Profesor extends Persona{
    
    public String materia;
    ArrayList<String> curso = new ArrayList<String>();
    
    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, String materia, ArrayList<String> curso) {
        super(nombre, apellido);
        this.materia = materia;
        this.curso = curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [materia=" + materia + ", curso=" + curso + "]";
    }

    
    

}
