package chapter3.varianta.bus.action;

import chapter3.varianta.bus.entities.Bus;
import chapter3.varianta.bus.enums.Mark;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Tasks {
   //Output a list of buses of a certain number of route
    public List<Bus> busesOfCertainRouteNumber(List<Bus> buses, int routeNumber){ 
        List<Bus> listBuses = new ArrayList<Bus>(); //Create a new array of buses
        for (Bus currentBus : buses) {
            if (currentBus.getRouteNumber()==routeNumber) {
                listBuses.add(currentBus); //Add the bus to the new array 
            }  
        }
        return listBuses;
    }

    //List of buses, which are operated more than n years
    public List<Bus> busesOfLifetime(List<Bus> buses, int numberOfYears) {
        List<Bus> listBuses = new ArrayList<Bus>(); //Create a new array of buses
        Date currentDate = new Date();
        int currentYear = currentDate.getYear()+1900;  //Find the current year
        for (Bus currentBus : buses) { 
             if (currentYear-currentBus.getYearStartExploitation() > numberOfYears)
                listBuses.add(currentBus); //Add the bus to the new array 
        }
        return listBuses;
    }

    //List of buses, the mileage is more than certain numbers
    public List<Bus> getBusesMileageMoreGivenDistance (List<Bus> buses, int distance) {
        List<Bus> listBuses = new ArrayList<Bus>(); //Create a new array of buses
        for (Bus currentBus : buses) {
            if (currentBus.getMileage() > distance) 
                listBuses.add(currentBus); //Add the bus to the new array
        }
        return listBuses;
    }
}
