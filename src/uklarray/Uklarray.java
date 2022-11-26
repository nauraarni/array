/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uklarray;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Uklarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("masukkan nama: ");
        String pilihan = scan.nextLine();

        String nama[][] = {{"Felisa", "Naura", "Azza", "Azwa"}, {"Aurel", "Davina", "Awa", "Keysia"}};
        String kelas[][] = {{"XR1", "XR2", "XR3", "XR4"}, {"XR5", "XR6", "XR7", "XR8"}};
        int nisn[][] = {{2191, 2192, 2193, 2194}, {2195, 2196, 2197, 2198}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (nama[i][j].equalsIgnoreCase(pilihan)) {
                    System.out.println("=============");
                    System.out.println("nama: " + nama[i][j]);
                    System.out.println("kelas: " + kelas[i][j]);
                    System.out.println("nisn: " + nisn[i][j]);

                    break;
                }

            }

        }

    }

}
