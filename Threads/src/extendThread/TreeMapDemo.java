/**
 * 
 */
package extendThread;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Divya Deverapally
 *
 *Sorst the map based on keys  in ascending order
 */
public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map= new TreeMap();
		map.put("Divya", 1);
		map.put("Aandeep", 4);
		map.put("Sundhu", 2);
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println("key ---"+ entry.getKey()+"Values----"+ entry.getValue());
		}
/*Output
 * key ---AandeepValues----4
	key ---DivyaValues----1
	key ---SundhuValues----2
  */
	}

}
