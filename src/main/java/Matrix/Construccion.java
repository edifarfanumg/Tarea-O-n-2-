package Matrix;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class Construccion {
    
    //public static String[][] ma = new String[8][8];
    
   public void llenarMatrix(){
         Scanner sn=new Scanner(System.in);
        System.out.println("Escribe un tamaño");
        int tamanio=sn.nextInt();
         
        int matriz1[][]=new int[tamanio][tamanio];
        int matriz2[][]=new int[tamanio][tamanio];
         
        int resultado[][]=new int[tamanio][tamanio];
         
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                 
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
                matriz1[i][j]=sn.nextInt();
                System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
                matriz2[i][j]=sn.nextInt();
                 
                resultado[i][j]=matriz1[i][j]*matriz2[i][j];
            }
        }
         
        System.out.println("Matriz 1");
        muestraMatrixx(matriz1);
         
        System.out.println("Matriz 2");
        muestraMatrixx(matriz2);
         
        System.out.println("Matriz resultante");
        muestraMatrixx(resultado);
                 
    }
   public static void muestraMatrixx(int[][] matriz){
     
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
         
    }
}
