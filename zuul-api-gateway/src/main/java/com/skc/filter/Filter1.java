package com.skc.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@Component
public class Filter1 extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("I am from Filter1");
		logger.info("{}", "i am from filter1");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";   //  1.  pre      2.  post   3.  error
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
