import java.util.Scanner;
public class Dosen07 {
    public String code;
    public String name;
    public boolean gender;
    public int age;

    public Dosen07 (String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Kode Dosen: ");
        this.code = scanner.nextLine();

        System.out.print("Nama Dosen: ");
        this.name = scanner.nextLine();

        System.out.print("Gender (True = Laki-laki, False = Perempuan): ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Umur: ");
        this.age = Integer.parseInt(scanner.nextLine());
    }

    public void tampilData() {
        String jenisKelamin = (this.gender) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + this.code);
        System.out.println("Nama Dosen: " + this.name);
        System.out.println("Gender: " + jenisKelamin);
        System.out.println("Umur: " + this.age);
        System.out.println("-------------------------------------------------");
    }
}
