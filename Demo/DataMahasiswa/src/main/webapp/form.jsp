<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>FORM MAHASISWA</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
  </head>

  <body>
    <div class="container">
      <div class="header">
        <h2>INPUT DATA MAHASISWA</h2>
      </div>

      <form action="Input" method="post" id="form" class="form">
        <div class="form-control">
          <label for="nim">NIM</label>
          <input
            type="text"
            name="nim"
            placeholder="Nomor Induk Mahasiswa"
            id="nim"
          />
        </div>

        <div class="form-control">
          <label for="nama">Nama</label>
          <input type="text" name="nama" placeholder="Nama Lengkap" id="nama" />
        </div>

        <div class="form-control">
          <label for="alamat">Alamat</label>
          <input type="text" name="alamat" placeholder="Alamat" id="alamat" />
        </div>

        <div class="form-control">
          <label for="tgl_lahir">Tanggal Lahir</label>
          <input
            type="text"
            name="tgl_lahir"
            placeholder="Tanggal Lahir"
            id="tgl_lahir"
          />
        </div>

        <button type="submit" value="submit">Submit</button>
      </form>
    </div>
  </body>
</html>
