/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.*;

public class Menu {

    List<String> listaCU = new ArrayList<>();
    List<String> listaBuenavista = new ArrayList<>();
    List<String> listaXochimilco = new ArrayList<>();
    Scanner sc = new Scanner (System.in);
    int cartelera;
    public Menu() {
    }


    public void menuPrincipal(){
        listaCU.addAll(List.of("Five Nights at Freddy´s ", "Barbie", "Super Mario Bros ", "Oppenheimer", "Godzilla vs Kong"));
        listaBuenavista.addAll(List.of("Five Nights at Freddy´s ", "Barbie", "Super Mario Bros", "Los increíbles", "Godzilla vs Kong"));
        listaXochimilco.addAll(List.of("Hercules", "Buscando a Nemo", "Super Mario Bros", "El Rey León", "Godzilla vs Kong"));

        int opcion=0;

        IA();
        System.out.println("""
                ¡Bienvenido  a A.C.C.I.O.N!
                Yo soy Rob, tu asistente personal.
                A continuacion se presentara un menu, favor de seleccionar la opcion de su agrado.
                """);
        do {

            try {
                System.out.println("\n");
                System.out.println("""
                        1. Ver Cartelera 
                        2. Buscar película
                        4. Iniciar Sesión
                        5. Buscar producto
                        6. Ver Carrito
                        7. Ver carrito 
                        8. Comprar
                        9. Actualizar Datos Personales
                        10. Registrarse
                        11. Ver Mis compras (solo si inició sesión)
                        12.Ver Mis puntos (solo si inició sesión)
                        13.Salir
                        """);
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        IA();
                        System.out.println("Favor de seleccionar una sucursal.");
                        do {
                            System.out.println("\n");
                            try {
                                System.out.println("""
                                        1.-A.C.C.I.O.N CU
                                        2.-A.C.C.I.O.N Buenavista
                                        3.-A.C.C.I.O.N Xochimilco
                                        """);
                                System.out.print("Opcion: ");
                                cartelera = sc.nextInt();
                            } catch (InputMismatchException e) {
                                IA();
                                System.out.println("Favor de solo ingresar numeros.");
                                sc.next();
                            }
                            if (cartelera<1 || cartelera>3){
                                IA();
                                System.out.println("""
                                        ¡Oh! parece que has seleccionado una opcion no valida.
                                        Por favor intente de nuevo. 
                                        """);
                            }
                            if(cartelera==1){
                                verCartelera(1);
                            }
                            if(cartelera==2){
                                verCartelera(2);
                            }
                            if(cartelera==3){
                                verCartelera(3);
                            }


                        }while(cartelera<1 || cartelera>3);

                        break;
                    case 2:
                        buscarPelicula(cartelera);

                        break;

                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;

                    case 8:
                        break;

                    case 9:
                        break;
                    case 10:
                        break;

                    case 11:
                        break;

                    case 12:
                        break;

                    case 13:
                        break;
                }
            }catch (InputMismatchException e){
                IA();
                System.out.println("""
                        ¡OH!
                        Por favor de solo ingresar numeros :)
                        """);
                sc.next();
            }
        }while(opcion!=13);
    }

    public void verCartelera(int opcion){
        if(opcion==1){
            System.out.println("Se imprime cartelera de la sucursal CU");
            for (int i = 0; i < listaCU.size(); i++) {
                System.out.println(listaCU.get(i));

            }

        }
        if(opcion==2){
            System.out.println("Se imprime cartelera de la sucursal Buenavista");
            for (int i = 0; i < listaBuenavista.size(); i++) {
                System.out.println(listaBuenavista.get(i));

            }
        }

        if(opcion==3){
            System.out.println("Se imprime cartelera de la sucursal Xochimilco");
            for (int i = 0; i < listaXochimilco.size(); i++) {
                System.out.println(listaXochimilco.get(i));

            }
        }


    }

    public void buscarPelicula(int opcion){
        boolean key=false;
        String name=null;
        int op=0;
        if(opcion==1) {

            IA();
            System.out.print("Por favor ingresa el nombre de la pelicula a buscar: ");
            sc.nextLine();
            name = sc.nextLine();
            for (int i = 0; i < listaCU.size(); i++) {
                if (name.equalsIgnoreCase(listaCU.get(i))) {
                    System.out.println("Se encontro pelicula exitosamente");
                    key = true;
                }

            }
            if (key == false){
                try {
                    IA();
                    System.out.println("""
                            Parece que la pelicula que buscas no esta disponible en la sucursal CU ):
                            Si gustas puedo expandir mi busqueda a otras sucursales.
                            """);
                    System.out.println("""
                            1.-Aceptar
                            2.-Rechazar
                            """);
                    System.out.print("Opcion: ");
                    op = sc.nextInt();
                    if (op == 1) {
                        CU(name);
                    }


                } catch (InputMismatchException e) {
                    System.out.println("Oh ha ocurrido un error inesperado");
                    sc.next();
                }
        }

        }

    }
    public void CU(String name){
        for (int i = 0; i < listaBuenavista.size(); i++) {
            if(name.equalsIgnoreCase(listaBuenavista.get(i))){
                System.out.println("Se encontro la pelicula en buenavista");
                IA();
                System.out.println("Favor de cambiar la cartelera a la sucursal Buenavista");
            }
        }
        for (int i = 0; i < listaXochimilco.size(); i++) {
            if(name.equalsIgnoreCase(listaXochimilco.get(i))){
                System.out.println("Se encontro la pelicula en xochimilco");
                System.out.println("Favor de cambiar la cartelera a la sucursal Xochimilco");
            }
        }

    }

    public void IA() {
        System.out.println("""
                 /\\_/\\  
                ( o.o ) 
                 > ^ <
                """);
    }



    }

