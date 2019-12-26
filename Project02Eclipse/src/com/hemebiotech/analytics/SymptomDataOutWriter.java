package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
/**
 * Write a file with .out extention
 *
 * @author BarbuDev
 * @version 1.0
 */
public class SymptomDataOutWriter implements ISymptomeWriter {
    /**
     *
     * @param symptomFromReader sorted map to write from reader
     * @param fileName
     */
    @Override
    public void writeSymptoms(Map<String,String> symptomFromReader, String fileName) {


        int writeCounter = 0;
        int writeLimit = 100;

        String strList = "";
        try{
            FileWriter writer = new FileWriter(fileName + ".out");

            Iterator symptomeIterator = symptomFromReader.entrySet().iterator();


            while (symptomeIterator.hasNext()) {
                Map.Entry pair = (Map.Entry)symptomeIterator.next();

                if(writeCounter <= writeLimit){
                    strList = strList + pair.getKey() + " : " + pair.getValue() + "\n";

                }else {
                    strList = strList + pair.getKey() + " : " + pair.getValue() + "\n";
                    writer.write(strList);
                    strList = "";
                    writeCounter = 0;
                }
                writeCounter++;

            }
            writer.write(strList);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}