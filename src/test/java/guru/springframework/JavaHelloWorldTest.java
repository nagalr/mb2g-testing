package guru.springframework;



/**
 * Created by ronnen on 12-May-2021
 */


public class JavaHelloWorldTest {

    public void testgetHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
//        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}