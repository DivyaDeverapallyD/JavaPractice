/**
 * 
 */
package practiceCar;
import java.util.*;
/**
 * @author Divya Deverapally
 *
 *
 */
public class Car {
	
	List<CarPart> list = new ArrayList<>();
	
	
	public Car()
	{
		Engine engine = new Engine();
		list.add(engine);
		FuelTank fuelTank= new FuelTank();
		list.add(fuelTank);
		Wheels wheels= new  Wheels();
		list.add(wheels);
	}
	
	public void run()
	{
		//System.out.println("Car is running");
		for(CarPart part : list)
		{
			part.function();
			part.status();
			System.out.println("*********************");
		}
	}

}
