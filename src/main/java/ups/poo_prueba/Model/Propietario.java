/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Model;

/**
 *
 * @author SAIDA
 */
public class Propietario {
   private String nombre;
    private String cedula;
    private String correo;
    private String fechanacimiento;
    

    public Propietario(String nombre, String cedula, String correo, String fechanacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", fechanacimiento=" + fechanacimiento +'}';
    }
}
