package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f12241a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f12241a = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f12241a = aVar;
    }
}
