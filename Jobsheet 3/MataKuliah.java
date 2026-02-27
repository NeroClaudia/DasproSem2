import java.util.Scanner;
public class MataKuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void addData(Scanner scanner) {
        System.out.print("Kode          : ");
        this.kode = scanner.nextLine();

        System.out.print("Nama          : ");
        this.nama = scanner.nextLine();

        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Jumlah Jam    : ");
        this.jumlahJam = Integer.parseInt(scanner.nextLine());
        System.out.println("-------------------------------------------------");
    }

    public void printInfo() {
        System.out.println("Kode              : " + this.kode);
        System.out.println("Nama              : " + this.nama);
        System.out.println("SKS               : " + this.sks);
        System.out.println("Jumlah Jam        : " + this.jumlahJam);
        System.out.println("-------------------------------------------------");
    }
    
}
