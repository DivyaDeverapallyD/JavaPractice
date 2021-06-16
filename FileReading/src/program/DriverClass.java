/**
 * 
 */
package program;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Divya Deverapally
 *
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReading fileReading = new FileReading();
		
		String transfomations = "E:\\Divya\\Program\\Transformation.xlsx";
		
		Map<String,String> TransformationMap =fileReading.TransformationFileData(transfomations);
		/*for(Entry<String,String> entry : TransformationMap.entrySet())
		{
			System.out.println(entry.getKey() + "---"+ entry.getValue());
		}*/
		
		String fileCompare1= "E:\\Divya\\Program\\File1.xlsx";
		List<Employee> fileCompareList1 = fileReading.readFile1(fileCompare1);
		
		
		/*System.out.println("file1");
		/*for(Employee e : fileCompareList1)
			System.out.println(e.getEmployee_Number()+ e.getWage_Type()+ e.getPay_Value());*/

		String fileCompare2= "E:\\Divya\\Program\\Filecomparision2.xlsx";
		
		List<Employee> fileCompareList2 = fileReading.readFile1(fileCompare2);
		/*System.out.println("file2");
		for(Employee e : fileCompareList2)
			System.out.println(e.getEmployee_Number()+ e.getWage_Type()+ e.getPay_Value());*/

		FileComparision fileComparision= new FileComparision();
		
		List<String> resList = fileComparision.CompareFilesData(fileCompareList1, fileCompareList2, TransformationMap);
		
		
	if(resList.isEmpty())
			System.out.println("Content in the files are same");
		else
		{
			System.out.println("Following values are not matching");
			for(String val : resList)
				System.out.println(val);
		}
	
	}}
