package com.kyaracter.fragmentmanagerannotation.library;


import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.kyaracter.fragmentmanagerannotation.annotation.FrameworkFragmentManager;
import com.kyaracter.fragmentmanagerannotation.annotation.FrameworkChildFragmentManager;
import com.kyaracter.fragmentmanagerannotation.annotation.SupportChildFragmentManager;
import com.kyaracter.fragmentmanagerannotation.annotation.SupportFragmentManager;

import java.lang.annotation.Annotation;
import java.util.List;


public class LookFragmentManager {

    public static void frameworkFragmentManager(@NonNull Activity activity, @IdRes int resId) {
        Annotation[] annoations = activity.getFragmentManager()
                .findFragmentById(resId)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportFragmentManager || annotation instanceof SupportChildFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void frameworkChildFragmentManager(@NonNull android.app.Fragment fragment, @IdRes int resId) {
        Annotation[] annoations = fragment.getChildFragmentManager()
                .findFragmentById(resId)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkFragmentManager || annotation instanceof SupportFragmentManager || annotation instanceof SupportChildFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void supportFragmentManager(@NonNull FragmentActivity activity, @IdRes int resId) {
        Annotation[] annoations = activity.getSupportFragmentManager()
                .findFragmentById(resId)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportChildFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void supportFragmentManager(@NonNull FragmentActivity activity, @NonNull String tag) {
        Annotation[] annoations = activity.getSupportFragmentManager()
                .findFragmentByTag(tag)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportChildFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void supportFragmentManager(@NonNull FragmentActivity activity) {
        List<Fragment> fragmentList = activity.getSupportFragmentManager().getFragments();

        if (!fragmentList.isEmpty()) {
            for (Fragment fragment : fragmentList) {
                Annotation[] annoations = fragment.getClass().getAnnotations();

                for (Annotation annotation : annoations) {
                    if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportChildFragmentManager) {
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
    }

    public static void supportChildFragmentManager(@NonNull Fragment fragment, @IdRes int resId) {
        Annotation[] annoations = fragment.getChildFragmentManager()
                .findFragmentById(resId)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void supportChildFragmentManager(@NonNull Fragment fragment, @NonNull String tag) {
        Annotation[] annoations = fragment.getChildFragmentManager()
                .findFragmentByTag(tag)
                .getClass()
                .getAnnotations();

        for (Annotation annotation : annoations) {
            if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportFragmentManager) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void supportChildFragmentManager(@NonNull Fragment fragment) {
        List<Fragment> fragmentList = fragment.getChildFragmentManager().getFragments();

        if (!fragmentList.isEmpty()) {
            for (Fragment fragment1 : fragmentList) {
                Annotation[] annoations = fragment1.getClass().getAnnotations();

                for (Annotation annotation : annoations) {
                    if (annotation instanceof FrameworkFragmentManager || annotation instanceof FrameworkChildFragmentManager || annotation instanceof SupportFragmentManager) {
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
    }
}
