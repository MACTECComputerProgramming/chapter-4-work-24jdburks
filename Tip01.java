
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double personOne = 10.00;
        double personTwo = 12.00;
        double personThree = 9.00;
        double personFour = 8.00;
        double personFive = 7.00;
        double personSix = 15.00;
        double personSeven = 11.00;
        double personEight = 30.00;
        
        //Calculations
        double total1 = personOne*(1+0.15+0.05);
        double total2 = personTwo*(1+0.15+0.05);
        double total3 = personThree*(1+0.15+0.05);
        double total4 = personFour*(1+0.15+0.05);
        double total5 = personFive*(1+0.15+0.05);
        double total6 = personSix*(1+0.15+0.05);
        double total7 = personSeven*(1+0.15+0.05);
        double total8 = personEight*(1+0.15+0.05);
        
        //Print
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
        System.out.println(total6);
        System.out.println(total7);
        System.out.println(total8);
    }    
}
