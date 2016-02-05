package probst.renato.estrutura;

import android.os.Bundle;

/**
 * Created by Renato on 03/02/2016.
 */
public class Utils {
    public static boolean hasExtra(Bundle b, String keyName) {
        return b != null && b.containsKey("text");
    }
}
