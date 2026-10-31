package nc;

import kotlin.jvm.internal.u;
import wc.k;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: VisibilityParams.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22962d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k<a> f22963e = m.b(o.NONE, b.f22970d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22966c;

    /* JADX INFO: renamed from: nc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VisibilityParams.kt */
    public static final class C0380a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f22967a = 50.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22969c;

        public final a a() {
            return new a(this.f22967a, this.f22968b, this.f22969c);
        }

        public final C0380a b(boolean z10) {
            this.f22969c = z10;
            return this;
        }

        public final C0380a c(boolean z10) {
            this.f22968b = z10;
            return this;
        }

        public final C0380a d(float f10) {
            this.f22967a = f10;
            return this;
        }
    }

    /* JADX INFO: compiled from: VisibilityParams.kt */
    static final class b extends u implements id.a<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f22970d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return a.f22962d.a().a();
        }
    }

    /* JADX INFO: compiled from: VisibilityParams.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final a b() {
            return (a) a.f22963e.getValue();
        }

        public final C0380a a() {
            return new C0380a().d(50.0f).c(true).b(true);
        }

        public final a c() {
            return b();
        }
    }

    public a(float f10, boolean z10, boolean z11) {
        this.f22964a = f10;
        this.f22965b = z10;
        this.f22966c = z11;
    }

    public final float b() {
        return this.f22964a;
    }

    public final boolean c() {
        return this.f22966c;
    }

    public final boolean d() {
        return this.f22965b;
    }
}
