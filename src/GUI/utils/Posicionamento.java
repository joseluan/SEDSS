/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.utils;

/**
 *
 * @author Luan
 */
public class Posicionamento {

    public static String esmisferio(Float grausLatitude) {
        //lógica do esmisfério        
        String emisferio = grausLatitude >= 0 ? "Sul" : "Norte";
        if (grausLatitude == 0) {
            emisferio = "Norte ou sul";
        }
        
        return emisferio;
    }
    
    public static Float angulacao(Float grausLatitudeABS) {
        grausLatitudeABS = Math.abs(grausLatitudeABS);
        Float grau = grausLatitudeABS;
        
        if (grausLatitudeABS >= 0 && grausLatitudeABS <= 10) {
            grau = (float) 10;
        } else if (grausLatitudeABS >= 21 && grausLatitudeABS <= 30) {
            grau += 5;
        } else if (grausLatitudeABS >= 31 && grausLatitudeABS <= 40) {
            grau += 10;
        } else if (grausLatitudeABS >= 41) {
            grau += 15;
        }
        
        return grau;
    }
}
