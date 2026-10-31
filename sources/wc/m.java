package wc;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: compiled from: LazyJVM.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static <T> k<T> a(id.a<? extends T> initializer) {
        kotlin.jvm.internal.t.f(initializer, "initializer");
        return new u(initializer, null, 2, null);
    }

    public static <T> k<T> b(o mode, id.a<? extends T> initializer) {
        kotlin.jvm.internal.t.f(mode, "mode");
        kotlin.jvm.internal.t.f(initializer, "initializer");
        int i10 = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i10 == 1) {
            return new u(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new t(initializer);
        }
        if (i10 == 3) {
            return new h0(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }
}
