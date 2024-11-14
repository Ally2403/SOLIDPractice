/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle.handlers;

import core.vehicle.Vehicle;
import core.vehicle.drivingmodes.DrivingMode;

/**
 *
 * @author Allison Ruiz
 */
public class EventHandler {
    private Vehicle vehicle;
    
    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    //no se pueden crear objetos de una interfaz pero si se pueden referenciar objetos como las interfaces que implementan.
    //DrivingMode sport = new Sport();
    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
    }
    
}
