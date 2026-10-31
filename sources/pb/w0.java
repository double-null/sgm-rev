package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class w0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24244e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f24248d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final w0 a(String str) {
            List listK0 = str != null ? rd.f0.K0(str, new String[]{","}, false, 0, 6, null) : null;
            if (listK0 == null || listK0.size() < 4) {
                return null;
            }
            try {
                return new w0(Float.parseFloat(rd.f0.d1((String) listK0.get(0)).toString()), Float.parseFloat(rd.f0.d1((String) listK0.get(1)).toString()), Float.parseFloat(rd.f0.d1((String) listK0.get(2)).toString()), Float.parseFloat(rd.f0.d1((String) listK0.get(3)).toString()));
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public w0(float f10, float f11, float f12, float f13) {
        this.f24245a = f10;
        this.f24246b = f11;
        this.f24247c = f12;
        this.f24248d = f13;
    }

    public final float a() {
        return this.f24248d;
    }

    public final float b() {
        return this.f24245a;
    }

    public final float c() {
        return this.f24247c;
    }

    public final float d() {
        return this.f24246b;
    }

    public final boolean e() {
        return this.f24245a == 0.0f && this.f24246b == 0.0f && this.f24247c == 0.0f && this.f24248d == 0.0f;
    }
}
