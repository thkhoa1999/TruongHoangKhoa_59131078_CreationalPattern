/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author ADMIN
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        var s1 = ShapeFactory.creatInstance();
        var s2 = ShapeFactory.creatInstance();
        var s3 = ShapeFactory.creatInstance();
        var s4 = ShapeFactory.creatInstance();
        var s5 = ShapeFactory.creatInstance();
        
        s1.setSt(ShapeType.circle);
        var P1 = s1.creatShape();
        System.out.println("Picture 1: " + P1.draw());
        
        s2.setSt(ShapeType.rectangle);
        s3.setSt(ShapeType.triangle);

        
        
        var P2 = s2.creatShape();
        var P3 = s3.creatShape();
        

        
        
        System.out.println("Picture 2: " + P2.draw());
        System.out.println("Picture 3: " + P3.draw());

   
    }
    
}
