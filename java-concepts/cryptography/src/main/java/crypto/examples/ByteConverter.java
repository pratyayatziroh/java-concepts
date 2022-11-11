package crypto.examples;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @author Pratyay Ganguli
 */

public class ByteConverter {
    public byte[] getByte(String str){
        var byteArr =  str.getBytes(Charset.defaultCharset());
        return byteArr;
    }

    public String getPlain(byte [] byteArr){
        var str = Arrays.toString(byteArr);
        return str;
    }
}
