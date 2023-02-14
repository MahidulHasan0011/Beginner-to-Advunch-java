
package oop;


public class parametrizedObject {
    public static void main(String[] args) {
        parametrizeClass variable=new parametrizeClass();
        variable.SetInfo("mahidul","male",11111);
        variable.DisplayInfo();
        parametrizeClass variable2=new parametrizeClass();
        variable2.SetInfo("hasan","male",2222);
        variable2.DisplayInfo();
    }
}
