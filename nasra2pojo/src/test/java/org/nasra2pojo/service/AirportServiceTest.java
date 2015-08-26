package org.nasra2pojo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.nasra2pojo.model.airport.AirportBase;

import com.github.ffpojo.exception.FFPojoException;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AirportServiceTest 
    extends TestCase
{

    public void testApp() throws FFPojoException, IOException
    {
    	BufferedReader textFileReader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("APTTest.txt")));
    	AirportService service = new AirportService();
    	String line;
        while ( (line = textFileReader.readLine()) != null) {
            AirportBase base = service.createFromText(line);
            System.out.println(base);
        }
        textFileReader.close();
    }
}
