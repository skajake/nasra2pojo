package org.nasra2pojo.service;

import org.nasra2pojo.model.airport.AirportBase;

import com.github.ffpojo.FFPojoHelper;
import com.github.ffpojo.exception.FFPojoException;

public class AirportService {

	protected AirportBase createFromText(String line) throws FFPojoException {
		FFPojoHelper ffpojo = FFPojoHelper.getInstance();
		AirportBase base = ffpojo.createFromText(AirportBase.class, line);
		return ffpojo.createFromText(base.classType(), line);
	}
	
}
