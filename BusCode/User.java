package BusCode;

import java.util.*;
import DatabaseConnection.*;
public class User {

    static int id = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome --");

        char cont = 'n';
        do {
            System.out.print("Enter Name : ");
            String name = sc.next();

            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            System.out.print("Enter Gender : ");
            String gender = sc.next();

            System.out.print("Enter SeatNo : ");
            int seatNo = sc.nextInt();


            InsertUserData data = new InsertUserData();
            try {
                id = id+1;
                int res =  data.insertUserData(id,name,age,gender,seatNo);
                System.out.println(res>0 ? "value inserted ": "value is Not inserted");
            }
            catch (Exception ec) {
                System.out.println("The seat is Already Booked --");
            }
            System.out.println("Do You Want to continue the Booking enter -> y :");
            cont = sc.next().charAt(0);
        }while(cont == 'y');


    }

}
