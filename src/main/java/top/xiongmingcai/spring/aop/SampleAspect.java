package top.xiongmingcai.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


//切面类
@Aspect
public class SampleAspect {
    @Pointcut("execution(public * top.xiongmingcai.spring.aop.*Service.create*(..))")
    public void pointcut() {
    }


    //1.前置通知
    @Before("pointcut()")
    public void doBefore(JoinPoint jp) {
        String clzName = jp.getTarget().getClass().getName();//getTarget() 获取即将要执行的对象
        String method = jp.getSignature().getName();//即将要执行的方法
        Object args = jp.getArgs();
        System.out.println("【前置通知】" + clzName + "." + method);
    }

    //2.后置通知
    public void doAfter(JoinPoint jp) {
        String clzName = jp.getTarget().getClass().getName();//getTarget() 获取即将要执行的对象
        String method = jp.getSignature().getName();//即将要执行的方法
        System.out.println("【后置通知】" + clzName + "." + method);

    }

    //3.返回通知
    public void doAfterReturning(JoinPoint jp, Object ret) {
        System.out.println("【返回后通知】" + ret);

    }

    //4.异常通知
    public void doAfterThrowing(JoinPoint jp, Throwable t) {
        System.out.println("【异常通知】" + t.getMessage());
    }

    //5.环绕通知
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        String clzName = pjp.getTarget().getClass().getName();//getTarget() 获取即将要执行的对象
        String method = pjp.getSignature().getName();//即将要执行的方法
        Object args = pjp.getArgs();
        System.out.println("【前置通知】" + clzName + "." + method);
        Object ret = null;
        try {
            ret = pjp.proceed();//执行目标方法
            System.out.println("【返回后通知】" + ret);
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            System.out.println("【异常通知】" + t.getMessage());
            throw t;
        } finally {
            System.out.println("【后置通知】" + clzName + "." + method + "()");
        }
        return ret;
    }

}
