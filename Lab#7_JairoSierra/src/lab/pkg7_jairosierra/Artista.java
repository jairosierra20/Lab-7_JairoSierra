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
public class Artista extends Persona{
    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList<Usuario> seguidores=new ArrayList();
    private ArrayList<Album> albumes= new ArrayList();

    public Artista(String nombre, String apellido, String usuario, String contrasena, Date fecha) {
        super(nombre, apellido, usuario, contrasena, fecha);
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
