import OOAD.Project3.classes.Car;
public class Decorator extends Car{
    public int price;
    public int num_days;
    public Car car;

    public Decorator(int price,int num_days,Car car){
        this.price = price;
        this.num_days = num_days;
        this.car = car;
    }

    public int getPrice(){
        return price+car.getPrice();
    }
}