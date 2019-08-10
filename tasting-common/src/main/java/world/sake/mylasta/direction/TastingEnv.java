/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package world.sake.mylasta.direction;

import org.lastaflute.core.direction.ObjectiveConfig;
import org.lastaflute.core.direction.exception.ConfigPropertyNotFoundException;

/**
 * @author FreeGen
 */
public interface TastingEnv {

    /** The key of the configuration. e.g. hot */
    String lasta_di_SMART_DEPLOY_MODE = "lasta_di.smart.deploy.mode";

    /** The key of the configuration. e.g. true */
    String DEVELOPMENT_HERE = "development.here";

    /** The key of the configuration. e.g. Local Development */
    String ENVIRONMENT_TITLE = "environment.title";

    /** The key of the configuration. e.g. false */
    String FRAMEWORK_DEBUG = "framework.debug";

    /** The key of the configuration. e.g. 0 */
    String TIME_ADJUST_TIME_MILLIS = "time.adjust.time.millis";

    /** The key of the configuration. e.g. debug */
    String LOG_LEVEL = "log.level";

    /** The key of the configuration. e.g. debug */
    String LOG_CONSOLE_LEVEL = "log.console.level";

    /** The key of the configuration. e.g. /tmp/lastaflute/tasting */
    String LOG_FILE_BASEDIR = "log.file.basedir";

    /** The key of the configuration. e.g. true */
    String MAIL_SEND_MOCK = "mail.send.mock";

    /** The key of the configuration. e.g. localhost:25 */
    String MAIL_SMTP_SERVER_MAIN_HOST_AND_PORT = "mail.smtp.server.main.host.and.port";

    /** The key of the configuration. e.g. [Test] */
    String MAIL_SUBJECT_TEST_PREFIX = "mail.subject.test.prefix";

    /** The key of the configuration. e.g. returnpath@sake.world */
    String MAIL_RETURN_PATH = "mail.return.path";

    /** The key of the configuration. e.g. com.mysql.jdbc.Driver */
    String JDBC_DRIVER = "jdbc.driver";

    /** The key of the configuration. e.g. jdbc:mysql://localhost:3306/tastingdb */
    String JDBC_URL = "jdbc.url";

    /** The key of the configuration. e.g. tastingdb */
    String JDBC_USER = "jdbc.user";

    /** The key of the configuration. e.g. tastingdb */
    String JDBC_PASSWORD = "jdbc.password";

    /** The key of the configuration. e.g. 10 */
    String JDBC_CONNECTION_POOLING_SIZE = "jdbc.connection.pooling.size";

    /** The key of the configuration. e.g. com.mysql.jdbc.Driver */
    String SHOCHUDB_JDBC_DRIVER = "shochudb.jdbc.driver";

    /** The key of the configuration. e.g. jdbc:mysql://localhost:3306/shochudb */
    String SHOCHUDB_JDBC_URL = "shochudb.jdbc.url";

    /** The key of the configuration. e.g. shochudb */
    String SHOCHUDB_JDBC_USER = "shochudb.jdbc.user";

    /** The key of the configuration. e.g. shochudb */
    String SHOCHUDB_JDBC_PASSWORD = "shochudb.jdbc.password";

    /** The key of the configuration. e.g. 10 */
    String SHOCHUDB_JDBC_CONNECTION_POOLING_SIZE = "shochudb.jdbc.connection.pooling.size";

