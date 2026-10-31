package c4;

import b4.u0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CrashEventReceiver.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4715a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u0 f4716b;

    private a() {
    }

    public static final void b() {
        try {
            if (f4716b == null) {
                f4715a.c(u0.f4026a.a());
            }
            a aVar = f4715a;
            if (aVar.a().a()) {
                aVar.a().b();
            }
        } catch (Exception unused) {
        }
    }

    public final u0 a() {
        u0 u0Var = f4716b;
        if (u0Var != null) {
            return u0Var;
        }
        t.u("sharedSessionRepository");
        return null;
    }

    public final void c(u0 u0Var) {
        t.f(u0Var, "<set-?>");
        f4716b = u0Var;
    }
}
