package io.bidmachine.analytics.internal.h;

import android.content.Context;
import kotlin.jvm.internal.k;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16929c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16930a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f16931b = b.EMPTY;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public abstract String a();

    public final void a(Context context) {
        synchronized (this.f16930a) {
            if (this.f16931b != b.EMPTY) {
                return;
            }
            d(context);
            this.f16931b = b.CREATED;
            g0 g0Var = g0.f27756a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f16930a) {
            if (this.f16931b != b.ENABLED) {
                return;
            }
            try {
                r.a aVar = r.f27774b;
                e(context);
                r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
            this.f16931b = b.DISABLED;
            g0 g0Var = g0.f27756a;
        }
    }

    public abstract void b(Object obj);

    public final void c(Context context) {
        synchronized (this.f16930a) {
            if (this.f16931b != b.DISABLED) {
                return;
            }
            try {
                r.a aVar = r.f27774b;
                f(context);
                r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
            this.f16931b = b.ENABLED;
            g0 g0Var = g0.f27756a;
        }
    }

    public abstract void d(Context context);

    public abstract void e(Context context);

    public abstract void f(Context context);

    public final void a(Object obj) {
        synchronized (this.f16930a) {
            b bVar = this.f16931b;
            if (bVar == b.CREATED || bVar == b.DISABLED) {
                b(obj);
                this.f16931b = b.DISABLED;
                g0 g0Var = g0.f27756a;
            }
        }
    }
}
