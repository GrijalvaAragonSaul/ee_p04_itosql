
package Proyecto;

/**
 *
 * @author Saul
 */
import java.io.IOException;
import javax.swing.JOptionPane;


public class Principal {
    ListaLigada tablas=new ListaLigada();
    ListaLigada campos=new ListaLigada();
    
    /*
     Metodo para agregar un campo 
    */
    public void agregarcampo(String campo){
      campos.agregarfinal(campo);
    }
    
    //Metodo para crear la tabla que se requiera
    public void creartabla(String n){
      
    tablas.agregarfinalista(campos,n);
    campos=new ListaLigada();
    JOptionPane.showMessageDialog(null,"TABLA "+n+" CREADA",
            "EXITO",JOptionPane.INFORMATION_MESSAGE);
    }
     
   
   
    public void imprimir(){
                         NodoL aux=tablas.iniciolista; 
                                               Nodo l=null;
     while(aux!=null){
                    System.out.println("\nTABLA :"+aux.getNombre());
                                                   l=aux.getLista().inicio;
     while(l!=null){
      System.out.print("campo :"+l.getDato());
                                 l.getLista().recorrer();
                                               System.out.println();
      l=l.getSiguiente();
     }
     aux=aux.getSiguiente();
     }
     
    }
    
    public String[][] vaciar(String tabla){
                                NodoL aux=tablas.buscartabla(tabla); 
    Nodo l=aux.getLista().inicio;
    String datos[][]=new String [l.getLista().size()+1][aux.getLista().size()];
                      int cam=0;int dat=1;
                                       Nodo d=null;
    System.out.println("\nTABLA :"+aux.getNombre());
    
    while(l!=null){
    
        datos[0][cam]=(String) l.getDato();
                                   d=l.getLista().inicio;
        while(d!=null){
         
         datos[dat][cam]=(String)d.getDato();
                                   d=d.getSiguiente();
         dat++;
      }
      l=l.getSiguiente();
                    cam++;
                          dat=1;
     }
   
    return datos;
    }
    
    //Metodo Que Regresa El Nombre De Las Listas En Un Arreglo
    
    public String[] rtablas(){
           NodoL aux=tablas.iniciolista;
                 String tab[]=new String[tablas.size()];
     int cont=0;
     while(aux!=null){
                    System.out.println("\nTABLA :"+aux.getNombre());
                                             tab[cont]=aux.getNombre();
                                                             aux=aux.getSiguiente();
     cont++;
     }
     return tab;
    }
    
    public String[] rcampos(String tabla){
                          NodoL aux=tablas.buscartabla(tabla);
         Nodo l=aux.getLista().inicio;
                        String tab[]=new String[aux.getLista().size()];
     int cont=0;
     while(l!=null){
                       System.out.println("\ncampo :"+l.getDato());
     tab[cont]=(String) l.getDato();
                          l=l.getSiguiente();
     cont++;
     }
     return tab;
    }
   //Eliminar Tabla
    public void eliminartabla(String tabla){
      tablas.buscayelimina(tabla);
                          JOptionPane.showMessageDialog(null,"TABLA "+tabla+" ELIMINADA",
            "AVISO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void agregardatos(String tabla,String campo,String dato){
                                             NodoL aux=tablas.buscartabla(tabla);
     if(aux!=null){
                       Nodo l=aux.getLista().buscarcadena(campo);
     if(l!=null){
                     l.getLista().agregarfinal(dato);
     
     }
     else{JOptionPane.showMessageDialog(null,"CAMPO INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
     }
     else{JOptionPane.showMessageDialog(null,"TABLA INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
    } 
    
    public void eliminarcampos(String tabla,String campo){
                                    NodoL aux=tablas.buscartabla(tabla);
                                               aux.getLista().buscarydestruir(campo);
     JOptionPane.showMessageDialog(null,"CAMPO "+campo+" ELIMINADO",
            "EXITO",JOptionPane.INFORMATION_MESSAGE);
     
    }
    public String[][] prueba(){
     String [][]t=new String [4][3];
     
     t[0][0]="id";t[0][1]="Nombre";t[0][2]="edad";t[1][0]="423"; t[1][1]="Juan"; t[1][2]="10";
     t[2][0]="3400";t[2][1]="David";t[2][2]="30";t[3][0]="6300";t[3][1]="Toño";t[3][2]="1";
     return t;
    }
    
    //METODO que regresa los nombres de los campos
    
    public ListaLigada regresacampos(String [][]dat){
                        ListaLigada campos=new ListaLigada();
                                  for(int d=0;d<dat[0].length;d++){
      campos.agregarfinal(dat[0][d]);
    }
    campos.recorrer();
                     System.out.println();
    return campos;
    } 
   
    public ListaLigada regresadatos(String [][]dat){   
                             ListaLigada datos=new ListaLigada();
                                              for(int d=1;d<dat.length;d++){
        for(int j=0;j<dat[d].length;j++)
        {
          datos.agregarfinal(dat[d][j]);
        }
    }
    datos.recorrer();
                  return datos;
    } 
   
   public static void main(String args[])throws IOException{
    
    Principal Pro =new Principal();
  
    
 } 
}

