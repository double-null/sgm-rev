package io.bidmachine.analytics.internal.f;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    default KeyPair a() {
        return b().generateKeyPair();
    }

    KeyPairGenerator b();
}
