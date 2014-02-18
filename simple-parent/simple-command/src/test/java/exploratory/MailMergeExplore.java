package exploratory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.*;

@RunWith(Parameterized.class)
public class MailMergeExplore {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {"[t1]", System.getProperty("value","abc")}
        });
    }

    @Parameter(value = 0 )
    public String pToken;
    @Parameter(value = 1 )
    public String pValue;

    @Test public void merge() {
        assertTrue(MailMerge.merge("abracadabra [t1]", pToken, pValue).contains(pValue));
    }
}
