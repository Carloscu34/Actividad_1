/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ccu33
 */
public class Conexion {
    //URL de conexion= driver de conexion, motor de base de datos: mysql, localhost, 3306, db_empresa_dos
    public final String puerto = "3306";
    public final String bd = "db_empresa_dos";
    public final String urlConexion = String.format( "jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,bd);
     public final String usuario = "root";
     public final String contra = "Carlos123";
     public final String jdbc ="com.mysql.cj.jdbc.Driver";
     public Connection conexionBD;
     public void abrir_conexion(){
     try{
         Class.forName(jdbc);
         conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
         System.out.println("Conexion exitosa :)");
         
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println("algo salio mal :("+ ex.getMessage());
        }
     }
     public void cerrar_conexion(){
     try{
         conexionBD.close();
        } catch(SQLException ex){
            System.out.println("algo salio mal :("+ ex.getMessage());
        }}
    
}
