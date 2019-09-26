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
public class Circle extends Shape{
    protected double radius = 1.0;
    
    public Circle(){
        setRadius(1.0);
    }
    
    public Circle(double radius){
        setRadius(radius);
    }
    
    public Circle(double radius, String color, boolean filled){
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
   
    @Override
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
   
    @Override
    public String toString(){
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }
}
