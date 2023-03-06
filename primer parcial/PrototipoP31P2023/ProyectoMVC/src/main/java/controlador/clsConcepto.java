/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.daoConcepto;
/**
 *
 * @author visitante
 */
public class clsConcepto {
    private String codigoConcepto;
    private String nombreConcepto;
    private String efectoConcepto;
    private String estatusConcepto;

    public clsConcepto(String codigoConcepto, String nombreConcepto, String efectoConcepto, String estatusConcepto) {
        this.codigoConcepto = codigoConcepto;
        this.nombreConcepto = nombreConcepto;
        this.efectoConcepto = efectoConcepto;
        this.estatusConcepto = estatusConcepto;
    }

    public clsConcepto(String codigoConcepto, String nombreConcepto, String efectoConcepto) {
        this.codigoConcepto = codigoConcepto;
        this.nombreConcepto = nombreConcepto;
        this.efectoConcepto = efectoConcepto;
    }

    public clsConcepto(String codigoConcepto, String nombreConcepto) {
        this.codigoConcepto = codigoConcepto;
        this.nombreConcepto = nombreConcepto;
    }

    public clsConcepto(String codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public clsConcepto() {
    }

    public String getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(String codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public String getEfectoConcepto() {
        return efectoConcepto;
    }

    public void setEfectoConcepto(String efectoConcepto) {
        this.efectoConcepto = efectoConcepto;
    }

    public String getEstatusConcepto() {
        return estatusConcepto;
    }

    public void setEstatusConcepto(String estatusConcepto) {
        this.estatusConcepto = estatusConcepto;
    }

    
    
    @Override
    public String toString() {
        return "clsConcepto{" + "codigoConcepto" + codigoConcepto + ", nombreConcepto=" + nombreConcepto + ", efectoConcepto=" + efectoConcepto + ", estatusConcepto=" + estatusConcepto + '}';
    }
    //Metodos de acceso a la capa controlador
  public clsConcepto getBuscarInformacionConceptoPorNombre(clsConcepto concepto)
    {
        daoConcepto daoconcepto= new daoConcepto ();
        return daoconcepto.consultaConceptoPorNombre(concepto);
    }
    public clsConcepto getBuscarInformacionConceptoPorCodigo(clsConcepto concepto)
    {
        daoConcepto daoconcepto= new daoConcepto();
        return daoconcepto.consultaConceptoPorCodigo(concepto);
    }    
    public List<clsConcepto> getListadoConcepto()
    {
        daoConcepto daoconcepto = new daoConcepto();
        List<clsConcepto> listadoConcepto = daoconcepto.consultaConcepto();
        return listadoConcepto;
    }
    public int setBorrarConcepto(clsConcepto concepto)
    {
        daoConcepto daoconcepto = new daoConcepto();
        return daoconcepto.borrarConcepto(concepto);
    }          
    public int setIngresarConcepto(clsConcepto concepto)
    {
        daoConcepto daoconcepto = new  daoConcepto();
        return daoconcepto.ingresaConcepto(concepto);
    }              
    public int setModificarConcepto(clsConcepto concepto)
    {
        daoConcepto daoconcepto = new daoConcepto();
        return daoconcepto.actualizaConcepto(concepto);
    }                           

}