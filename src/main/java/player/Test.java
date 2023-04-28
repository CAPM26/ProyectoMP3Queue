/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        ColaPlaylist cl = new ColaPlaylist();
        ObjetoCancion n;
        ListaEnlazada q;
        ListaEnlazadaOrdenada p;
        try{
            n = new ObjetoCancion("cesar", "mp3");
            q = new ListaEnlazada(n);
            p = new ListaEnlazadaOrdenada();
            
            cl.insertar("andrea");
            cl.insertar(11);
            cl.insertar("Cancion.mp3");
            cl.insertar(n);
            cl.insertar(p.insertarOrdenado(n));
            
            
            while(!cl.colaVacia()){
                System.out.println(cl.quitar());
            }
        }catch (Exception ex){
            System.out.println("Hubo clavo " + ex.getMessage());
        }
        
        System.out.println("fin");
    }
    
}
