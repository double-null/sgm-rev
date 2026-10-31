package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11426b;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, String str) {
        this.f11425a = i10;
        this.f11426b = str;
    }

    public int getErrorCode() {
        return this.f11425a;
    }

    public String getMessage() {
        return this.f11426b;
    }
}
