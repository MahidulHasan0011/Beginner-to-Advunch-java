
package staticMethod;

public class staticBlock {
  static int id;
static String name;


static{
id=001;
name="mahidul";

}
static void Printres(){
    System.out.println("id ="+id);
    System.out.println("");
    System.out.println("name ="+name);
}
    public static void main(String[] args) {
        staticBlock.Printres();
    }
}
