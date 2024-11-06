package com.alura.literalura.app;

import com.alura.literalura.repository.LibroRepository;

import java.util.Scanner;

public class App {
    private LibroRepository repository;

    public App(LibroRepository repository) {
        this.repository = repository;
    }
    public static void mostrarMenu()
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("------------------------------------------------");
            System.out.println("*** Bienvenido a LiterAlura ***");
            System.out.println("1. Buscar libro por título.");
            System.out.println("2. Listar libros registrados.");
            System.out.println("3. Listar autores registrados.");
            System.out.println("4. Listar autores vivos en un determinado año.");
            System.out.println("5. Listar libros por idioma.");
            System.out.println("0. Salir.");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                   // buscarLibroPorTitulo(titulo);
                    break;

                case 2:
                   // listarLibrosRegistrados();
                    break;

                case 3:
                    //listarAutoresRegistrados();
                    break;

                case 4:
                    System.out.print("Ingrese el año: ");
                    int fecha = scanner.nextInt();
                   // listarAutoresVivosPorFecha(fecha);
                    break;

                case 5:
                    System.out.print("Ingrese el idioma: ");
                    String idioma = scanner.nextLine();
                    //listarLibrosPorIdioma(idioma);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo de LiterAlura. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
            System.out.println();
        }

        scanner.close();
    }
}

