/**
 * Title: Workout
 * Description:
 * @author 
 */

public class Workout {
	
	// Instance variables
    
	/**
	 * Name: parameterized constructor
	 * Description: initialize each instance variable with the values stored in the parameters 
	 * @param dayName - the name of the day
	 * @param morningActivity - the name of the morning activity
	 * @param morningCalories - the number of calories burned in the morning activity
	 * @param eveningActivity - the name of the evening activity
	 * @param eveningCalories - the number of calories burned in the evening activity
	 * @param totalOuncesWater - the number of ounces of water 
	 */

  /**
	 * Name: toString 
	 * Description: Creates a formatted String object containing the values of each of the instance
	 * variables and return the String reference.
	 * @return a String reference containing the current state of the object (all instance variables)
	 */

    
	/**
	 * Name: bothSameActivity 
	 * Description: Checks if both sessions are the same activity type (e.g., both "running")
	 * @return true if the activities are the same, false otherwise
	 */

    
	/**
	 * Name: totalCalories 
	 * Description: Calculates and returns total calories burned from both morning and evening
	 * activities
	 * @return the total calories burn today
	 */

	/**
	 * Name: getLowerCalorieActivity
	 * Description: Determines which activity, morning or evening, has the lower number
	 * of calories burned and returns that activity name.
	 * @return name of the activity that burned fewer calories
	 */

	/**
	 * Name: replaceActivity
	 * Description: This method accepts parameters that specify if the morning activity or 
	 * evening activity should be replaced, and the name of the new activity along with its 
	 * number of calories.  The activity name is replaced with newActivity and the calories
	 * burned is replaced with newCalories.
	 * @param slot - 1 = morning activity or 2 = evening activity
	 * @param newActivity - name of the new activity
	 * @param newCalories - number of the new calories burned
	 */    
    
	/**
	 * Name: getTotalOuncesWater
	 * Description: accessor method for the private instance variable, totalOuncesWater
	 * @return the value stored in the instance variabe, totalOuncesWater
	 */
    
	/**
	 * Name: addWater
	 * Description: This method accepts a parameter for the ounces of water to add to the 
	 * instance variable totalOuncesWater. The method adds the value in the parameter to the
	 * value of totalOuncesWater if ounces is valid (above 0).
	 * @param ounces - the value to be added to totalOuncesWater
	 */
    
	/**
	 * Name: metWaterGoal
	 * Description: This method accepts a parameter for a water goal in ounces, and determines 
	 * if the totalOunceWater value is greater than or equal to the water goal.  If it is, return
	 * true, if not, return false.
	 * @param goalOunces - the water goal in ounces
	 * @return true if the water goal was met, false otherwise
	 */
}
