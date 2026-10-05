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
if (kegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();
        }

        System.out.println("\n=== HASIL VALIDASI ===");
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + kegiatan);
        System.out.println("Jumlah dokumen : " + jumlahDokumen);

        // Validasi kelengkapan dokumen
        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;

            System.out.println("Status : Dokumen tidak lengkap");
            System.out.println("Dokumen kurang : " + kurang);
            System.out.println("Dana penghargaan : Tidak diberikan");
        } else {
            if (kegiatan.equalsIgnoreCase("BELMAWA")
                    || kegiatan.equalsIgnoreCase("BAKORMA")
                    || kegiatan.equalsIgnoreCase("MANDIRI")) {

                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Dokumen lengkap");
                    System.out.println("Dana penghargaan : Diberikan");
                } else {
                    System.out.println("Status : Dokumen lengkap");
                    System.out.println("Dana penghargaan : Tidak diberikan");
                }

        input.close();
    }
}