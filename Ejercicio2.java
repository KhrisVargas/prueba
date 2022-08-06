package EJERCICIOS;

import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);

        System.out.println("Ingrese un numero para elegir una opcion:\n" +
                "Opcion 0: Llamar\n" +
                "Opcion 1: Enviar\n" +
                "Opcion 2: Apagar\n" +
                "Opcion 3: Reiniciar\n" +
                "Opcion 4: Autodestruir");
        int opcion=obj.nextInt();

        switch (opcion){
            case 0:
                System.out.println("Haz marcado la opción Llamar");
            case 1:
                System.out.println("Haz marcado la opción Enviar Mensaje");
            case 2:
                System.out.println("Haz marcado la opción Apagar");
            case 3:
                System.out.println("Haz marcado la opción Reiniciar");
            case 4:
                System.out.println("Haz marcado la opción Autodestruir");
            default:
                System.out.println("La opcion que elegiste no existe");

        }
    }
}
