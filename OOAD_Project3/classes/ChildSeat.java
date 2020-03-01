import OOAD.Project3.decorator.Decorator;
public class ChildSeat extends Decorator{
    public static int price = 20;
    public ChildSeat(int price,int num_days,Car car){
        super(price,num_days,car);
    }

}