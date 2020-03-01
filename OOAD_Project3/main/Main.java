import java.util.Random;
import java.util.List;
import OOAD.Project3.classes.Customer;
import OOAD.Project3.factory.CustomerFactory;
import OOAD.Project3.factory.CategoryFactory;
import OOAD.Project3.classes.MiniVan;
import OOAD.Project3.classes.Luxury;
import OOAD.Project3.classes.Economy;
import OOAD.Project3.classes.Standard;
import OOAD.Project3.classes.RentalStore;
import OOAD.Project3.decorator.Decorator;
import OOAD.Project3.classes.RentalRecord;

public class Main{
    public static void main(String[] args) {
        RentalStore rs = new RentalStore();
        for(int i = 0;i<12;i++){
        Random rand = new Random();
        int num = rand.nextInt(3);
        if(rand==0){
        Customer customer = CustomerFactory.getCustomer("CasualCustomer", "CasualCustomer"+(i));
        rs.addCustomer(customer);
        }
        else if(rand==1){
            Customer customer = CustomerFactory.getCustomer("RegularCustomer","RegularCustomer"+(i));
            rs.addCustomer(customer);
        }
        
        else if(rand==2){
            Customer customer = CustomerFactory.getCustomer("BusinessCustomer", "BusinessCustomer"+(i));
        }
    }


        Luxury l;
        MiniVan m;
        Standard s;
        SUV u;
        Economy e;

        for(int i = 0;i<34;i++){
            if(l.getCount()!=0){
                System.out.println(l.getCount());
            }
            if(m.getCount()!=0){
                System.out.println(m.getCount());
            }
            if(s.getCount()!=0){
                System.out.println(s.getCount());
            }
            if(u.getCount()!=0){
                System.out.println(u.getCount());
            }
            if(e.getCount()!=0){
                System.out.println(e.getCount());
            }
            
            List<Customer> customers = rs.returnCustomer();
            for(Customer customer:customers){
                List<RentalRecord> rrlist = customer.getRentalRecord();
                for(int k = 0;k<rrlist.size();k++){
                int buyingDay = rrlist.get(k).dayofBuying;
                int numberOfDaysRented = rrlist.get(k).getDecoratorOptions().get(0).num_days;
                if(i==(buyingDay+numberOfDaysRented)){
                    rrlist.get(j).returnCar(customer);
                }
                else{
                    //do nothing
                }
            }

        System.out.println("-----Day NUmber "+ (i-1)+"-------");
            }
            Random randomGen=new Random();
            int randomNumber=randomGen.nextInt(12)+1;
            int totalPrice=0;
            int total=0;
            int noOfCars = 0;
            int noOfDays = 0;
            Customer customer=customers.get(randomNumber);
            System.out.println("Customer "+customer.getCustomerName() + "enters the store");
            switch (customer.getClass().getSimpleName()) {
                case "BusinessCustomer":
                    noOfCars=3;
                    noOfDays=7;
                    break;
                case "CasualCustomer":
                    noOfCars=1;
                    noOfDays=2;
                    break;
                case "RegularCustomer":
                    noOfCars=2;
                    noOfDays=5;
                    break;                  
                default:
                    break;
            }
            // if (customer.getClass().getSimpleName().equals("BusinessCustomer")) {
            //         int noOfCars=3;
            //         int noOfDays=7;
                    RentalRecord rentalRecord=RentalRecord(i);
                    for (int j=0;j<noOfCars;j++){
                        int carno=randomGen.nextInt(5)+1;
                        Car cartype;
                        Car addonproperty;
                        String type;
                        if (carno==1) {
                            cartype=CategoryFactory.getCar("Standard", "Standard"+(carno+1), noOfDays);
                            type="Standard";
                            cartype=CategoryFactory.getCar("Standard", "Standard"+(carno+1), noOfDays);
                            addonproperty=CategoryFactory.addonoption("GPS","GPS"+(carno+1),cartype,noOfDays);
                        }
                        else if (carno==2) {
                            cartype=CategoryFactory.getCar("Economy", "Economy"+(carno+1), noOfDays);
                            type="Economy";
                            cartype=CategoryFactory.getCar("Economy", "Economy"+(carno+1), noOfDays);
                            addonproperty=CategoryFactory.addonoption("childSeat","childSeat"+(carno+1),cartype,noOfDays);
                        }
                        else if (carno==3) {
                            cartype=CategoryFactory.getCar("Luxury", "Luxury"+(carno+1), noOfDays);
                            type="Luxury";
                            cartype=CategoryFactory.getCar("Luxury", "Luxury"+(carno+1), noOfDays);
                            addonproperty=CategoryFactory.addonoption("GPS","GPS"+(carno+1),cartype,noOfDays);
                        }
                        else if (carno==4) {
                            cartype=CategoryFactory.getCar("SUV", "SUV"+(carno+1), noOfDays);
                            type="SUV";
                            cartype=CategoryFactory.getCar("SUV", "SUV"+(carno+1), noOfDays);
                            addonproperty=CategoryFactory.addonoption("SatelliteRadio","SatelliteRadio"+(carno+1),cartype,noOfDays);
                        }
                        else {
                            cartype=CategoryFactory.getCar("Minivan", "Minivan"+(carno+1), noOfDays);
                            type="Minivan";
                            cartype=CategoryFactory.getCar("Minivan", "Minivan"+(carno+1), noOfDays);
                            addonproperty=CategoryFactory.addonoption("SatelliteRadio","SatelliteRadio"+(carno+1),cartype,noOfDays);
                        }
                        if (cartype!=null){
                            rentalRecord.addDecoratorOptions((Decorator)addonproperty);
                        if (cartype==null){
                            System.out.println("customer not able to purchase car of type" + type);
                        }
                        else {
                            System.out.println("customer purchases cartype" + cartype.name);
                            System.out.println("Addons" + addonproperty.name);
                        }
                        }
                    customer.addRentalRecord(rentalRecord);
                    totalPrice=rentalRecord.getTotalPrice();
                    total=total+totalPrice;
                    System.out.println("Price of RentalRecord is " + total);

                    }

                if(total !=0){
                    System.out.println("Total price the store made that day" + total);
                }
            

            }
            List<Customer> customers = rs.returnCustomer();//					System.out.println("type is " +type);

            System.out.println("total number of completed rentals");
            int totalCompletedRentals = 0;
            int countBusiness = 0;
            int countRegular = 0;
            int countCasual = 0; 
            for(Customer customer:customers)
            {
                String type = customer.getClass().getSimpleName();
                
                List<RentalRecord> crr = customer.getRentalRecord();
                int temp=-1;
                for (RentalRecord rentalRecord: crr) {
                    if (rentalRecord.getStatus() == false ) {
                        totalCompletedRentals++;
    
                        if (type.equals("RegularCustomer")){
                            countRegular++;
                        }
                        else if (type.equals("BusinessCustomer")) {
                            countBusiness++;
                        }
                        else if (type.equals("CasualCustomer")) {
                            countCasual++;
                        }
                    }
                }
    
            }
            
            //Summary of 34 days
            System.out.println("+++++++++++++++++++++++++++++++++++++ Summary +++++++++++++++++++++++++++++");
            System.out.println("Total completed rentals is " +totalCompletedRentals);
            System.out.println("Total completed rentals for regular customer is " +countRegular);
            System.out.println("Total completed rentals for business customer is " +countBusiness);
            System.out.println("Total completed rentals for casual customer is " +countCasual);
            System.out.println("Total profit of store for the entire period " +sumOfAllDaysTotal);


        }
    }



 















