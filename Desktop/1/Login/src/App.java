import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //entradas
        Scanner leerTeclado=new Scanner(System.in);
        String usuario;
        String usuarioBD="Cristiano777";
        String contraseña;
        String contraseñaBD = "ADMIN123*";


        //PROCESO

        System.out.println("INGRESO EDUCHECK");
        System.out.print("\n Digita tu nombre de usuario:");
        usuario= leerTeclado.nextLine();

        System.out.println("Digita tu contraseña");
        contraseña = leerTeclado.nextLine();



        if (usuario.equals(usuarioBD)&& contraseña.equals(contraseñaBD)){
            System.out.println("Apreciado Usuario Bienvenido");
        } else {
            System.out.println("Apreciado Usuario Revisa Tus Datos Por Favor");
        }



        //salidas
    }
}
    

