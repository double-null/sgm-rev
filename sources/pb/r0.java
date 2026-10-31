package pb;

import android.webkit.MimeTypeMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24202b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f24203a;

    public static final class a {

        /* JADX INFO: renamed from: pb.r0$a$a, reason: collision with other inner class name */
        static final class C0393a extends kotlin.jvm.internal.u implements id.l {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0393a f24204d = new C0393a();

            C0393a() {
                super(1);
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String it) {
                kotlin.jvm.internal.t.f(it, "it");
                return wb.d0.p(it);
            }
        }

        static final class b extends kotlin.jvm.internal.u implements id.l {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final b f24205d = new b();

            b() {
                super(1);
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String it) {
                kotlin.jvm.internal.t.f(it, "it");
                return Boolean.valueOf(wb.d0.u(it));
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final r0 a(String str) {
            r0 r0VarC = c(str);
            if (r0VarC != null) {
                return r0VarC;
            }
            r0 r0VarD = d(str);
            if (r0VarD != null) {
                return r0VarD;
            }
            if (str != null) {
                return b(str);
            }
            return null;
        }

        public final r0 b(String str) {
            if (str == null) {
                return null;
            }
            if (rd.f0.k0(str)) {
                str = null;
            }
            if (str != null) {
                return new m(str);
            }
            return null;
        }

        public final r0 c(String str) {
            try {
                String strA = pa.i.f23787a.a(str);
                if (strA != null) {
                    return r0.f24202b.b(strA);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final r0 d(String str) {
            if (str == null) {
                return null;
            }
            return e(kotlin.collections.s.e(str));
        }

        public final r0 e(List<String> input) {
            boolean zW;
            kotlin.jvm.internal.t.f(input, "input");
            List listX = qd.r.x(qd.r.n(qd.r.w(kotlin.collections.b0.E(input), C0393a.f24204d), b.f24205d));
            Object obj = null;
            if (listX.isEmpty()) {
                return null;
            }
            for (Object obj2 : listX) {
                try {
                    zW = rd.c0.w(MimeTypeMap.getFileExtensionFromUrl((String) obj2), "m3u8", true);
                } catch (Throwable unused) {
                    zW = false;
                }
                if (zW) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            return str != null ? new j1(str, b.STREAM) : new j1((List<String>) listX, b.PRELOAD);
        }

        private a() {
        }
    }

    public enum b {
        PRELOAD,
        STREAM
    }

    public /* synthetic */ r0(b bVar, kotlin.jvm.internal.k kVar) {
        this(bVar);
    }

    public b a() {
        return this.f24203a;
    }

    private r0(b bVar) {
        this.f24203a = bVar;
    }
}
