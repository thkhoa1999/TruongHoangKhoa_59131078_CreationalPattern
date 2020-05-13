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
public class ShapeFactory 
{
    ShapeType st;

    public ShapeType getSt() {
        return st;
    }

    public void setSt(ShapeType st) {
        this.st = st;
    }
    
    private static ShapeFactory instance;
    
    public static ShapeFactory creatInstance()
    {
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
    protected ShapeFactory(){
        
    }
    
    public Shape creatShape()
    {
        switch(st)
        {
            case rectangle: return new Rectangle();
            case circle: return new Circle();
            case triangle: return new Triangle();
            
        }
        return null;
    }
}
