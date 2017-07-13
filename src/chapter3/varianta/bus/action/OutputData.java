package chapter3.varianta.bus.action;

import chapter3.varianta.bus.entities.Bus;
import java.util.List;

/**
 *
 * @author SLAVA
 */
public class OutputData {
    
    public static void outputListBuses (List<Bus> listBuses) {
    for (Bus bus : listBuses)
            System.out.println(bus.toString());
            System.out.println("---------------");
    
    }
}
