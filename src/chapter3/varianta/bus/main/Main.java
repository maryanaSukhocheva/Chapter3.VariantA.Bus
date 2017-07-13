/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.varianta.bus.main;

import chapter3.varianta.bus.action.Action;
import chapter3.varianta.bus.action.OutputData;
import chapter3.varianta.bus.action.Tasks;
import chapter3.varianta.bus.entities.Bus;
import chapter3.varianta.bus.enums.Mark;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Action action = new Action();
            List<Bus> buses = new ArrayList<Bus>();
            buses = action.generateBuses();
            Tasks tasks = new Tasks();
            
            System.out.println("Cписок автобусов для маршрута 15:");
            List<Bus> listBusesFirst = tasks.busesOfCertainRouteNumber(buses, 15);
            OutputData.outputListBuses(listBusesFirst);
                        
            System.out.println("список автобусов, которые эксплуатируются больше 3 лет:");
            List<Bus> listBusesSecond = tasks.busesOfLifetime(buses, 3);
            OutputData.outputListBuses(listBusesSecond);
                        
            System.out.println("Список автобусов, пробег у которых больше 50000 км:");
            List<Bus> listBusesThird = tasks.getBusesMileageMoreGivenDistance(buses, 50000);
            OutputData.outputListBuses(listBusesThird);
       
        

    }
}
