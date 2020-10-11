package listaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaApp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<String> EjemLista = new ArrayList<>();
        int opc1, opc2;
        int i;
        String Dato;
        do {
            opc2 = 1;
            System.out.println("Ingrese el numero de la operacion a realizar: ");
            System.out.println("1.-Insertar un dato a la lista");
            System.out.println("2.-Mostrar la lista");
            System.out.println("3.-Actualizar lista");
            System.out.println("4.-Borrar elementos ");
            System.out.println("5.- Comprobar si esta vacia");
            System.out.println("6.-Salir"); 
            opc1 = leer.nextInt();
            switch (opc1) {
                // Insertar datos
                case 1:
                    System.out.println("\nInserte un elemento");
                    Dato = leer.next();
                    EjemLista.add(Dato);
                    break;
                    
                    
                case 2:
                    // Mostrar Lista
                    //Mostrar
                    if (!EjemLista.isEmpty()) {
                        Mostrar(EjemLista);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 3:
                    //Actualizar Lista
                    if (!EjemLista.isEmpty()) {
                        System.out.println("Inserte el indice del elemento");
                        i = leer.nextInt();
                        if (i < 1 || i > EjemLista.size()) {
                            System.out.println("El elemento no existe");
                        } else {
                            System.out.println("Inserte el nuevo dato");
                            Dato = leer.next();
                            EjemLista.set((i - 1), Dato);
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 4:
                    // Borrar elementos / Lista
                    if (!EjemLista.isEmpty()) {
                        System.out.println("Inserte el indice del elemento");
                        i = leer.nextInt();
                        if (i < 1 || i > EjemLista.size()) {
                            System.out.println("El indice no existe");
                        } else {
                            EjemLista.remove((i - 1));
                        }
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 5:
                    if (EjemLista.isEmpty()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("La lista tiene dados");
                    }
                    break;
                    
                    
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Valor no encontrado");
            }

            if (opc1 != 6) {
                System.out.println("Desea hacer otra operacion [0]Si/[1]No");
                opc2 = leer.nextInt();
            }
        } while (opc2 != 1);

    }

    public static void Mostrar(List M) {
        for (int i = 0; i < M.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + M.get(i));
        }
        System.out.println("");
    }
}
