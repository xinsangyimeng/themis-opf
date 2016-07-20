package org.jason.themis.core.commons.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public abstract class StringUtils {
    private static final Pattern INT_PATTERN = Pattern.compile("^\\d+$");

    public static boolean isEmpty(Object value) {
        return null == value || "".equals(value);
    }

    public static boolean isInteger(String str) {
        return !(null == str || 0 == str.length()) && INT_PATTERN.matcher(str).matches();
    }

    public static String trim(String str) {
        if (null == str) {
            return null;
        }

        return str.trim();
    }

    public static String concat(String... strings) {
        if (null == strings) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            if (str != null) {
                sb.append(str);
            }
        }

        return sb.toString();
    }

    public static String[] splitWithTrim(String spilt, String sequence) {
        if (isEmpty(sequence)) {
            return null;
        }

        String[] values = sequence.split(spilt);
        if (0 == values.length) {
            return values;
        }

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim();
        }

        return values;
    }

    public static String toString(String msg, Throwable e) {
        StringWriter sw = new StringWriter();
        sw.write(msg + "\n");
        PrintWriter pw = new PrintWriter(sw);
        try {
            e.printStackTrace(pw);
            return sw.toString();
        } finally {
            pw.close();
        }
    }
}
