
import java.util.Scanner;

public class Libreria{
    static ObjLibro o = new ObjLibro();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int n = 0;
         System.out.println("Dimension del arreglo: ");
         n = sc.nextInt();
         sc.nextLine(); 

         ObjLibro[][] m = new ObjLibro[n][n];

         for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                    m[i][j] = new ObjLibro();
                System.out.println("======= Ficha del libro " + (j + 1) + " ========");
                System.out.print("Ingrese el título: ");
                m[i][j].setTitulo(sc.nextLine());

                System.out.print("Ingrese el nombre del autor: ");
                m[i][j].setAutor(sc.nextLine());

                System.out.print("Ingrese el precio: ");
                m[i][j].setPrecio(sc.nextInt());
                sc.nextLine();

                
            }
             
         }
         MostrarObjLibro(m);

    }
    public static void MostrarObjLibro(ObjLibro[][]m){

        ObjLibro mc = null;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
            }
            if (m[i][j] != null){
                if ( mc == null || m[i][j].getPrecio() > mc.getPrecio())
                        mc = m[i][j];  
            }

            
        }
         if (mc != null) {
        System.out.println("\n El libro más caro es...");
        System.out.println("Título: " + mc.getTitulo());
        System.out.println("Autor: " + mc.getAutor());
        System.out.println("Valor: " + mc.getPrecio());
    } else {
        System.out.println("No se encontraron libros en la matriz.");
    }
}
}