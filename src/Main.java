import java.util.Scanner;
/*
*@Author Emircan Aktaş - 28.Dec.2022
*/
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;//Hak
        int balance = 1500;//Bakiye
        int select;//Seçim
        while (right > 0) {
            System.out.print("Username :");
            userName = inp.nextLine();
            System.out.print("Password :");
            password = inp.nextLine();

            if (userName.equals("admin") && password.equals("12345")) {
                System.out.println("Welcome to our bank!");
                do {
                    System.out.println("Select action ;\n" +
                            "1-Deposit\n" +//Para Yatırma
                            "2-Withdrawal\n" +//Para Çekme
                            "3-Balance Query :\n" +//Bakiye Sorgulama
                            "4-Sign Out");//Çıkış
                    System.out.print("Please select the action you want to perform :");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Money amount :");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Your money is deposited. Current balance :" + balance);
                            break;
                        case 2:
                            System.out.print("Money amount :");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= price;
                                System.out.println("Your money is withdrawn. Current balance :" + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Balance :" + balance);
                            break;
                        case 4:
                            System.out.println("See you again.");
                            break;
                        default:
                            System.out.println("You chose wrong.");

                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Incorrect username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account is blocked please contact the bank.");
                } else {
                    System.out.println("Remaining Rights :" + right);
                }
            }
        }
    }
}
