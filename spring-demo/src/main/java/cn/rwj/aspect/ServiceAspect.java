package cn.rwj.aspect;

import cn.rwj.introduction.LittleUniverse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author rwj
 * @Date 2022/11/4
 * @Description
 */
@Aspect
@Component
public class ServiceAspect {

	@Pointcut("execution(* cn.rwj.service..*.*(..))")
	public void embed() {}

	@Before("embed()")
	public void before(JoinPoint joinPoint) {
		System.out.println("开始调用 " + joinPoint);
	}

	@After("embed()")
	public void after(JoinPoint joinPoint) {
		System.out.println("调用完成 " + joinPoint );
	}

	@Around("embed()")
	public Object around(JoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("开始计时 " + joinPoint);

		Object returnValue = ((ProceedingJoinPoint) joinPoint).proceed();

		System.out.println("执行成功，结束计时 " + joinPoint);
		long endTime = System.currentTimeMillis();
		System.out.println("总耗时 "+ joinPoint + "[" + (endTime - startTime) + "]ms");

		return returnValue;
	}

	@AfterReturning(pointcut = "embed()", returning = "returnValue")
	public void afterReturning(JoinPoint joinPoint, Object returnValue){
		System.out.println("无论是空还是有值都返回  " + joinPoint + "，返回值[" + returnValue + "]");
	}

	@AfterThrowing(pointcut = "embed()", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,  Exception exception){
		System.out.println("抛出异常通知  " + joinPoint + "   " + exception.getMessage() );
	}

	@DeclareParents(value = "cn.rwj.controller..*", defaultImpl = cn.rwj.introduction.impl.LittleUniverseImpl.class)
	public LittleUniverse littleUniverse;


}
