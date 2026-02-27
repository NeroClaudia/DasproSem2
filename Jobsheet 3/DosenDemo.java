import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDosen;

        System.out.print("Masukkan jumlah dosen: ");
        jumlahDosen = scanner.nextInt();
        scanner.nextLine();
        Dosen07[] arrayDaftarDosen = new Dosen07[jumlahDosen];
        
        for (int i = 0; i < arrayDaftarDosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            arrayDaftarDosen[i] = new Dosen07("", "", false, 0);
            arrayDaftarDosen[i].inputData(scanner);
        }

        int no = 1;
        System.out.println("===== /DAFTAR DOSEN/ =====");
        for (Dosen07 d : arrayDaftarDosen) {
            System.out.println("Dosen ke-" + no);
            d.tampilData();
            no++;
        }
        scanner.close();
    }
}
