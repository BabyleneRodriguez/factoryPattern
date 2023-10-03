package SoftEng1_LabAss4_factoryPattern;
import java.util.Scanner;

public class Clinic
{
    public static void printMenu()
    {
        System.out.println();
        System.out.print("LABORATORY ASSIGNMENT 4 - REVISE THE SAMPLE FACTORY DESIGN PATTERN\n");
        System.out.print("RODRIGUEZ, BABYLENE G.\n");
        System.out.print("3BSCS-1\n");
        System.out.println();
    }

    public static void main(String[] args)
    {
        printMenu();

        while (true)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice)
            {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    System.out.println("\nDog's Breed : " + ((Dog) pet).getBreed());
                    System.out.println();

                    break;

                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    System.out.println("\nNumber of Lives: " + ((Cat) pet).getNoOfLives());
                    System.out.println();

                    break;

                case 3:
                    System.out.println("\nEXITING PROGRAM...");
                    System.exit(0);

                    break;

                default:
                    System.out.println("\nThis is not a valid Menu Option! Please Select Another");
                    System.out.println();
                    break;

            }

        }

    }
}

