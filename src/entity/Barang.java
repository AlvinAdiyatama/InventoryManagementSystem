
package entity;

public class Barang {

    private int id;
    private String nama;
    private int stok;
    private double harga;

    public Barang() {
    }

    public Barang(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}