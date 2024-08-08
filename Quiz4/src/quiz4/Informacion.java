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
public class Informacion {

    private String nombreEstudiante;
    private int curso;
    private String nombreProfesor;
    private double calificacion;
    Estudiantes estudiante[];

    
    public Informacion() {
        this.estudiante = new Estudiantes[3];
    }

    public void solicitarInformacion(){
        for (int i = 0; i < estudiante.length; i++) {
            Estudiantes estudiante = new Estudiantes();
            this.estudiante[i] = estudiante;
        }
    }
    

    public void imprimirDatosEstudiantes() {
        String datos = "";
        for (int i = 0; i < estudiante.length; i++) {
            datos = datos + estudiante[i].getInformacion() + "\n";

        }
        JOptionPane.showMessageDialog(null, "Listado de estudiantes: ");
        JOptionPane.showMessageDialog(null, datos);
    }

    public void estudianteNotaMayor() {
        double calificacionMayor = 0;
        String nombreEstudiante = "";
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getCalificacion() > calificacionMayor) {
                calificacionMayor = estudiante[i].getCalificacion();
                nombreEstudiante = estudiante[i].getNombreEstudiante();

            }
        }
    }

    public void estudianteNotaMenor() {
        double calificacionMenor = 100;
        String nombreEstudiante = "";
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getCalificacion() < calificacionMenor) {
                calificacionMenor = estudiante[i].getCalificacion();
                nombreEstudiante = estudiante[i].getNombreEstudiante();
            }
        }
    }

    double promedio = 0;

    public void promedioCalificaciones() {
        double sumaCalificaciones = 0;
        for (int i = 0; i < estudiante.length; i++) {
            sumaCalificaciones += estudiante[i].getCalificacion();

        }
        promedio = sumaCalificaciones / estudiante.length;
    }

    public void calificacionesPorEncimaDelPromedio() {
        JOptionPane.showMessageDialog(null, "Calificaciones por encima del promedio: ");
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getCalificacion() > promedio) {
                JOptionPane.showMessageDialog(null, "Nombre del estudiante: " + estudiante[i].getNombreEstudiante());
                JOptionPane.showMessageDialog(null, "Calificacion: " + estudiante[i].getCalificacion());
            }
        }
    }

    public void calificacionesPorDebajoDelPromedio() {
        JOptionPane.showMessageDialog(null, "Calificaciones por debajo del promedio: ");
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getCalificacion() < promedio) {
                JOptionPane.showMessageDialog(null, "Nombre del estudiante: " + estudiante[i].getNombreEstudiante());
                JOptionPane.showMessageDialog(null, "Calificacion: " + estudiante[i].getCalificacion());
            }
        }
    }

}
