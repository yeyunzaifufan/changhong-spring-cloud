package com.ly.gatewayzuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class PreRequestLogFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(PreRequestLogFilter.class);

    /**
     * 执行过滤器类型
     * @return 类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 指定过滤器执行顺序
     * @return 序号
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否执行该过滤器
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.logger.info(String.format("----------------send %s request to %s----------------------", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }
}
