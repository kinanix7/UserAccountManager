import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
    ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    ArrayList<Role> roles = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void ajouterUtilisateur(){
        System.out.print("Enter l'ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter le nom : ");

        String nom = scanner.nextLine();
        System.out.print("Enter l'age : ");
        int age = scanner.nextInt();
        System.out.print("Enter l'email : ");
        String email = scanner.next();
        scanner.nextLine();

        System.out.print("Enter le mot de passe : ");
        String motDePasse = scanner.nextLine();

        System.out.print("Enter le role  : ");
        String rolename = scanner.nextLine();
        Role role = new Role(id, rolename);
        utilisateurs.add(new Utilisateur(id, age, nom, email, motDePasse, role));

    }

    public void modifierUtilisateur(){
        if (utilisateurs.isEmpty()){
        System.out.println("Aucun utilisateur trouve!");
    }
        System.out.print("Enter l'ID de l'utilisateur à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("1. Modifier le nom `\n` 2. Modifier l'age `\n` 3. Modifier l'email `\n` 4. Modifier le role ");
        System.out.print("Enter your choice: ");
        String choix = scanner.nextLine();
        scanner.nextLine();
        for (Utilisateur utilisateur : utilisateurs){
            if (utilisateur.getId() == id){

                switch (choix){
                    case "1":
                        System.out.print("Enter le nouveau nom : ");
                        utilisateur.setNom(scanner.nextLine());


                        break;
                    case "2":
                        System.out.print("Enter le nouvel age : ");
                        utilisateur.setAge(scanner.nextInt());
                        break;
                    case "3":
                        System.out.print("Enter le nouvel email : ");
                        utilisateur.setEmail(scanner.nextLine());
                        break;
                    case "4":
                        System.out.print("Enter le nouveau role : ");
                        String rolename = scanner.nextLine();
                        Role role = new Role(id, rolename);
                        break;
                    default:
                        System.out.println("Choix invalide!");

                }
            }
        }





    }


    public void removeUser(){
        System.out.print("Enter l'ID de l'utilisateur à supprimer : ");
        int id = scanner.nextInt();
        if (utilisateurs.isEmpty()){
            System.out.println("Aucun utilisateur trouve!");
            return;
        }

        utilisateurs.removeIf(utilisateur -> utilisateur.getId() == id);
    }


    public void searchUser(){
        String valueSearch;
        ArrayList<Utilisateur> usersFound = new ArrayList<>();
        System.out.print("Enter Email ou le nom   de l'utilisateur à rechercher : ");
        valueSearch = scanner.nextLine();

        for (Utilisateur utilisateur : utilisateurs){
            if (utilisateur.getNom().contains(valueSearch)
                    || utilisateur.getEmail().contains(valueSearch)
                    || utilisateur.getRole().getRoleName().contains(valueSearch)){

                usersFound.add(utilisateur);
            }
        }

        if (usersFound.isEmpty()){
            System.out.println("Aucun utilisateur trouve!");

        }else {
            for (Utilisateur utilisateur : usersFound){
                System.out.println(utilisateur);
            }
        }


    }


    public void displayUsers(){
        if (utilisateurs.isEmpty()){
            System.out.println("Aucun utilisateur trouve!");
            return;
        }
        for (Utilisateur utilisateur : utilisateurs){
            System.out.println(utilisateur);
        }
    }

}