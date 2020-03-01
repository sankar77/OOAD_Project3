import OOAD.Project3.classes.Economy;
import OOAD.Project3.classes.Standard;
import OOAD.Project3.classes.Luxury;
import OOAD.Project3.classes.SUV;
import OOAD.Project3.classes.MiniVan;
import OOAD.Project3.classes.ChildSeat;
import OOAD.Project3.classes.GPS;
import OOAD.Project3.classes.SatelliteRadio;

public class CategoryFactory{
    public static Car getCar(String type, String name,int num_days) {
            if(type.equals("Economy"))
                return new Economy.createInstance(name,num_days);
            else if(type.equals("Standard"))
                return new Standard.createInstance(name,num_days);
            else if(type.equals("Luxury"))
                return new Luxury.createInstance(name,num_days);
            else if(type.equals("SUV"))
                return new SUV.createInstance(name,num_days);
            else if(type.equals("MiniVan"))
                return new MiniVan.createInstance(name,num_days);

        
    }
    public static Car addonoption(String type,String name,Car car,int numDays){
        if(type.equals("ChildSeat"))
            return new ChildSeat.createInstance(name,numDays);
        else if(type.equals("GPS"))
            return new GPS.createInstance(name,numDays);
        else if(type.equals("SatelliteRadio"))
            return new SatelliteRadio.createInstance(name,numDays);
    }
}