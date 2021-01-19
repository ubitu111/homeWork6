import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestHomeWorkArray2 {
    private int[] inArray;
    private boolean result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 5, 3}, false},
                {new int[]{4, 1}, true},
                {new int[]{4, 4}, false},
                {new int[]{1, 1, 1}, false}
        });
    }

    public TestHomeWorkArray2(int[] inArray, boolean result) {
        this.inArray = inArray;
        this.result = result;
    }

    @Test
    public void testArrayIsOnly4and1() {
        Assert.assertEquals(result, HomeWork.isArrayContainsOnlyNumberOneAndFour(inArray));
    }
}
