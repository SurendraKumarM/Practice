package org.surendra.Myntra.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")     // prototype -> to create n no of Objects
		// singleton -> to give only one object and it is default singleton scope
@Component
public class RestUtil {

	@Value("https://localhost:8808/Myntra")
	private String url;
	
	@Value("username")
	private String requestBody;
	
	@Value("success")
	private String reponseBody;
	
	public RestUtil() {
		
		System.out.println(this.getClass().getSimpleName() + " object class created");
	}
	
	public void sendData(String msg)
	{
		System.out.println("Data Sent Succesfully " + msg);
	}

	@Override
	public String toString() {
		return "RestUtil [url=" + url + ", requestBody=" + requestBody + ", reponseBody=" + reponseBody + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public String getReponseBody() {
		return reponseBody;
	}

	public void setReponseBody(String reponseBody) {
		this.reponseBody = reponseBody;
	}
	
	

}
