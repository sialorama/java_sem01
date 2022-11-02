// import java.util.Scanner;
class test {
    public static void main (String [] args)
    {
    // Scanner keyb = new Scanner(System.in);

    // System.out.print("Entrez un nombre entre 1 et 10: ");
    // int n = keyb.nextInt();

    int a = 2;
    int b = 3;
    int c = 5;
    int d = 8;

    if (a + b == c) {
        if (b + c == d) {
            System.out.print("1");
            if (a + c == d) {
                System.out.print("2");
            }
        }
        else {
            System.out.print("3");
        }
    }
    else {
        if (a + d == c){
            System.out.print("4");
        }
        else {
            System.out.print("5");
        }
    }
}
}