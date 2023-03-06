/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsEmpleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoDepartamento {

    private static final String SQL_SELECT = "SELECT codigo_aula, nombre_aula, estatus_aula FROM aulas";
    private static final String SQL_INSERT = "INSERT INTO aulas (codigo_aula, nombre_aula, estatus_aula) VALUES(?,?, ?)";
    private static final String SQL_UPDATE = "UPDATE aulas SET nombre_aula=?, estatus_aula=? WHERE codigo_aula = ?";
    private static final String SQL_DELETE = "DELETE FROM aulas WHERE codigo_aula=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT codigo_aula, nombre_aula, estatus_aula FROM aulas WHERE nombre_aula = ?";
    private static final String SQL_SELECT_ID = "SELECT codigo_aula, nombre_aula, estatus_aula FROM aulas WHERE codigo_aula = ?";    

    public List<clsEmpleado> consultaAulas() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsEmpleado> aulas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_aula");
                String nombre = rs.getString("nombre_aula");
                String estatus = rs.getString("estatus_aula");
                clsEmpleado aula = new clsEmpleado();
                aula.setcodigoAula(codigo);
                aula.setNombreAula(nombre);
                aula.setEstatusAula(estatus);
                aulas.add(aula);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return aulas;
    }

    public int ingresaAulas(clsEmpleado aula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, aula.getCodidoAula());
            stmt.setString(2, aula.getNombreAula());
            stmt.setString(3, aula.getEstatusAula());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizaAulas(clsEmpleado aula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, aula.getNombreAula());
            stmt.setString(2, aula.getEstatusAula());
            stmt.setString(3, aula.getCodidoAula());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int borrarAulas(clsEmpleado aula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, aula.getCodidoAula());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsEmpleado consultaAulasPorNombre(clsEmpleado aula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + aula);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, usuario.getIdUsuario());            
            stmt.setString(1, aula.getNombreAula());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_aula");
                String nombre = rs.getString("nombre_aula");
                String estatus = rs.getString("estatus_aula");

                //usuario = new clsUsuario();
                aula.setcodigoAula(codigo);
                aula.setNombreAula(nombre);
                aula.setEstatusAula(estatus);
                System.out.println(" registro consultado: " + aula);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return aula;
    }
    public clsEmpleado consultaAulasPorCodigo(clsEmpleado aula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + aula);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setString(1, aula.getCodidoAula());            
            //stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_aula");
                String nombre = rs.getString("nombre_aula");
                String estatus = rs.getString("estatus_aula");

                //usuario = new clsUsuario();
                aula.setcodigoAula(codigo);
                aula.setNombreAula(nombre);
                aula.setEstatusAula(estatus);
                System.out.println(" registro consultado: " + aula);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return aula;
    }    
}
