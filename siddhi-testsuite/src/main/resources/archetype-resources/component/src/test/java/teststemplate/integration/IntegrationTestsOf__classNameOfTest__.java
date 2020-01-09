package teststemplate.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststemplate.AbstractTests;

/**
 * Class for integration testing. Performs integration tests by running the application and dependent services as
 * Docker containers. This ensures that the updated Siddhi application functions as expected.
 *
 */
public class IntegrationTestsOf${classNameOfTest} extends AbstractTests {

    private static final Logger logger = LoggerFactory.getLogger(IntegrationTestsOf${classNameOfTest}.class);

    @BeforeClass
    public void setUpCluster() {

    }

    @AfterClass
    public void shutdownCluster() {

    }

    @Test
    public void testDBPersistence() {

    }
}
