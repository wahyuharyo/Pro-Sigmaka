package com.haryo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
	private static final String URL = "jdbc:mysql://localhost:3306/data_mhs";
	private static final String USER = "root";
	private static final String PASSWORD = "0852";


	static boolean tambah(Mahasiswa m) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pst = con.prepareStatement("insert into data_mahasiswa(nim, nama, tanggal_lahir, alamat) values(?, ?, ?, ?)");
			pst.setString(1, m.getNim());
			pst.setString(2, m.getNama());
			pst.setString(3, m.getTglLahir());
			pst.setString(4, m.getAlamat());
			int rs = pst.executeUpdate();
			
			return rs > 0;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}

