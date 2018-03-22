package hdychi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Test {
    @org.junit.Test
    public void testNormal(){
        int res1 = Triangle.getType(1,1,1);//测试等边三角形
        assertEquals(1,res1);
        int res2 = Triangle.getType(2,2,1);//测试等腰三角形
        assertEquals(2,res2);
        res2 = Triangle.getType(1,2,2);//换两条边等腰
        assertEquals(2,res2);
        res2 = Triangle.getType(2,1,2);//换两条边等腰
        assertEquals(2,res2);
        int res3 = Triangle.getType(3,4,5);//测试斜边三角形
        assertEquals(3,res3);
        int res4 = Triangle.getType(2,2,4);//测试不是三角形的
        assertEquals(4,res4);
        assertThat(res4,equalTo(4));
    }
}
