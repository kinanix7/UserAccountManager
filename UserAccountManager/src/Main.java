
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        Scanner scanner= new Scanner(System.in);
   userManagement.roles.add(new Role(1, "Admin"));




        while (true){
            System.out.println("\n=== Menu de Gestion des Utilisateurs ===");
            System.out.println("1. Ajouter ");
            System.out.println("2. Rechercher ");
            System.out.println("3. Modifier ");
            System.out.println("4. Supprimer ");
            System.out.println("5. Afficher ");
            System.out.println("0. Quitter");

            System.out.print("Enter votre choix : ");
            String choix = scanner.nextLine();

            switch (choix){
                case "1":userManagement.ajouterUtilisateur(); break;
                case "2":userManagement.searchUser();break;
                case "3":userManagement.modifierUtilisateur(); break;
                case "4":userManagement.removeUser(); break;
                case "5":userManagement.displayUsers(); break;
                case "0": System.out.println("Goodbye!"); System.exit(0); break;
                default:
                    System.out.println("Choix invalide!");
            }
        }



    }}