package com.applovin.shadow.okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes.dex */
final class Handshake$Companion$get$1 extends u implements id.a<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // id.a
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
