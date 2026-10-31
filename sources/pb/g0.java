package pb;

import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes5.dex */
public enum g0 implements wb.q {
    Normal(Constants.NORMAL, 0),
    Bold("bold", 1),
    Italic("italic", 2),
    BoldItalic("bold_italic", 3);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24079c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24086b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g0 a(String str) {
            return (g0) wb.e0.l(g0.values(), str);
        }

        private a() {
        }
    }

    g0(String str, int i10) {
        this.f24085a = str;
        this.f24086b = i10;
    }

    public final int c() {
        return this.f24086b;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24085a;
    }
}
