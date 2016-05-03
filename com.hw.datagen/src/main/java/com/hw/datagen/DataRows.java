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
public class DataRows {
	
	List<DataRow> rows = new ArrayList<DataRow>();

	/**
	 * 
	 */
	public DataRows() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rows
	 */
	public List<DataRow> getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<DataRow> rows) {
		this.rows = rows;
	}
	
	/**
	 * Add new row
	 * @param r
	 */
	public void addRow(DataRow r){
		rows.add(r);
	}
	
	public void addHeader(List<DataColumn> cl){
		DataRow headerRow = new DataRow();
		for(DataColumn c : cl )
			headerRow.add(c.getColumnName());
		rows.add(0, headerRow);
	}

	/**
	 * 
	 */
	public String toString(){
		String retValue="";
		for(DataRow row:rows){
			retValue += row;
		}
		return retValue;
	}
}
