/**
 * 
 */
package com.hw.datagen;

import java.io.IOException;
import java.util.List;

/**
 * @author ajain
 *
 */
public abstract class DataGenerator {

	/**
	 * 
	 */
	public DataGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Generate the data in output file based on input format.
	 * @param inputFormatFile
	 * @param outputFile
	 * @return
	 */
	public abstract List<String> generate(String inputFormatFile, String outputFile);
	

	/**
	 * Generate N rows data in output file based on input format.
	 * @param inputFormatFile
	 * @param outputFile
	 * @param numRows
	 * @return
	 * @throws IOException 
	 */
	public abstract DataRows generate(String inputFormatFile, String outputFile,int numRows) throws IOException;
}
