 import java.util.Scanner;
 import java.io.*;
 class main {
    protected int user_id;
    protected int user_pin;
    protected  double checking_balance=0;
    protected double savinging_balance=0;
    Scanner a=new Scanner(System.in);
    
    public void setUser_id(int user_id){
        this.user_id=user_id;
        
    }
    public int getUser_id(){
        return user_id;
    }
    public void setUser_pin(int user_pin){
        this.user_pin=user_pin;
    }
    public int getUser_pin(){
        return user_pin;
    }
    public double getchecking(){
        return checking_balance;
    }
    public double getsaving(){
        return savinging_balance;
    }
    public double checking_withdraw( double amount){
        checking_balance=checking_balance-amount;
        return checking_balance;


    }
    public double checking_deposit(double amount){
        checking_balance=checking_balance+amount;
        return checking_balance;
    }
    public double saving_withdraw(double amount){
        savinging_balance+=amount;
        return savinging_balance;
    }
    public double saving_deposit(double amount){
        savinging_balance+=amount;
        return savinging_balance;
    }
    public void withdraw_checkingacc(){
        System.out.println("money in checking account is"+getchecking());
        System.out.println("Enter amount you want to withdraw");
        double amount=a.nextDouble();
        if((checking_balance+amount)>0){
            checking_withdraw(amount);
            System.out.println("new balance after withdraw is:"+getchecking());
        }
        else{
            System.out.println("Not enough balance");
        }
    }
    public void deposit_checkingacc(){
        System.out.println("money in your checking account is"+getchecking());
       
        try{
            System.out.println("Enter amount you want to deposit");
            double amount=a.nextDouble();
            checking_deposit(amount);
            System.out.println("New balance after deposit is"+getchecking());
        }
        catch (Exception e){
            System.out.println("enter only positive amount"+e.getMessage());

        }

    }
    public void withdraw_savingacc(){
        System.out.println("money in checking account is"+getsaving());
        System.out.println("Enter amount you want to withdraw");
        double amount=a.nextDouble();
        if((checking_balance+amount)>0){
            saving_withdraw(amount);
            System.out.println("New balance after withdraw is:"+getsaving());
        }
        else{
            System.out.println("Not enough balance");
        }
    }
    public void deposit_savingacc(){
        System.out.println("money in your checking account is"+getsaving());
       
        try{
            System.out.println("Enter amount you want to deposit");
            double amount=a.nextDouble();
          saving_deposit(amount);
        }
        catch (Exception e){
            System.out.println("enter only positive amount"+e.getMessage());

        }

    }

    }



