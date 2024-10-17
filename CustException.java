import java.util.Scanner;

class InvalidAmountException extends Exception{
    public InvalidAmountException(){
            super();
        }
        public InvalidAmountException(String message){
            super(message);
        }
    }
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super();
    }
        public InsufficientFundsException(String message){
            super(message);
        }

    }

public class CustException{
    public static void main(String[] args){
        int n, flag =1, ch;
        int[] accNumber = new int[25];
        int[] amount = new int[25];
        String[] Names = new String[25];
        Scanner scan = new Scanner(System.in);
        CustException e = new CustException();

        System.out.print("Enter No. of Customers: ");
        n = scan.nextInt();
        e.accounts(n, Names, accNumber, amount);

        System.out.println("Banking System");
        System.out.println("1. Display All Accounts");
        System.out.println("2. Search Account");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Withdraw Amount");
        System.out.println("5. Exit");

        while(flag ==1){
            System.out.println("Enter Choice: ");
            ch = scan.nextInt();
            switch(ch){
                case 1:
                    e.display(n, Names, accNumber, amount);
                    break;
                case 2:
                    e.search(n,Names,accNumber,amount);
                    break;
                case 3:
                    e.deposit(n,accNumber, amount);
                    break;
                case 4:
                    e.withdraw(n, accNumber, amount);
                    break;
                case 5:
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }
            scan.close();
        }
    public void accounts(int n, String[] Names, int[] accNumber, int[] amount)
        {
        Scanner scan = new Scanner(System.in);

                for (int i =0; i< n; i++){
                    System.out.print("Enter Customer Name: ");
                    Names[i] = scan.next();
                    System.out.print("Enter Account Number: ");
                    accNumber[i] = scan.nextInt();
                    System.out.print("Enter Balance: ");
                    amount[i] = scan.nextInt();
                    System.out.print("\n");
                }

            }
    public void display(int n, String[] Names, int[] accNumber, int[] amount){
                for(int i =0; i<n; i++){
                    System.out.print("Account Name: "+ Names[i]+ " -> Account Number: "+ accNumber[i] + " -> Account Balance: "+ amount[i] + "\n");
                    }
                }
    public void search(int n, String[] Names, int[] accNumber, int[] amount){
        int acno, flag =0, pos = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acno = scan.nextInt();
        for(int i =0; i<n; i++){
            if(accNumber[i] == acno){
                flag = 1;
                pos = i;
                break;
            }
        }
        if(flag == 1){
            System.out.print("Account Name: " + Names[pos] + "-> Account Number: " + accNumber[pos] + "-> Account Balance: "+ amount[pos] + "\n");
        }
        else{
            System.out.println("Account not found");
        }
    }
    
    public void deposit(int n, int[] accNumber, int[] amount){
        int acno, flag = 0, pos = 0, balance;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acno =  scan.nextInt();
        for(int i =0; i<n; i++){
            if(accNumber[i]== acno){
                flag = 1;
                pos = i;
                break;
            }
        }
        if(flag == 1){
            System.out.print("Enter amount to be deposited: ");
            balance = scan.nextInt();
            try{
                if (balance <= 0){
                    throw new InvalidAmountException("invalid amount");
                }
                else{
                    amount[pos] = amount[pos] + balance;

                }
            }
            catch(InvalidAmountException e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Account not found");
        }
    }
    public void withdraw(int n, int[] accNumber, int[] amount){
        int acno, flag =0, pos = 0, withdraw;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acno = scan.nextInt();
        for(int i = 0; i<n;i++){
            if(accNumber[i] == acno){
                flag = 1;
                System.out.print("Enter amount to be Withdrawn: ");
                withdraw = scan.nextInt();
                try{
                    if(withdraw <= 0){
                        throw new InvalidAmountException("invalid amomunt");
                    }
                    else if(withdraw>amount[i]){
                        throw new InsufficientFundsException("Insufficient");
                    }
                    else {
                        amount[i] -= withdraw;
                        System.out.println("Withdrawn Successfully!");

                    }
                }
                catch(InvalidAmountException e ){
                    System.out.println(e);

                }
                catch(InsufficientFundsException e){
                    System.out.println(e);
                }
                break;

                }
            }
        if (flag == 0){
            System.out.println("Account not Found");

        }
    }
}


