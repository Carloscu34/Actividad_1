/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ccu33
 */
public class Cliente extends Persona {
    private String nit;
public Cliente(){}

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public void agregar() {
        // Asegúrate de que este método esté implementado correctamente en la clase Persona
        System.out.println("Nit: " + getNit());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
        System.out.println("______________________________");
    }
}
