package pb;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public enum j0 implements wb.q {
    LeftRight("right"),
    TopBottom("bottom"),
    RightLeft(ViewHierarchyConstants.DIMENSION_LEFT_KEY),
    BottomTop(ViewHierarchyConstants.DIMENSION_TOP_KEY);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24138b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24144a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final j0 a(String str) {
            return (j0) wb.e0.l(j0.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.LeftRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.TopBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.RightLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.BottomTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    j0(String str) {
        this.f24144a = str;
    }

    public final pa.m.c c() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return pa.m.c.LEFT_RIGHT;
        }
        if (i10 == 2) {
            return pa.m.c.TOP_BOTTOM;
        }
        if (i10 == 3) {
            return pa.m.c.RIGHT_LEFT;
        }
        if (i10 == 4) {
            return pa.m.c.BOTTOM_TOP;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // wb.q
    public String getKey() {
        return this.f24144a;
    }
}
