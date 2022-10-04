import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        boolean x = true;
        int quantity = 0;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] array = text.split(" ");
        int[] numbers = new int[array.length];
        for (int i = 0; i< array.length; i++)
        {
            numbers[i] = Integer.parseInt(array[i]);
        }
        for (int j = 0; j<numbers.length; j++)
        {
            int count = numbers[j];
            if ( count == 0)
            {
                quantity++;
                if(quantity == 2 && x != false)
                {
                    System.out.println(true);
                    x = false;
                }
            }
            for ( int z = 1; z<numbers.length; z++) {
                if ( x == true && count*-1 == numbers[z] && count !=0) {
                    System.out.println(true);
                    x = false;
                }
                else if ( j == numbers.length-1 && z == numbers.length-1 && x ==true && quantity !=2)
                {
                    System.out.println(false);
                }
            }
        }
    }
}