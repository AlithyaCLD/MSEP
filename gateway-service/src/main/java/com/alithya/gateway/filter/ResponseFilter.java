/**
 * 
 */
package com.alithya.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import brave.Tracer;


/**
 * @author gnaoussi
 *
 */
@Component
public class ResponseFilter extends ZuulFilter {

	private static final int FILTER_ORDER=1;
	private static final boolean SHOULD_FILTER=true;
	
	private static final Logger logger = LoggerFactory.getLogger(ResponseFilter.class);
	
	@Autowired
	private Tracer tracer;
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return SHOULD_FILTER;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.getResponse().addHeader("alithya-correlation-id",  tracer.currentSpan().context().traceIdString());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "post";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return FILTER_ORDER;
	}

}
