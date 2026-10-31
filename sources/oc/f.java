package oc;

import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;

/* JADX INFO: compiled from: IabUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23364a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c7.a f23365b = c7.a.FullLoad;

    /* JADX INFO: compiled from: IabUtils.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private f() {
    }

    public final c7.a a(Object obj) {
        CreativeLoadingMethod creativeLoadingMethodValueOf;
        if (obj == null) {
            return f23365b;
        }
        if (obj instanceof c7.a) {
            return (c7.a) obj;
        }
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethodValueOf = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf((String) obj);
            } catch (Throwable unused) {
                creativeLoadingMethodValueOf = null;
            }
        } else {
            creativeLoadingMethodValueOf = null;
        }
        int i10 = creativeLoadingMethodValueOf == null ? -1 : a.$EnumSwitchMapping$0[creativeLoadingMethodValueOf.ordinal()];
        if (i10 == -1) {
            return f23365b;
        }
        if (i10 != 1) {
            return i10 != 2 ? f23365b : c7.a.PartialLoad;
        }
        return c7.a.Stream;
    }

    public final g7.n b(Object obj) {
        if (obj instanceof AdExtension.ControlAsset) {
            return m.n((AdExtension.ControlAsset) obj);
        }
        return null;
    }
}
