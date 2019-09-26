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
public class Shape {
    private String color = "red";
    private boolean filled = true;
    
    public Shape(){
        setColor("green");
        setFilled(true);
    }
    
    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        String buffer = "filled";
        if(isFilled() == false){
            buffer = "not filled";
        }
        return "A Shape with color of " + getColor() + " and " + buffer;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shep = new Shape();
        System.out.println(shep.toString());
        Shape shop = new Shape("yellow",false);
        System.out.println(shop.toString());
        Circle circ = new Circle();
        System.out.println(circ.toString());
        Circle cle = new Circle(2.0,"yellow",false);
        System.out.println(cle.toString());
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());
        Rectangle tangle = new Rectangle(2.0,4.0,"yellow",false);
        System.out.println(tangle.toString());
        Square squ = new Square();
        System.out.println(squ.toString());
        Square are = new Square(2.0,"yellow",false);
        System.out.println(are.toString());
        System.out.println(are.getPerimeter());
        System.out.println(are.getArea());
    }
}
