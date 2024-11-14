/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.RadioSwitch;

/**
 *
 * @author Allison Ruiz
 */
public class Car extends Vehicle implements RadioSwitch{
    
    private boolean radioOn;
    
    public Car(int maxFuel) {
        super(maxFuel);
    }
    @Override
    public void accelerate(){
        this.setRemainingFuel(this.getRemainingFuel() - 2);
    }

    public boolean isRadioOn() {
        return radioOn;
    }

    public void setRadioOn(boolean radioOn) {
        this.radioOn = radioOn;
    }
    
    //metodos privados no entran dentro de la resposabilidad unica. la mayoría de veces se usan para validaciones internas de la clase.
    private boolean isMovingForwards(Gear gear, Gear actualGear){
        //Moverse de drive a reverse es un cambio que no debería ser posible.
        return this.isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
    
    private boolean isMovingBackwards(Gear gear, Gear actualGear){
        return this.isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
    
    
    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = this.getGear();
        if(isMovingForwards(gear, actualGear) || isMovingBackwards(gear, actualGear)){
            //Se refiere a el método stop de este objeto Car en específico.
            this.stop();
        }
        //es super y no this porque sino haría referencia a este método que estoy reescribiendo en la clase Car
        super.changeGear(gear);
    }

    //metodos abstractos de la interfaz RadioSwitch
    @Override
    public void startRadio() {
        this.radioOn = true;
    }

    @Override
    public void shutDownRadio() {
        this.radioOn = false;
    }
}
