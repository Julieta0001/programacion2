package center;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import animal.proccess.Animal;
import animal.proccess.Dog;
import animal.proccess.Duck;
import animal.proccess.Pigeon;
import animal.proccess.Fish;

public class Center {
    Scanner sc;
    ArrayList<Animal> animal;

    public Center() {
        sc = new Scanner(System.in);
        animal = new ArrayList<Animal>();
    }

    public void run() {
        int selection;
        do {
            try{

            this.printMenu();
            selection = sc.nextInt();
            this.selectionMenu(selection);
            }catch(InputMismatchException e){
                System.out.println("select the correct option");
                selection = 0;
                sc.next();
            }catch(Exception e){
                System.out.println(e.getMessage());
                selection = 0;
                sc.next();
            }

        } while (selection != 6);

    }

    public void printAnimal() {
        System.out.println("Seleccione animal:");
        System.out.println("1. Perro");
        System.out.println("2. Pez");
        System.out.println("3. Paloma");
        System.out.println("4. Pato");
    }

    public void register() { 
        int selection;
        String name;
        String specie;
        this.printAnimal();
        selection = sc.nextInt();
        System.out.print("registre nombre:");
        name = sc.next();
        System.out.print("registre especie:");
        specie = sc.next();
        this.printAnimal();
        switch (selection) {
            case 1:
                this.animal.add(new Dog(name, specie));
                break;
            case 2:
                this.animal.add(new Fish(name, specie));
                break;
            case 3:
                this.animal.add(new Pigeon(name, specie));
                break;
            case 4:
                this.animal.add(new Duck(name, specie));
                break;
            default:
                System.out.println("No selection");
                break;
        }

    }

    public void printMenu() {
        System.out.println("====== Menu ======");
        System.out.println("1. Registrar animal");
        System.out.println("2. Mostrar todos los animales");
        System.out.println("3. Mostrar voladores");
        System.out.println("4. Mostrar nadadores");
        System.out.println("5. Mostrar caminador");
        System.out.println("6. salir");
        System.out.print("Ingresa tu opcion: ");
    }

    public void selectionMenu(int option) {
        switch (option) {
            case 1:
                this.register();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.out.println("Good Bye");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
    }
}
