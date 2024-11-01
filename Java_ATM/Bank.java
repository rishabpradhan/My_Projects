import java.util.Scanner;
import java.util.HashMap;

public class Bank extends main {
    Scanner sc =new Scanner(System.in);
    HashMap <Integer,Integer> data =new HashMap<Integer,Integer>();
    
        public void check_user() {
            
                data.put(984123,1235);
                data.put(982332,1234);
                System.out.println("enter your user_id");
                 setUser_id(sc.nextInt());
                System.out.println("enter your 4 digit pin");
                  setUser_pin(sc.nextInt());
                int id=getUser_id();
                            int pin=getUser_pin();
                            if(data.containsKey(id) && data.get(id)==pin){
                            get_useracc();
                            }
                            else{
                                System.out.println("please enter correct Id and Pin");
                            }

            }
            public void get_useracc(){
                System.out.println("choose a number from 1,2,3");
                System.out.println("type 1 for current account");
                System.out.println("type 2 for saving account");
                System.out.println("type 3 for exit");

                
                int num=sc.nextInt();
                switch (num) {
                    case 1:
                    get_checking_acc();
                    get_useracc();
                    
                        
                        break;
                        case 2:
                       get_saving_acc();
                       get_useracc();
                       
                        break;
                        case 3:
                        System.out.println("type 3 for exit");
                        break;
                
                    default:
                        System.out.println("Please enter acorrect number from 1,2,3");

                }

            }
            public void get_checking_acc(){
                System.out.println("select what you want to do with your current account");
                System.out.println("Select-1 for view balance");
                System.out.println("Select-2 for withdraw money");
                System.out.println("select-3 for deposit money");
                System.out.println("select-4 for exit");
                int num=sc.nextInt();
                switch (num) {
                    case 1:
                    System.out.println("money in your bank accountis :"+getchecking());
                        
                        break;
                        case 2:
                        withdraw_checkingacc();
                        get_checking_acc();
                        break;
                        case 3:
                      deposit_checkingacc();
                      get_checking_acc();
                        break;
                        case 4:
                        System.out.println("exit");
                        break;
                        default:
                        System.out.println("Please enter correct number from 1,2,3,4");
                        
                
                   
                }

            }
            public void get_saving_acc(){
                System.out.println("select what you want to do with your saving account"+getsaving());
                System.out.println("Select-1 for view balance");
                System.out.println("Select-2 for withdraw money");
                System.out.println("select-3 for deposit money");
                System.out.println("select-4 for exit");
                int num=sc.nextInt();
                switch (num) {
                    case 1:
                    System.out.println("money in your bank accountis "+getsaving());
                        
                        break;
                        case 2:
                        withdraw_savingacc();
                        get_saving_acc();
                        break;
                        case 3:
                        deposit_savingacc();
                        get_saving_acc();
                        break;
                        case 4:
                        System.out.println("exit");
                        break;
                        default:
                        System.out.println("Please enter correct number from 1,2,3,4");
                        
                
                   
                }


            }
public static void main(String[] args) {
    Bank b=new Bank();
    b.check_user();
}


            
            
}