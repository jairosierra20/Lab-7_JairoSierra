/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jairosierra;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jairo Sierra
 */
public class Usuario extends Persona{
    private ArrayList<Cancion> canciones=new ArrayList();
    private ArrayList<Playlist> lista= new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();

    public Usuario(String nombre, String apellido, String usuario, String contrasena, Date fecha) {
        super(nombre, apellido, usuario, contrasena, fecha);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Playlist> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Playlist> lista) {
        this.lista = lista;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
