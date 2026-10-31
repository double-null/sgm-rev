package v8;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtractorsFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f27435a = new u() { // from class: v8.t
        @Override // v8.u
        public final p[] g() {
            return u.c();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ p[] c() {
        return new p[0];
    }

    default p[] f(Uri uri, Map<String, List<String>> map) {
        return g();
    }

    p[] g();

    default u a(s9.r.a aVar) {
        return this;
    }

    default u b(int i10) {
        return this;
    }

    @Deprecated
    default u e(boolean z10) {
        return this;
    }
}
