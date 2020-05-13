/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDonHeader 
{
    String maHD;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "\nMã hoá đơn: " + maHD + "\nNgày bán: " + ngayBan + "\nTên khách hàng: " + tenKH + '}';
    }

    
    
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
   
    
}   
