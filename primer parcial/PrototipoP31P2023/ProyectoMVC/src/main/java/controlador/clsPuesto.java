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
public class clsPuesto {
    private String CarnetAlumno;
    private String NombreAlumno;
    private String DireccionAlumno;
    private String TelefonoAlumno;
    private String EmailAlumno;
    private String EstatusAlumno;

    public String getCarnetAlumno() {
        return CarnetAlumno;
    }

    public void setCarnetAlumno(String CarnetAlumno) {
        this.CarnetAlumno = CarnetAlumno;
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public String getDireccionAlumno() {
        return DireccionAlumno;
    }

    public void setDireccionAlumno(String DireccionAlumno) {
        this.DireccionAlumno = DireccionAlumno;
    }

    public String getTelefonoAlumno() {
        return TelefonoAlumno;
    }

    public void setTelefonoAlumno(String TelefonoAlumno) {
        this.TelefonoAlumno = TelefonoAlumno;
    }

    public String getEmailAlumno() {
        return EmailAlumno;
    }

    public void setEmailAlumno(String EmailAlumno) {
        this.EmailAlumno = EmailAlumno;
    }

    public String getEstatusAlumno() {
        return EstatusAlumno;
    }

    public void setEstatusAlumno(String EstatusAlumno) {
        this.EstatusAlumno = EstatusAlumno;
    }

    public clsPuesto(String CarnetAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno, String EmailAlumno, String EstatusAlumno) {
        this.CarnetAlumno = CarnetAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
        this.EmailAlumno = EmailAlumno;
        this.EstatusAlumno = EstatusAlumno;
    }

    public clsPuesto(String CarnetAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno, String EmailAlumno) {
        this.CarnetAlumno = CarnetAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
        this.EmailAlumno = EmailAlumno;
    }

    public clsPuesto(String CarnetAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno) {
        this.CarnetAlumno = CarnetAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
    }

    public clsPuesto(String CarnetAlumno, String NombreAlumno, String DireccionAlumno) {
        this.CarnetAlumno = CarnetAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
    }

    public clsPuesto(String CarnetAlumno, String NombreAlumno) {
        this.CarnetAlumno = CarnetAlumno;
        this.NombreAlumno = NombreAlumno;
    }

    public clsPuesto(String CarnetAlumno) {
        this.CarnetAlumno = CarnetAlumno;
    }

    public clsPuesto() {
    }

    
    @Override
    public String toString() {
        return "clsAlumnos{" + "CarnetAlumno=" + CarnetAlumno + ", NombreAlumno=" + NombreAlumno + ", DireccionAlumno=" + DireccionAlumno + ", TelefonoAlumno=" + TelefonoAlumno + ", EmailAlumno=" + EmailAlumno + ", EstatusAlumno=" + EstatusAlumno + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsPuesto getBuscarInformacionAlumnosPorNombre(clsPuesto alumno)
    {
        daoConcepto daoalumnos = new daoConcepto();
        return daoalumnos.consultaAlumnosPorNombre(alumno);
    }
    public clsPuesto getBuscarInformacionAlumnosPorCarnet(clsPuesto alumno)
    {
        daoConcepto daoalumnos = new daoConcepto();
        return daoalumnos.consultaAlumnosPorCarnet(alumno);
    }    
    public List<clsPuesto> getListadoAlumnos()
    {
        daoConcepto daoalumnos = new daoConcepto();
        List<clsPuesto> listadoAlumnos = daoalumnos.consultaAlumnos();
        return listadoAlumnos;
    }
    public int setBorrarAlumnos(clsPuesto alumno)
    {
        daoConcepto daoalumnos = new daoConcepto();
        return daoalumnos.borrarAlumnos(alumno);
    }          
    public int setIngresarAlumnos(clsPuesto alumno)
    {
        daoConcepto daoalumnos = new daoConcepto();
        return daoalumnos.ingresaAlumnos(alumno);
    }              
    public int setModificarAlumnos(clsPuesto alumno)
    {
        daoConcepto daoalumnos = new daoConcepto();
        return daoalumnos.actualizaAlumnos(alumno);
    }              
}
