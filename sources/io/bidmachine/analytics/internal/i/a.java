package io.bidmachine.analytics.internal.i;

import io.bidmachine.analytics.internal.h.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends d {

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC0281a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.b f16959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0281a f16960c;

        public b(String str, io.bidmachine.analytics.internal.h.b bVar, InterfaceC0281a interfaceC0281a) {
            this.f16958a = str;
            this.f16959b = bVar;
            this.f16960c = interfaceC0281a;
        }

        public final io.bidmachine.analytics.internal.h.b a() {
            return this.f16959b;
        }

        public final InterfaceC0281a b() {
            return this.f16960c;
        }

        public final String c() {
            return this.f16958a;
        }
    }
}
