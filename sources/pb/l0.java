package pb;

import com.facebook.appevents.internal.ViewHierarchyConstants;

/* JADX INFO: loaded from: classes5.dex */
public enum l0 implements wb.q {
    Left(ViewHierarchyConstants.DIMENSION_LEFT_KEY, 3),
    Center("center", 1),
    Right("right", 5);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24158c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24164b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final l0 a(String str) {
            return (l0) wb.e0.l(l0.values(), str);
        }

        private a() {
        }
    }

    l0(String str, int i10) {
        this.f24163a = str;
        this.f24164b = i10;
    }

    public final int c() {
        return this.f24164b;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24163a;
    }
}
