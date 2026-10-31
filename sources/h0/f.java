package h0;

import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.p1;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends w<f, a> implements q0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile x0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private j0<String, h> preferences_ = j0.n();

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class a extends w.a<f, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a u(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            m();
            ((f) this.f2372b).P().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: PreferencesProto.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i0<String, h> f15567a = i0.d(p1.b.f2267k, "", p1.b.f2269m, h.Y());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        w.K(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> P() {
        return R();
    }

    private j0<String, h> R() {
        if (!this.preferences_.t()) {
            this.preferences_ = this.preferences_.x();
        }
        return this.preferences_;
    }

    private j0<String, h> S() {
        return this.preferences_;
    }

    public static a T() {
        return DEFAULT_INSTANCE.q();
    }

    public static f U(InputStream inputStream) throws IOException {
        return (f) w.I(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> Q() {
        return Collections.unmodifiableMap(S());
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object t(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f15566a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return w.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f15567a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
