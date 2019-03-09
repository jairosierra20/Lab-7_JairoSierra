/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jairosierra;

import java.io.Serializable;

/**
 *
 * @author Jairo Sierra
 */
public class Cancion implements Serializable{
    private String nombre;
    private String ano;
    private String artista;
    private String duracion;
    private static final long SerialVersionUID=777L;
    public Cancion(String nombre, String ano, String artista, String duracion) {
        this.nombre = nombre;
        this.ano = ano;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
