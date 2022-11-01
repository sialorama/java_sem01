import java.util.Scanner;

class DemanderVariable
{
    public static void main (String [] args)
    {
        Scanner keyb = new Scanner (System.in);
        System.out.println("Entrez une valeur pour n");
        int n = keyb.nextInt();
        int nCarre = n * n;
        
        System.out.println("La variable n contient " + n);
        System.out.println("Le carre de " + n + " est " + nCarre);
        System.out.println("Le double de n est " + 2 * n + ".");
    }
}