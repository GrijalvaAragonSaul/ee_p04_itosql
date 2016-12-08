
package Proyecto;

//Grijalva Aragon Saul
import java.io.IOException;

public class ListaLigada<T> {
                    Nodo inicio;
                          Nodo fin;
                               NodoL iniciolista;
                                          NodoL finlista;
   int size=0;
  
   public ListaLigada(){
    inicio = null;
    fin=null;
   }
   
 public boolean estavacia(){
             return (inicio==null)?true:false;
 }
   
 
  //agrega un elemento al inicio de la lista
  
 
 public void agregar_inicio(T dato){
  if(inicio == null){
      inicio=new Nodo(dato);
  }
  else{
         Nodo temp = inicio;
   
    Nodo nuevo=new Nodo(dato);
                    nuevo.setSiguiente(temp);
    inicio=nuevo;
  }
  size++;
 }
  public int size(){
                  return size;
  }

 public T obtener(int index){
  int contador=0;
              Nodo temporal=inicio;
  while(contador<index){
                       temporal=temporal.getSiguiente();
   contador++;
  }
  return (T) temporal.getDato();
 }
/**
 * 
 * @return el nodo inicial
 */
 public Nodo<T> inicio() {
        return inicio;
    }

  //este metodo elimina el primero de la lista
  
 public void eliminarprimero(){
 inicio=inicio.getSiguiente();
 size--;
 
 }
 
  //metodo para agregar al final
  
 public void agregarfinal(T dato){
 Nodo nuevo=new Nodo(dato,null);
 if(inicio==null){
 fin=nuevo;
 inicio=fin;
 }
 else{
 fin.setSiguiente(nuevo);
 fin=nuevo;
 }
 size++;
 }

 public void agregarfinalista(ListaLigada<T> lista,String n){
     
     
     
 NodoL nuevo=new NodoL(lista,null,n);
 
 
 if(iniciolista==null){
     
     
     
 finlista=nuevo;
 
 
 
 iniciolista=finlista;
 }
 else{
 finlista.setSiguiente(nuevo);
 finlista=nuevo;
 }
 size++;
 }
 

 public void eliminar(int index){
 if(index==0){
   inicio=inicio.getSiguiente();
 }
 else{
    int contador=0;
    Nodo aux=inicio;
    while(contador<index-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 size--;
 }
 
 
 
 
 
 public void eliminarl(int index){
 if(index==0){
     
     
   iniciolista=iniciolista.getSiguiente();
 }
 
 
 else{
    int contador=0;
    NodoL aux=iniciolista;
    while(contador<index-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 size--;
 }
 
  // metodo donde elimina el ultimo elemento de la lista
  
 public void eliminarultimo(){
 int contador=0;
 Nodo aux=inicio;
 while(contador<size-2){
  aux=aux.getSiguiente();
  contador++;
 }
 aux.setSiguiente(null);
 size--;
 if(size==0){
     inicio=null;
 }
 }

 public void recorrer(){
             int cont =0;
                   Nodo aux=inicio;
   while(cont<size){
                      System.out.print("-"+aux.getDato());
             aux=aux.getSiguiente();
      cont++;
   }
 }
 
 
 //Merodo que recorre una lista
 public void recorrerlista(){
 int cont =0;
 
 
 NodoL aux=iniciolista;
   while(cont<size){
       
       
       
     System.out.println(aux.getNombre());
     aux.getLista().recorrer();
     
     
     
     
     
     System.out.println();
     aux=aux.getSiguiente();
     cont++;
   }
 }

 
 
 
public Nodo buscarcadena(String cadena){
 int cont =0;
 
 
 
 
 Nodo aux=inicio;
 Nodo indice=null;
 
 
 
 boolean b=false;
   while(cont<size){
       
       
       
      int x=cadena.compareTo((String) aux.getDato());
                     if(x == 0){
         
                             indice=aux;
         
         
         
               b=true;
         }
                aux=aux.getSiguiente();
                       cont++;
     }
   
   
                                if(b==false){
                                             System.out.println("\nNo Existe Ese Dato");
  }
  
  return indice;
}






public void buscayelimina(String cadena){
            int cont =0;
               NodoL aux=iniciolista;
                             boolean b=false;
 while(cont<size){
                int x=cadena.compareTo((String) aux.getNombre());
      if(x == 0){
         
         eliminarl(cont);
         
         b=true;
         }
                          aux=aux.getSiguiente();
                                           cont++;
   }
            if(b==false){
                    System.out.println("\nNo Existe El Dato");
  }
  
  
}





 public NodoL buscartabla(String cadena){
                                       int cont =0;
                                          NodoL aux=iniciolista;
                                      NodoL indice=null;
 boolean b=false;
   while(cont<size){
                       int x=cadena.compareTo((String) aux.getNombre());
     if(x == 0){
         
         indice=aux;
       
         b=true;
   }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNo Existe Esa Tabla");
  }
 
  return indice;
}

 public void buscarydestruir(String cadena){
           int cont =0;
               Nodo aux=inicio;
                        boolean b=false;
   while(cont<size){
               int x=cadena.compareTo((String) aux.getDato());
                 if(x == 0){
                         eliminar(cont);
         b=true;
         }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNo Existe Ese Campo");
  }
  
}
 
 public String transString(){
	    Nodo<T> temporal = inicio;
    	                        String b = "";
    	while(temporal != null){
    		b += temporal.getDato() + ",";
    		temporal = temporal.getSiguiente();
    	}
    	b += "null";
		return b;
	}
 public static void main(String args[])throws IOException{
    
    ListaLigada lista=new ListaLigada();
    
    
   lista.agregarfinal("Toño");
                lista.agregarfinal("Matias");
                          lista.agregarfinal("Carla");
                                      lista.agregarfinal("rey");
                                                      lista.recorrer();
                                                                    lista.buscarcadena("Saul");
   
 }
}