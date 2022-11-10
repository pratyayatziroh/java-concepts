package concepts.thread.core;

import java.time.LocalDateTime;

/**
 * @author Pratyay Ganguli
 */

public class UserTime {
    public String getTimeStamp(){
        return Long.toString(System.currentTimeMillis());
    }
}
