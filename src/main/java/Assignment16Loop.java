
import java.util.Scanner;


public class Assignment16Loop {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user, pass;
//        int count =0;
        
          System.out.print("Enter your user name : ");
            user = input.nextLine();
            System.out.print("Enter your user pass : ");
            pass = input.nextLine();
//          do{
//              System.out.print("Enter your user name : ");
//            user = input.nextLine();
//            System.out.print("Enter your user pass : ");
//            pass = input.nextLine();
//            if(user.equals("mhi")||pass.equals("123456")){
//               System.out.println("welcome to the system");
//               count=1; 
//             break;
//             
//            }else{
//                   System.out.println("Username or password incorrect please try again!");
//            }
//          }while(count ==0)  ; 
       for(int i=1;i<=3;i++){
       if(user.equals("mhi")&& pass.equals("12345")){
       System.out.println("welcome to the system");
       break;
       }else if(user.equals("mhi")&& pass!="12345"){
         System.out.println("password incorrect please try again!");
         break;
       }
       else if(  user != "mhi" && pass.equals("12345")){
         System.out.println("Username incorrect please try again!");
         break;
       }
       else{
        System.out.println("Username or password incorrect please try again!");
        break;
       }
       }
    }
}
