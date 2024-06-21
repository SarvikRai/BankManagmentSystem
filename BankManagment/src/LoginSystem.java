import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /* Array Style[ Reserved, Login id ,Password] */
        String[] login= new String[3];
        /* Array Style[ Reserved, Name, Pan number, mobile number, password] */
        String[] register =new String[5];
        int confirm;
        System.out.println("Welcome to our Bank");
        System.out.println("Please select the desired value:");
        System.out.println("1.Login                               2.Register as new Applicant ");
        int log= input.nextInt();
        if(log==1){
            System.out.println("Welcome back, Kindly Enter your details to get into the User Panel: ");
            System.out.println("Login/Customer ID");
            login[0]= input.nextLine();
            login[1]= input.nextLine();
            System.out.println("Password");
            login[2]=input.nextLine();

        }
        else if(log==2){
            System.out.println("Welcome back, Kindly Enter your details to create a new Account ");
            System.out.print("Name: ");
            register[0]= input.nextLine();
            register[1]= input.nextLine();
            System.out.print("PAN Number: ");
            register[2]=input.nextLine();
            System.out.print("Mobile Number: ");
            register[3]=input.nextLine();
            System.out.print("Password: ");
            register[4]=input.nextLine();
            System.out.println("Are you sure you have input correct details (0 for no & 1 for yes): ");
            confirm= input.nextInt();
            if(confirm==1){
                System.out.println("Thank you for creating account... Kindly check your email for login  details");
            }
            else{
                System.out.println("Re Enter All the details.. Thank you");
            }


        }
        else{
            System.out.println("Please enter a correct value");
        }

    }


}