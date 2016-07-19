package org.jason.themis.commons.constant;


import java.nio.charset.Charset;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public interface BaseConstants {
    int AVAILABLE_PROCESSOR = Runtime.getRuntime().availableProcessors();

    String OS_NAME = System.getProperty("os.name");
    String OS_ARCH = System.getProperty("os.arch");
    String OS_VERSION = System.getProperty("os.version");

    String USER_HOME = System.getProperty("user.home");

    String LINE_SEPARATOR = System.getProperty("line.separator");

    int REGISTRY_HUB_DEFAULT_PORT = 9411;

    String DEFAULT_GROUP = "defaultGroup";

    String CHARSET = "UTF-8";

    Charset UTF_8 = Charset.forName("utf-8");

    String SUBSCRIBE = "subscribe";

    String UNSUBSCRIBE = "unsubscribe";

    String REGISTRY_RETRY_PERIOD_KEY = "retry.period";

    int DEFAULT_REGISTRY_RETRY_PERIOD = 5 * 1000;

    String REGISTRY_RECONNECT_PERIOD_KEY = "reconnect.period";

    int DEFAULT_REGISTRY_RECONNECT_PERIOD = 3 * 1000;

    String ROUTER_PROCESSOR_THREAD = "router.processor.thread";

    int DEFAULT_PROCESSOR_THREAD = 32 + AVAILABLE_PROCESSOR * 5;

    String LAZY_ROUTER_LOGGER = "lazy.router.logger";

    String LAZY_ROUTER_LOG_THRESHOLD = "lazy.router.log.threshold";

    String LAZY_ROUTER_LOG_CHECK_PERIOD = "lazy.router.log.check.period";

    String LAZY_ROUTER_LOG_BATCH_FLUSH_SIZE = "lazy.router.log.batch.flush.size";

    String LAZY_ROUTER_LOG_OVERFLOW_SIZE = "lazy.router.log.overflow.size";

    String JAVA_COMPLIER = "java.compiler";

}
