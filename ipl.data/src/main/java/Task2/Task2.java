package Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Task2 {
	public static void taskNumber3() 
	{
		String[] teamName ={"Sunrisers Hyderabad","Kolkata Knight Riders","Rising Pune Supergiant","Kings XI Punjab"
				,"Royal Challengers Bangalore","Mumbai Indians","Delhi Daredevils","Gujarat Lions"};
		
		String CSV_FILE_PATH = "C:\\Users\\PRABHAKAR KUMAR OJHA\\Downloads\\Ipl_Problem (1)\\Ipl_Problem\\deliveries.csv";
		try {
		FileReader filereader = new FileReader(CSV_FILE_PATH);

		CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		
			List<String[]> allData = csvReader.readAll();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
