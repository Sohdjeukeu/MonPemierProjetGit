package MonPackageGit;

public class Etudiant {
    private String nomEtudaint;
    private String prenomEtudiant;
    private byte ageEtudaint;
    private static int nombreEtudiant;


        // constructeur

    public Etudiant()
    {
        nombreEtudiant += 1;
    }


    public Etudiant(String nom, String prenom, byte age)
    {
         this.nomEtudaint = nom;
        this.prenomEtudiant = prenom;
        this. ageEtudaint = age;
         Etudiant.nombreEtudiant += 1;
    }

    public int getNombreEtudiant()
    {
        return nombreEtudiant;
    }


    public static void creerEtudiant()
    {
        new Etudiant("Sojdjeukeu", "Merlin", (byte) 45);
        new Etudiant("Mbakop", "Bogelette", (byte) 40);
        Etudiant Etudiant1 =  new Etudiant();
        System.out.println(Etudiant1.getNombreEtudiant()); ;
    }



}
