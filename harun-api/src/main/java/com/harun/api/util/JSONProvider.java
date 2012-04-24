package com.harun.api.util;

import javax.ws.rs.ext.Provider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

@Provider
@Component
public class JSONProvider extends JacksonJsonProvider {

	private ObjectMapper mapper = new ObjectMapper();

	public JSONProvider() {
		setMapper(mapper);
	}

}
