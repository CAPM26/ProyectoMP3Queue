/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author Usuario
 */
public class ColaPlaylist {
    
    protected ListaEnlazada fin;
    protected ListaEnlazada frente;
    protected static int contador;
    
    public ColaPlaylist(){
        fin = frente = null;
        contador = 0;
    }
 
    // Función de utilidad para sacar de la queue el elemento frontal
    public ListaEnlazada quitar()     // eliminar al principio
    {
        if (frente == null)
        {
            System.out.println("\nCola Vacia");
            System.exit(-1);
        }
 
        ListaEnlazada temp = frente;
        System.out.println(temp.cancion.getNombreCancion());
 
        // avanzar al siguiente nodo
        frente = frente.enlace;
        temp = frente;
 
//         si la lista queda vacía
        if (frente == null) {
            fin = null;
        }
 
        // disminuye la cuenta del nodo en 1
        contador++;
 
        // devuelve el elemento eliminado
        return temp;
    }
 
    // Función de utilidad para agregar un elemento a la queue
    public void Insertar(String nCan, String uCan)     // inserción al final
    {
        // asignar un nuevo nodo en un heap
        Cancion n = new Cancion(nCan, uCan);
        ListaEnlazada nodoCancion = new ListaEnlazada(n);
        System.out.println(nCan + uCan);
 
        // caso especial: la queue estaba vacía
        if (frente == null)
        {
            // inicializa tanto la parte delantera como la trasera
            frente = nodoCancion;
            fin = nodoCancion;
        }
        else {
            // actualizar la parte trasera
            fin.enlace = nodoCancion;
            fin = nodoCancion;
        }
 
        // aumenta la cuenta del nodo en 1
        contador++;
    }
 
    // Función de utilidad para devolver el elemento superior en una queue
    public Cancion obtenerFrente()
    {
        // comprobar si hay una queue vacía
        if (frente == null) {
            System.exit(-1);
        }
 
        return frente.cancion;
    }
 
    // Función de utilidad para verificar si la queue está vacía o no
    public boolean isEmpty() {
        return fin == null && frente == null;
    }
 
    // Función para devolver el tamaño de la queue
    private int size() {
        return contador;
    }

    @Override
    public String toString() {
        return "ColaPlaylist{" + "fin=" + fin + ", frente=" + frente + '}';
    }
    
    
}
