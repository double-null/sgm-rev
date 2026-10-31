package ce;

import id.q;
import ud.n;
import wc.g0;
import zc.j;
import zd.e0;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f5542a = a.f5548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f5543b = new e0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f5544c = new e0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f5545d = new e0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f5546e = new e0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f5547f = new e0("PARAM_CLAUSE_0");

    /* JADX INFO: compiled from: Select.kt */
    static final class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5548a = new a();

        a() {
        }

        @Override // id.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(int i10) {
        if (i10 == 0) {
            return d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return d.REREGISTER;
        }
        if (i10 == 2) {
            return d.CANCELLED;
        }
        if (i10 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(n<? super g0> nVar, q<? super Throwable, Object, ? super j, g0> qVar) {
        Object objG = nVar.g(g0.f27756a, null, qVar);
        if (objG == null) {
            return false;
        }
        nVar.h0(objG);
        return true;
    }
}
