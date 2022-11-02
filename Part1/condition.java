import java.util.Scanner;
class condition {
    public static void main (String [] args)
    {
    Scanner keyb = new Scanner(System.in);

    System.out.print("Entrez un nombre entre 1 et 10: ");
    int n = keyb.nextInt();

    if ((n >= 1) && (n<=10)) {
        System.out.println("Votre nombre est correct!");
        System.out.println("Vous avez saisi: " + n);
        } else {
        System.out.println("Votre nombre est incorrect!");
        System.out.println("Vous avez saisi: " + n);
        }
}
}