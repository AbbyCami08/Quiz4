/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz4;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Estudiantes {
    //Atributos
    private String nombreEstudiante;
    private int curso;
    private String nombreProfesor;
    private double calificacion;
    
    
    // Constructor
    public Estudiantes() {
        this.nombreEstudiante = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        this.curso = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de curso: "));
        this.nombreProfesor = JOptionPane.showInputDialog("Digite el nombre del profesor: ");
        this.calificacion = Double.parseDouble(JOptionPane.showInputDialog("Digite la calificacion obtenida de este estudiante: "));
        
    }
    
    //Getters

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getCurso() {
        return curso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public double getCalificacion() {
        return calificacion;
    }
    
    //Setters

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public String getInformacion() {
        String infoProducto = "Nombre del estudiante: " + this.nombreEstudiante + "\n" +
                "Curso: " + this.curso + "\n" +
                "Nombre del profesor: " + this.nombreProfesor + "\n" +
                "Calificacion: " + this.calificacion + "\n";
        
        return infoProducto;
        
                
                
    }
    
}
