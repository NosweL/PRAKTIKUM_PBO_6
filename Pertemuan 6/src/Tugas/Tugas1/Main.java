/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Tugas1;

/**
 *
 * @author welso
 */
public class Main {
    public static void main(String[]args){
        Pegawai p1 = new Pegawai("2041720253","Welson Mario","Jl Kampung belakang");
        System.out.println("");
        p1.nama="Welson Mario";
        p1.gaji=99999999;
        System.out.println("Nama Pegawai : "+p1.getNama());
        System.out.println("============================");
        p1.printSemuaGaji();
    }
}
