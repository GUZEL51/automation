package session13;
//learn to create excel file 
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class readingWebTableWritingInExcel {


private static final WebElement rows = null;

public static void main(String[] args) throws Exception {
		//WebDriver.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//saving the ekement under a variable
		WebElement customerTable=
				driver.findElement(By.xpath("//a[Table[@id=customers']/child::tbody"));
		List<WebElement> rows=(List<WebElement>) customerTable.findElement(By.tagName("tr"));
				
		//create a new newbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//creatingn and giving a name to the sheet 
		XSSFSheet sheet = workbook.createSheet("Table_Data");
		
	
		
		int rowNum =0;
		for (WebElement row: rows) {
			//find out all the cells in a row of the webtable
			List<WebElement> cells = row.findElements(By.xpath(".//th | .//td"));
			XSSFRow sheetRow = sheet.createRow(rowNum);
			
			int cellNum =0;
			for (WebElement cell : cells) {
				//create cells in the row
				XSSFCell sheetCell = sheetRow.createCell(cellNum++);
			//capture the value from the web table and set it in the cells
				sheetCell.setCellValue(cell.getText());
			}
			rowNum++;
			//save the workbook to a file
			FileOutputStream outputStream = new FileOutputStream("Table-data.xlsx");
			workbook.write(outputStream);
			workbook.close();// close the workbook
			outputStream.close();//close the output stream
			
			
			EdgeDriver edgeDriver = new EdgeDriver();
			edgeDriver.quit();//quit the driver
			System.out.println("Excel file is created. \nRefresh your project and look for the file");
			
			
 		}
	}

}
