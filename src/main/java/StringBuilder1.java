
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder Name = new StringBuilder("Mahidul");
        System.out.print(Name+"\n");
        Name.append("Hasan");
        System.out.print("append : "+Name+"\n");
        Name.reverse();
        System.out.print("reverse : "+Name+"\n");
        Name.delete(2, 5);
        System.out.print("delete : "+Name+"\n");
        Name.setLength(5);
        System.out.print("setLength :"+Name+"\n");
        
    }
}
