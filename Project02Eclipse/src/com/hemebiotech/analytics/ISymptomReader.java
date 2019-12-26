package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 *
 * @author BarbuDev
 * @version 1.0
 *
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 *
	 * @param fileName name of file to read
	 * @throws java.io.FileNotFoundException
	 *
	 * @return a list of all Symptoms sorted and counted obtained from a data source
	 */
	Map <String,String> getSymptoms (String fileName) throws Exception;
}
