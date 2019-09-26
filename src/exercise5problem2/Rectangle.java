/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5problem2;

/**
 *
 * @author quinicotis_cis21035
 */
public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle(){
        setWidth(1.0);
        setLength(1.0);
    }
    
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return getWidth()*getLength();
    }
    
    @Override
    public double getPerimeter(){
        return 2*(getWidth()+getLength());
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width=" + getWidth() + "and length=" + getLength() + ", which is a subclass of " + super.toString();
    }
}
