package u;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: FontsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f25857b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f25856a = i10;
            this.f25857b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f25857b;
        }

        public int c() {
            return this.f25856a;
        }
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f25858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f25861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f25862e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f25858a = (Uri) w.h.c(uri);
            this.f25859b = i10;
            this.f25860c = i11;
            this.f25861d = z10;
            this.f25862e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f25862e;
        }

        public int c() {
            return this.f25859b;
        }

        public Uri d() {
            return this.f25858a;
        }

        public int e() {
            return this.f25860c;
        }

        public boolean f() {
            return this.f25861d;
        }
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        u.a aVar = new u.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
