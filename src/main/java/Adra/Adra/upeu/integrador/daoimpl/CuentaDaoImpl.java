package Adra.Adra.upeu.integrador.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adra.Adra.upeu.integrador.config.Conexion;
import Adra.Adra.upeu.integrador.dao.CuentaDao;


public class CuentaDaoImpl implements CuentaDao {

	Connection cx;
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public int validar(String user, String pass) {
		int r=0;
		String consulta = "select p.id_p ,p.nombre, p.apellido_p, p.apellido_m, c.id_cuenta from persona p inner join cuenta c where (c.usuario = '"
				+ user +"' and c.contraseña = '"+ pass +"') and (p.id_cuenta = c.id_cuenta);";
		try {
			System.out.println(user +" "+ pass);
			cx = Conexion.getConexion();
			pst= cx.prepareStatement(consulta);
			rs = pst.executeQuery();
			while (rs.next()) {
				r=+1;
				System.out.println(r);
				return r;
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
			return 0;
		}
		return 0;
	}
	
	
	

	

}
