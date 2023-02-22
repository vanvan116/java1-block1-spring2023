/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.anhnv_ph1234;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV service = new QLSV();

        do {
            System.out.println("Menu\n1.Nhap \n2. Xuat\n3.Qua mon\n4. Tim\n0.Thoat");
            System.out.print("Moi ban lua chon:");
            int choice = Integer.parseInt(sc.nextLine()); //ep kieu sang int
            switch (choice) {
                case 1:
                    System.out.println("Bai 1");
                    service.nhapThongTin();
                    break;
                case 2:
                    System.out.println("Bai 2");
                    service.xuatThongIn();
                    break;
                case 3:
                    service.quaMon();
                    break;
                case 4:
                    service.timSinhVienTheoMa();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
                    break;
            }
        } while (true);

    }
}
