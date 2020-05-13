/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author ADMIN
 */
public class main1 {


    public static void main(String[] args) throws ParseException {
        
        HoaDonHeader HDH = new HoaDonHeader("KH01",new SimpleDateFormat("dd/MM/yyyy").parse("25/06/2020"), "Trương Hoàng Khoa");
        CTHD CT1 = new CTHD("Gundam", 1, 10000, 2);
        CTHD CT2 = new CTHD("Gundam1", 2, 2000, 3);
         CTHD CT3 = new CTHD("Gundam2", 3, 3000, 4);
       
        
        
        HoaDon HD = new HoaDon.BuilderHoaDon()
                .addHoaDonHeader(HDH)
                .addCTHD(CT1)
                .addCTHD(CT2)
                .addCTHD(CT3)
                .builder();
        
        System.out.println(HD.toString());
    }
}
