package com.facebook;

/* JADX INFO: compiled from: FacebookAuthorizationException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookAuthorizationException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: FacebookAuthorizationException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public FacebookAuthorizationException() {
    }

    public FacebookAuthorizationException(String str) {
        super(str);
    }

    public FacebookAuthorizationException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookAuthorizationException(Throwable th) {
        super(th);
    }
}
