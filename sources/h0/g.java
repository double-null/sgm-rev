package h0;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import java.util.List;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends w<g, a> implements q0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile x0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private y.i<String> strings_ = w.u();

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class a extends w.a<g, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a u(Iterable<String> iterable) {
            m();
            ((g) this.f2372b).P(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w.K(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(Iterable<String> iterable) {
        Q();
        androidx.datastore.preferences.protobuf.a.b(iterable, this.strings_);
    }

    private void Q() {
        y.i<String> iVar = this.strings_;
        if (iVar.isModifiable()) {
            return;
        }
        this.strings_ = w.E(iVar);
    }

    public static g R() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return DEFAULT_INSTANCE.q();
    }

    public List<String> S() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object t(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f15566a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return w.G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
