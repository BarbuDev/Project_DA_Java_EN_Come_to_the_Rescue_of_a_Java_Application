package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Start the application
 * Write a file result with sorted and counted elements from an other file
 *
 * @see ISymptomeWriter
 * @see ISymptomReader
 * @see SymptomDataWriterFactory
 * @see SymptomDataFromFileFactory
 *
 * @author BarbuDev
 * @version 1.0
 *
 */


public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {


		Map<String,String> symptomMap;
		// Start factory for reader and writer
		SymptomDataFromFileFactory symptomReader = new SymptomDataFromFileFactory();
		SymptomDataWriterFactory symptomWriter = new SymptomDataWriterFactory();

		// Instanciation of reader and writer with the factories
		ISymptomReader dataReader = symptomReader.getReader("TXT") ;
		ISymptomeWriter dataWriter = symptomWriter.getWriter("OUT");

		// Write result
		symptomMap = dataReader.getSymptoms("symptoms");
		dataWriter.writeSymptoms(symptomMap, "result");

	}
}
