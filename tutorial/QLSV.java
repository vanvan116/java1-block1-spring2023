/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.anhnv_ph1234;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLSV {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    SinhVien sv;

    //khoi tao list Sinh Vien co 3 thong tin sv
    public QLSV() {
        sv = new SinhVien(0, "Anh", 1777, 6);
        listSinhVien.add(sv);
        sv = new SinhVien(1, "Man", 1877, 3);
        listSinhVien.add(sv);
        sv = new SinhVien(2, "Mo", 1877, 5);
        listSinhVien.add(sv);
    }

    public void nhapThongTin() {
        while (true) {
            SinhVien sv = new SinhVien();
            System.out.print("Nhap ma sinh vien: ");
            //int masv = sv.setMaSV(Integer.parseInt(sc.nextLine()));
            int masv = Integer.parseInt(sc.nextLine());
            sv.setMaSV(masv);
            System.out.print("Nhap ten:");
            String ten = sc.nextLine();
            sv.setTen(ten);
            System.out.print("Nhap nam sinh: ");
            int nam = Integer.parseInt(sc.nextLine());
            sv.setNamSinh(nam);
            System.out.print("Nhap diem C#: ");
            double diem = Double.parseDouble(sc.nextLine());
            sv.setDiemCSharo(diem);
            //truyen sv vua nhap tu ban phim vao listSinhVien
            listSinhVien.add(sv);
            
            System.out.print("Nhan phim bat ki de tiep tuc, nhap no de thoat!");
            String temp = sc.nextLine();
            if(temp.equalsIgnoreCase("no")) {
                break;
            }

        }

    }
    public void xuatThongIn() {
        for (SinhVien sv : listSinhVien) {
            sv.inThongTin();
        }
    }
    public void quaMon() {
        for (SinhVien sv : listSinhVien) {
            if(sv.getDiemCSharo() >= 5) {
                sv.inThongTin();
            }
        }
    }
    public void timSinhVienTheoMa() {
        System.out.print("Vui long nhap ma sv muon tim: ");
        int tim  = Integer.parseInt(sc.nextLine());
        for (SinhVien sv : listSinhVien) {
            if(sv.getMaSV() == tim) {
                sv.inThongTin();
            }
        }
    }
    public void timSinhVienTheoTen() {
        System.out.print("Nhap ten muon tim:");
        String name = sc.nextLine();
        for (SinhVien sv : listSinhVien) {
            if(sv.getTen().equalsIgnoreCase(name)){
                sv.inThongTin();
            }
        }
    }

}
