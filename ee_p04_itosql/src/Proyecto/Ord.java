package Proyecto; 



/**
 * @Grijalva Aragon Saul
 * 
 */
public class Ord{
	
    public Ord(){
        
    }
    
    
    public String [] crearTitulo(ListaLigada encabezado){
                            String titulo = encabezado.transString();
                                             String title [] = titulo.split(",");
        return title;
    }
    
    public void imprimir(String [] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
    public void imprimirD(String [] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(" "+arr[i]+" ");
            System.out.println("");
        }
    }
    public void imprimirD1(String [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
            System.out.println("");
        }
    }
    public String [][] crear(String [] arr, int a, int b){
        String [][] matriz = new String [a][b];
        for(int i=0;i<a;i++){
            String elemento = arr[i];
            String array [] = elemento.split(",");
            for(int j=0;j<b;j++){
                String aux = array [j];
                matriz [i][j] = aux;
            }
        }
        return matriz;
    }
    public String [] burbuja(String [] arr){
        Burbuja b = new Burbuja();
        String nuevo [] = b.burbuja(arr);
        return nuevo;
    }
    public String [] quicksort(String [] arr){
        Quicksort<String> q = new Quicksort<String>();
        String nuevo [] = q.qsort(arr, 0, arr.length-1);
        return nuevo;
    }
    
    public String [] seleccionDirecta(String [] arr){
        SeleccionDirecta<String> se = new SeleccionDirecta<String>();
        String nuevo [] = se.seleccion(arr);
        return nuevo;
    }
    public String [] insercionBinaria(String [] arr){
        InserBinaria<String> b = new InserBinaria<String>();
        String nuevo [] = b.insercionB(arr);
        return nuevo;
    }
   
    public String [] crearTN(ListaLigada encabezado,String campo){
    String titulo = encabezado.transString();
        String title [] = titulo.split(",");
        int pos = posicion(title,campo);
	    String [] nuevEnc = cambioEnc(title,pos);
            return nuevEnc;
    }
            
    public String [] crearMatriz(ListaLigada encabezado, ListaLigada datos,String campo,String metodo){
        String titulo = encabezado.transString();
        String title [] = titulo.split(",");
        imprimir(title);
        
        String data = datos.transString();
        String contenido [] = data.split(",");
        System.out.println(datos);
        System.out.println(data);
        //System.out.println(contenido.length);
       
        
        Integer columna = encabezado.size();
        //System.out.println(a);
        Integer total = datos.size();
       // System.out.println(total);
        int filas = total/columna;
        
        String nuevo [] = new String [filas];
        String [][] matriz = new String [filas][columna];
        
       int conta = 0;
        for(int i=0;i<filas;i++){
	        String elemento="";
	       for(int j=0; j<columna; j++){
	         String aux = contenido[conta];
	         matriz[i][j] = aux;
	         elemento+=aux+",";
	         conta++;
	       }
	        nuevo [i] = elemento;
	        //System.out.println(" ");
	    }
	    System.out.println("");
	              System.out.println("");
	                           imprimirD(nuevo);
	                                     System.out.println("");
	                                            System.out.println("");
	                                                       crear(matriz,filas,columna);
	                                                                  int pos = posicion(title,campo);
	    String [] nuevEnc = cambioEnc(title,pos);
	    imprimir(nuevEnc);
	    String [][] nuevoDatos = cambio(matriz,filas,columna,pos); 
	    System.out.println("");
	    System.out.println("");
	    crear(nuevoDatos,filas,columna);
	    String [] orden = concatenar(nuevoDatos,filas,columna);
	    System.out.println("");
	    System.out.println("");
	    String [] ordenado;
	    String burbu = "Burbuja";
	    String quicksort = "Quick Sort";
	    
	    String seleccion = "SeleccionD";
	    String insercion = "InsercionBinaria";
	    if(burbu.equals(metodo)){
                ordenado = burbuja(orden);
        }
        if(quicksort.equals(metodo)){
            ordenado = quicksort(orden);
            return ordenado;
        }
        //if(sharker.equals(metodo)){
          //  ordenado = shakerSort(orden);
            //return ordenado;
        //}
        if(seleccion.equals(metodo)){
            ordenado = seleccionDirecta(orden);
            return ordenado;
        }
        if(insercion.equals(metodo)){
            ordenado = insercionBinaria(orden);
            return ordenado;
        }
	    imprimirD1(orden);
	    
            return orden;
    }
    public void crear(String [][] m,int a,int b){
        String [][] matriz = m;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(""+matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public String[] concatenar(String [][] matriz,int a,int b){
        String nuevo [] = new String [a];
        for (int i=0;i<a;i++){
            String elemento = "";
            for(int j=0;j<b;j++){
                String aux = matriz[i][j];
                elemento+=aux+",";
            }
            nuevo[i] = elemento;
        }
        return nuevo;
    }
    
    public String [][] cambio(String [][] matriz, int a, int b, int pos){
        
        for(int i=0;i<a;i++){
            
            for(int j=0; j<b; j++){
                String aux = matriz[i][pos];
                String cambio = matriz[i][0];
                matriz[i][0]=aux;
                matriz[i][pos]=cambio;
            }
        }
        return matriz;
    }
    
	
    public int posicion(String [] encabezado, String campo){
                                         int tam = encabezado.length;
                                                          int conta = 0;
                                                                for(int i=0;i<tam;i++){
                           String aux = encabezado [i];
                                              if(aux.equals(campo)){
                return conta;
            }
            conta++;
        }
        return 0;
    }
    
    public String [] cambioEnc(String [] titulo, int pos){
	    int n = titulo.length;
	    for(int i=0;i<n-1;i++){
	        if(i==pos){
	            String aux = titulo[pos];
	                           String ord = titulo[0];
	                                  titulo [pos] = ord;
	                                          titulo [0] = aux;
	        }
	    }
	    return titulo;   
	   }
   
}