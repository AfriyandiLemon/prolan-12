package layanan;

import java.util.Scanner;

public class Bunga extends Jasa {

    Scanner input1;

    private int jumlah;
    private int total;
    private double tambahan = 10000;
    private String nama;
    private String tabungan;

    public Bunga(String jenis, int Jumlah) {
        super(jenis, Jumlah);
        this.input1 = new Scanner(System.in);
        System.out.println("(modifikasi pada konstruktor)");
    }

    public int getJumlah() {
        System.out.println("Jumlah yang disetor = " + jumlah);
        return jumlah;
    }

    public void setJumlah() {
//        input1.next();
        System.out.println("Masukkan jumlah nominal yang ingin disetor = ");
        jumlah = input1.nextInt();
    }

    public int getTotal() {
        total = (int) (jumlah + tambahan);
        System.out.println("total tabungan Anda sekarang = " + total);
        return total;

    }

    public double getTambahan() {
        if (jumlah > 20000) {
            tambahan = 0.1 * jumlah;
        } else if (jumlah >= 50000) {
            tambahan = 0.15 * jumlah;
        } else if (jumlah >= 100000) {
            tambahan = 0.2 * jumlah;
        }
        System.out.println("Tambahan Bunga = " + tambahan);
        return tambahan;
    }

    public void setNama() {
        System.out.println("Masukkan nama anda : ");
        nama = input1.nextLine();
    }

    public String getNama() {
        System.out.println("Nama Anda = " + nama);
        return nama;
    }

    public String getTabungan() {
        System.out.println("Penyedia Jasa = " + tabungan);
        return tabungan;
    }

    public void setTabungan() {
        System.out.println("List penyedia layanan jasa: ");
        System.out.println("[| Mandiri | BCA | BNI | BRI | CIMB |");
        System.out.println("Masukkan nama penyedia jasa Tabungan : ");
        tabungan = input1.nextLine();
    }

}
