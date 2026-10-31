package ca;

import android.util.SparseArray;
import io.bidmachine.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes4.dex */
public interface l0 {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f5214c;

        public a(String str, int i10, byte[] bArr) {
            this.f5212a = str;
            this.f5213b = i10;
            this.f5214c = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f5218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f5219e;

        public b(int i10, String str, int i11, List<a> list, byte[] bArr) {
            this.f5215a = i10;
            this.f5216b = str;
            this.f5217c = i11;
            this.f5218d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f5219e = bArr;
        }

        public int a() {
            int i10 = this.f5217c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        SparseArray<l0> a();

        l0 b(int i10, b bVar);
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5224e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f5223d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f5223d;
            this.f5223d = i10 == Integer.MIN_VALUE ? this.f5221b : i10 + this.f5222c;
            this.f5224e = this.f5220a + this.f5223d;
        }

        public String b() {
            d();
            return this.f5224e;
        }

        public int c() {
            d();
            return this.f5223d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f5220a = str;
            this.f5221b = i11;
            this.f5222c = i12;
            this.f5223d = Integer.MIN_VALUE;
            this.f5224e = "";
        }
    }

    void a(x7.g0 g0Var, v8.r rVar, d dVar);

    void b();

    void c(x7.a0 a0Var, int i10) throws ParserException;
}
