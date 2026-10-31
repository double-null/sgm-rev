package ud;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum q0 {
    DEFAULT,
    f26806b,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ bd.a f26810f = bd.b.a(b());

    /* JADX INFO: compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.f26806b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final <R, T> void c(id.p<? super R, ? super zc.f<? super T>, ? extends Object> pVar, R r10, zc.f<? super T> fVar) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            ae.a.b(pVar, r10, fVar);
            return;
        }
        if (i10 == 2) {
            zc.h.a(pVar, r10, fVar);
        } else if (i10 == 3) {
            ae.b.a(pVar, r10, fVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean e() {
        return this == f26806b;
    }
}
