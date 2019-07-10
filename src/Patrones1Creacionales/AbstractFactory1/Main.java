package Patrones1Creacionales.AbstractFactory1;

import java.util.Scanner;

/**
 * @author Genarogg
 * 
 * El patrón Abstract Factory nos permite crear, mediante una interfaz, 
 * conjuntos o familias de objetos (denominados productos) que dependen
 * mutuamuente y todo esto sin especificar cual es el objeto concreto.
 *
 */

public class Main{
    public static void main(String ...args){
        Scanner t = new Scanner(System.in);

        System.out.println("Digite el tipo de fabrica: ");
        int typeAbstract = t.nextInt();
        VehicleAbstractFactory abstractFactory = VehicleAbstractFactory.getFactory(typeAbstract);
        System.out.print("Digite el tipo de Vehiculo");
        
        int typeVehicle = t.nextInt();
        Vehicle vehicle = abstractFactory.getVehicle(typeVehicle);
        
        System.out.println("Llantas: " + vehicle.getWheels());
        System.out.println("Asientos: " + vehicle.getSeats());
    }
}