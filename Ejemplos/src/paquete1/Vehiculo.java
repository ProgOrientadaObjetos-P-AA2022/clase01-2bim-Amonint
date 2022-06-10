package paquete1;

public class Vehiculo {
    private String nombre;
    private Vehiculo [] vehiculos;
    private double costoVehiculos;
    public Vehiculo(String string) {
    }

    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerVehiculos(Vehiculo[] m){
        vehiculos = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public void establecercostoVehiculos(double d){
       double suma = 0;
       for(int i=0;i<obtenerVehiculos().length;i++){
        suma= suma + obtenerVehiculos()[i].obtenercostoVehiculos(); 
       }
       costoVehiculos= suma;

        
    }
    public double obtenercostoVehiculos(){
        return costoVehiculos;
    }
    @Override
    public String toString(){
        /* String reporte= String.format("%s, (%2f)",obtenerNombre(),obtenerCosto()); */
        String reporte= String.format("%s\n Lista de Edificios\n",nombre,vehiculos);
        
        for(int i=0;i<obtenerVehiculos().length;i++){
            reporte= String.format("%s%d. %s(%1f)\n", reporte, i+1,obtenerVehiculos()[i].obtenerNombre().toUpperCase(),
            obtenerVehiculos()[i].obtenercostoVehiculos());
        }
        reporte= String.format("%s Total de inmuebles: %.2f\n", reporte, obtenercostoVehiculos());
        return reporte;
    }
}