    /**
     * Get the value of property as {@link String}.
     * @param propertyKey The key of the property. (NotNull)
     * @return The value of found property. (NotNull: if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    String get(String propertyKey);

    /**
     * Is the property true?
     * @param propertyKey The key of the property which is boolean type. (NotNull)
     * @return The determination, true or false. (if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    boolean is(String propertyKey);

    /**
     * Get the value for the key 'lasta_di.smart.deploy.mode'. <br>
     * The value is, e.g. hot <br>
     * comment: The mode of Lasta Di's smart-deploy, should be cool in production (e.g. hot, cool, warm)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLastaDiSmartDeployMode();

    /**
     * Get the value for the key 'development.here'. <br>
     * The value is, e.g. true <br>
     * comment: Is development environment here? (used for various purpose, you should set false if unknown)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDevelopmentHere();

    /**
     * Is the property for the key 'development.here' true? <br>
     * The value is, e.g. true <br>
     * comment: Is development environment here? (used for various purpose, you should set false if unknown)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isDevelopmentHere();

    /**
     * Get the value for the key 'environment.title'. <br>
     * The value is, e.g. Local Development <br>
     * comment: The title of environment (e.g. local or integration or production)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getEnvironmentTitle();

    /**
     * Get the value for the key 'framework.debug'. <br>
     * The value is, e.g. false <br>
     * comment: Does it enable the Framework internal debug? (true only when emergency)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getFrameworkDebug();

    /**
     * Is the property for the key 'framework.debug' true? <br>
     * The value is, e.g. false <br>
     * comment: Does it enable the Framework internal debug? (true only when emergency)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isFrameworkDebug();

    /**
     * Get the value for the key 'time.adjust.time.millis'. <br>
     * The value is, e.g. 0 <br>
     * comment: The milliseconds for (relative or absolute) adjust time (set only when test) @LongType *dynamic in development
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getTimeAdjustTimeMillis();

    /**
     * Get the value for the key 'time.adjust.time.millis' as {@link Long}. <br>
     * The value is, e.g. 0 <br>
     * comment: The milliseconds for (relative or absolute) adjust time (set only when test) @LongType *dynamic in development
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not long.
     */
    Long getTimeAdjustTimeMillisAsLong();

    /**
     * Get the value for the key 'log.level'. <br>
     * The value is, e.g. debug <br>
     * comment: The log level for logback
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogLevel();

    /**
     * Get the value for the key 'log.console.level'. <br>
     * The value is, e.g. debug <br>
     * comment: The log console level for logback
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogConsoleLevel();

    /**
     * Get the value for the key 'log.file.basedir'. <br>
     * The value is, e.g. /tmp/lastaflute/tasting <br>
     * comment: The log file basedir
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogFileBasedir();

    /**
     * Get the value for the key 'mail.send.mock'. <br>
     * The value is, e.g. true <br>
     * comment: Does it send mock mail? (true: no send actually, logging only)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSendMock();

    /**
     * Is the property for the key 'mail.send.mock' true? <br>
     * The value is, e.g. true <br>
     * comment: Does it send mock mail? (true: no send actually, logging only)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isMailSendMock();

    /**
     * Get the value for the key 'mail.smtp.server.main.host.and.port'. <br>
     * The value is, e.g. localhost:25 <br>
     * comment: SMTP server settings for main: host:port
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSmtpServerMainHostAndPort();

    /**
     * Get the value for the key 'mail.subject.test.prefix'. <br>
     * The value is, e.g. [Test] <br>
     * comment: The prefix of subject to show test environment or not
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSubjectTestPrefix();

    /**
     * Get the value for the key 'mail.return.path'. <br>
     * The value is, e.g. returnpath@sake.world <br>
     * comment: The common return path of all mail
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailReturnPath();

    /**
     * Get the value for the key 'jdbc.driver'. <br>
     * The value is, e.g. com.mysql.jdbc.Driver <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcDriver();

    /**
     * Get the value for the key 'jdbc.url'. <br>
     * The value is, e.g. jdbc:mysql://localhost:3306/tastingdb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcUrl();

    /**
     * Get the value for the key 'jdbc.user'. <br>
     * The value is, e.g. tastingdb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcUser();

    /**
     * Get the value for the key 'jdbc.password'. <br>
     * The value is, e.g. tastingdb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcPassword();

    /**
     * Get the value for the key 'jdbc.connection.pooling.size'. <br>
     * The value is, e.g. 10 <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcConnectionPoolingSize();

    /**
     * Get the value for the key 'jdbc.connection.pooling.size' as {@link Integer}. <br>
     * The value is, e.g. 10 <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getJdbcConnectionPoolingSizeAsInteger();

    /**
     * Get the value for the key 'shochudb.jdbc.driver'. <br>
     * The value is, e.g. com.mysql.jdbc.Driver <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getShochudbJdbcDriver();

    /**
     * Get the value for the key 'shochudb.jdbc.url'. <br>
     * The value is, e.g. jdbc:mysql://localhost:3306/shochudb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getShochudbJdbcUrl();

    /**
     * Get the value for the key 'shochudb.jdbc.user'. <br>
     * The value is, e.g. shochudb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getShochudbJdbcUser();

    /**
     * Get the value for the key 'shochudb.jdbc.password'. <br>
     * The value is, e.g. shochudb <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getShochudbJdbcPassword();

    /**
     * Get the value for the key 'shochudb.jdbc.connection.pooling.size'. <br>
     * The value is, e.g. 10 <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getShochudbJdbcConnectionPoolingSize();

    /**
     * Get the value for the key 'shochudb.jdbc.connection.pooling.size' as {@link Integer}. <br>
     * The value is, e.g. 10 <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getShochudbJdbcConnectionPoolingSizeAsInteger();

    /**
     * The simple implementation for configuration.
     * @author FreeGen
     */
    public static class SimpleImpl extends ObjectiveConfig implements TastingEnv {

