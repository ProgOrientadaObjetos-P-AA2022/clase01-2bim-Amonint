/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("casa");
        Edificio edf2 = new Edificio("2");
        Edificio edf3 = new Edificio("3");
        Edificio edf4 = new Edificio("4");
        /* ----------------------------------------------------- */
        edf1.establecerCostos(10.00);
        edf2.establecerCostos(13.00);
        edf3.establecerCostos(13.00);
        edf4.establecerCostos(13.00);

        /* Array de posiciones  */
       /*  Edificio [] edificios = new Edificio[4];
        edificios[0]= edf1;
        edificios[1]= edf2;
        edificios[2]= edf3;
        edificios[3]= edf4; */
        
        Edificio [] edificio = {edf1,edf2,edf3,edf4};
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("empresa1");
        miempresa.establecerEdificios(edificio);
        miempresa.establecercostoBienesInmuebles();
        /* --------------------------------------------- */
        Vehiculo vec1 = new Vehiculo("casa");
        Vehiculo vec2 = new Vehiculo("2");
        Vehiculo vec3 = new Vehiculo("3");
        Vehiculo vec4 = new Vehiculo("4");
        vec1.establecercostoVehiculos(10.00);
        vec2.establecercostoVehiculos(10.00);
        vec3.establecercostoVehiculos(10.00);
        vec4.establecercostoVehiculos(10.00);

        Vehiculo [] vehiculos = {vec1,vec2,vec3,vec4};
        Vehiculo miVehiculo= new Vehiculos();
        miempresa.establecerNombre("empresa1");
        miempresa.establecerEdificios(edificio);
        miempresa.establecercostoBienesInmuebles();

 


        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
        System.out.printf("%s\n",miempresa);
    }
}
