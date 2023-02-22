/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.anhnv_ph1234;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int maSV;
    private String ten;
    private int namSinh;
    private double diemCSharo;
    //contructor ko tham so
    public SinhVien() {
    }
    //contructor co tham so
    public SinhVien(int maSV, String ten, int namSinh, double diemCSharo) {
        this.maSV = maSV;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemCSharo = diemCSharo;
    }
    //method inThongTin
    public void inThongTin() {
        System.out.printf("%d  | %s  |%d  | %.1f\n", 
                maSV,ten,namSinh,diemCSharo);
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemCSharo() {
        return diemCSharo;
    }

    public void setDiemCSharo(double diemCSharo) {
        this.diemCSharo = diemCSharo;
    }
    
    
    
    
            
            
            
            
            
            
            
}
