import java.util.Scanner;
class Branchements_conditionnels{
    public static void main (String [] args)
    {
    Scanner keyb = new Scanner(System.in);

    System.out.print("Entrez un nombre entre 1 et 10: ");
    int n = keyb.nextInt();

    if (n >= 1) && (n<=10) {
        System.out.println("Votre nombre est plus petit que 5!");
        System.out.println("Votre nombre est " + n);
        } else {
        System.out.println("Votre nombre est plus grand que 5!");
        System.out.println("Votre nombre est " + n);
        }
}
}