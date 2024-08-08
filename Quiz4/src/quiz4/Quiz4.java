/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz4;

/**
 *
 * @author WChavarria
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacion informacion = new Informacion();
        informacion.solicitarInformacion();
        informacion.imprimirDatosEstudiantes();
        informacion.estudianteNotaMayor();
        informacion.estudianteNotaMenor();
        informacion.promedioCalificaciones();
        informacion.calificacionesPorEncimaDelPromedio();
        informacion.calificacionesPorDebajoDelPromedio();
        
        
    }
    
}
