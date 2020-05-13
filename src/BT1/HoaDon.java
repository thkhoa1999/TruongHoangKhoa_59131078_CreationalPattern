/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoaDon 
{
    HoaDonHeader HDH = new HoaDonHeader();
    ArrayList<CTHD> DSCT = new ArrayList<>();
    
    protected HoaDon(BuilderHoaDon builder)
    {
        this.HDH = builder.HDH;
        this.DSCT = builder.DSCT;
    }
    
    public static class BuilderHoaDon
    {
        HoaDonHeader HDH = new HoaDonHeader();
        ArrayList<CTHD> DSCT = new ArrayList<>();
        
        public BuilderHoaDon addHoaDonHeader(HoaDonHeader HDH){
            this.HDH = HDH;
            return this;
        }
        
        public BuilderHoaDon addCTHD(CTHD CT){
            this.DSCT.add(CT);
            return this;
        }
        
        public HoaDon builder(){
            return new HoaDon(this);
        }

    }

        @Override
        public String toString() {
            String s = "";
            s +=HDH.toString();
            s +="\nCTHD{";
            for (int i= 0; i<DSCT.size(); i++){
                s+="\nmón hàng thứ " + i+ ": " + DSCT.get(i).toString();
                        
            }
            s +="}";
            return s;
        }
        
        
        
    
    
  
            
}
