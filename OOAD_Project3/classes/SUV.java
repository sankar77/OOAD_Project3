import OOAD.Project3.classes.Car;
public class SUV extends Car{
    public static int price = 9;

    public static int count = 6;

    private SUV(String name,int num_days){
        this.name = name;
        this.num_days = num_days;
    }
    public createInstance(String name,int num_days){
        if(count>1){
            count = count-1;
            return new SUV(name,num_days);
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