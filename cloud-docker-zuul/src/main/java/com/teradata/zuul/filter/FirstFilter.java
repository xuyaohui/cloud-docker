package com.teradata.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class FirstFilter extends ZuulFilter {

    private final String TOKEN = "xuyaohui";
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("初始登录，进行权限验证...");
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        String accessToken = String.valueOf(request.getParameter("Token"));
//        if(!TOKEN.equals(accessToken)) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        return null;
    }
}
