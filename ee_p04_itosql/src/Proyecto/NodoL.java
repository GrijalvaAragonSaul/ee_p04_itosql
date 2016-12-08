
package Proyecto;





    public class NodoL<T>{
               private ListaLigada<T> lista;
                          private NodoL<T> siguiente;
                                              private String nombre="";
    
    
 public NodoL(){
   siguiente=null;
 }
 
 
  
  
 public NodoL(ListaLigada<T> p){
                               siguiente=null;
                                           lista=p;
 }
 
 
 public NodoL(ListaLigada<T> p, NodoL<T> siguiente,String n){
     
  this.siguiente=siguiente;
  lista=p;
  nombre=n;
 }

    public ListaLigada<T> getLista() {
                                return lista;
    }

    public void setLista(ListaLigada<T> lista) {
                                          this.lista = lista;
    }

    public NodoL<T> getSiguiente() {
                                 return siguiente;
    }

    public void setSiguiente(NodoL<T> siguiente) {
                                        this.siguiente = siguiente;
    }

    public String getNombre() {
                          return nombre;
    }

    public void setNombre(String nombre) {
                               this.nombre = nombre;
    }
    
    

}
