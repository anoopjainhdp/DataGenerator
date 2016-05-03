/**
 * 
 */
package com.hw.datagen;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author ajain
 *
 */
public abstract class DataFormatReader {

	/**
	 * 
	 */
	public DataFormatReader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Reads the format file
	 * @param formatFile
	 * @return
	 * @throws IOException 
	 */
	public abstract  List<DataColumn> readFormat(File formatFile) throws IOException;
}
