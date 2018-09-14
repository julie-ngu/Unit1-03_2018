/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program calculates whatever mass (kg) the user inputs to energy (j)
 *
 ****************************************************************************/
import java.util.Scanner;

public class EnergyConverter {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter mass of object (kg): ");
		
		double LIGHTSPEED = 299800000;
		double mass = userInput.nextDouble();
		userInput.close();
		
		double energy = mass * (LIGHTSPEED * LIGHTSPEED);
		
		System.out.println("If " + mass + " kg was converted into energy, " + energy + " joules would be produced.");
		
	}

}
