package com.axione.validateur.stoc.controllers.export;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.CsvMapWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.io.ICsvMapWriter;
import org.supercsv.prefs.CsvPreference;

public class ExportCmdService <T>{
	
	private Logger logger = Logger.getLogger(ExportCmdService.class);
	
	private String[] headers;
	private  List<T> objects;
	private Field[] fields;
	
	
	public ExportCmdService(String[] headers, List<T> objects) {
		this.headers = headers;
		this.objects = objects;
		if(objects!=null && objects.size() > 0)
			fields = objects.get(0).getClass().getDeclaredFields();
	}
	
	public boolean export(String filePath){
		if(headers == null || headers.length < 1)
			return false;
		if(objects == null || objects.size() < 1 )
			return false;
		
		boolean ok = false;
		
		ICsvMapWriter  csvWriter=null ;
		File file = new File(filePath);
		
		 try {
			 file.createNewFile();
			csvWriter = new CsvMapWriter(new FileWriter(filePath),CsvPreference.EXCEL_NORTH_EUROPE_PREFERENCE);
			csvWriter.writeHeader(headers);
			writeData(csvWriter);			
			
			ok=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
            if( csvWriter != null ) {
            	try {
					csvWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
		}	
		 return ok;
	}
	

	private void writeData(final ICsvMapWriter  csvWriter) throws IOException{
		for(Object o : objects){
			Map<String,Object> data = new HashMap<>();
			for(String header: headers){
				data.put(header, getFieldValue(header,o));
			}
			csvWriter.write(data, headers);
		}
		
	}
	
	private Object getFieldValue(String fieldName, Object o){
		if(o == null){
			logger.error("looking for field in null object ");
			return "";
		}
		if(fieldName== null || fieldName.equals("")){
			logger.error("Empty field name is requested from the object class :" +o.getClass());
			return "";
		}
		String methodName="get";
		String objectFieldName=null;
		for(Field f: fields ){
			if(fieldName.equalsIgnoreCase(f.getName())){
				objectFieldName =f.getName();
				break;
			}
		}
		
		if(objectFieldName == null){
			logger.error("!!!!!!!!! Could not find field with name : "+fieldName+" in the class : "+o.getClass().getName());
			return "";
		}
		
		methodName = methodName+(objectFieldName.substring(0, 1).toUpperCase() + objectFieldName.substring(1));
		try {
			Method method = o.getClass().getDeclaredMethod(methodName);
			Object value = method.invoke(o);
			if(value != null){
				return value.toString();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			logger.error("!!!!!!!!Problem while getting method by name : "+methodName+ " from object class : "+ o.getClass().getName());
		} catch (IllegalAccessException e) {
			logger.error("!!!!!!!Problem while invoking method by name : "+methodName+ " from object class : "+ o.getClass().getName() +" IllegalAccessException");
		} catch (IllegalArgumentException e) {
			logger.error("!!!!!!!Problem while invoking method by name : "+methodName+ " from object class : "+ o.getClass().getName()+" IllegalArgumentException");

		} catch (InvocationTargetException e) {
			logger.error("!!!!!!!!!Problem while invoking method by name : "+methodName+ " from object class : "+ o.getClass().getName()+" InvocationTargetException");
		}
		return "";
	}
	
	public String[] getHeaders() {
		return headers;
	}
	public void setHeaders(String[] headers) {
		this.headers = headers;
	}

	

	
}
