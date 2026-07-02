package service;

import entity.Barang;
import repository.BarangRepository;

import java.util.List;

public class BarangService {

    private BarangRepository repository = new BarangRepository();

    public void tambahBarang(String nama, int stok, double harga){

        Barang barang = new Barang();

        barang.setNama(nama);
        barang.setStok(stok);
        barang.setHarga(harga);

        repository.tambahBarang(barang);

    }

    public List<Barang> getAllBarang(){

        return repository.getAllBarang();

    }

}