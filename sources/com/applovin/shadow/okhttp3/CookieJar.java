package com.applovin.shadow.okhttp3;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CookieJar.kt */
/* JADX INFO: loaded from: classes.dex */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* JADX INFO: compiled from: CookieJar.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: CookieJar.kt */
        private static final class NoCookies implements CookieJar {
            @Override // com.applovin.shadow.okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl url) {
                t.f(url, "url");
                return kotlin.collections.t.k();
            }

            @Override // com.applovin.shadow.okhttp3.CookieJar
            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                t.f(url, "url");
                t.f(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
