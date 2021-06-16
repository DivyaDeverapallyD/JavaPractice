/**
 * 
 */
package program;
import java.util.*;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

/**
 * @author Divya Deverapally
 *
 *
 */
public class FileReading {
	public  Map<String,String> TransformationFileData(String str) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		try {
			
			File file = new File(str); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			while (itr.hasNext()) {
				List<String> list = new ArrayList<String>();
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
					list.add(cell.getStringCellValue());
					else if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
					{
						list.add(String.valueOf(cell.getNumericCellValue()));
					      // do something

					}
						
					
					
				}
				//resList.add(list);
				map.put(list.get(0), list.get(1));
			//	System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
	public   List<Employee> readFile1(String str)
	{
		
		List<Employee> empList= new ArrayList<Employee>();

		Map<String,String> map = new LinkedHashMap<String,String>();
		List<List<String>> resList= new ArrayList<>();
		try {
			
			File file = new File(str); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			
			while (itr.hasNext()) {
				List<String> list = new ArrayList<String>();
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
					list.add(cell.getStringCellValue());
					else if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
					{
						list.add(String.valueOf(cell.getNumericCellValue()));
					      // do something

					}
						
					
					
				}
				if(list.size() > 2 && list.size() <= 4)
				empList.add(new Employee(list.get(0), list.get(1).isEmpty() ? "": list.get(1), list.get(2).isEmpty() ? "": list.get(2)));
				else if(list.size() > 4)
					empList.add(new Employee(list.get(2), list.get(5), list.get(6)));
			//	resList.add(list);
			//	System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	
		
	}
	
	
	
	
	public  List<List<String>> ReadtextFile(String path) {
		
		List<List<String>> resList = new ArrayList<>();
		try  
		{  
		File file=new File(path);    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((br.readLine())!=null)  
		{  
			List<String> list= new ArrayList<>();
			String[] s= br.readLine().split("\\s+");
		list.add(s[2]) ; 
		list.add(s[5]) ;
		list.add(s[6]) ;//line feed   
		
		resList.add(list);
		}  
		fr.close();    //closes the stream and release the resources  
		//System.out.println("Contents of File: ");  
		//System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
		
		return resList;
	}
}
