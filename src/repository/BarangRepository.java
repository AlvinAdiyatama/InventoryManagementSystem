package repository;

import database.DatabaseConnection;
import entity.Barang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class BarangRepository {

    public void tambahBarang(Barang barang) {

        String sql = "INSERT INTO barang(nama_barang, stok, harga) VALUES (?, ?, ?)";

        try {

            Connection conn = DatabaseConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

ps.setString(1, barang.getNama());
ps.setInt(2, barang.getStok());
ps.setDouble(3, barang.getHarga());

ps.executeUpdate();

System.out.println("Barang berhasil ditambahkan!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Barang> getAllBarang() {

    List<Barang> daftarBarang = new ArrayList<>();

    String sql = "SELECT * FROM barang";

    try {

        Connection conn = DatabaseConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            Barang barang = new Barang();

            barang.setId(rs.getInt("id"));
barang.setNama(rs.getString("nama_barang"));
barang.setStok(rs.getInt("stok"));
barang.setHarga(rs.getDouble("harga"));
            daftarBarang.add(barang);

        }

    } catch(SQLException e){

        e.printStackTrace();

    }

    return daftarBarang;

}

}