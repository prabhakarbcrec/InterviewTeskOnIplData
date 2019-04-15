package Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReaderClass {
	public static void main(String[] args) throws IOException{
		String YEAR= null,YEAR1= null,YEAR2= null,YEAR3= null,YEAR4= null,YEAR5= null,YEAR6= null,YEAR7= null;
		ArrayList<MAIN> all= new ArrayList<MAIN>();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("matches.csv");
		String CSV_FILE_PATH = "C:\\Users\\PRABHAKAR KUMAR OJHA\\Downloads\\Ipl_Problem (1)\\Ipl_Problem\\matches.csv";
int snrhb0 = 0,knr1=0,pune2 = 0,kElaven3 = 0,rcb4 = 0,mi5 = 0,dd6 = 0,gl7=0;
		try {

			FileReader filereader = new FileReader(CSV_FILE_PATH);

			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();
			

			for (String[] row : allData) {
			
				if(row[1].equals("2017")||row[1].equals("2016")&&row[7].equals("field"))
				{
				switch(row[9])
				{
				case "Sunrisers Hyderabad":
					 snrhb0++;
					 YEAR=row[1];
					 break;
				case "Kolkata Knight Riders":
					knr1++;
					 YEAR1=row[1];
					break;
				case "Rising Pune Supergiant":
					pune2++;
					 YEAR2=row[1];
					break;
					
				case "Kings XI Punjab":
				kElaven3++;
				 YEAR3=row[1];
				break;
				case "Royal Challengers Bangalore":
					rcb4++;
					 YEAR4=row[1];
					break;
				case "Mumbai Indians":
					mi5++;
					 YEAR5=row[1];
					break;
				case "Delhi Daredevils":
					dd6++;
					 YEAR6=row[1];
					break;
				case "Gujarat Lions":
					gl7++;
					 YEAR7=row[1];
				
				}			
				}				
			}
			int count=0;
			MAIN m=new MAIN(snrhb0,"Sunrisers Hyderabad",YEAR);
			MAIN m1=new MAIN(knr1,"Kolkata Knight Riders",YEAR1);
			MAIN m2=new MAIN(pune2,"Rising Pune Supergiant",YEAR2);
			MAIN m3=new MAIN(kElaven3,"Kings XI Punjab",YEAR3);
			MAIN m4=new MAIN(rcb4,"Royal Challengers Bangalore",YEAR4);
			MAIN m5=new MAIN(mi5,"Mumbai Indians",YEAR5);
			MAIN m6=new MAIN(dd6,"Delhi Daredevils",YEAR6);
			MAIN m7=new MAIN(gl7,"Gujarat Lions",YEAR7);
			
			all.add(m);
			all.add(m1);
			all.add(m2);
			all.add(m3);
			all.add(m4);
			all.add(m5);
			all.add(m6);
			all.add(m7);
			Collections.sort(all,Collections.reverseOrder());
		System.out.println("YEAR"+"\t"+"TEAM_NAME"+"\t\t"+"NUMBER_OF_WIN");
		for(MAIN k:all)
			if(count<=3)
			{
		System.out.println("2016-2017"+"\t"+k.TeamName+" \t\t"+k.getValue);
		count++;
			}
			else
			{
				System.exit(0);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
 class MAIN implements Comparable<MAIN>
{
	int getValue;
	String YEAR;
	String TeamName;
	MAIN(int getValue,String TeamName,String YEAR)
	{
		this.getValue=getValue;
		this.TeamName=TeamName;
		this.YEAR=YEAR;
	}
	public int compareTo(MAIN MN){  
		if(getValue==MN.getValue)  
		return 0;  
		else if(getValue>MN.getValue)  
		return 1;  
		else  
		return -1;  
		}  
}

