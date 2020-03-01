import OOAD.Project3.decorator.Decorator;
public class SatelliteRadio extends Decorator{
    public static int price = 22;
    public SatelliteRadio(int price,int num_days,Car car){
        super(price,num_days,car);
    }
}