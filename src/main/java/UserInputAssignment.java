
import java.util.Scanner;


public class UserInputAssignment {
    public static void main (String []args){
    Scanner input =new Scanner (System.in);
     int id;
     String title;
     double price;
     String description;
     String category;
    System.out.print("enter id: ") ;
    id=input.nextInt();
    
   
     System.out.print("enter title: ") ;
     title= input.nextLine();
      
  
     System.out.print("enter price: ") ;
     price= input.nextDouble();
    
    
     System.out.print("enter description: ") ;
     description=input.nextLine();

     System.out.print("enter category: ") ;
     category=input.nextLine();
     
     		
    System.out.println("\nThe product"  );
    System.out.println("----------------"  );
    System.out.println("ID : "+id  );
    System.out.println("Title : "+title  );
    System.out.println("price : "+price  );
    System.out.println("description : "+description  );
    System.out.println("catgory : "+category  );
//    System.out.print("enter id" +id) ;
//    System.out.print("Enter title"+title);
//    System.out.print("Enter price"+price);
//    System.out.print("Enter description"+description);
//    System.out.print("Enter category"+category);
    }
    
}
