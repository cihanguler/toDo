package com.dart.step_definitions;
import com.dart.utilities.ConfigurationReader;
import com.dart.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginStepDefs {

    static Logger logger = LoggerFactory.getLogger(LoginStepDefs.class);

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String actual = Driver.get().getTitle();
        String expected = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(expected, actual);
        logger.info("Landing page Assertion Successful");
    }




}
