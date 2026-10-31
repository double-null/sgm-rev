package ab;

import kotlin.jvm.internal.t;
import pb.a0;
import pb.h1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final h1 a(a0 a0Var) {
        t.f(a0Var, "<this>");
        if (a0Var.f() != null) {
            return a0Var.f().b();
        }
        if (a0Var.k() != null) {
            return a0Var.k().b();
        }
        if (a0Var.b() != null) {
            return a0Var.b().b();
        }
        return null;
    }

    public static final h1 b(a0 a0Var) {
        t.f(a0Var, "<this>");
        if (a0Var.l() != null) {
            return a0Var.l().b();
        }
        if (a0Var.a() != null) {
            return a0Var.a().b();
        }
        if (a0Var.c() != null) {
            return a0Var.c().b();
        }
        return null;
    }
}
