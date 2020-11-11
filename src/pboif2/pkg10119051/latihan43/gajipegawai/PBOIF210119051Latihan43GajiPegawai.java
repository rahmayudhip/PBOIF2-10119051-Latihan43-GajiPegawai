/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan43.gajipegawai;

import DataClass.GajiPegawai;
import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Gaji Pegawai
 */
public class PBOIF210119051Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        GajiPegawai gP = new GajiPegawai();
        gP.setNama("Rizki Adam Kurniawan");
        gP.setAlamat("Jalan Semar dlm 4 No 72/66");
        gP.setUangTransport(250000);
        gP.setUangTunjangan(300000);
        gP.setGajiPokok(4500000);
        
        int totalGaji = gP.totalGaji(
                        gP.getUangTunjangan(),
                        gP.getUangTransport(),
                        gP.getGajiPokok()
        );
        
        gP.tampilData(
            gP.getNama(),
            gP.getAlamat(),
            gP.getUangTunjangan(),
            gP.getUangTransport(),
            gP.getGajiPokok(),
            totalGaji
        );
    }
    }
    

