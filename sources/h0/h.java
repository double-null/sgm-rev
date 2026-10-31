package h0;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x0;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w<h, a> implements q0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class a extends w.a<h, a> implements q0 {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(String str) {
            m();
            ((h) this.f2372b).n0(str);
            return this;
        }

        public a B(g.a aVar) {
            m();
            ((h) this.f2372b).o0(aVar.build());
            return this;
        }

        public a u(boolean z10) {
            m();
            ((h) this.f2372b).h0(z10);
            return this;
        }

        public a v(androidx.datastore.preferences.protobuf.g gVar) {
            m();
            ((h) this.f2372b).i0(gVar);
            return this;
        }

        public a w(double d10) {
            m();
            ((h) this.f2372b).j0(d10);
            return this;
        }

        public a x(float f10) {
            m();
            ((h) this.f2372b).k0(f10);
            return this;
        }

        public a y(int i10) {
            m();
            ((h) this.f2372b).l0(i10);
            return this;
        }

        public a z(long j10) {
            m();
            ((h) this.f2372b).m0(j10);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: PreferencesProto.java */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15578a;

        b(int i10) {
            this.f15578a = i10;
        }

        public static b c(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        w.K(h.class, hVar);
    }

    private h() {
    }

    public static h Y() {
        return DEFAULT_INSTANCE;
    }

    public static a g0() {
        return DEFAULT_INSTANCE.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(androidx.datastore.preferences.protobuf.g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean W() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.g X() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.f2126b;
    }

    public double Z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float a0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int b0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long c0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String d0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g e0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.R();
    }

    public b f0() {
        return b.c(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.w
    protected final Object t(w.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f15566a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return w.G(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0<h> bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
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
