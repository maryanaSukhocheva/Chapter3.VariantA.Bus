
package chapter3.varianta.bus.action;

import chapter3.varianta.bus.entities.Bus;
import chapter3.varianta.bus.enums.Mark;


/**
 *
 * @author Sukhocheva Maryana
 */
public class BusBuilder {
    
    //Creating a book on the set parameters
    public Bus buildBus (String fioDriver, int busNumber,int routeNumber, Mark carMark, 
            int yearStartExploitation, long mileage) throws Exception {
               
        Bus bus = new Bus();
         if (!fioDriver.isEmpty() && fioDriver!=null && busNumber>=0 && routeNumber>0 && yearStartExploitation>0 && carMark!=null && mileage>=0 ) {
                try {
                    bus.setFioDriver(fioDriver);
                    bus.setBusNumber(busNumber);
                    bus.setRouteNumber(routeNumber);
                    bus.setCarMark(carMark);
                    bus.setYearStartExploitation(yearStartExploitation);
                    bus.setMileage(mileage);
                    
                   
                } catch (Exception ex) {
                    System.out.println("Bus error");
                }

        } else {
             System.out.println("Parametrs incorrect");
        }

        return bus;
    }
    
    
    
    
}
