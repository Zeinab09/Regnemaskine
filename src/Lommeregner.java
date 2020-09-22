import java.util.Scanner;
public class Lommeregner {
    public static void main(String[]args) {

        System.out.println("Indtast 2 tal:");
        Scanner math = new Scanner(System.in);
        int tal1 = math.nextInt();
        int tal2 = math.nextInt();

        System.out.println("Kunne du tænke dig at +, -, * eller /?");
        String regne = math.next();

        if (regne.equals("+")){
            int total = tal1 + tal2;
            System.out.println(total);
        }
        else if (regne.equals("-")){
            int total = tal1 - tal2;
            System.out.println(total);
        }
        else if (regne.equals("*")){
            int total = tal1 * tal2;
            System.out.println(total);
        }
        else if (regne.equals("/")){
            int total = tal1 / tal2;
            System.out.println(total);
        }

        }

    }

