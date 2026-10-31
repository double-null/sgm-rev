package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;

/* JADX INFO: compiled from: LoginTargetApp.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum LoginTargetApp {
    FACEBOOK(AccessToken.DEFAULT_GRAPH_DOMAIN),
    INSTAGRAM(FacebookSdk.INSTAGRAM);

    public static final Companion Companion = new Companion(null);
    private final String targetApp;

    /* JADX INFO: compiled from: LoginTargetApp.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final LoginTargetApp fromString(String str) {
            for (LoginTargetApp loginTargetApp : LoginTargetApp.values()) {
                if (kotlin.jvm.internal.t.a(loginTargetApp.toString(), str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    public static final LoginTargetApp fromString(String str) {
        return Companion.fromString(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
