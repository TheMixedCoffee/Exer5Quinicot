/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author quinicotis_cis21035
 */
public class Square extends Rectangle{
    
    public Square(){
        
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side);
        setColor(color);
        setFilled(filled);
    }
    
    public double getSide(){
        return getWidth();
    }
    
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    public String toString(){
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    //No need to override getArea() and getPerimeter() since the width and length are set to be equal.
}
