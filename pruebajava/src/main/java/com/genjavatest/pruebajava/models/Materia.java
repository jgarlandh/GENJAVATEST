package com.genjavatest.pruebajava.models;

import java.util.ArrayList;

public class Materia {
    
    public String nombreMateria;
    ArrayList<Profesor> listadoProfesores = new ArrayList<Profesor>();
    
    public Materia() {
    }

    public Materia(String nombreMateria, ArrayList<Profesor> listadoProfesores) {
        this.nombreMateria = nombreMateria;
        this.listadoProfesores = listadoProfesores;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public ArrayList<Profesor> getListadoProfesores() {
        return listadoProfesores;
    }

    public void setListadoProfesores(ArrayList<Profesor> listadoProfesores) {
        this.listadoProfesores = listadoProfesores;
    }

    @Override
    public String toString() {
        return "Materia [nombreMateria=" + nombreMateria + ", listadoProfesores=" + listadoProfesores + "]";
    }
}
