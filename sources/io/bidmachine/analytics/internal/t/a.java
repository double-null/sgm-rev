package io.bidmachine.analytics.internal.t;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.E.e;
import java.io.File;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.s.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0307a f17382h = new C0307a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f17383g = "aexs";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.t.a$a, reason: collision with other inner class name */
    public static final class C0307a {
        public /* synthetic */ C0307a(k kVar) {
            this();
        }

        private C0307a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17383g;
    }

    @Override // io.bidmachine.analytics.internal.s.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File(e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }
}
