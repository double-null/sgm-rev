package e0;

/* JADX INFO: compiled from: Message.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class y<T> {

    /* JADX INFO: compiled from: Message.kt */
    public static final class a<T> extends y<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final id.p<T, zc.f<? super T>, Object> f13827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ud.x<T> f13828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k0<T> f13829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final zc.j f13830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(id.p<? super T, ? super zc.f<? super T>, ? extends Object> transform, ud.x<T> ack, k0<T> k0Var, zc.j callerContext) {
            super(null);
            kotlin.jvm.internal.t.f(transform, "transform");
            kotlin.jvm.internal.t.f(ack, "ack");
            kotlin.jvm.internal.t.f(callerContext, "callerContext");
            this.f13827a = transform;
            this.f13828b = ack;
            this.f13829c = k0Var;
            this.f13830d = callerContext;
        }

        public final ud.x<T> a() {
            return this.f13828b;
        }

        public final zc.j b() {
            return this.f13830d;
        }

        public k0<T> c() {
            return this.f13829c;
        }

        public final id.p<T, zc.f<? super T>, Object> d() {
            return this.f13827a;
        }
    }

    private y() {
    }

    public /* synthetic */ y(kotlin.jvm.internal.k kVar) {
        this();
    }
}
