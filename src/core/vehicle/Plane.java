/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

/**
 *
 * @author Allison Ruiz
 */
public class Plane extends Vehicle{

    public Plane(int maxFuel) {
        super(maxFuel);
    }
    @Override
    public void accelerate(){
        this.setRemainingFuel(this.getRemainingFuel() - 10);
    }
}
