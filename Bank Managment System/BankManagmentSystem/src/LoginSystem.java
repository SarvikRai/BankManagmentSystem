import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] credLogin= new String[3];

        System.out.print("Welcome to our Bank:\nPress 1 for login and 2 for new registration: ");
        int a=input.nextInt();
        if(a==1) {
            System.out.println("Kindly Fill in the required details for login. ");
            System.out.print("Enter your name:");
            credLogin[0]= input.nextLine();
            System.out.print("Enter your mobile number: ");
            credLogin[1]=input.nextLine();
            System.out.print("Enter your password: ");
            credLogin[2]=input.nextLine();


        } else if (a==2) {
            System.out.println("Kindly Fill in the required details for registration ");

        }
        else{
            System.out.println("input correct value after reloading the app");
        }
    }

}
