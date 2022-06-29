package datos;

import java.sql.*;

import javax.swing.JOptionPane;


public class Mantenimiento {
	
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost:3306/carros";
	public String usuario="root";
	public String clave="";
	public Connection conn;
	public ResultSet data;
	public PreparedStatement PreSta;
	
	
	
	public Mantenimiento() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(cadena,usuario,clave);
			} catch (ClassNotFoundException e1) {
				JOptionPane.showMessageDialog(null,"Error en el driver" + e1);
			} catch (SQLException e2){
				JOptionPane.showMessageDialog(null,"Error en el driver" + e2);
		}
	}

}
