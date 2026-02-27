import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MataKuliah[] arrayOfMataKuliah = new MataKuliah[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata kuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = scanner.nextLine();
            System.out.print("Nama          : ");
            nama = scanner.nextLine();
            System.out.print("SKS           : ");
            dummy = scanner.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = scanner.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            System.out.println("Kode              : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama              : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS               : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam        : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("-------------------------------------------------");
        }
        
        
        scanner.close();
        
    }
}