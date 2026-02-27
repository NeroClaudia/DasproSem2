package FolderJava;
import java.util.Scanner;

public class duties2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan Jumlah Jadwal: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            String[][] jadwal = new String[n][4];
            inputJadwal(jadwal);
            tampilSemuaJadwal(jadwal);
            tampilJadwalSesuaiHari(jadwal);
            tampilJadwalSesuaiMatkul(jadwal);

            scanner.close();
    }
    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Jadwal ke - " + (i + 1));

            System.out.print("Nama mata kuliah: ");
                jadwal[i][0] = scanner.nextLine();
                    
            System.out.print("Ruangan Kuliah: ");
                jadwal[i][1] = scanner.nextLine();

            System.out.print("Hari: ");
                jadwal[i][2] = scanner.nextLine();

            System.out.print("Jam Pelajaran: ");
                jadwal[i][3] = scanner.nextLine();
        }
    }
    static void tampilSemuaJadwal(String[][] jadwal) {
        System.out.println("========= SEMUA JADWAL ========");
        System.out.printf("%-20s %-20s %-15s %-15s\n", "Mata Kuliah", "Ruangan", "Hari", "Jam");
        System.out.println("===============================================");
            for (int i = 0; i < jadwal.length; i++) {
                System.out.printf("%-20s %-20s %-15s %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);   
        }
    }
    static void tampilJadwalSesuaiHari(String[][] jadwal) {
        System.out.print("Masukkan hari yang ingin dicari: ");
            String hari = scanner.nextLine();

        System.out.println("Jadwal pada hari " + hari + ":");

        boolean found = false;
            for (int i = 0; i < jadwal.length; i++) {
                if (jadwal[i][2].equalsIgnoreCase(hari)) {
                    System.out.printf("%-20s %-20s %-15s %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);

                        found = true;
                    }
                if (!found) {
                    System.out.println("Tidak ada jadwal pada hari tersebut");
            }
        }
    }

    static void tampilJadwalSesuaiMatkul(String[][] jadwal) {
        System.out.print("Masukkan mata kuliah yang ingin dicari: ");
            String matKul = scanner.nextLine();

        System.out.println("Jadwal pada mata kuliah " + matKul + ":");

        boolean found2 = false;
            for (int i = 0; i < jadwal.length; i++) {
                if (jadwal[i][0].equalsIgnoreCase(matKul)) {
                    System.out.printf("%-20s %-20s %-15s %-15s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);

                    found2 = true;
            }

                if (!found2) {
                    System.out.println("Tidak ada jadwal pada mata kuliah");
                }
        }
    }
}
