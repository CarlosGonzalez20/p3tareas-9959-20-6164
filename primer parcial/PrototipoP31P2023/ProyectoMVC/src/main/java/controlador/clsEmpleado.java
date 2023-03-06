/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.daoDepartamento;
/**
 *
 * @author visitante
 */
public class clsEmpleado {
    private String codigoAula;
    private String NombreAula;
    private String EstatusAula;

    public String getCodidoAula() {
        return codigoAula;
    }

    public void setcodigoAula(String codigoAula) {
        this.codigoAula = codigoAula;
    }

    public String getNombreAula() {
        return NombreAula;
    }

    public void setNombreAula(String NombreAula) {
        this.NombreAula = NombreAula;
    }

    public String getEstatusAula() {
        return EstatusAula;
    }

    public void setEstatusAula(String EstatusAula) {
        this.EstatusAula = EstatusAula;
    }

    public clsEmpleado(String codigoAula, String NombreAula, String EstatusAula) {
        this.codigoAula = codigoAula;
        this.NombreAula = NombreAula;
        this.EstatusAula = EstatusAula;
    }

    public clsEmpleado(String NombreAula, String EstatusAula) {
        this.NombreAula = NombreAula;
        this.EstatusAula = EstatusAula;
    }

    public clsEmpleado(String codigoAula) {
        this.codigoAula = codigoAula;
    }

    public clsEmpleado() {
    }

    @Override
    public String toString() {
        return "clsAulas{" + "codigoAula=" + codigoAula + ", NombreAula=" + NombreAula + ", EstatusAula=" + EstatusAula + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsEmpleado getBuscarInformacionAulaPorNombre(clsEmpleado aula)
    {
        daoDepartamento daoaula = new daoDepartamento();
        return daoaula.consultaAulasPorNombre(aula);
    }
    public clsEmpleado getBuscarInformacionAulaPorCodigo(clsEmpleado aula)
    {
        daoDepartamento daoaula = new daoDepartamento();
        return daoaula.consultaAulasPorCodigo(aula);
    }    
    public List<clsEmpleado> getListadoAulas()
    {
        daoDepartamento daoaula = new daoDepartamento();
        List<clsEmpleado> listadoUsuarios = daoaula.consultaAulas();
        return listadoUsuarios;
    }
    public int setBorrarAulas(clsEmpleado aula)
    {
        daoDepartamento daoaula = new daoDepartamento();
        return daoaula.borrarAulas(aula);
    }          
    public int setIngresarAulas(clsEmpleado aula)
    {
        daoDepartamento daoaula = new daoDepartamento();
        return daoaula.ingresaAulas(aula);
    }              
    public int setModificarAulas(clsEmpleado aula)
    {
        daoDepartamento daoaula = new daoDepartamento();
        return daoaula.actualizaAulas(aula);
    }              
}
