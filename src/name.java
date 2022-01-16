import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Name");
        System.out.println("Age");

        String namePerson = myObj.nextLine();
        int agePerson = myObj.nextInt();

        if (agePerson<18) {
            System.out.println("Too young to enter");}
            else {
                System.out.println(namePerson+", "+agePerson);
            }
        }


    }

