package org.surendra.Myntra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.surendra.Myntra.config.AppConfiguration;
import org.surendra.Myntra.util.CommonUtil;
import org.surendra.Myntra.util.RestUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfiguration.class);
        context.refresh();
        
//        RestUtil restUtil = context.getBean(RestUtil.class);
//        System.out.println(restUtil);
//        restUtil.sendData("Send data to Java");
        
        CommonUtil commonUtil = context.getBean(CommonUtil.class);
        context.getBean(CommonUtil.class);
        context.getBean(CommonUtil.class);
        context.getBean(CommonUtil.class);
        context.getBean(CommonUtil.class);
        System.out.println();
        context.getBean(RestUtil.class);
        context.getBean(RestUtil.class);
        context.getBean(RestUtil.class);
        context.getBean(RestUtil.class);
        
//        System.out.println(commonUtil);
    }
}
