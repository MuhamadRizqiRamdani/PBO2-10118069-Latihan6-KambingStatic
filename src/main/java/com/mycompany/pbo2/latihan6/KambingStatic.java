/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan6;

/**
 *
 * @author
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : PBO2
 * NIM      : 10118069
 * Deskripsi program : Program ini berisi program untuk menampilkan jumlah
 * kambing
 */
public class KambingStatic {
    public static final String NAMA_KAMBING = "MIDUN"; 
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
