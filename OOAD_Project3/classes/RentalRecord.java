import OOAD.Project3.decorator.Decorator;
import java.util.ArrayList;
import java.util.List;
import OOAD.Project3.classes.Customer;
public class RentalRecord {
    public int dayofBuying;
    boolean status;
    public RentalRecord(int buyDay){
        this.dayOfBuying=buyDay;
        this.status=true;
    }
    public List<Decorator> decoratorOptions=new ArrayList<Decorator>();

    public List<Decorator> getDecoratorOptions() {
        return decoratorOptions;
    }

    public void addDecoratorOptions(Decorator DecoratorOption){
        decoratorOptions.add(DecoratorOption);
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }

    public int getTotalPrice(){
        int total=0;
        for (int i=0;i<decoratorOptions.size();i++){
            total=total+decoratorOptions.get(i).getPrice();
        }
        return total;
    }

    public returnCar(Customer cus){
        for(int i=0;i<decoratorOptions.size();i++){
            Decorator dec=decoratorOptions.get(i);
            while (!dec.getClass().getSimpleName().equals("Economy") && !dec.getClass().getSimpleName().equals("SUV") && 
                    !dec.getClass().getSimpleName().equals("MiniVan") && !dec.getClass().getSimpleName().equals("Luxury") &&
                    !dec.getClass().getSimpleName().equals("GPS")) {
                        if(dec.car instanceof Decorator) {
                            dec=(Decorator) dec.car;
                        }
                        else {
                            break;
                        }
            dec.car.onReturn();
            System.out.Println(dec.car.name+"returned by customer"+ cus.name);
                    }
        }
    }
}