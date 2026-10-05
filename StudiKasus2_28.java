import java.util.Scanner;
public class StudiKasus2_28 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/DLL): ");
        String kegiatan = input.nextLine();
        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        int jumlahDokumen = input.nextInt();
        System.out.print("Peringkat juara (1, 2, 3, atau 0 jika bukan juara): ");
        int juara = input.nextInt();
        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
        int pendanaan = input.nextInt();
        boolean penghargaan = false;
        String alasan = "";

        input.close();
    }
}