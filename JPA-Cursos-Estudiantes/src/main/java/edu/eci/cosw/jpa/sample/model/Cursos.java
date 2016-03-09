package edu.eci.cosw.jpa.sample.model;
// Generated Mar 9, 2016 7:01:57 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cursos generated by hbm2java
 */
public class Cursos  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String nemonico;
     private Set estudianteses = new HashSet(0);

    public Cursos() {
    }

	
    public Cursos(int id, String nombre, String nemonico) {
        this.id = id;
        this.nombre = nombre;
        this.nemonico = nemonico;
    }
    public Cursos(int id, String nombre, String nemonico, Set estudianteses) {
       this.id = id;
       this.nombre = nombre;
       this.nemonico = nemonico;
       this.estudianteses = estudianteses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNemonico() {
        return this.nemonico;
    }
    
    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }
    public Set getEstudianteses() {
        return this.estudianteses;
    }
    
    public void setEstudianteses(Set estudianteses) {
        this.estudianteses = estudianteses;
    }




}

