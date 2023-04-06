/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;

/**
 *
 * @author User
 */
public class CobaMobil {
    public static void main (String[] args){
        Mobil toyota01 = new Mobil();
        
        toyota01.setModel("Avanza");
        toyota01.setspeed(120);
        
        System.out.print("Mobil : " + toyota01.getModel());
        System.out.print("Mempunyai maxspeed " + toyota01.getspeed());
        System.out.println("Km per jam");
    }
}
