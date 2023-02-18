/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritingPrivateMember;

/**
 *
 * @author DELL
 */
public class InheritingObj {
    public static void main(String[] args) {
        teacher obj = new teacher();
        obj.setName("mhi");
        obj.setId(101);
        obj.setQualification("Bsc in Swe");  
        obj.DisplayInfo();
        
        teacher obj1 = new teacher();
        obj1.setName("yyy");
        obj1.setId(11);
        obj1.setQualification("Bsc in yy");  
        obj1.DisplayInfo();
    }
}
