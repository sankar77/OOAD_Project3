import OOAD.Project3.classes.Car;
public class Economy extends Car{

    public static int count = 6;

    public static int price = 10;

    private Economy(String name,int num_days){
        this.name = name;
        this.num_days = num_days;

    }
    public static createInstance(String name,int num_days){
            if(count>1){
                count = count-1;
                return new Economy(name,num_days);
                
            }
            else{
                return null;
            }
    }

    public int quotePrice(){
        return price*(this.num_days);
    }

    public int getCount(){
        return count;
    }
    public void onReturn(){
        if(count<6)
            count = count+1;
    }
}