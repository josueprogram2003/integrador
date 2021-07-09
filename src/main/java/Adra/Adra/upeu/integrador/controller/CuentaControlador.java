package Adra.Adra.upeu.integrador.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Adra.Adra.upeu.integrador.dao.CuentaDao;
import Adra.Adra.upeu.integrador.daoimpl.CuentaDaoImpl;

/**
 * Servlet implementation class CuentaControlador
 */
public class CuentaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CuentaDao cdao = new CuentaDaoImpl();
	private Gson gson = new Gson();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CuentaControlador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		System.out.println(user+" "+pass);
		if (cdao.validar(user, pass)==1) {	
			response.sendRedirect("./html/menuAsesor.html");
			//request.getRequestDispatcher("html/menuAsesor.html").forward(request, response);
		} else {
			out.println("Incorrecto");
			//request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		/*
		int x = 0;
		int opcion = Integer.parseInt(request.getParameter("opc"));
		switch (opcion) {
		case 1:
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			System.out.println(user+" "+pass);
			if (cdao.validar(user, pass)==1) {	
				//response.sendRedirect("/html/menuAsesor.html");
				request.getRequestDispatcher("html/menuAsesor.html").forward(request, response);
			} else {
				out.println("Incorrecto");
				//request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
			break;
		case 2:
			
			break;
		default:
			System.out.println("No se encontro el valor uno o dos en el opc mandado");
			break;
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
