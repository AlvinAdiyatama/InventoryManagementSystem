import entity.Barang;
import service.BarangService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        BarangService service = new BarangService();

        List<Barang> daftarBarang = service.getAllBarang();

        System.out.println("===== DAFTAR BARANG =====");

        for (Barang barang : daftarBarang) {

            System.out.println("ID    : " + barang.getId());
            System.out.println("Nama  : " + barang.getNama());
            System.out.println("Stok  : " + barang.getStok());
            System.out.println("Harga : " + barang.getHarga());
            System.out.println("--------------------------");

        }

    }

}