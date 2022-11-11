package crypto.examples;

import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class ByteConverterTest {
    private final ByteConverter converter;

    public ByteConverterTest(){
        converter = new ByteConverter();
    }

    @Test
    public void convert(){
        converter.getByte("Hello I am Pratyay and I am having a great Day");
    }

    @Test
    public void getString(){
        var byteArr = converter.getByte("Hello I am Pratyay and I am having a great Day");
        var str = converter.getPlain(byteArr);
        System.out.println(str);
    }
}
