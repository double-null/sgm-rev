package io.bidmachine.analytics.internal.u;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.E.e;
import java.io.File;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.analytics.internal.s.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0308a f17384i = new C0308a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final id.a f17385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f17386h = "aints";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.u.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public /* synthetic */ C0308a(k kVar) {
            this();
        }

        private C0308a() {
        }
    }

    public a(id.a aVar) {
        this.f17385g = aVar;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17386h;
    }

    @Override // io.bidmachine.analytics.internal.s.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File((File) this.f17385g.invoke(), e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }
}
