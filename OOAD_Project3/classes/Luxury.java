import OOAD.Project3.classes.Car;
public class Luxury extends Car{
    public static int price = 10;

    public static int count = 5;

    private Luxury(String name,int num_days){
        this.name = name;
        this.num_days = num_days;
    }
    public createInstance(String name,int num_days){
        if(count>1){
            count = count-1;
            return new Luxury(name,num_days);
        }
        else{
            return null;
        }

    }
    public int quotePrice(){
        return price*num_days;
    }
    public int getCount(){
        return count;
    }
    public void onReturn(){
        if(count<5)
            count = count+1;
    }
}