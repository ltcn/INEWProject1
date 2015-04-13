/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.Random;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author dawit.gebremichael1
 */
public class Ch3 {
    private static void ifExample() {
      

        
        Random r = new Random();
        int rNumber = r.nextInt(5);
        if (rNumber == 1){
            JOptionPane.showMessageDialog(null, "Ya, you are champ!");
        }else{
            JOptionPane.showMessageDialog(null, "Train hard!");
        }
        
        JOptionPane.showMessageDialog(null, rNumber);
        
    }
    
    
     private static void ifExample2() {
      
        Random r = new Random();
        int rNumber = r.nextInt(5);  // this generate a random number 1 - 5
        JOptionPane.showMessageDialog(null, rNumber);
        
        if (rNumber == 1){
            JOptionPane.showMessageDialog(null, "You are a java guy");
        }else if ( rNumber == 2){
            JOptionPane.showMessageDialog(null, "You are a Bio... guy");
        }else{
            JOptionPane.showMessageDialog(null, "I don't care");
        }
        
        
        
    }
     
     private static void ifExample3() {
      
        Random r = new Random();
        int rNumber = r.nextInt(5);  // this generate a random number 1 - 5
        JOptionPane.showMessageDialog(null, rNumber);
        
        String chs = JOptionPane.showInputDialog("How many credit hours do you have?");
        int creditHours = Integer.parseInt(chs);
        
        
        if (rNumber == 1){
            JOptionPane.showMessageDialog(null, "You are a java guy");
            if (creditHours > 60){
                JOptionPane.showMessageDialog(null, "You get a job");
            }else{
                JOptionPane.showMessageDialog(null, "You need more hours");
            }
            
        }else if ( rNumber == 2){
            JOptionPane.showMessageDialog(null, "You are a Bio... guy");
             if (creditHours > 30){
                JOptionPane.showMessageDialog(null, "You could me lab assistant");
            }else{
                JOptionPane.showMessageDialog(null, "You need more hours");
            }
        }else{
            JOptionPane.showMessageDialog(null, "I don't care");
        }
    
        
    }
     
    private static void andLogic() {
        
        String gpa_s = JOptionPane.showInputDialog("What is your GPA?");
        double gpa = Double.parseDouble(gpa_s);
        
        String vol = JOptionPane.showInputDialog(" Have you ever voulentered? yes/no");
        
        if ( gpa > 3 && vol.equals("yes") ){
            JOptionPane.showMessageDialog(null, "You can apply for tuition assistant");
        }else{
            
            JOptionPane.showMessageDialog(null, "You can't apply for tuition assistant");
        }
        
    }
    
     private static void orLogic() {
        
        String incomes = JOptionPane.showInputDialog("What is your income");
        double income = Double.parseDouble(incomes);
        
        String va = JOptionPane.showInputDialog("Are you a VA? yes/no");
        
        if ( income < 20 || va.equals("yes") ){
            JOptionPane.showMessageDialog(null, "You can apply for tuition assistant");
        }else{
            
            JOptionPane.showMessageDialog(null, "You can't apply for tuition assistant");
        }
        
    }
     
     


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //andLogic();
        orLogic();
    }
    
}
