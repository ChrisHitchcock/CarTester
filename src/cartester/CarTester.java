/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 * This program creates cars from the car class, outputs the details and honks
 * the horn.
 * @author chhit5249
 */
public class CarTester {
         

    /**
     * Everything happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the cars
        Car one = new Car("Chevrolet", "Impala", 1967, 140, 30000);
        Car two = new Car();
        Car three = new Car("Mazda", "5", "Gas", 2015, 152, 28000);
        
        //Output details of the car
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        
        //Honk the horn
        one.honk();
    }
    
}
