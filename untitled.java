// Java program
// file myClass.java

import java.io.*;
import java.util.*;


Scanner scanner = new Scanner(System.in.);
Scanner fileIn; //input file conenction
PrintWriter filenameOut; //HTL file conneciton
String filenameIn; //original file's name
String filenameOut; // new HTML file's name
int dotIndex; //holds position of any . in the filename
String line = null; //a line from the input file

//1. ask the user for a file name (or file path)

System.out.println("Enter file name or path")
filenameIn = scanner.nextline();

//2. 

try {
	//3. rename .txt as .html
	fileIn = new Scanner(new FileReader(filenameIn));
	dotIndex = filenameIn.lastIndexOf(".");
	if(dotIndex == -1) {
		filenameOut = filenameIn + ".html";
	}
	else {
		filenameOut =  filenameIn.substring(0, dotIndex) + ".html";
	}
	fileOut - new PrintWriter(fileaeOut);
	//4. determine if file is empty

	try {
		line = fileIn.nextline();
	}
	catch(NoSuchElementException e){
		System.out.println("Error: "+e.getMessage());
	}
	if(line==null) {
		System.out.println("This file is empty :(");
	}
	else {
		//5. read each line and insert necessary <tags> 
		fileOut.println("<html>");
		fileOut.println("<head>");
		fileOut.println("</head>");
		fileOut.println("<body>");
		fileOut.println(line);

		while(fileIn.hasNextline()) {

			fileOut.println("<br>");
			line = fileIn.nextline();

			if(line.isEmpty()) {
				fileOut.println("<br>");
			}
			else{

				fileOut.println(line);
			}
		}
		fileOut.print("<body>");
		fileOut.println("</html>");

		system.out.println("HTML file is processed:)");
		}
		fileIn.close();
		fileOut.close();

}
catch(FileNotFoundException e) {
	System.out.println("File not found");
}
