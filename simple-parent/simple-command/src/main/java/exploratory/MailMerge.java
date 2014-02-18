package exploratory;

/**
 * Created by dvydra on 2/17/14.
 */
public class MailMerge {

    public static String merge(String template, String token, String value) {
        return template.replaceAll(token, value);
    }

}
