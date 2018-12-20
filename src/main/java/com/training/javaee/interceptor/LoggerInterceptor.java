package com.training.javaee.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Logger
public class LoggerInterceptor {

	@AroundInvoke
	public Object log(InvocationContext invocationCtx) throws Exception {
		System.out.println("Start method: " + invocationCtx.getMethod().getName());
		// execute the intercepted method and store the return value
		Object returnValue = invocationCtx.proceed();
		System.out.println("End method: " + invocationCtx.getMethod().getName());
		return returnValue;
	}
}
