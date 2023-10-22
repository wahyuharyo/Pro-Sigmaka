package com.haryo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		String nama = request.getParameter("nama");
		String nim	= request.getParameter("nim");
		String alamat = request.getParameter("alamat");
		String tglLahir = request.getParameter("tglLahir");
//		int day = Integer.parseInt(request.getParameter("day"));
//		int month = Integer.parseInt(request.getParameter("month"));
//		int year = Integer.parseInt(request.getParameter("year"));
		
		Mahasiswa m = new Mahasiswa(nama, nim, tglLahir, alamat);
		
		//Menyimpan data
		LoginService mhs = new LoginService();
		mhs.tambah(m);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", m);
		
		return mv;
	}
}
