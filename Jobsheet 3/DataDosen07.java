public class DataDosen07 {

    public void tampilSemuDosen(Dosen07[] arrayOfDosen) {
        int no = 1;
        System.out.println("===== /DAFTAR SEMUA DOSEN/ =====");
        for (Dosen07 d : arrayOfDosen) {
            System.out.println("Dosen ke-" + no);
            d.tampilData();
            no++;
        }
    }

    public void numberOfLecturesPerGender(Dosen07[] arrayOfDosen) {
        int laki = 0;
        int perempuan = 0;
        for (Dosen07 d : arrayOfDosen) {
            if (d.gender) {
                laki++;
            }else {
                perempuan++;
            }
        }
        System.out.println("\n===== JUMLAH DOSEN PER GENDER =====");
        System.out.println("Laki-laki  : " + laki + " orang");
        System.out.println("Perempuan  : " + perempuan + " orang");
        System.out.println("-------------------------------------------------");
    }

    public void AverageAgeOfLecturersPerGender(Dosen07[] arrayOfDosen) {
        int totalLaki = 0;
        int totalPerempuan = 0;
        int countLaki = 0;
        int countPr = 0;

        for (Dosen07 d : arrayOfDosen) {
            if (d.gender) {
                totalLaki += d.age;
                countLaki ++;
            }else {
                totalPerempuan += d.age;
                countPr++;
            }
        }
        System.out.println("\n===== RATA-RATA UMUR DOSEN PER GENDER =====");
        if (countLaki > 0) {
            System.out.printf("Laki-laki : %.1f tahun\n", (double) totalLaki / countLaki);
        }else {
            System.out.println("Laki-laki : tidak ada data");
        }
        if (countPr > 0) {
            System.out.printf("Perempuan : %.2f tahun\n", (double) totalPerempuan / countPr);
        }else {
            System.out.println("Perempuan : tidak ada data");
        }
        System.out.println("-------------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
        Dosen07 tertua = arrayOfDosen[0];
        for (Dosen07 d : arrayOfDosen) {
            if (d.age > tertua.age) {
                tertua = d;
            }
        }
        System.out.println("\n===== DOSEN PALING TUA =====");
        tertua.tampilData();
    }

    public void infoDosenMostYoungest(Dosen07[] arrayOfDosen) {
        Dosen07 termuda = arrayOfDosen[0];
        for (Dosen07 d : arrayOfDosen) {
            if (d.age < termuda.age) {
                termuda = d;
            }
        }
        System.out.println("\n===== DOSEN PALING MUDA =====");
        termuda.tampilData();
    }
}
