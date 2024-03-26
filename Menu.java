import java.util.Scanner;


public class Menu {
 
    Menu() {
        String c;
        Scanner sc = new Scanner(System.in);
        do {
            linea();
            System.out.println("Por favor, seleccione una opcion");
            System.out.println("1. Leer procesos desde archivo externo");
            System.out.println("2. Ingresar procesos");
            System.out.println("3. Salir");
            int res = sc.nextInt();
            sc.nextLine();
            switch (res) {
                case 1:
                    submenu1();
                    break;
                case 2:
                    submenu2();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo denuevo");
                    break;
            }
            System.out.println("Desea continuar en el menu principal? s/n");
            c = sc.nextLine();

        } while (c.equals("s") || c.equals("S"));
    }

    void submenu1() {
        Scanner sc = new Scanner(System.in);
        String c;

        do {
            //aquí se ingresa la lectura desde archivo.
            //---------------------------------------------
            
            System.out.println("Desea continuar en este submenu? s/n");
            c = sc.nextLine();
        } while (c.equals("s") || c.equals("S"));

    }

    void submenu2() {
        Scanner sc = new Scanner(System.in);
        String c;
        do {
            linea();
            System.out.println("Ingresa cantidad de procesos: ");
            int res = sc.nextInt();
            for(int j=0;j<=res;j++){
                System.out.println("Ingresa ID");
                int id_p_t = sc.nextInt();
                System.out.println("Ingresa Nombre");
                String nom_p_t = sc.nextLine();
                System.out.println("Ingresa Tamaño");
                int tam_p_t = sc.nextInt();
                System.out.println("Ingresa tiempo requerido para su ejecución");
                int tiemp_p_t = sc.nextInt();
                System.out.println("Ingresa tiempo de llegada");
                int llegada_p_t = sc.nextInt();
                
                //Creación del proceso.
                
                Proceso var = new Proceso(id_p_t, llegada_p_t, tam_p_t, tiemp_p_t, nom_p_t);
            }
    
           
            System.out.println("Desea continuar en este submenu? s/n");
            c = sc.nextLine();

        } while (c.equals("s") || c.equals("S"));
    }

    void linea() {
        System.out.println("---------------------------------------------------------------------------");
    }
    void linea_c(){
        System.out.println("--------------------------------------");
    }
    
}
