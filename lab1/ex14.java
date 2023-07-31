import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(2>1){
            System.out.println("1. Coca\n2. Pepsi\n3. Sprite\n4. Snack\n5. Shutdown Machine");
            System.out.println("Pls enter your number");
            int choose = sc.nextInt();
            if (choose < 1 && choose >5)
                System.out.println("Pls enter the valid number.");
            else if (choose == 5)
                {
                    System.out.println("Machine is shutting down");
                    break;
                }
            else
            {
                switch(choose){
                    case 1:
                    {
                      System.out.println("The price of Coca is 2$, pls enter your amount of money:");
                      int money = sc.nextInt();
                      if(money < 2)
                      {
                          System.out.println("Your money is not enough, pls choose again.");
                          break;
                      }
                      else{
                          System.out.println("Your change is : "+ (money - 2));
                          break;
                      }
                    }
                      case 2:
                      {
                        System.out.println("The price of Pepsi is 3$, pls enter your amount of money:");
                        int money = sc.nextInt();
                        if(money < 3)
                        {
                            System.out.println("Your money is not enough, pls choose again.");
                            break;
                        }
                        else{
                            System.out.println("Your change is : "+ (money - 3));
                            break;
                        }
                      }
                        case 3:
                        {
                          System.out.println("The price of Sprite is 4$, pls enter your amount of money:");
                          int money = sc.nextInt();
                          if(money < 4)
                          {
                              System.out.println("Your money is not enough, pls choose again.");
                              break;
                          }
                          else{
                              System.out.println("Your change is : "+ (money - 4));
                              break;
                          }
                        }
                          case 4:
                          {
                            System.out.println("The price of Snack is 2$, pls enter your amount of money:");
                            int money = sc.nextInt();
                            if(money < 2)
                            {
                                System.out.println("Your money is not enough, pls choose again.");
                                break;
                            }
                            else{
                                System.out.println("Your change is : "+ (money - 2));
                                break;
                            }
                          }
      
      
                        }
    
                      }
  
                    }
    sc.close();
  }

}
    
