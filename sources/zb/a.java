package zb;

import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import ud.v0;
import wc.r;
import zc.f;

/* JADX INFO: compiled from: DownloadManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: zb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadManager.kt */
    public static final class C0493a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, List<String>> f29102b;

        public /* synthetic */ C0493a(long j10, Map map, k kVar) {
            this(j10, map);
        }

        public static /* synthetic */ Long e(C0493a c0493a, String str, Long l10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                l10 = null;
            }
            return c0493a.d(str, l10);
        }

        public static /* synthetic */ String g(C0493a c0493a, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return c0493a.f(str, str2);
        }

        public final Long a() {
            return e(this, "Content-Length", null, 2, null);
        }

        public final String b() {
            return g(this, "Content-Type", null, 2, null);
        }

        public final long c() {
            return this.f29101a;
        }

        public final Long d(String key, Long l10) {
            String str;
            Long lR;
            t.f(key, "key");
            List<String> list = this.f29102b.get(key);
            return (list == null || (str = (String) b0.P(list)) == null || (lR = rd.b0.r(str)) == null) ? l10 : lR;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0493a)) {
                return false;
            }
            C0493a c0493a = (C0493a) obj;
            return sd.a.k(this.f29101a, c0493a.f29101a) && t.a(this.f29102b, c0493a.f29102b);
        }

        public final String f(String key, String str) {
            String str2;
            t.f(key, "key");
            List<String> list = this.f29102b.get(key);
            return (list == null || (str2 = (String) b0.P(list)) == null) ? str : str2;
        }

        public int hashCode() {
            return (sd.a.x(this.f29101a) * 31) + this.f29102b.hashCode();
        }

        public String toString() {
            return "CallData(executionTime=" + ((Object) sd.a.H(this.f29101a)) + ", headers=" + this.f29102b + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C0493a(long j10, Map<String, ? extends List<String>> map) {
            this.f29101a = j10;
            this.f29102b = map;
        }
    }

    /* JADX INFO: compiled from: DownloadManager.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f29104b;

        public /* synthetic */ b(long j10, File file, k kVar) {
            this(j10, file);
        }

        public final long a() {
            return this.f29103a;
        }

        public final File b() {
            return this.f29104b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return sd.a.k(this.f29103a, bVar.f29103a) && t.a(this.f29104b, bVar.f29104b);
        }

        public int hashCode() {
            return (sd.a.x(this.f29103a) * 31) + this.f29104b.hashCode();
        }

        public String toString() {
            return "DownloadData(executionTime=" + ((Object) sd.a.H(this.f29103a)) + ", output=" + this.f29104b + ')';
        }

        private b(long j10, File file) {
            this.f29103a = j10;
            this.f29104b = file;
        }
    }

    /* JADX INFO: compiled from: DownloadManager.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0<r<b>> f29106b;

        public c(String url, v0<r<b>> deferred) {
            t.f(url, "url");
            t.f(deferred, "deferred");
            this.f29105a = url;
            this.f29106b = deferred;
        }

        public final v0<r<b>> a() {
            return this.f29106b;
        }

        public final String b() {
            return this.f29105a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return t.a(this.f29105a, cVar.f29105a) && t.a(this.f29106b, cVar.f29106b);
        }

        public int hashCode() {
            return (this.f29105a.hashCode() * 31) + this.f29106b.hashCode();
        }

        public String toString() {
            return oqHAiWkeGzWld.GnfaLWXKernxq + this.f29105a + ", deferred=" + this.f29106b + ')';
        }
    }

    c a(String str, File file);

    Object b(String str, sd.a aVar, f<? super r<C0493a>> fVar);

    c c(String str, File file, sd.a aVar);
}
