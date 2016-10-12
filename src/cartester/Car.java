/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 * This class creates a car based on inputted parameters <p>
 * pre: car creation called <br>
 * post: car created with details
 * @author chhit5249
 */
public class Car {
    //Create the variables needed for car details
    private String make, model, type;
    private int year, horsepower;
    private double price;  
    
    /**
     * This constructor handles situations where make, model, type, year,
     * horsepower, and price are passed through, and sets those to each of the 
     * variables for the details of the car (ALL DETAILS) <p>
     * pre: car created with all details <br>
     * post: details of car set with inputted values
     * @param mk Make of the car
     * @param md Model of the car
     * @param ty Type of the car (electric/gas)
     * @param yr Year the car was made
     * @param hp Horsepower of the car
     * @param p Price of the car
     */
    public Car(String mk, String md, String ty, int yr, int hp, double p)
    {
        //Set the passed parameters as the details.
        make = mk;
        model = md;
        type = ty;
        year = yr;
        horsepower = hp;
        price = p;
    }
    
    /**
     * This constructor handles situations where all values but type are inputted;
     * it assumes that the type is Gas <p>
     * pre: car is created with all details except type <br>
     * post: details of car are set as inputted values and default type
     * @param mk Make of the car
     * @param md Model of the car
     * @param yr Year the car was made
     * @param hp Horsepower of the car
     * @param p Price of the car
     */
    public Car(String mk, String md, int yr, int hp, double p)
    {
        //Set the inputted values as their respective variables
        make = mk;
        model = md;
        year = yr;
        horsepower = hp;
        price = p;
        
        //Set the default type as Gas
        type = "Gas";
    }
    
    /**
     * This is the default constructor; it gets no values in and creates a default
     * car (2016 Ford Escape) <p>
     * pre: car created with no details <br>
     * post: sets all details as default values.
     */
    public Car()
    {
        make = "Ford";
        model = "Escape";
        type = "Gas";
        year = 2016;
        horsepower = 168;
        price = 25239;
    }
    
    /**
     * This method honks the car horn (output line) <p>
     * pre: called from CarTester (carName.honk()) <br>
     * post: honks the horn via text.
     */
    public void honk()
    {
        //HONK THE HORN!!
        System.out.println("HONK! HONK!");
    }
    
    /**
     * This method converts all the details into a String format so it can
     * be outputted <p>
     * pre: toString() called <br>
     * post: details converted to String form
     * @return output String of details
     */
    public String toString()
    {
        //Add all the details to the string and format it.
        String output = "Make: "+make+"\n";
        output+="Model: "+model+"\n";
        output+="Type: "+type+"\n";
        output+="Year: "+year+"\n";
        output+="Horsepower: "+horsepower+"\n";
        output+="Price: $"+price+"\n";
        output+="----------------------------";
        
        //Return this string.
        return output;
    }
}
