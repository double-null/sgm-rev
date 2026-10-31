package kotlinx.serialization.json;

import ke.e1;
import ke.h1;
import ke.i1;
import ke.l1;
import ke.o1;
import ke.q0;
import ke.r0;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements fe.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21551d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f21552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le.c f21553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ke.e0 f21554c;

    /* JADX INFO: compiled from: Json.kt */
    public static final class a extends b {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), le.d.a(), null);
        }
    }

    public /* synthetic */ b(g gVar, le.c cVar, kotlin.jvm.internal.k kVar) {
        this(gVar, cVar);
    }

    @Override // fe.k
    public le.c a() {
        return this.f21553b;
    }

    @Override // fe.x
    public final <T> String b(fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        r0 r0Var = new r0();
        try {
            q0.b(this, r0Var, serializer, t10);
            return r0Var.toString();
        } finally {
            r0Var.g();
        }
    }

    public final <T> T d(fe.c<? extends T> deserializer, i element) {
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        kotlin.jvm.internal.t.f(element, "element");
        return (T) l1.a(this, element, deserializer);
    }

    public final g e() {
        return this.f21552a;
    }

    public final ke.e0 f() {
        return this.f21554c;
    }

    private b(g gVar, le.c cVar) {
        this.f21552a = gVar;
        this.f21553b = cVar;
        this.f21554c = new ke.e0();
    }

    @Override // fe.x
    public final <T> T c(fe.c<? extends T> deserializer, String str) {
        kotlin.jvm.internal.t.f(deserializer, "deserializer");
        kotlin.jvm.internal.t.f(str, cNMUz.zFI);
        h1 h1VarA = i1.a(this, str);
        T t10 = (T) new e1(this, o1.OBJ, h1VarA, deserializer.getDescriptor(), null).C(deserializer);
        h1VarA.v();
        return t10;
    }
}
