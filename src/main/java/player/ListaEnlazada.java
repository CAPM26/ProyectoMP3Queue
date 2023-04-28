/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada {
    Cancion cancion;
    ListaEnlazada enlace;
 
    public ListaEnlazada(Cancion n){
        cancion = n;
        enlace = null;
    }
}
