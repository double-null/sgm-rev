package d3;

import com.adjust.sdk.Constants;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes4.dex */
class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f13287d = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f13288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f13290c;

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f13291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f13292b;

        a(byte[] bArr, int[] iArr) {
            this.f13291a = bArr;
            this.f13292b = iArr;
        }

        @Override // d3.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f13291a, this.f13292b[0], i10);
                int[] iArr = this.f13292b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: QueueFileLogStore.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f13294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13295b;

        b(byte[] bArr, int i10) {
            this.f13294a = bArr;
            this.f13295b = i10;
        }
    }

    i(File file, int i10) {
        this.f13288a = file;
        this.f13289b = i10;
    }

    private b g() {
        if (!this.f13288a.exists()) {
            return null;
        }
        h();
        h hVar = this.f13290c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.K()];
        try {
            this.f13290c.p(new a(bArr, iArr));
        } catch (IOException e10) {
            z2.f.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f13290c == null) {
            try {
                this.f13290c = new h(this.f13288a);
            } catch (IOException e10) {
                z2.f.f().e("Could not open log file: " + this.f13288a, e10);
            }
        }
    }

    @Override // d3.d
    public void a() {
        com.google.firebase.crashlytics.internal.common.h.f(this.f13290c, "There was a problem closing the Crashlytics log file.");
        this.f13290c = null;
    }

    @Override // d3.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f13287d);
        }
        return null;
    }

    @Override // d3.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f13295b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f13294a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // d3.d
    public void d() {
        a();
        this.f13288a.delete();
    }

    @Override // d3.d
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }

    private void f(long j10, String str) {
        if (this.f13290c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f13289b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f13290c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll(RHIpdOnfgiYkEj.jWHjIvr, " ")).getBytes(f13287d));
            while (!this.f13290c.t() && this.f13290c.K() > this.f13289b) {
                this.f13290c.G();
            }
        } catch (IOException e10) {
            z2.f.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }
}
