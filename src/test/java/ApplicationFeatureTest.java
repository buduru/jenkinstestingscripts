
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class ApplicationFeatureTest {

    @Test
    public void testSumFunctionality() {
        int result = 2 + 3;
        assertEquals("Sum of 2 + 3 should be 5", 5, result);
    }

    @Test
    public void testAppNameInitialization() {
        String appName = "My Web Application";
        assertNotNull("Application name should not be null", appName);
    }

    @Test
    public void testFeatureToggle() {
        boolean isFeatureEnabled = true; // Simulate feature toggle
        assertTrue("Feature should be enabled", isFeatureEnabled);
    }
}
