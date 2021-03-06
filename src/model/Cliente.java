package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase para representar los clientes de la inmobiliaria
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private List<Mensaje> from = new ArrayList<>();
    private ArrayList<Anuncio> anuncios = new ArrayList<>();

    /**
     * Constructor del cliente
     *
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     * @param password contraseña del cliente
     */
    public Cliente(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    /**
     * Constructor auxiliar para no pasar informacion de la contraseña
     *
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     */
    public Cliente(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = "";
        this.anuncios = new ArrayList<Anuncio>();
        this.from = new ArrayList<>();
    }

    /**
     * Getter del nombre
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del apellido
     *
     * @return apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Getter del correo
     *
     * @return correo del cliente
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Getter de la contraseña
     *
     * @return la contraseña del cliente
     */
    public String getPassword() {
        return password;
    }

    /**
     * Getter de los mensajes del cliente
     *
     * @return los mensajes del clientes
     */
    public List<Mensaje> getFrom() {
        return from;
    }

    /**
     * Getter de los anuncios del cliente
     *
     * @return anuncios del cliente
     */
    public ArrayList<Anuncio> getAnuncios() {
        return this.anuncios;
    }

    /**
     * Setter del nombre del cliente
     *
     * @param nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del apellido del cliente
     *
     * @param apellido del cleinte
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Setter del correo del cliente
     *
     * @param correo del cliente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Setter de la contraseña del cliente
     *
     * @param password contraseña nueva del cliente
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Setter de los anuncios del cliente
     *
     * @param anuncios lista de anuncios del cliente
     */
    public void setAnunciosFavoritos(ArrayList<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    /**
     * Setter de la lista de mensajes del cliente
     *
     * @param from la lista de mensajes
     */
    public void setFrom(List<Mensaje> from) {
        this.from = from;
    }

    /**
     * Metodo para enviar un mensaje a un cliente
     *
     * @param mensaje a enviar del cliente interesado
     */
    public void enviarMensaje(Mensaje mensaje) {
        from.add(mensaje);
    }

    public void addAnuncios(Anuncio a) {
        anuncios.add(a);
    }

    @Override
    public String toString() {
    return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + '}';
    }
    
    public String infoCliente() {
        return "Nombre:" + nombre + ", Apellido:" + apellido + ", Correo:" + correo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return true;
    }
}
