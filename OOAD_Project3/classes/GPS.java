import OOAD.Project3.decorator.Decorator;
public class GPS extends Decorator{
    public static int price = 25;
    public GPS(int price,int num_days,Car car){
        super(price,num_days,car);
    }
}
