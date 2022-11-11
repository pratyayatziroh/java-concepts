package crypto.examples;

import java.nio.charset.Charset;

/**
 * @author Pratyay Ganguli
 */

public class ByteConverter {
    public byte[] getByte(String str){
        try{
            return str.getBytes(Charset.defaultCharset());
        }
        catch(Exception e){
            if(e instanceof NullPointerException){
                throw new RuntimeException("string value cannot be null or empty " + e.getMessage());
            }
            else{
                throw new RuntimeException("Unknown error " + e.getMessage());
            }
        }
    }

    public String getPlain(byte [] byteArr){
        var str = new String(byteArr);
        return str;
    }
}
