/**
 * 
 */
package com.hw.datagen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajain
 *
 */
public class DataRow {
	List<String> rowData = new ArrayList<String>();

	/**
	 * @return the rowData
	 */
	public List<String> getRowData() {
		return rowData;
	}

	/**
	 * @param rowData the rowData to set
	 */
	public void setRowData(List<String> rowData) {
		this.rowData = rowData;
	}
	
	/**
	 * Add new column data in row
	 * @param data
	 */
	public void add(String data){
		rowData.add(data);
	}
	
	public String toString(){
		String retValue="";
		for(String data:rowData){
			retValue+=","+data;
		}
		
		retValue = retValue.replaceFirst(",", "");
		return (retValue+="\n");
	}
}
