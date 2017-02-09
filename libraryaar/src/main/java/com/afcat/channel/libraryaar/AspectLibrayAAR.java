package com.afcat.channel.libraryaar;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by jebai on 2017/2/8.
 */
@Aspect
public class AspectLibrayAAR {

    private static final String TAG = AspectLibrayAAR.class.getSimpleName();

    @Before("execution(void com.afcat.channel.libraryaar.ClassAAR.setBusinessNameAAR(**))")
    public void onTroggleAspectLibraryAAR(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onTroggleAspectLibraryAAR: " + key);

        Object object = joinPoint.getArgs()[0];

        Log.d(TAG, object.getClass().toString() + " " + object);

    }
}
