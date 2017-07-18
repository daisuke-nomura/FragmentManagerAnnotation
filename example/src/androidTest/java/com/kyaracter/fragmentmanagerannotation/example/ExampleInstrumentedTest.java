package com.kyaracter.fragmentmanagerannotation.example;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.kyaracter.fragmentmanagerannotation.library.LookFragmentManager;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class, false);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.kyaracter.fragmentmanagerannotation.example", appContext.getPackageName());
    }

    @Test
    public void supportFragmentManagerTest() throws RuntimeException {
        MainActivity mainActivity = mActivityRule.launchActivity(null);
        LookFragmentManager.supportFragmentManager(mainActivity, com.kyaracter.fragmentmanagerannotation.example.R.id.fragment);
        onView(withText("Hello World!"));
    }

    @Test
    public void supportChildFragmentManagerTest() throws RuntimeException {
        MainActivity mainActivity = mActivityRule.launchActivity(null);
        LookFragmentManager.supportFragmentManager(mainActivity, com.kyaracter.fragmentmanagerannotation.example.R.id.fragment);
        onView(withText("Hello World!"));
    }
}
