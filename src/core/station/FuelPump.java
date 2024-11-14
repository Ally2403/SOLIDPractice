/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.station;

import core.vehicle.Vehicle;

/**
 *
 * @author Allison Ruiz
 */
public class FuelPump {
    
    public void reFuel(Vehicle vehicle){
        int remainingFuel = vehicle.getRemainingFuel();
        int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}