        /** The serial version UID for object serialization. (Default) */
        private static final long serialVersionUID = 1L;

        public String getLastaDiSmartDeployMode() {
            return get(TastingEnv.lasta_di_SMART_DEPLOY_MODE);
        }

        public String getDevelopmentHere() {
            return get(TastingEnv.DEVELOPMENT_HERE);
        }

        public boolean isDevelopmentHere() {
            return is(TastingEnv.DEVELOPMENT_HERE);
        }

        public String getEnvironmentTitle() {
            return get(TastingEnv.ENVIRONMENT_TITLE);
        }

        public String getFrameworkDebug() {
            return get(TastingEnv.FRAMEWORK_DEBUG);
        }

        public boolean isFrameworkDebug() {
            return is(TastingEnv.FRAMEWORK_DEBUG);
        }

        public String getTimeAdjustTimeMillis() {
            return get(TastingEnv.TIME_ADJUST_TIME_MILLIS);
        }

        public Long getTimeAdjustTimeMillisAsLong() {
            return getAsLong(TastingEnv.TIME_ADJUST_TIME_MILLIS);
        }

        public String getLogLevel() {
            return get(TastingEnv.LOG_LEVEL);
        }

        public String getLogConsoleLevel() {
            return get(TastingEnv.LOG_CONSOLE_LEVEL);
        }

        public String getLogFileBasedir() {
            return get(TastingEnv.LOG_FILE_BASEDIR);
        }

        public String getMailSendMock() {
            return get(TastingEnv.MAIL_SEND_MOCK);
        }

        public boolean isMailSendMock() {
            return is(TastingEnv.MAIL_SEND_MOCK);
        }

        public String getMailSmtpServerMainHostAndPort() {
            return get(TastingEnv.MAIL_SMTP_SERVER_MAIN_HOST_AND_PORT);
        }

        public String getMailSubjectTestPrefix() {
            return get(TastingEnv.MAIL_SUBJECT_TEST_PREFIX);
        }

        public String getMailReturnPath() {
            return get(TastingEnv.MAIL_RETURN_PATH);
        }

        public String getJdbcDriver() {
            return get(TastingEnv.JDBC_DRIVER);
        }

        public String getJdbcUrl() {
            return get(TastingEnv.JDBC_URL);
        }

        public String getJdbcUser() {
            return get(TastingEnv.JDBC_USER);
        }

        public String getJdbcPassword() {
            return get(TastingEnv.JDBC_PASSWORD);
        }

        public String getJdbcConnectionPoolingSize() {
            return get(TastingEnv.JDBC_CONNECTION_POOLING_SIZE);
        }

        public Integer getJdbcConnectionPoolingSizeAsInteger() {
            return getAsInteger(TastingEnv.JDBC_CONNECTION_POOLING_SIZE);
        }

        public String getShochudbJdbcDriver() {
            return get(TastingEnv.SHOCHUDB_JDBC_DRIVER);
        }

        public String getShochudbJdbcUrl() {
            return get(TastingEnv.SHOCHUDB_JDBC_URL);
        }

        public String getShochudbJdbcUser() {
            return get(TastingEnv.SHOCHUDB_JDBC_USER);
        }

        public String getShochudbJdbcPassword() {
            return get(TastingEnv.SHOCHUDB_JDBC_PASSWORD);
        }

        public String getShochudbJdbcConnectionPoolingSize() {
            return get(TastingEnv.SHOCHUDB_JDBC_CONNECTION_POOLING_SIZE);
        }

        public Integer getShochudbJdbcConnectionPoolingSizeAsInteger() {
            return getAsInteger(TastingEnv.SHOCHUDB_JDBC_CONNECTION_POOLING_SIZE);
        }
    }
}
