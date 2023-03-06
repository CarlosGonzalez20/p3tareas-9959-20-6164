/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.daoNomina;
/**
 *
 * @author visitante
 */
//clsFacultad, Hecho por Nelson Josué Pineda Culajay, 9959-21-10015
public class clsDepartamento {
    private String CodFacultad;
    private String NombreFacultad;
    private String EstatusFacultad;

    public clsDepartamento() {
    }

    public clsDepartamento(String CodFacultad) {
        this.CodFacultad = CodFacultad;
    }

    public clsDepartamento(String CodFacultad, String NombreFacultad) {
        this.CodFacultad = CodFacultad;
        this.NombreFacultad = NombreFacultad;
    }

    public clsDepartamento(String CodFacultad, String NombreFacultad, String EstatusFacultad) {
        this.CodFacultad = CodFacultad;
        this.NombreFacultad = NombreFacultad;
        this.EstatusFacultad = EstatusFacultad;
    }

    public String getCodFacultad() {
        return CodFacultad;
    }

    public void setCodFacultad(String CodFacultad) {
        this.CodFacultad = CodFacultad;
    }

    public String getNombreFacultad() {
        return NombreFacultad;
    }

    public void setNombreFacultad(String NombreFacultad) {
        this.NombreFacultad = NombreFacultad;
    }

    public String getEstatusFacultad() {
        return EstatusFacultad;
    }

    public void setEstatusFacultad(String EstatusFacultad) {
        this.EstatusFacultad = EstatusFacultad;
    }


    @Override
    public String toString() {
        return "clsFacultad{" + "CodFacultad=" + CodFacultad + ", NombreFacultad=" + NombreFacultad + ",EstatusFacultad=" + EstatusFacultad + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsDepartamento getBuscarInformacionFacultadPorNombre(clsDepartamento facultad)
    {
        daoNomina daofacultad = new daoNomina();
        return daofacultad.consultaFacultadesPorNombre(facultad);
    }
    public clsDepartamento getBuscarInformacionFacultadPorId(clsDepartamento facultad)
    {
        daoNomina daofacultad = new daoNomina();
        return daofacultad.consultaFacultadesPorId(facultad);
    }    
    public List<clsDepartamento> getListadoFacultades()
    {
        daoNomina daofacultad = new daoNomina();
        List<clsDepartamento> listadoFacultades = daofacultad.consultaFacultades();
        return listadoFacultades;
    }
    public int setBorrarFacultad(clsDepartamento facultad)
    {
        daoNomina daofacultad= new daoNomina();
        return daofacultad.borrarFacultades(facultad);
    }          
    public int setIngresarFacultad(clsDepartamento facultad)
    {
        daoNomina daofacultad = new daoNomina();
        return daofacultad.ingresaFacultades(facultad);
    }              
    public int setModificarFacultad(clsDepartamento facultad)
    {
        daoNomina daofacultad = new daoNomina();
        return daofacultad.actualizaFacultades(facultad);
    }              
}
