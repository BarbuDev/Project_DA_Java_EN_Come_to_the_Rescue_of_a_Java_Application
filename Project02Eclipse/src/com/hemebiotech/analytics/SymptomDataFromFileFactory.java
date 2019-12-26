package com.hemebiotech.analytics;

/**
 * Reader Factory instantiate the reader from the selected extention
 *
 * @author BarbuDev
 * @version 1.0
 */

public class SymptomDataFromFileFactory {

	/**
	 * Intantiate the object to read the selected extention
	 *
	 * @param extentionFile file extention to read
	 * @return ISymptomReader
	 */
	public ISymptomReader getReader(String extentionFile) throws Exception {

		if(extentionFile.equals("TXT")){
				return new SymptomDataFromTextReader();
		}else{
			throw new Exception(extentionFile + " Extention non prise en charge");
		}

	}


}
