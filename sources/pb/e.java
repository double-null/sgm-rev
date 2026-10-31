package pb;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public enum e implements wb.q {
    Left(ViewHierarchyConstants.DIMENSION_LEFT_KEY),
    Top(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    Right("right"),
    Bottom("bottom");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23999b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24005a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final e a(String str) {
            return (e) wb.e0.l(e.values(), str);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    e(String str) {
        this.f24005a = str;
    }

    public final e c() {
        int i10 = b.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return Right;
        }
        if (i10 == 2) {
            return Bottom;
        }
        if (i10 == 3) {
            return Left;
        }
        if (i10 == 4) {
            return Top;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // wb.q
    public String getKey() {
        return this.f24005a;
    }
}
