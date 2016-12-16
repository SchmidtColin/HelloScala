package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by cw on 16.12.2016.
 */
public class StringResources {

    public static List<String> zeroStrings(){
        String baseName = "resources.Strings";
        ResourceBundle bundle = ResourceBundle.getBundle(baseName, Locale.GERMAN);
        List<String> result = new ArrayList<>();
        result.add(bundle.getString("FIRST_ZERO"));
        result.add(bundle.getString("SECOND_ZERO"));
        result.add(bundle.getString("NO_ZERO"));
        return result;
    }

}
