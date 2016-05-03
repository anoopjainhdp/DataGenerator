/**
 * 
 */
package com.hw.datagen;

/**
 * @author ajain
 *
 */
public enum DataType {
	NUMBER {
		public String toString(){
			return "Number";
		}
	},
	STRING {
		public String toString(){
			return "String";
		}
	}
}
