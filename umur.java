/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class umur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama;
        int umur;

        while (true) {
            System.out.print("Masukkan nama (hanya huruf): ");
            nama = scanner.nextLine();
            
            if (nama.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Nama hanya boleh berisi huruf!");
            }
        }

        while (true) {
            System.out.print("Masukkan umur (hanya angka positif): ");
            String inputUmur = scanner.nextLine();
            
            try {
                umur = Integer.parseInt(inputUmur);
                
                if (umur > 0) {
                    break;
                } else {
                    System.out.println("Umur harus bernilai positif!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Umur harus berupa angka!");
            }
        }
        
        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

    