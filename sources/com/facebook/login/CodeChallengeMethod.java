package com.facebook.login;

/* JADX INFO: compiled from: CodeChallengeMethod.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    CodeChallengeMethod(String str) {
    }

    /* synthetic */ CodeChallengeMethod(String str, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? "S256" : str);
    }
}
