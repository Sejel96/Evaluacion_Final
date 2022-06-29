package datos;

import java.sql.*;

import javax.swing.JOptionPane;

public class MantenimientoMatricula  extends Mantenimiento{
	public void  registro_matricula(int id_cliente, int id_vehiculo, String codigo_matricula) {
		try {
			CallableStatement sp = conn.prepareCall("call sp_registro_matricula(?,?,?)");
			sp.setInt("id_cliente", id_cliente);
			sp.setInt("id_vehiculo", id_vehiculo);
			sp.setString("codigo_matricula", codigo_matricula);
			sp.execute();
			} catch (SQLException e5) {
				JOptionPane.showMessageDialog(null,"Error en el driver" + e5);
			}
	}
}
