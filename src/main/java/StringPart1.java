
public class StringPart1 {
    public static void main(String[] args) {
        String S1="MHI";
        String S2=new String("MHI");
        
         String S3="MHI";
        String S4=new String("mHI");
        String S5 =new String("");
        
        if(S1==S2){
            System.out.println("==  Equal");
        }
        else if(S1 !=S2){
            System.out.println("== Not Equal");
        }


  if(S1.contains("MHI") ){
            System.out.println("contains Equal");
            
        }
   if(S1.equals(S2)){
         System.out.println("equals Equal");
        }

   if(S3.equals(S4)){
         System.out.println("equals Equal");
        }else{
      System.out.println("equals not equal");
  }
   
   if(S3.equalsIgnoreCase(S4)){
       System.out.println( "equalsIgnoreCase Equal");
   }else{
       System.out.println("equalsIgnoreCase not");
   }
  
      boolean con=S1.contains("MH");
        System.out.print("con:"+con+"\n");
       boolean isEmp=S5.isEmpty();
        System.out.print("isEmp "+isEmp);
    }
}
