import org.junit.Assert;
import org.junit.Test;

public class SimpleTestHomeWork {

    @Test
    public void test1ArrayAfterNumberFour() {
        int[] in = new int[]{2, 3, 4, 1, 2};
        int[] out = new int[]{1, 2};
        Assert.assertArrayEquals(out, HomeWork.getNewArrayAfterNumberFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void test2ArrayAfterNumberFour() {
        int[] in = new int[]{3, 1, 6, 2, 1};
        HomeWork.getNewArrayAfterNumberFour(in);
    }

    @Test
    public void test1ArrayContainsOnlyNumberOneAndFour() {
        int[] in = new int[]{2, 3, 1, 4};
        Assert.assertFalse(HomeWork.isArrayContainsOnlyNumberOneAndFour(in));
    }

    @Test
    public void test2ArrayContainsOnlyNumberOneAndFour() {
        int[] in = new int[]{1, 1, 1, 4};
        Assert.assertTrue(HomeWork.isArrayContainsOnlyNumberOneAndFour(in));
    }
}
