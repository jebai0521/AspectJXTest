package com.afcat.channel.library;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by jebai on 2017/2/8.
 */
@Aspect
public class AspectLibray {

    private static final String TAG = AspectLibray.class.getSimpleName();

    @Before("execution(void com.afcat.channel.library.ClassA.setBusinessName(**))")
    public void onTroggleAspectLibrary(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onTroggleAspectLibrary: " + key);

        Object object = joinPoint.getArgs()[0];

        Log.d(TAG, object.getClass().toString() + " " + object);

    }
}
