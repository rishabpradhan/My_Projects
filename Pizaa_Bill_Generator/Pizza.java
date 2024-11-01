
/*solution to these problem
there are two types pf pizza (regular and delux)
regular pizza cost 200 rupess and delux cost 300rs
customer can three options after ordering pizza 
1.he can add extra cheese in piza which increase cost by rs20
2.he can add extra topping which can increase cost by rs50
3.he can take away pizza which bag will cost rs 10
*/

public class Pizza {
    private  int price;
    private boolean veg;
    private int extratopping=20;
    private int extracheese=30;
    private int takeaway=10;
    public void pizzaprice(boolean veg){
        if(veg==true){
            this.price=200;
            System.out.println("the price of veg pizza is :"+price);
        }
        else{
            this.price=300;
            System.out.println("the price of non neg pizza is :"+price);
        }
    }
    public void addtopping(){
       this. price=price+extratopping;
        System.out.println("for new price after adding extra topping is :"+price);

    }
    public void extracheese(){
        this.price=price+extracheese;
        System.out.println("price after extrachess is :"+price);

    }
    public void takeaway(){

        this.price=price+takeaway;
        System.out.println("for take away price will be :"+price);
    }

  public static void main(String[] args) {
    Pizza a=new Pizza();
    a.pizzaprice(true);
    a.addtopping();
    a.extracheese();
    a.takeaway();
  }



    
}
