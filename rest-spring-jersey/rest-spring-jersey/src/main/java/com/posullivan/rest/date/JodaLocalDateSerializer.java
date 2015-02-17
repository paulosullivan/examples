package com.posullivan.rest.date;

import java.io.IOException;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.posullivan.rest.util.Constants;

public class JodaLocalDateSerializer extends JsonSerializer<LocalDate> {

	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider provider) throws IOException, JsonProcessingException {
		DateTimeFormatter formatter = DateTimeFormat.forPattern(Constants.ISO_8601_DATE_FORMAT);
		gen.writeString(formatter.print(value));
	}

}
