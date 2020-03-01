import OOAD.Project3.classes.CasualCustomer;
import OOAD.Project3.classes.BusinessCustomer;
import OOAD.Project3.classes.RegularCustomer;

public class CustomerFactory{
    public static Customer getCustomer(String type,String name) {
        if (type.equalsIgnoreCase("RegularCustomer")) return new RegularCustomer(name);
        if (type.equalsIgnoreCase("BusinessCustomer")) return new BusinessCustomer(name);
        if (type.equalsIgnoreCase("CasualCustomer")) return new CasualCustomer(name);
        return Null;
    }
}