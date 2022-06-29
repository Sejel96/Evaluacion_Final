package datos;

import java.sql.*;

import javax.swing.JOptionPane;

public class MantenimientoVehiculo  extends Mantenimiento{
	public void  registro_vehiculos(String  marca, String modelo) {
		try {
			CallableStatement sp = conn.prepareCall("call sp_registro_vehiculos(?,?)");
			sp.setString("marca", marca);
			sp.setString("modelo", modelo);
			sp.execute();
			} catch (SQLException e4) {
				JOptionPane.showMessageDialog(null,"Error en el driver" + e4);
			}
	}
}
