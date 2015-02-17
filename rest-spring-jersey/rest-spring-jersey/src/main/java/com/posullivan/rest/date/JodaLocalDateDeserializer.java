package com.posullivan.rest.date;

import java.io.IOException;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.posullivan.rest.util.Constants;

public class JodaLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	@Override
	public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String date = jp.getText();
		DateTimeFormatter formatter = DateTimeFormat.forPattern(Constants.ISO_8601_DATE_FORMAT);
		return formatter.parseLocalDate(date);
	}

}
