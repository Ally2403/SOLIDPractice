/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.EngineSwitch;

/**
 *
 * @author Allison Ruiz
 */
//principio de inversión de dependencia: todas las clases deben depender de interfaces y clases abstractas
//los vehículos deben depender de vehicle como clase abstracta para cumplir este principio.
public abstract class Vehicle implements EngineSwitch{
    
    private final int maxFuel;
    private int remainingFuel;
    private int power;
    private int suspensionHeight;
    private Gear gear;
    private boolean moving;
    private boolean engineRunning;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }
    
    //metodos de la interfaz EngineSwitch
    @Override
    public void startEngine(){
        this.engineRunning = true;
    }
    @Override
    public void shutDownEngine(){
        this.engineRunning = false;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public boolean isMoving() {
        return moving;
    }

    // this is not a car's responsibility.
    /*public void reFuel(){
    remainingFuel = maxFuel;
    }*/
    
    //Setter de la variable Moving
    public void move() {
        this.moving = true;
    }
    
    public void stop() {
        this.moving = false;
    }

    public void changeGear(Gear gear) {
        this.gear = gear;
    }

    public Gear getGear() {
        return gear;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }
    //La clase ahora solo tiene la responsabilidad de acelerar, ya no retanquear y acelerar al tiempo
    //todos los vehículos necesitan su propio comportamiento unico al momento de acelerar por lo que se vuelve abstracta para reescribirlo en las hijas.
    public abstract void accelerate();
    
    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

}
