/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.switches.CameraSwitch;

/**
 *
 * @author Allison Ruiz
 */
public class Drone extends Vehicle implements CameraSwitch{

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }
    @Override
    public void accelerate(){
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
    public void setCameraOn(boolean cameraOn) {
        this.cameraOn = cameraOn;
    }
    
    public Drone(int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void startCamera() {
       this.cameraOn = true;
    }

    @Override
    public void shutDownCamera() {
        this.cameraOn = false;
    }
    
}
