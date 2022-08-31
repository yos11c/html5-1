/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class AlumnoController {
     ClienteModel[] tablaALumno;
    int indiceArray;
    
    public AlumnoController(){
        this.tablaALumno = new  ClienteModel[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno( ClienteModel cliente){
        this.tablaALumno[this.indiceArray]=cliente;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public  ClienteModel[] getAlumnos(){
        return this.tablaALumno;
    }
}
