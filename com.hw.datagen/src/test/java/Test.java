import java.io.IOException;

import com.hw.datagen.csv.CSVDataGenetator;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static void main(String[] args) throws IOException{
		CSVDataGenetator c = new CSVDataGenetator();
		c.generate("/Users/ajain/test", "/Users/ajain/test1",10);
	}

}
