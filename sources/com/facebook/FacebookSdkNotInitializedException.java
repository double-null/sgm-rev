package com.facebook;

/* JADX INFO: compiled from: FacebookSdkNotInitializedException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookSdkNotInitializedException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: FacebookSdkNotInitializedException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public FacebookSdkNotInitializedException() {
    }

    public FacebookSdkNotInitializedException(String str) {
        super(str);
    }

    public FacebookSdkNotInitializedException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookSdkNotInitializedException(Throwable th) {
        super(th);
    }
}
