package base_java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

 

public class DyProxyDo implements InvocationHandler {
   private Object delegate;
   
   public Object bind(Object target) {
	   this.delegate = target;
	   return 
	   Proxy.newProxyInstance(this.getClass().getClassLoader(),this.delegate.getClass().getInterfaces(),this);
   }
    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result =null;
		try {
			result = method.invoke(this.delegate, args);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
