package com.facebook;

/* JADX INFO: compiled from: FacebookOperationCanceledException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookOperationCanceledException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: FacebookOperationCanceledException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(String str) {
        super(str);
    }

    public FacebookOperationCanceledException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookOperationCanceledException(Throwable th) {
        super(th);
    }
}
