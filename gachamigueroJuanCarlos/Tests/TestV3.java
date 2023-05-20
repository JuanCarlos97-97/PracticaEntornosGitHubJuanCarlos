import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestV3 {
    @org.junit.jupiter.api.Test
    public void testFor1(){
        String result = V3.cocinar("1");
        Assertions.assertEquals("1",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor2() {
        String result = V3.cocinar("2");
        Assertions.assertEquals("2",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor3() {
        String result = V3.cocinar("3");
        Assertions.assertEquals("Gacha",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor4() {
        String result = V3.cocinar("4");
        Assertions.assertEquals("4",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor5() {
        String result = V3.cocinar("5");
        Assertions.assertEquals("Miga",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor6() {
        String result = V3.cocinar("6");
        Assertions.assertEquals("Gacha",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor7() {
        String result = V3.cocinar("7");
        Assertions.assertEquals("7",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor8() {
        String result = V3.cocinar("8");
        Assertions.assertEquals("8",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor9() {
        String result = V3.cocinar("9");
        Assertions.assertEquals("Gacha",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor10() {
        String result = V3.cocinar("10");
        Assertions.assertEquals("Miga",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor11() {
        String result = V3.cocinar("11");
        Assertions.assertEquals("11",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor12() {
        String result = V3.cocinar("12");
        Assertions.assertEquals("Gacha",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor13() {
        String result = V3.cocinar("13");
        Assertions.assertEquals("13",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor14() {
        String result = V3.cocinar("14");
        Assertions.assertEquals("14",result);
    }
    @org.junit.jupiter.api.Test
    public void testFor15() {
        String result = V3.cocinar("15");
        Assertions.assertEquals("Gachamiga",result);
    }
    @Test
    public void testFor16() {
        String result = V3.cocinar("30");
        Assertions.assertEquals("Gachamiga",result);
    }
}
