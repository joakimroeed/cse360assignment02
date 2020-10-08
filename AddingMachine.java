package cse360assignment02;

//https://github.com/joakimroeed/cse360assignment02
//Joakim Roeed
//1215162468


public class AddingMachine {  
	  //public static void main(String[] args) {
	  //	  AddingMachine comp = new AddingMachine();
	  //	  comp.add(4);
	  //	  comp.subtract(2);
	  //	  comp.add(5);
	  //	  System.out.println(comp.toString());
	  //}
	
	  private int total;
	  private String string = "0";
	  
	  public AddingMachine () {
		  total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () { // Get the total value
		  return total; 
	  }
	  
	  public void add (int value) { // Add value to total
		  total = total + value;
		  string += " + " + value;
	  }

	  public void subtract (int value) { // Subtract value from total
		  total = total - value;
		  string += " - " + value;
	  }

	  public String toString () {
		  return string;
	  }

	  public void clear() { // Reset the total to 0
		  total = 0;
	  }
}
