/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.daoPuesto;
/**
 *
 * @author visitante
 */
public class clsNomina {
    private String codigo_jornada;
    private String nombre_jornada;
    private String estatus_jornada;

    public clsNomina() {
    }

    public clsNomina(String codigo_jornada) {
        this.codigo_jornada = codigo_jornada;
    }

    public clsNomina(String nombre_jornada, String estatus_jornada) {
        this.nombre_jornada = nombre_jornada;
        this.estatus_jornada = estatus_jornada;
    }

    public clsNomina(String codigo_jornada, String nombre_jornada, String estatus_jornada) {
        this.codigo_jornada = codigo_jornada;
        this.nombre_jornada = nombre_jornada;
        this.estatus_jornada = estatus_jornada;
    }

    public String getCodigo_jornada() {
        return codigo_jornada;
    }

    public void setCodigo_jornada(String codigo_jornada) {
        this.codigo_jornada = codigo_jornada;
    }

    public String getNombre_jornada() {
        return nombre_jornada;
    }

    public void setNombre_jornada(String nombre_jornada) {
        this.nombre_jornada = nombre_jornada;
    }

    public String getEstatus_jornada() {
        return estatus_jornada;
    }

    public void setEstatus_jornada(String estatus_jornada) {
        this.estatus_jornada = estatus_jornada;
    }
    
    @Override
    public String toString() {
        return "clsJornadas{" + "codigo_jornada=" + codigo_jornada + ", nombre_jornada=" + nombre_jornada + ", estatus_jornada=" + estatus_jornada + '}';
    }
    //Metodos de acceso a la capa controlador
  public clsNomina getBuscarInformacionJornadasPorNombre(clsNomina jornada)
    {
        daoPuesto daojornada= new daoPuesto ();
        return daojornada.consultaJornadasPorNombre(jornada);
    }
    public clsNomina getBuscarInformacionJornadasPorId(clsNomina jornada)
    {
        daoPuesto daojornada= new daoPuesto();
        return daojornada.consultaJornadasporId(jornada);
    }    
    public List<clsNomina> getListadoJornadas()
    {
        daoPuesto daojornada = new daoPuesto();
        List<clsNomina> listadoJornadas = daojornada.consultaJornadas();
        return listadoJornadas;
    }
    public int setBorrarJornada(clsNomina jornada)
    {
        daoPuesto daojornada = new daoPuesto();
        return daojornada.borrarJornada(jornada);
    }          
    public int setIngresarJornada(clsNomina jornada)
    {
        daoPuesto daojornada = new  daoPuesto();
        return daojornada.ingresaJornadas(jornada);
    }              
    public int setModificarJornada(clsNomina jornada)
    {
        daoPuesto daojornada = new daoPuesto();
        return daojornada.actualizaJornadas(jornada);
    }              

}