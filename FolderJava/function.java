package FolderJava;

public class function {
    static String[] flowerName = {"Aglonema", "Yam", "Alocasia", "Rose"};
    static String[] branchName = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static int[][] flowerStock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };
    static String[] status = new String[branchName.length];
    static int[] flowerPrice = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        displayIncome();
    }
    static void displayIncome() {
        double[] totalIncome = new double[flowerStock.length];
        for (int i = 0; i < flowerStock.length; i++) {
            for (int j = 0; j < flowerStock[i].length; j++) {
                totalIncome[i] += flowerStock[i][j] * flowerPrice[j];
            }

            if (totalIncome[i] > 1500000) {
                status[i] = "Very Good";
            }else {
                status[i] = "Need Evaluation";
            }
        }
            System.out.println("=========================================");
            System.out.println("Nama Cabang\t\tPendapatan Akhir\tStatus");
            System.out.println("=========================================");
            for (int i = 0; i < branchName.length; i++) {
                System.out.printf("\n%-24s %-20.2f %-20s", branchName[i], totalIncome[i], status[i]);
            }
        
    }
}