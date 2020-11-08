/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda;

/**
 *
 * @author jacQu
 */
public class Alumno implements Comparable<Alumno>{
    int matricula;
    String nombre;

    public Alumno(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Alumno a) {
       if(a.getMatricula()== this.getMatricula()){
           return 0;
       }else if(a.getMatricula()<this.getMatricula()){
           return -1;
       }else{
           return 1;
       }
    }
    
}
