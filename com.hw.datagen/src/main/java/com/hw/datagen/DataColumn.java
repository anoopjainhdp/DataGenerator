/**
 * 
 */
package com.hw.datagen;

import java.util.HashMap;

/**
 * @author ajain
 *
 */
public class DataColumn {
	
	String columnName;
	DataType columnType;
	HashMap<String,String> parameters = new HashMap<>();
	
	/**
	 * @param columnName
	 * @param columnType
	 * @param parameters
	 */
	public DataColumn(String columnName, DataType columnType, HashMap<String, String> parameters) {
		super();
		this.columnName = columnName;
		this.columnType = columnType;
		this.parameters = parameters;
	}


	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * @return the columnType
	 */
	public DataType getColumnType() {
		return columnType;
	}

	/**
	 * @param columnType the columnType to set
	 */
	public void setColumnType(DataType columnType) {
		this.columnType = columnType;
	}

	/**
	 * @return the parameters
	 */
	public HashMap<String, String> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(HashMap<String, String> parameters) {
		this.parameters = parameters;
	}
	
	

	
	
}
