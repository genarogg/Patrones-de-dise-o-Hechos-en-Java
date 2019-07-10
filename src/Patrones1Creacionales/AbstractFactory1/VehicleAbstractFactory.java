package Patrones1Creacionales.AbstractFactory1;

/**
 * @author Genarogg
 */

public abstract class  VehicleAbstractFactory{
    public static final  int CARFACTORY = 1;
    public static final int MOTORBIKEFACTORY = 2;

    public abstract Vehicle getVehicle(int t);

    public static VehicleAbstractFactory getFactory(int t){
        switch(t){
            case CARFACTORY:
                return new CarFactory();
            case MOTORBIKEFACTORY:
                return new MotorbikeFactory();
        }
        return null;
    }
}