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
package world.sake.mylasta.direction.sponsor;

import world.sake.mylasta.direction.TastingConfig;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;

/**
 * @author jflute
 */
public class TastingCookieResourceProvider implements CookieResourceProvider {

    protected final TastingConfig config;
    protected final InvertibleCryptographer cookieCipher;

    public TastingCookieResourceProvider(TastingConfig config, InvertibleCryptographer cookieCipher) {
        this.config = config;
        this.cookieCipher = cookieCipher;
    }

    @Override
    public String provideDefaultPath() {
        return config.getCookieDefaultPath();
    }

    @Override
    public Integer provideDefaultExpire() {
        return config.getCookieDefaultExpireAsInteger();
    }

    @Override
    public InvertibleCryptographer provideCipher() {
        return cookieCipher;
    }
}
