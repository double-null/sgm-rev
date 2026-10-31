package d3;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* JADX INFO: compiled from: LogFileManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f13265c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileStore f13266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f13267b;

    public f(FileStore fileStore) {
        this.f13266a = fileStore;
        this.f13267b = f13265c;
    }

    private File d(String str) {
        return this.f13266a.q(str, "userlog");
    }

    public void a() {
        this.f13267b.d();
    }

    public byte[] b() {
        return this.f13267b.c();
    }

    public String c() {
        return this.f13267b.b();
    }

    public final void e(String str) {
        this.f13267b.a();
        this.f13267b = f13265c;
        if (str == null) {
            return;
        }
        f(d(str), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    }

    void f(File file, int i10) {
        this.f13267b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f13267b.e(j10, str);
    }

    public f(FileStore fileStore, String str) {
        this(fileStore);
        e(str);
    }

    /* JADX INFO: compiled from: LogFileManager.java */
    private static final class b implements d {
        private b() {
        }

        @Override // d3.d
        public String b() {
            return null;
        }

        @Override // d3.d
        public byte[] c() {
            return null;
        }

        @Override // d3.d
        public void a() {
        }

        @Override // d3.d
        public void d() {
        }

        @Override // d3.d
        public void e(long j10, String str) {
        }
    }
}
