package Patrones1Creacionales.AbstractFactory1;

/**
 * @author Genarogg
 */

public class LuxuryCar implements Car{
    @Override
    public int getDoors(){
        return 2;
    }

    @Override
    public int getWheels(){
        return 4;
    }

    @Override
    public int getSeats(){
        return 2;
    }
}