/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrade;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * This is myPlainDocument extends PlainDocument and Override the insertString method to
 * realize the effection of limiting input
 * @author Paul Duan
 */
public class MyPlainDocument extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        str = str.replaceAll(regex,""); //As regex, replace all to ""
        super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
    } 
    
    //Constructor to accept regex
    public MyPlainDocument(String regex) {
        this.regex = regex; //set the regex to limit input
    }
    
    private String regex;
}
