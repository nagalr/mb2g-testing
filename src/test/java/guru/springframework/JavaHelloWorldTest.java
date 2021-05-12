package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ronnen on 12-May-2021
 */


public class JavaHelloWorldTest {

    @Test
    public void getHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}