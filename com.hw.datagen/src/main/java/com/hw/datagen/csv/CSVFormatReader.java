/**
 * 
 */
package com.hw.datagen.csv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.hw.datagen.DataColumn;
import com.hw.datagen.DataFormatReader;
import com.hw.datagen.DataType;

/**
 * @author ajain
 *
 */
public class CSVFormatReader extends DataFormatReader {

	/**
	 * 
	 */
	public CSVFormatReader() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.hw.datagen.DataFormatReader#readFormat(java.io.File)
	 */
	@Override
	public List<DataColumn> readFormat(File formatFile) throws IOException {
		List<DataColumn> columnList = new ArrayList<DataColumn>();
		
		List<String> lines = FileUtils.readLines(formatFile);
		
		for(String line : lines){
			String[] lineTokens = line.split(" ");
			
			switch (lineTokens[0]){
			//[ToDo] Use enum
			case "Number":
				int min = Integer.parseInt(lineTokens[1]);
				int max = Integer.parseInt(lineTokens[2]);
				String columnName = lineTokens[3];
				
				HashMap<String, String> parameters = new HashMap<>();
				parameters.put("MIN", min+"");
				parameters.put("MAX", max+"");
				
				columnList.add(new DataColumn(columnName,DataType.NUMBER,parameters));
				break;
			}
		}
		
		return columnList;
	}

}
