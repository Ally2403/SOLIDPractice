/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle.drivingmodes;

/**
 *
 * @author Allison Ruiz
 */
public class Economy implements DrivingMode{
    
    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    @Override
    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
