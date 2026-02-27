import java.util.Scanner;
public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jmlMatkul;
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        jmlMatkul = scanner.nextInt();
        scanner.nextLine();
        MataKuliah[] arrayOfMataKuliah = new MataKuliah[jmlMatkul];

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah("", "", 0, 0);
            arrayOfMataKuliah[i].addData(scanner);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].printInfo();
        }
        scanner.close();
        
    }
}