/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;

/**
 *
 * @author Huong Thu Tran
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String[] chuoi = {"D:/image", "D:/image/output1.png"};
            SpriteMapManipulator.join(chuoi[0], chuoi[1]);
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
    
}
