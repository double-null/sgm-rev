package qb;

import pa.s;
import wb.a0;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rb.d f24731a = new rb.e();

    public static void c(Runnable runnable) {
        f24731a.a(runnable);
    }

    public static void d(Runnable runnable) {
        f24731a.execute(runnable);
    }

    public static void e(Runnable runnable, long j10) {
        f24731a.schedule(runnable, j10);
    }

    public static <I> void f(final I i10, final wb.i<I> iVar) {
        if (iVar == null) {
            return;
        }
        a0.c(new s() { // from class: qb.g
            @Override // wb.v
            public final void p() {
                iVar.execute(i10);
            }
        });
    }

    public static String g(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 != 4) {
            return i10 != 8 ? "unknown" : "GONE";
        }
        return "INVISIBLE";
    }
}
