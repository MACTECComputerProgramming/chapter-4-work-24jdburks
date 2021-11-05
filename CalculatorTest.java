
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

       calc.findTotal(10.00, "Joe");
       calc.findTotal(12.00, "Guy Man");
       calc.findTotal(9.00, "Real Man");
       calc.findTotal(8.00, "Not a Robot");
       calc.findTotal(7.00, "Also Not a Robot");
       calc.findTotal(15.00, "I am a real person");
       calc.findTotal(11.00, "Name of person that is not a robot");
       calc.findTotal(30.00, "Robot");
      
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
