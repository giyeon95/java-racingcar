package step2;

import java.util.Objects;

public class Common {

    public static boolean textNullOrEmpty(String text) {
        if(Objects.isNull(text) || text.equals("")) {
            return true;
        }

        return false;
    }
}