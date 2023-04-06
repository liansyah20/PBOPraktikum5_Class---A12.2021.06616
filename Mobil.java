/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobil;

/**
 *
 * @author User
 */
public class Mobil {

    
    //property..........
    private String model;
    private int maxspeed;
    
    //behavior...........
    public void setModel(String param1){
        model = param1;
    }
    public void setspeed(int param2){
        maxspeed = param2;
    }
    
    public String getModel(){
        return model;
    }
    public int getspeed(){
        return maxspeed;
    }
}
