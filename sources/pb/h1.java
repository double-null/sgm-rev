package pb;

import c2.YDwL.tFQWuE;
import com.facebook.appevents.internal.ViewHierarchyConstants;

/* JADX INFO: loaded from: classes5.dex */
public enum h1 implements wb.q {
    Left(ViewHierarchyConstants.DIMENSION_LEFT_KEY),
    f24099d(tFQWuE.fEd),
    Right("right"),
    Bottom("bottom"),
    CenterX("centerX"),
    CenterY("centerY");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24097b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24105a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    h1(String str) {
        this.f24105a = str;
    }

    @Override // wb.q
    public String getKey() {
        return this.f24105a;
    }
}
