package snake;
import java.util.Scanner;

public class Snake {
    public static int m;
    public static String matriz[][];
    public static Scanner sc = new Scanner(System.in);
    public static String datos;
    public static String vector[];
    public static int c=0,c2=0;
    
    public static void main(String[] args) {
        Menu();     
               
    }
    
    public static void Menu(){
          
        int opcion = 0 ;
        
        while(opcion != 4){
            System.out.println(""); 
            System.out.println("\033[32m ******************************************");
            System.out.println("\033[32m *************** BIENVENIDO ***************");
            System.out.println("\033[32m ******************************************");
            System.out.println("");
            System.out.println("\033[34m ******************************************");
            System.out.println("\033[34m ************* Menu Principal *************");
            System.out.println("\033[34m ************* 1. Iniciar Juego ***********");
            System.out.println("\033[34m ********* 2. Datos del Estudiante ********");
            System.out.println("\033[34m **** 3. Historial de partidas jugadas ****");
            System.out.println("\033[34m **************** 4. salir ****************");
            System.out.println("\033[34m ******************************************");
                
            try{
                
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();    
            switch(opcion){
            case 1 :
                    Limpiar();
                    GenerarTabla(); 
                break;
            case 2: Limpiar();   
                    DatosAlumno();
                    
                break;
            case 3: System.out.println("Hola3");;
                break;
            case 4:;
                break;
            default:System.out.println("Ingrese numeros entre 1 y 4");
                break;
        }
        }catch(Exception e){
            System.out.println("Ingrese solo numeros");
            sc.next();
        }
        }

    
    }
    
    public static void GenerarTabla(){
               
        System.out.println("Ingrese su nombre: ");
        datos = sc.next();
        System.out.println("Ingrese tamaño del Tablero: ");
        m = sc.nextInt();
                
        matriz = new String[m][m];
        if(m>=10){
            for(int fila=0; fila<matriz.length;fila++){
                System.out.println(" ");
                    for(int col =0; col<matriz[fila].length;col++){
                        if(matriz[fila][col] != null){
                        }else{
                        matriz[fila][col] = " ";
                        matriz[0][col] = "@ ";
                        matriz[fila][0] = "@ ";
                        
                                               
                        System.out.print(matriz [fila][col]+" ");
                        }
                        Comida();
                        
            }
            
            System.out.print(" ");
                      
        }
             
        }else{
            System.out.println("Ingrese Filas y Columnas mayor a 10");
            GenerarTabla();
        
        }
        
    }
    
    public static void DatosAlumno(){
        System.out.println("Nombre: "+"Johan Leonel Chan Toledo");
        System.out.println("Carne: "+ "201603052");
        System.out.println("Seccion: "+ "E");
        
    
    }
    
    public static void Limpiar(){
        for(int i=0; i<100;i++){
            System.out.println(" ");
        }
    
}
    
    public static void Comida(){
    c =(int)(Math.random()*m-1);
    c2 =(int)(Math.random()*m-1); 
    matriz[c][c2] ="*";
    
    
    }
}
