/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsConcepto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoConcepto {

    private static final String SQL_SELECT = "SELECT codigo_concepto, nombre_concepto, efecto_concepto, estatus_concepto FROM concepto";
    private static final String SQL_INSERT = "INSERT INTO concepto(codigo_concepto, nombre_concepto, efecto_concepto, estatus_concepto) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE concepto SET nombre_concepto=?, efecto_concepto=?, estatus_concepto=? WHERE codigo_concepto = ?";
    private static final String SQL_DELETE = "DELETE FROM concepto WHERE codigo_concepto=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT codigo_concepto, nombre_concepto, efecto_concepto, estatus_concepto FROM empresa WHERE nombre_concepto = ?";
    private static final String SQL_SELECT_CARNET = "SELECT codigo_concepto, nombre_concepto, efecto_concepto, estatus_concepto FROM empresa WHERE codigo_concepto = ?";    

    public List<clsConcepto> consultaConcepto() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsConcepto> conceptos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_concepto");
                String nombre = rs.getString("nombre_concepto");
                String efecto = rs.getString("efecto_concepto");
                String estatus = rs.getString("estatus_concepto");
                clsConcepto concepto = new clsConcepto();
                concepto.setCodigoConcepto(codigo);
                concepto.setNombreConcepto(nombre);
                concepto.setEfectoConcepto(efecto);
                concepto.setEstatusConcepto(estatus);
                conceptos.add(concepto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return conceptos;
    }

    public int ingresaConcepto(clsConcepto concepto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, concepto.getCodigoConcepto());
            stmt.setString(2, concepto.getNombreConcepto());
            stmt.setString(3, concepto.getEfectoConcepto());
            stmt.setString(4, concepto.getEstatusConcepto());

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

    public int actualizaConcepto(clsConcepto concepto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, concepto.getCodigoConcepto());
            stmt.setString(2, concepto.getNombreConcepto());
            stmt.setString(3, concepto.getEfectoConcepto());
            stmt.setString(4, concepto.getEstatusConcepto());

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

    public int borrarConcepto(clsConcepto concepto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, concepto.getCodigoConcepto());
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

    public clsConcepto consultaConceptoPorNombre(clsConcepto concepto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + concepto);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, usuario.getIdUsuario());            
            stmt.setString(1, concepto.getNombreConcepto());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_concepto");
                String nombre = rs.getString("nombre_concepto");
                String efecto = rs.getString("efecto_concepto");
                String estatus = rs.getString("estatus_concepto");

                //usuario = new clsUsuario();
                concepto.setCodigoConcepto(codigo);
                concepto.setNombreConcepto(nombre);
                concepto.setEfectoConcepto(efecto);
                concepto.setEstatusConcepto(estatus);
                System.out.println(" registro consultado: " + concepto);                
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
        return concepto;
    }
    public clsConcepto consultaConceptoPorCodigo(clsConcepto concepto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + alumno);
            stmt = conn.prepareStatement(SQL_SELECT_CARNET);
            stmt.setString(1, concepto.getCodigoConcepto());            
            //stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_concepto");
                String nombre = rs.getString("nombre_concepto");
                String efecto = rs.getString("efecto_concepto");
                String estatus = rs.getString("estatus_concepto");

                //usuario = new clsUsuario();
                concepto.setCodigoConcepto(codigo);
                concepto.setNombreConcepto(nombre);
                concepto.setEfectoConcepto(efecto);
                concepto.setEstatusConcepto(estatus);
                System.out.println(" registro consultado: " + concepto);                
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
        return concepto;
    }    
}
