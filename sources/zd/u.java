package zd;

import java.util.List;
import kotlin.KotlinNothingValueException;
import ud.k2;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f29240a = true;

    private static final v a(Throwable th, String str) throws Throwable {
        if (f29240a) {
            return new v(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ v b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(k2 k2Var) {
        return k2Var.q0() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final k2 e(s sVar, List<? extends s> list) {
        try {
            return sVar.b(list);
        } catch (Throwable th) {
            return a(th, sVar.a());
        }
    }
}
