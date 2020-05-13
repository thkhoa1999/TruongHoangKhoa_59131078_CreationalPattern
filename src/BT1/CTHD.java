    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatest
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author ADMIN
 */
public class CTHD 
{
    String sanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public CTHD() {
    }

    public CTHD(String sanPham, int soLuong, double donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "\nTên sản phẩm: " + sanPham + "\nSố lượng: " + soLuong + "\nĐơn giá: " + donGia + "\nChiết khấu: " + chietKhau;
    }
    
    
    
   
}
