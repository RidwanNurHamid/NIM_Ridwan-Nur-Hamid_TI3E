/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author USER
 */
public class ObjekGeometri {
    private String sifat="red";
    public String bentuk="geometri";
    public int luas=0;
    
    public void ObjekGeometri(String bentuk, int luas) {
        this.bentuk = bentuk;
        this.luas = luas;
    }
    
    public void setColor(String color)
    {
        this.sifat= color;
    }
    
    public String getcolor()
    {
        return this.sifat;
    }
    
    public String getBentuk() {
        return this.bentuk;
    }
    
    public int getLuas() {
        return this.luas;
    }
}