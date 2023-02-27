/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TypeCasting.NONpremitive;

/**
 *
 * @author DELL
 */
public class upCastingOBJ {
    public static void main(String[] args) {
        upCastingPerson p =new upCastingTeacher();//UpCasting
        p.display();
        
        
        upCastingTeacher t=(upCastingTeacher) new upCastingPerson();//DownCasting
        t.display();
    }
}
