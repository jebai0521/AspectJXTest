package com.afcat.channel.aspecttest;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by jebai on 2017/2/8.
 */

@Aspect
public class AspectMain {

    private static final String TAG = AspectMain.class.getSimpleName();

//    @Before("execution(* android.app.Activity.on**(..))")
//
//    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
//
//        String key = joinPoint.getSignature().toString();
//
//        Log.d(TAG, "onActivityMethodBefore: " + key);
//
//    }


    @Before("execution(void com.afcat.channel.aspecttest.MainActivity.toggleAspect(android.view.View))")

    public void onTroggleAspect(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onTroggleAspect: " + key);

        Object object = joinPoint.getArgs()[0];

        Log.d(TAG, object.getClass().toString());

    }
}
