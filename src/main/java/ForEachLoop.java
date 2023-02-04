
public class ForEachLoop {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6,7,8};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int sum=0;
        for(String y:cars){
            System.out.println(y);
        
        }
        for(int x:num){
            System.out.println("x = "+x);
            sum+=x;
        }
        System.out.println("sum"+sum);
    }
}
