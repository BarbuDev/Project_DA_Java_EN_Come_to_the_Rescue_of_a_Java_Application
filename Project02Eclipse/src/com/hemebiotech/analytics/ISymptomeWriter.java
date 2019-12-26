package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Anything that will write symptom data to a file
 *
 * @author BarbuDev
 * @version 1.0
 */
public interface ISymptomeWriter {
    /**
     * If no data is available, return an empty List
     *
     * @param symptomFromReader sorted map to write from reader
     * @param fileName
     * @throws java.io.IOException
     */
    void writeSymptoms (Map<String,String> symptomFromReader, String fileName) throws Exception;
}
