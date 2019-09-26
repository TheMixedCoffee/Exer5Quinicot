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
public class Exercise5Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Square are = new Square(5.0,"yellow",false);
        System.out.println(are.toString());
        System.out.println(are.getPerimeter());
        System.out.println(are.getArea());
    }
    
}
