package io.bidmachine.analytics.internal.p002a;

import android.content.Context;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16840b = m.a(new C0276a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f16841c = m.a(b.f16844a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f16842d = m.a(c.f16845a);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.a$a, reason: collision with other inner class name */
    static final class C0276a extends u implements id.a {
        C0276a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.p002a.b invoke() {
            return new io.bidmachine.analytics.internal.p002a.b(a.this.a());
        }
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16844a = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.p002a.c invoke() {
            return new io.bidmachine.analytics.internal.p002a.c();
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16845a = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gc.a invoke() {
            return new gc.a();
        }
    }

    public a(Context context) {
        this.f16839a = context.getApplicationContext();
    }

    public final Context a() {
        return this.f16839a;
    }

    public final io.bidmachine.analytics.internal.p002a.b b() {
        return (io.bidmachine.analytics.internal.p002a.b) this.f16840b.getValue();
    }

    public final io.bidmachine.analytics.internal.p002a.c c() {
        return (io.bidmachine.analytics.internal.p002a.c) this.f16841c.getValue();
    }

    public final gc.b d() {
        return (gc.b) this.f16842d.getValue();
    }
}
