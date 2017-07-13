package chapter3.varianta.bus.entities;

import chapter3.varianta.bus.enums.Mark;

/**
 *
 * @author SLAVA
 */
public class Bus {
    private String fioDriver;
    private int busNumber;
    private int routeNumber;
    private Mark carMark;
    private int yearStartExploitation;
    private long mileage;
    
    public Bus(){
    }
   
 
    public Bus(String fioDriver, int busNumber,int routeNumber, Mark carMark,int yearStartExploitation,long mileage){
        this.fioDriver = fioDriver;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.carMark = carMark;
        this.yearStartExploitation = yearStartExploitation;
        this.mileage = mileage;
    }
    

    public String getFioDriver() {
        return fioDriver;
    }

    public void setFioDriver(String fioDriver) {
        this.fioDriver = fioDriver;
    }
      
    
    

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
    
     
    public Mark getCarMark() {
        return carMark;
    }

    public void setCarMark(Mark carMark) {
        this.carMark = carMark;
    }

    public int getYearStartExploitation() {
        return yearStartExploitation;
    }

    public void setYearStartExploitation(int yearStartExploitation) {
        this.yearStartExploitation = yearStartExploitation;
    }

    



     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Автобус").append("\n");
        sb.append("водитель = ").append(fioDriver).append("\n");
        sb.append("номер автобуса = ").append(busNumber).append("\n");;
        sb.append("номер маршрута = ").append(routeNumber).append("\n");;
        sb.append("марка = ").append(carMark).append("\n");;
        sb.append("год начала эксплуатации = ").append(yearStartExploitation).append("\n");
        sb.append("пробег = ").append(mileage);
         return sb.toString();
    }

}