import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        System.out.println("Enter a coordinate point on a 3x3 grid. Ex. 3, 3");
        String input = scr1.nextLine();

        input = input.replaceAll("\\s", "");
        int x = Integer.parseInt(input.substring(0, input.indexOf(',')));
        int y = Integer.parseInt(input.substring(input.indexOf(',')+1));

        if (x > 3 || y > 3) {
            System.out.println("Please enter number that are less than or equal to three (3)");
            System.exit(1);
        }

        System.out.println("What number do you want to put there?");
        int data = scr2.nextInt();

        int[][] arr = new int[3][3];

        int newX = x-1;
        int newY = y-1;

        arr[newX][newY] = data;

        System.out.println(arr[newX][newY]);

    }
}