
/** Calculator fulfills basic mathematic functions
*
* @author Ryan Gonzales
* @version Feb 22, 2016.
*/
package cse360assign3;

public class Calculator 
{
	/** int total is the total within the Calculator */
	private int total;

	/** String history is the history of what has been done */
	public String history = "";
	
	/** Calculator constructor initializes total to 0
	*/
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history += Integer.toString(total);
	}
	
	/** Returns the total within calculator
	*
	* @return total: calculated total at any given time
	*/
	public int getTotal () 
	{
		return total;
	}
	
	/** Adds an inputted value to the total
	*
	* @param value value to be added to total
	*/
	public void add (int value) 
	{
		total += value;
		history += " + " + Integer.toString(value);
	}
	
	/** Subtracts an inputted value from the total
	*
	* @param value value to be subtracted from the total
	*/
	public void subtract (int value) 
	{
		total -= value;	
		history += " - " + Integer.toString(value);
	}
	
	/** Multiplies an inputted value by the total
	*
	* @param value value to be multiplied by total
	*/
	public void multiply (int value) 
	{
		total *= value;
		history += " * " + Integer.toString(value);
	}
	
	/** Adds an inputted value to the total
	*
	* @param value value to be added to total
	*/
	public void divide (int value) 
	{
		if(value==0)
			total=0;
		
		else
			total = total/value;
			
		history += " / " + Integer.toString(value);
	}
	
	/** Returns a string of history within Calculator
	*
	* @return String of history
	*/
	public String getHistory () 
	{
		return history;
	}
}
