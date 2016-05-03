/**
 * 
 */
package com.hw.datagen.csv;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import com.hw.datagen.DataColumn;
import com.hw.datagen.DataGenerator;
import com.hw.datagen.DataRow;
import com.hw.datagen.DataRows;
import com.hw.datagen.DataType;

/**
 * @author ajain
 *
 */
public class CSVDataGenetator extends DataGenerator {

	/**
	 * 
	 */
	public CSVDataGenetator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.hw.datagen.DataGenerator#generate(java.lang.String, java.lang.String)
	 */
	@Override
	public List<String> generate(String inputFormatFile, String outputFile) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hw.datagen.DataGenerator#generate(java.lang.String, java.lang.String, int)
	 */
	@Override
	public DataRows generate(String inputFormatFile, String outputFile, int numRows) throws IOException {
		File inf = new File(inputFormatFile);
		File opf = new File(outputFile);
		DataRows rows = new DataRows();
		
		if(inf.exists()){
			List<DataColumn> dataColumns = (new CSVFormatReader()).readFormat(inf);
			rows.addHeader(dataColumns);
			
			for(int rowCount = 0;rowCount<numRows;rowCount++){
				DataRow row = new DataRow();
				
				for(DataColumn c : dataColumns){
					if(c.getColumnType().equals(DataType.NUMBER)){
						int min = Integer.parseInt(c.getParameters().get("MIN"));
						int max = Integer.parseInt(c.getParameters().get("MAX"));
						Random r = new Random();
						row.add((r.nextInt(max-min) +min)+"");
					}
				}
				rows.addRow(row);
			}
			
		}
		
		if(! opf.exists())
			opf.createNewFile();
		
		FileUtils.writeStringToFile(opf, rows.toString());
		
		return rows;
	}

}
