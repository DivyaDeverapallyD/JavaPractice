/**
 * 
 */
package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Divya Deverapally
 *
 *
 */
public class FileComparision {

	public  List<String> CompareFiles(List<List<String>> fileCompareList1, List<List<String>> fileCompareList2,
			Map<String, String> TransformationMap)

	{

		List<String> resList = new ArrayList<String>();
		for (List<String> l : fileCompareList1) {
			// System.out.println(l);
			boolean flag = false;
			/*
			 * if(TransformationMap.containsKey(l.get(1))) {
			 */

			String val = TransformationMap.get(l.get(1));

			for (List<String> l2 : fileCompareList2) {

				if (l2.get(2).equals(l.get(0))) {
					if (l2.get(5).toString().equals(val))

						if (l2.get(6).equals(l.get(2))) {
							flag = true;
							// System.out.println(l.get(0) +" ,"+val + ","+l.get(2) );
							// System.out.println(l2.get(2)+","+l2.get(5)+","+l2.get(6));
							// System.out.println("***************************************************");;
						} else {
							//System.out.println("Values are different  for " + l.get(1));

							String s = "Different for " + l.get(0) + " for" + "- " + l.get(1) + " :"+"File 1 Amount : "
									+ l.get(2) + "," + "File 2 Amount :" + l2.get(6);

							resList.add(s);

							// System.out.println("File1 Data : "+l.get(0) +" ,"+l.get(1) + ","+l.get(2) );
							// System.out.println("File2 Data : "+l2.get(2)+","+l2.get(5)+","+l2.get(6));
							// System.out.println("***************************************************");

						}

				}
				if (flag)
					break;

			}

			// if(fileCompare2List.contains(l.get(0)))

		}

		return resList;

	}

	/**
	 * @param fileCompareList1
	 * @param fileCompareList2
	 * @param transformationMap
	 * @return
	 */
	public List<String> CompareFilesData(List<Employee> fileCompareList1, List<Employee> fileCompareList2,
			Map<String, String> transformationMap) {
		// TODO Auto-generated method stub
		List<String> resList = new ArrayList<String>();
		List<Employee> res= new ArrayList<>();
		for(Employee emp1 : fileCompareList1)
		{
			boolean flag = false;
		//	emp1.setWage_Type((transformationMap.get(emp1.getWage_Type()).isEmpty()? "": transformationMap.get(emp1.getWage_Type())));
			if(transformationMap.containsKey(emp1.getWage_Type()))
				emp1.setWage_Type(transformationMap.get(emp1.getWage_Type()));
			else
				emp1.setWage_Type("");
			
			for(Employee emp2 : fileCompareList2)
			{

				if (emp1.getEmployee_Number().equals(emp2.getEmployee_Number())) {
					if (emp1.getWage_Type().equals(emp2.getWage_Type()))

						if (emp1.getPay_Value().equals(emp2.getPay_Value())) {
							flag = true;
							// System.out.println(l.get(0) +" ,"+val + ","+l.get(2) );
							// System.out.println(l2.get(2)+","+l2.get(5)+","+l2.get(6));
							// System.out.println("***************************************************");;
						} else {
							//System.out.println("Values are different  for " + l.get(1));

						//	String s = "Different for " + emp1.getEmployee_Number() + " for" + "- " + emp1.getWage_Type() + " :"+"File 1 Amount : "
							//		+ emp1.getPay_Value() + "," + "File 2 Amount :" + emp2.getPay_Value();

							
							String aa= "File 1 : "+  emp1.toString()+"\n"+"File 2 :" + emp2.toString();
							resList.add(aa);

							// System.out.println("File1 Data : "+l.get(0) +" ,"+l.get(1) + ","+l.get(2) );
							// System.out.println("File2 Data : "+l2.get(2)+","+l2.get(5)+","+l2.get(6));
							// System.out.println("***************************************************");

						}

				}
				if (flag)
					break;

			}
		}
		
		return resList;
	}

}
