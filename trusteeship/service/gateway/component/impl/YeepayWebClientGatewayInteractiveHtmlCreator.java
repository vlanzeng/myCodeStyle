package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.GatewayInteractiveHtmlCreator;

@Service("yeepayWebClientGatewayInteractiveHtmlCreator")
class YeepayWebClientGatewayInteractiveHtmlCreator implements GatewayInteractiveHtmlCreator{
	
	@Resource(name="gatewayInteractiveInfoValidator")
	private    ParameterValidator<GatewayInteractiveInfo>  gatewayInteractiveInfoValidator;
 	
	@Override
	public String create(GatewayInteractiveInfo gatewayInteractiveInfo) {
		gatewayInteractiveInfoValidator.validate(gatewayInteractiveInfo);
		return createHtmlString(gatewayInteractiveInfo);
	}
	
	private String   createHtmlString(GatewayInteractiveInfo gatewayInteractiveInfo){
	    StringBuilder  sb=new StringBuilder();
	  	sb.append("<!DOCTYPE html>");
	  	sb.append("<html>");
	  	sb.append("<head>");
	  	sb.append("<meta");
	  	sb.append(" ");
	  	sb.append("http-equiv=\"Content-Type\"");
	  	sb.append(" ");
		sb.append("content=\"text/html;\"");
		sb.append(" ");
		sb.append("charset=\"utf8\"");
		sb.append(" ");
	  	sb.append("/>");
	  	sb.append("<title>Servlet AccountServlet</title>");
	  	sb.append("</head>"); 
	  	sb.append("<body>");
	  	sb.append("<form action=\""+gatewayInteractiveInfo.getRequestHandlerUrl()+"\" id=\"frm1\" method=\"post\">"); 
	  	Map<String, String>   paramsMap = gatewayInteractiveInfo.getParamsMap();
        Set<String> keySet = paramsMap.keySet();
        for(String key : keySet){
        	String value = paramsMap.get(key);
        	sb.append("<input type=\"hidden\" name=\""+key+"\"  value=\"" + value + "\"/>");
        }
         sb.append("</form>");
	     sb.append("<script language=\"javascript\">");
	     sb.append("document.getElementById(\"frm1\").submit();");
	     sb.append("</script>");
	     sb.append("</body>");
	     sb.append("</html>");
	     return  sb.toString();
	}
	
}
