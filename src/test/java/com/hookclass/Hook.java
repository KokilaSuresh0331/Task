package com.hookclass;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	@Before
    public void beforeScenario() {
       launchBrowser("https://www.facebook.com");
	}

    @After
    public void afterScenario() {
        quitBrowser();
    }
}
