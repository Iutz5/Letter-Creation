/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author ianut
 */
public class Lab0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Letter happyBirthday  = new Letter("Dear", "Best,", "John,", "Ann"); // instantiating the first letter
        happyBirthday.addSentence("Happy Birthday John!"); // adding the first body sentence to the first letter
        happyBirthday.addSentence("Hope you like your gifts I sent you!"); // adding the second body sentence to the first letter
        happyBirthday.addSentence("Stop growing up so fast!"); // adding the last body sentence to the first letter
        
        Letter getWellSoon = new Letter("Hello","Love,","Paul,","Sarah"); // instantiating the second letter
        getWellSoon.addSentence("I heard you got very sick."); // adding the first body sentence to the second letter
        getWellSoon.addSentence("The grandkids miss you so much!"); // adding the second body sentence to the second letter
        getWellSoon.addSentence("I hope you get well soon!"); // adding the last body sentence to the last leetter
        
        Letter thankYou = new Letter("Dear","Thanks,","Ann,", "John"); // instantiating the last letter
        thankYou.addSentence("Thank you so much for the gifts!"); // adding the first body sentence to the last letter
        thankYou.addSentence("I will try my best to stop growing up so fast!"); // adding the second body sentence to the last letter
        thankYou.addSentence("I hope to see you soon!"); // adding the last body sentence to the last letter
        
        System.out.println(happyBirthday); // printing the first letter
        System.out.println(getWellSoon); // printing the second letter
        System.out.println(thankYou); // pringint the last letter
    }
    
}
