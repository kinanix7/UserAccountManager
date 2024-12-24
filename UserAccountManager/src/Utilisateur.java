public class Utilisateur extends Personne {
     String email;
     String motDePasse;
     Role role;


    public Utilisateur(int id, int age, String nom, String email, String motDePasse, Role role) {
        super(id, age, nom);
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return  "\n     | ID : " + getId() +
                "\n     | Name : " + getNom() +
                "\n     | Age  : " + getAge() +
                "\n     | Email: " + getEmail() +
                "\n     | Role : " + role.getRoleName();
    }
}