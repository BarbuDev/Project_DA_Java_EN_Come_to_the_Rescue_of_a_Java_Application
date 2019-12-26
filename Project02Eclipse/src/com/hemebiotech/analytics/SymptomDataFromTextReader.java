package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Read a file with .txt extention
 *
 * @author BarbuDev
 * @version 1.0
 */
public class SymptomDataFromTextReader implements ISymptomReader {


    /**
     * Read the .txt file sort and count element inside
     *
     * @param fileName file name to read
     * @throws java.io.FileNotFoundException file not found
     * @return TreeMap of strings
     */

    @Override
    public Map<String,String> getSymptoms(String fileName) {

        int counterSymptom;
        Map<String, Integer> symptomMap = new HashMap<>();


        BufferedReader reader;


        if (fileName != null) {
            try {

                // control extension file
                if (fileName.indexOf(".") >= 0 ){
                    reader = new BufferedReader (new FileReader(fileName));
                }else{
                    reader = new BufferedReader (new FileReader(fileName + ".txt"));
                }


                String line = reader.readLine();


                while (line != null) {


                    counterSymptom = symptomMap.get(line) == null ? 1 : symptomMap.get(line) + 1;




                    symptomMap.put(line,counterSymptom);
                    line = reader.readLine();

                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        Map symptomSortedMap = new TreeMap(symptomMap);



        return symptomSortedMap;
    }



}
