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
public class Letter {
    
    // member data
    
    private String _greeting;
    private String _closing;
    private String _recipient;
    private String _sender;
    private String _body;
    
    // constructor
    
    public Letter(String greeting, String closing, String recipient, String sender) { // putting memeber data into the constructor
        // initializations
        _greeting = greeting;
        _closing = closing;
        _recipient = recipient;
        _sender = sender;
        _body = ""; // leaving the String body empty to avoid null pointer exception
    }
    
    public String addSentence (String sentence) { // method to add sentences to the body paragraph
        _body = _body + sentence + " ";
        return _body;
    }
    
    @Override
    public String toString(){ // Overrides to print out the letter in order from start to finish
        return _greeting + " " + _recipient + "\n" + _body + "\n" + _closing + "\n" + _sender + "\n"; // "\n" to skip to the next line for style purposes
    }
}
