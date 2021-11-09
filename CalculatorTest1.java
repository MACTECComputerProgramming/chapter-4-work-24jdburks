
package tip04;

public class CalculatorTest1 {
    public static void main(String[] args) {
        
        Calculator1 calc = new Calculator1();
        
        double totalTable = 0;
        totalTable += calc.findTotal(10, "Bob = ");
        totalTable += calc.findTotal(12, "Bob Again = ");
         totalTable += calc.findTotal(9, "Third Bob = ");
          totalTable += calc.findTotal(8, "The Other Bob = "); 
          totalTable +=calc.findTotal(7, "BOB = ");
           totalTable += calc.findTotal(0, "Alex = ");
            totalTable += calc.findTotal(11, "bub = ");
             totalTable += calc.findTotal(0, "Forgetful = ");
            
      
        System.out.println("Table Total = $" +totalTable + 30 + 15);

        //Find and print the entire table's total, including tax and tip
       
    } 
}
