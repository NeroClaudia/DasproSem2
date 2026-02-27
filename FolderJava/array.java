package FolderJava;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] namaMatkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan kesehatan kerja"};

        int[] sks = {2, 2, 2, 2, 2, 2, 2, 2};

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        double[] nilaiAngka = new double[namaMatkul.length];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMatkul[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
        }

        String[] nilaiHuruf = new String[namaMatkul.length];
        double[] bobotNilai = new double[namaMatkul.length];

        for (int i = 0; i < namaMatkul.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            }else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            }else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            }else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            }else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            }else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            }else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("======================");
        System.out.println("Hasil konversi nilai");
        System.out.println("======================");
        System.out.printf("MK\t\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai\n");
        System.out.println("======================");

        int totalSks = 0 ;
        double totalBobotSks = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-48s %-24.2f %-24s %-24.2f\n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);

            totalBobotSks += (bobotNilai[i] * sks[i]);
            totalSks += sks[i];
        }
        double ipSemester = totalBobotSks / totalSks;
        System.out.println("======================");
        System.out.printf("IP: %.2f", ipSemester);
        
        scanner.close();
    }
}
