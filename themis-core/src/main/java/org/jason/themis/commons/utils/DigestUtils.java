package org.jason.themis.commons.utils;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public abstract class DigestUtils {

    public static String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
