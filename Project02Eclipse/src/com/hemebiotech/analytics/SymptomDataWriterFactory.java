package com.hemebiotech.analytics;
/**
 * Writer Factory instantiate the writer from the selected extention
 *
 * @author BarbuDev
 * @version 1.0
 */
public class SymptomDataWriterFactory {
    /**
     * Intantiate the object to read the selected extention
     *
     * @param extentionFile file extention to write
     * @return ISymptomeWriter
     */
    public ISymptomeWriter getWriter(String extentionFile) throws Exception {

        if(extentionFile.equals("OUT")){
            return new SymptomDataOutWriter();
        }else{
            throw new Exception(extentionFile + " Extention non prise en charge");
        }

    }
}
