import java.util.ArrayList;
import java.util.List;
import OOAD.Project3.classes.RentalRecord;

public abstract class Customer {
        String name;
        List<RentalRecord> record=new ArrayList<RentalRecord>();
        public String getCustomerName() {
            return this.name;
        }
        public void addRentalRecord (RentalRecord rentalrecord) {
            record.add(rentalrecord);
        }
        public List<RentalRecord> getRentalRecord(){
            return record;
        }
        public int getNumberOfOptionsRented() {
            int sum=0;
            for (int i=0;i<record.size();i++){
                    sum=sum+record.get(i).getDecoratorOptions().size();
            }
            return sum;
        }

}