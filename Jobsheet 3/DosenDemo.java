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
        
        System.out.println("\n===== /DAFTAR DOSEN/ =====");
        int no = 1;
        for (Dosen07 d : arrayDaftarDosen) {
            System.out.println("Dosen ke-" + no);
            d.tampilData();
            no++;
        }

        DataDosen07 dataDosen = new DataDosen07();
        dataDosen.numberOfLecturesPerGender(arrayDaftarDosen);
        dataDosen.AverageAgeOfLecturersPerGender(arrayDaftarDosen);
        dataDosen.infoDosenPalingTua(arrayDaftarDosen);
        dataDosen.infoDosenMostYoungest(arrayDaftarDosen);

        scanner.close();
    }
}
