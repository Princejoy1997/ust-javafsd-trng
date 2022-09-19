package sba3;

import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadWriteJson {

	public static void main(String[] args) {
		
		JSONParser p=new JSONParser();
		
try {
			FileReader f=new FileReader("C:\\Users\\ustjavafsdb206\\Downloads\\EmployeeData.json");
			JSONArray a=(JSONArray)p.parse(f);
			//JSONObject obj =(JSONObject) parser.parse(new FileReader("C:\\Users\\ustjavafsdb206\\Downloads\\EmployeeData.json"));
			//JSONObject obj=(JSONObject)o;
			FileOutputStream ofile=new FileOutputStream("C:\\Users\\ustjavafsdb206\\Downloads\\EmployeeData.xlsx");
			HSSFWorkbook wb=new HSSFWorkbook();
			HSSFSheet s1=wb.createSheet("Sheet1");
			Row r0=s1.createRow(0);
			Cell c1=r0.createCell(0);
			c1.setCellValue("ID");
			
			for(int i=0;i<a.size();i++) {
				
				JSONObject obj=(JSONObject)a.get(i);
			
			
			long id=(long)obj.get("id");
			String name=(String)obj.get("name");
			String email=(String)obj.get("email");
			String password=(String)obj.get("password");
			String about=(String)obj.get("about");
			String token=(String)obj.get("token");
			String country=(String)obj.get("country");
			String location=(String)obj.get("location");
			long lng=(long)obj.get("lng");
			long lat=(long)obj.get("lat");
			String dob=(String)obj.get("dob");
			long gender=(long)obj.get("gender");
			//System.out.println(name+"\n"+email);
			
			Row rh=s1.createRow(i+1);
			Cell ch1=rh.createCell(0);
			Cell ch2=rh.createCell(1);
			Cell ch3=rh.createCell(2);
			Cell ch4=rh.createCell(3);
			Cell ch5=rh.createCell(4);
			Cell ch6=rh.createCell(5);
			Cell ch7=rh.createCell(6);
			Cell ch8=rh.createCell(7);
			Cell ch9=rh.createCell(8);
			Cell ch10=rh.createCell(9);
			Cell ch11=rh.createCell(10);
			Cell ch12=rh.createCell(11);
			
			ch1.setCellValue(id);
			ch2.setCellValue(name);
			ch3.setCellValue(email);
			ch4.setCellValue(password);
			ch5.setCellValue(about);
			ch6.setCellValue(token);
			ch7.setCellValue(country);
			ch8.setCellValue(location);
			ch9.setCellValue(lng);
			ch10.setCellValue(lat);
			ch11.setCellValue(dob);
			ch12.setCellValue(gender);
			
			
		}
			wb.write(ofile);
			wb.close();
			ofile.close();
			
			
}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
