package FolderJava;
import java.util.Scanner;  


public class FinalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Input assignment score: ");   
        int assignmentScore = scanner.nextInt();
        System.out.print("Input quiz score: ");
        int quizScore = scanner.nextInt();
        System.out.print("Input midterm score: ");
        int midtermScore = scanner.nextInt();
        System.out.print("Input final exam score: ");
        int finalExamScore = scanner.nextInt();

        if (assignmentScore < 0 || assignmentScore > 100 || quizScore < 0 || quizScore > 100 || midtermScore < 0 || midtermScore > 100 || finalExamScore < 0 || finalExamScore > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }else {

        double finalScore = ((assignmentScore * 0.2) + (quizScore * 0.2) + (midtermScore * 0.3) + (finalExamScore * 0.3));

        String nilaiHuruf;
        if (finalScore >= 80) nilaiHuruf = "A";
        else if (finalScore >= 73) nilaiHuruf = "B+";
        else if (finalScore >= 65) nilaiHuruf = "B";
        else if (finalScore >= 60) nilaiHuruf = "C+";
        else if (finalScore >= 50) nilaiHuruf = "C";
        else if (finalScore >= 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        System.out.println("======================");
        System.out.println("======================");
        System.out.println("Nilai Akhir: " + finalScore);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");
        
        if (finalScore >= 70) {
            System.out.println("Selamat anda lulus");
        }else {
            System.out.println("Maaf, anda tidak lulus");
        }


        }
        scanner.close();
        
    }
}
