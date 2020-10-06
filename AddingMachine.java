package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String his="0 ";
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity

	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total+=value;
		  his+=" + "+value;
	  }

	  public void subtract (int value) {
		  total-=value;
		  his+=" - "+value;
	  }

	  public String toString () {
	    return his;
	  }

	  public void clear() {
		  this.his = "0";
		  this.total = 0;
	  }

}
