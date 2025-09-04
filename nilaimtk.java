import java.util.Scanner;
public class nilaimtk {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Nama :");
        String nama = input.nextLine();

        System.out.print("Kelas :");
        String kelas = input.nextLine();

        System.out.print("Jurusan :");
        String jurusan = input.nextLine();

        System.out.print("Mapel :");
        String mapel = input.nextLine();

        System.out.print("Nilai UTS :");
        int nilaiuts = input.nextInt();

        System.out.print("Nilai UAS :");
        int nilaiuas = input.nextInt();

        int nilaiakhir = (nilaiuts + nilaiuas) / 2;
            String predikat;
            if (nilaiakhir >= 60 && nilaiakhir <= 75) {
                predikat = "C";
            } else if (nilaiakhir >= 76 && nilaiakhir <= 80) {
                predikat = "B";
            } else if (nilaiakhir >= 81 && nilaiakhir <= 100) {
                predikat = "A";
            } else {
                predikat = "Tidak ada predikat";
            }

        System.out.println("\n---Hasil Data---");
        System.out.println("Nama    :"+nama);
        System.out.println("Kelas   :"+kelas);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Mapel   :"+mapel);
        System.out.println("Nilai UTS   :"+nilaiuts);
        System.out.println("Nilau UAS   :"+nilaiuas);
        System.out.println("Rata Nilai Akhir    :"+nilaiakhir);
            System.out.println("Predikat : " + predikat);


    }
}
