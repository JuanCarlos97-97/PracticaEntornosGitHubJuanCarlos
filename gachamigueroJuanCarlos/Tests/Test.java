import org.junit.jupiter.api.Assertions;
public class Test {
    @org.junit.jupiter.api.Test
    public void testFor1(){
        String result = V2.metodo("1");
        Assertions.assertEquals("1",result);
    }
    @org.junit.jupiter.api.Test
    public void testfor2() {
        String result = V2.metodo("2");
        Assertions.assertEquals("2",result);
    }
}
