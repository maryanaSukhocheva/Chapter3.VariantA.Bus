
package chapter3.varianta.bus.action;

import chapter3.varianta.bus.entities.Bus;
import chapter3.varianta.bus.enums.Mark;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    private List<Bus> arrayOfBuses;
   
    
    public boolean addBus(Bus bus) throws Exception {
        boolean result;
        if (bus!=null) {
            result=arrayOfBuses.add(bus);
            System.out.println("Add bus");
        } else {
            throw new Exception("Error bus added");
        }
        return result;
    }
//filling the arrayOfBuses with buses
     public List<Bus> generateBuses()  {
        List<Bus> arrayOfBuses = new ArrayList<Bus>();
        try {
        BusBuilder action = new BusBuilder();
        Bus busFirst = action.buildBus("Иванов А.А.", 23, 15, Mark.VOLVO, 1990, 0);
        Bus busSecond = action.buildBus("Петров А.А.", 0, 3, Mark.LADA, 2015, 230000);
        Bus busThird = action.buildBus("Сидоров А.А.", 44, 15, Mark.MERSEDES, 2000, 100000);
        arrayOfBuses.add(busFirst);
        arrayOfBuses.add(busSecond);
        arrayOfBuses.add(busThird);
       
         } catch (Exception ex) {
            System.err.println("Error when creating buses");
        }
        System.out.println("Создан массив автобусов");
        return arrayOfBuses;

    }
}
