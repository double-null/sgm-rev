package com.vungle.ads.internal.network;

import fe.d;
import fe.l;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public enum HttpMethod {
    GET,
    POST;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: TpatSender.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<HttpMethod> serializer() {
            return HttpMethod$$serializer.INSTANCE;
        }
    }
}
