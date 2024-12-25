import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
    ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    ArrayList<Role> roles = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void ajouterUtilisateur(){
        System.out.print("Enter l'ID de l'utilisateur : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter le nom de l'utilisateur : ");

        String nom = scanner.nextLine();
        System.out.print("Enter l'age de l'utilisateur : ");
        int age = scanner.nextInt();
        System.out.print("Enter l'email de l'utilisateur : ");
        String email = scanner.next();
        scanner.nextLine();

        System.out.print("Enter le mot de passe de l'utilisateur : ");
        String motDePasse = scanner.nextLine();

        System.out.print("Enter le role de l'utilisateur : ");
        String rolename = scanner.nextLine();
        Role role = new Role(id, rolename);


        utilisateurs.add(new Utilisateur(id, age, nom, email, motDePasse, role));

        System.out.println("Utilisateur ajouté avec succès!");
    }
    public void removeUser(){
        if (utilisateurs.isEmpty()){
            System.out.println("Aucun utilisateur trouvé!");
            return;
        }
        utilisateurs.removeIf(utilisateur -> {
            System.out.print("Enter l'ID de l'utilisateur à supprimer : ");
            int id = scanner.nextInt();
            return utilisateur.getId() == id;
        });
    }




    public void displayUsers(){
        if (utilisateurs.isEmpty()){
            System.out.println("Aucun utilisateur trouvé!");
            return;
        }
        for (Utilisateur utilisateur : utilisateurs){
            System.out.println(utilisateur);
        }
    }

  }