package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: LoginConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoginConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final String OPENID = "openid";
    private final String codeVerifier;
    private final String nonce;
    private final Set<String> permissions;

    /* JADX INFO: compiled from: LoginConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginConfiguration(Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, int i10, kotlin.jvm.internal.k kVar) {
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.t.e(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(Collection<String> collection, String nonce) {
        this(collection, nonce, PKCEUtil.generateCodeVerifier());
        kotlin.jvm.internal.t.f(nonce, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, String str2, int i10, kotlin.jvm.internal.k kVar) {
        collection = (i10 & 1) != 0 ? null : collection;
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.t.e(str, "randomUUID().toString()");
        }
        this(collection, str, str2);
    }

    public LoginConfiguration(Collection<String> collection, String nonce, String codeVerifier) {
        kotlin.jvm.internal.t.f(nonce, "nonce");
        kotlin.jvm.internal.t.f(codeVerifier, "codeVerifier");
        if (NonceUtil.isValidNonce(nonce) && PKCEUtil.isValidCodeVerifier(codeVerifier)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            kotlin.jvm.internal.t.e(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.permissions = setUnmodifiableSet;
            this.nonce = nonce;
            this.codeVerifier = codeVerifier;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
