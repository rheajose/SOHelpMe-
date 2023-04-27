package sohelpme.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class SOHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		String content = null;
		try
		{
			//Excel part
			FileWriter writer;
			String vOutput;
			//Reading Keywords from test.txt
			File file = new File("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt");
		    FileReader fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr);
		    String line;
			while ((line = br.readLine()) != null) 
			{
				if(line.contains("a cannot be resolved to a variable"))
				{
					vOutput=ReadCellData(1, 2);   //starts from 0
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
				}
				else if (line.contains("key1 cannot be resolved to a variable"))
		    	{
		    		vOutput=ReadCellData(2, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("missing.main"))
		    	{
		    		vOutput=ReadCellData(3, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The literal 2147483648 of type int is out of range"))
		    	{
		    		vOutput=ReadCellData(4, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The literal 600851475143 of type int is out of range"))
		    	{
		    		vOutput=ReadCellData(5, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Type mismatch: cannot convert from void to int"))
		    	{
		    		vOutput=ReadCellData(6, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Type mismatch: cannot convert from int to char"))
		    	{
		    		vOutput=ReadCellData(7, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Type mismatch: cannot convert from void to String"))
		    	{
		    		vOutput=ReadCellData(8, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"else\", delete this token"))
		    	{
		    		vOutput=ReadCellData(9, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The local variable str may not have been initialized"))
		    	{
		    		vOutput=ReadCellData(10, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("public static void main(String[] args"))
		    	{
		    		vOutput=ReadCellData(11, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Invalid character constant"))
		    	{
		    		vOutput=ReadCellData(12, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Type mismatch: cannot convert from String to char"))
		    	{
		    		vOutput=ReadCellData(12, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"and\", :: expected"))
		    	{
		    		vOutput=ReadCellData(13, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Type mismatch: cannot convert from A to B"))
		    	{
		    		vOutput=ReadCellData(14, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"=\", delete this token"))
		    	{
		    		vOutput=ReadCellData(15, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"void\", record expected"))
		    	{
		    		vOutput=ReadCellData(16, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"n\", ++ expected after this token"))
		    	{
		    		vOutput=ReadCellData(17, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The type List is not generic; it cannot be parameterized with arguments <Integer>"))
		    	{
		    		vOutput=ReadCellData(18, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("HashMap cannot be resolved to a type"))
		    	{
		    		vOutput=ReadCellData(19, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The constructor Animal(String) is undefined"))
		    	{
		    		vOutput=ReadCellData(20, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Unreachable code"))
		    	{
		    		vOutput=ReadCellData(21, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error on token \"\"hours, \"\", delete this token"))
		    	{
		    		vOutput=ReadCellData(22, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error, insert \";\" to complete BlockStatements"))
		    	{
		    		vOutput=ReadCellData(23, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("java.lang.ArrayIndexOutOfBoundsException"))
		    	{
		    		vOutput=ReadCellData(24, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("This method must return a result of type int"))
		    	{
		    		vOutput=ReadCellData(25, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The method PI() is undefined for the type Math"))
		    	{
		    		vOutput=ReadCellData(26, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("The constructor noVoid(String, int, String) is undefined"))
		    	{
		    		vOutput=ReadCellData(27, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Duplicate local variable x"))
		    	{
		    		vOutput=ReadCellData(28, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("java.lang.ArithmeticException"))
		    	{
		    		vOutput=ReadCellData(29, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("Syntax error, insert \"Finally\" to complete TryStatement"))
		    	{
		    		vOutput=ReadCellData(30, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
		    	else if (line.contains("length cannot be resolved or is not a field"))
		    	{
		    		vOutput=ReadCellData(31, 2);   //starts from 0
					//System.out.println(vOutput);
					writer = new FileWriter("/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt", true);
					writer.write("\n\n**StackOverflow**\n");
					writer.write(vOutput);
					writer.close();
					//str = line;
					break;
		    	}
			}
			br.close();
			fr.close();
		    //Displaying the contents of the file
		    String filePath = "/Users/rheajose/eclipse-workspace/Cerorrrs/test.txt";
			File file1 = new File(filePath);
			content = new String(Files.readAllBytes(file1.toPath()));
	
			//Display the contents of the text file in a dialog box
			//MessageDialog.openInformation(window.getShell(),"StackOverflow",content);
			
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		//System.out.println(content);
		/*MessageDialog.openInformation(
				window.getShell(),
				"SOHELPME",
				content);*/
		MessageConsole console = new MessageConsole("My Console", null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { console });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);

		MessageConsoleStream stream = console.newMessageStream();
		stream.println(content);

		return null;
	}
	//method defined for reading a cell  
	public static String ReadCellData(int vRow, int vColumn)  
		{  
			String value=null;          //variable for storing the cell value  
			Workbook wb=null;           //initialize Workbook null  
			try  
			{  
				//reading data from a file in the form of bytes  
				FileInputStream fis=new FileInputStream("/Users/rheajose/Desktop/Unimelb/SY project materials/SEDE/SO.xlsx");  
				//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
				wb=new XSSFWorkbook(fis);  
			}
			catch(FileNotFoundException e)  
			{  
				e.printStackTrace();  
			}
			catch(IOException e1)  
			{  
				e1.printStackTrace();  
			}
			Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
			Row row=sheet.getRow(vRow); //returns the logical row  
			Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
			value=cell.getStringCellValue();    //getting cell value 
			return value;               //returns the cell value  
		} 
}

