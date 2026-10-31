package com.facebook;

/* JADX INFO: compiled from: FacebookDialogException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookDialogException extends FacebookException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;
    private final int errorCode;
    private final String failingUrl;

    /* JADX INFO: compiled from: FacebookDialogException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public FacebookDialogException(String str, int i10, String str2) {
        super(str);
        this.errorCode = i10;
        this.failingUrl = str2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.errorCode + ", message: " + getMessage() + ", url: " + this.failingUrl + "}";
        kotlin.jvm.internal.t.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
