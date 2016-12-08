//Grijalva Aragon Saul, Juan, David
package Proyecto;




public class Nodo<T>{

    private T dato;
    private Nodo<T> siguiente;
     private ListaLigada datos=new ListaLigada();
    
 
 public Nodo(){
   siguiente=null;
 }
 
 
 public Nodo(T p){
  siguiente=null;
  dato=p;
 }
 

 
 public Nodo(T t, Nodo<T> siguiente){
  this.siguiente=siguiente;
  dato=t;
 }




    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public ListaLigada<T> getLista() {
        return datos;
    }

    public void setLista(ListaLigada<T> lista) {
        this.datos = lista;
    }
    
 
    
    
}


