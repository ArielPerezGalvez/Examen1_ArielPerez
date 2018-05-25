package examen1;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private String edad;
    private String correo;
    private String user;
    private String contraseña;
    ArrayList<Clase> lista = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String edad, String correo, String user, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Clase> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clase> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", user=" + user + ", contrase\u00f1a=" + contraseña + ", lista=" + lista + '}';
    }

}//fin de la clase
