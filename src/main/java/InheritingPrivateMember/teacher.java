/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritingPrivateMember;

/**
 *
 * @author DELL
 */
public class teacher extends person {
    private String Qualification;

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
     
    void DisplayInfo(){
     System.out.println("name = "+getName());
        System.out.println("");
        System.out.println("id = "+getId());
        System.out.println("");
        System.out.println("qualification = "+getQualification());
        System.out.println("\n \n");
    }
    
}
