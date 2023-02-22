/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.anhnv_ph1234;

/**
 *
 * @author Admin
 */
public class SinhVienUDPM extends SinhVien{
    private double diemJava;
    private double diemCsharp;

    public SinhVienUDPM() {
    }

    public SinhVienUDPM(double diemJava, double diemCsharp, int maSV, String ten, int namSinh, double diemCSharo) {
        super(maSV, ten, namSinh, diemCSharo);
        this.diemJava = diemJava;
        this.diemCsharp = diemCsharp;
    }
    public void xuat() {
        super.inThongTin();
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCsharp() {
        return diemCsharp;
    }

    public void setDiemCsharp(double diemCsharp) {
        this.diemCsharp = diemCsharp;
    }
    
    
    
}
