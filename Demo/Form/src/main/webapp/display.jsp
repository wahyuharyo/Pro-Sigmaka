<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DATA MAHASISWA</title>
<link href="https://fonts.googleapis.com/css?family=Muli&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Muli&display=swap" rel="stylesheet">
<link rel="stylesheet" href="resources/review.css">

<script>
        function goBack() {
            window.location.href = 'http://localhost:8080/Form/input.jsp';
        }
        
    </script>
</head>


<body>
	<div class="container">
      <div class="header">
        <h2>DATA MAHASISWA</h2>
      </div>
      
     <div class="notification">
            <script>
                // Tambahkan skrip langsung untuk menampilkan notifikasi
                alert('Data berhasil diinput ke database!');
            </script>
        </div>
      
      
      <form id="form" class="form">
        <div class="form-control">
          <label for="name">NIM</label>
          <input type="text" name="nim" placeholder="Nomor Induk Mahasiswa" id="nim" value="${result.getNim()}" disabled />
        </div>

        <div class="form-control">
          <label for="name">Nama</label>
          <input type="text" name="nama" placeholder="Nama Lengkap" id="nama" value="${result.getNama()}" disabled />
        </div>

        <div class="form-control">
          <label for="name">Alamat</label>
          <input type="text" name="alamat" placeholder="Alamat" id="alamat" value="${result.getAlamat()}" disabled />
        </div>

        <div class="form-control">
          <label for="name">Tanggal Lahir</label>
          <input type="text" name="tglLahir" placeholder="Tanggal Lahir" id="tglLahir" value="${result.getTglLahir()}" disabled />
        </div>
        
         <button type="button" onclick="goBack()">Kembali</button>
        </form>
    </div>
</body>
</html>