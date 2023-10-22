package com.haryo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
@WebServlet("/DataMahasiswa/Input")
public class Input extends HttpServlet {		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String nama = request.getParameter("nama");
			String nim = request.getParameter("nim");
			String alamat = request.getParameter("alamat");
			String tgl_lahir = request.getParameter("tgl_lahir");
			
			
			request.setAttribute("nama", nama);
			request.setAttribute("nim", nim);
			request.setAttribute("alamat", alamat);
			request.setAttribute("tgl_lahir", tgl_lahir);
			
			
			response.getWriter().println("DATA MAHASISWA");
			response.getWriter().println("NIM: " + nim);
			response.getWriter().println("Nama: " + nama);
			response.getWriter().println("Alamat: " + alamat);
			response.getWriter().println("Tanggal Lahir: " + tgl_lahir);
			
			
			
		}

}
