package pb;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public enum k0 implements wb.q {
    Linear("linear"),
    Radial("radial"),
    Bilinear("bilinear");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24151b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24156a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final k0 a(String str) {
            return (k0) wb.e0.l(k0.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                iArr[k0.Linear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.Radial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.Bilinear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    k0(String str) {
        this.f24156a = str;
    }

    public final int c() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // wb.q
    public String getKey() {
        return this.f24156a;
    }
}
