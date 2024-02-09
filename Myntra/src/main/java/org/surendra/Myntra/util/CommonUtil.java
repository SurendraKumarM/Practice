package org.surendra.Myntra.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class CommonUtil {
	
	@Autowired
	private RestUtil restUtil;

	public CommonUtil() {
		System.out.println(this.getClass().getSimpleName() + " object class created");
	}

	public RestUtil getRestUtil() {
		return restUtil;
	}

	public void setRestUtil(RestUtil restUtil) {
		this.restUtil = restUtil;
	}

//	@Override
//	public String toString() {
//		return "CommonUtil [restUtil=" + restUtil + "]";
//	}

}