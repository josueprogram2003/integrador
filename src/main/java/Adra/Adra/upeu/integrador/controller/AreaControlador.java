package Adra.Adra.upeu.integrador.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Adra.Adra.upeu.integrador.dao.AreaDao;
import Adra.Adra.upeu.integrador.daoimpl.AreaDaoImpl;

/**
 * Servlet implementation class AreaControlador
 */
public class AreaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AreaDao adao= new AreaDaoImpl();
	Gson gson = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AreaControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int opcion = Integer.parseInt(request.getParameter("opc"));
		switch (opcion) {
		//Insertar
		case 1:
			System.out.println(opcion);
			out.println(gson.toJson(adao.insertar(request.getParameter("area"))));
			break;
		//ReadALL
		case 2:
			System.out.println(opcion);
			out.println(gson.toJson(adao.listar()));
			break;
		case 3:
			break;
		default:
			out.println("No hay nada");
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
