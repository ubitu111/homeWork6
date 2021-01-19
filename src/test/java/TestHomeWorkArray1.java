import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestHomeWorkArray1 {
    private int[] inArray;
    private int[] outArray;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 5, 7, 4, 1}, new int[]{1}},
                {new int[]{1, 3, 4, 5, 4}, new int[]{}},
                {new int[]{1, 3, 5, 7, 4, 1, 4, 4, 1}, new int[]{1}},
                {new int[]{4, 1, 3, 8}, new int[]{1, 3, 8}}
        });
    }

    public TestHomeWorkArray1(int[] inArray, int[] outArray) {
        this.inArray = inArray;
        this.outArray = outArray;
    }

    @Test
    public void testArrayAfterNumberFour() {
        Assert.assertArrayEquals(outArray, HomeWork.getNewArrayAfterNumberFour(inArray));
    }
}
