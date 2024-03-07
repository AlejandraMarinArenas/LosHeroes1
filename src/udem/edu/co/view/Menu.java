package udem.edu.co.view;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import udem.edu.co.model.CaracteristicasIroman;
import udem.edu.co.model.impl.HeroesImpl;

public class Menu {
    private Scanner scanner;
    private List<HeroesImpl> heroes;

    public Menu(List<HeroesImpl> heroes) {
        this.heroes = heroes;
        this.scanner = new Scanner(System.in);
    }

    public void listarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void listarTodosHeroes() {
        System.out.println("==  = Lista de heroes ===");
        for (HeroesImpl heroe : heroes) {
            System.out.println(heroe.getNombre() + " - " + heroe.getHabilidades());
        }
    }

    public int menuHeroes() {
        System.out.println("Seleccione uno de los heroes");
        System.out.println("1. Iron Man");
        System.out.println("2. Capitan America");
        System.out.println("3. Thor");
        System.out.println("4. Ant Man");
        System.out.println("5. Dr Strange");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void iniciar() {
        int opcion2;
        do {
            opcion2 = menuHeroes();
            switch (opcion2) {
                case 1:
                    listarTodosHeroes();
                    break;
                case 2:
                    listarMensaje("Saliendo del programa...");
                    break;
                default:
                    listarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion2 != 6);
    }

    private void listarHeroesPorClasificacion(String habilidad) {
        List<HeroesImpl> heroesFiltrados = new ArrayList<>();
        for (HeroesImpl heroe : heroes) {
            for (String habilidadHeroe : heroe.getHabilidades()) {
                if (habilidadHeroe.equals(habilidad)) {
                    heroesFiltrados.add(heroe);
                    break;
                }
            }
        }
        listarMensaje(heroesFiltrados.toString());
    }


    public int listarMenu() {
        System.out.println("Seleccione una opcion");
        System.out.println("1. Listar información de un Heroe");
        System.out.println("2. Listar todos los heroes");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void iniciarMenuPrincipal() {
        int opcion1;
        do {
            opcion1 = listarMenu();
            switch (opcion1) {
                case 1:
                    iniciar();
                    break;
                case 2:
                    listarTodosHeroes();
                    break;
                case 3:
                    listarMensaje("Saliendo del programa...");
                    break;
                default:
                    listarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion1 != 3);
    }
    public static void main(String[] args) {
        List<HeroesImpl> heroes = new ArrayList<>();
        CaracteristicasIroman caracteristicasIroman = new CaracteristicasIroman();
        CaracteristicasCapitan caracteristicasCapitan = new CaracteristicasCapitan();
        CaracteristicasThor caracteristicasThor = new CaracteristicasThor();
        CaracteristicasAntMan caracteristicasAntMan = new CaracteristicasAntMan();
        CaracteristicasDrStrange  caracteristicasDrStrange = new CaracteristicasDrStrange();

        caracteristicasIroman.agregarIroman(new HeroesImpl("Tony ", new ArrayList<>()));
        caracteristicasCapitan.agregarCapitan(new HeroesImpl("Steve", new ArrayList<>()));
        caracteristicasThor.agregarThor(new HeroesImpl("Dios del trueno", new ArrayList<>()));
        caracteristicasAntMan.agregaAntMan(new HeroesImpl("Scott", new ArrayList<>()));
        caracteristicasDrStrange.agregarDrStrange(new HeroesImpl("Stephen", new ArrayList<>()));

        iniciarMenuPrincipal();
    }
}