package se;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;
import me.b0;
import me.v;
import me.z;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.e f25432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<v> f25433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final re.c f25435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f25436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25440i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(re.e call, List<? extends v> interceptors, int i10, re.c cVar, z request, int i11, int i12, int i13) {
        t.f(call, "call");
        t.f(interceptors, "interceptors");
        t.f(request, "request");
        this.f25432a = call;
        this.f25433b = interceptors;
        this.f25434c = i10;
        this.f25435d = cVar;
        this.f25436e = request;
        this.f25437f = i11;
        this.f25438g = i12;
        this.f25439h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, re.c cVar, z zVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f25434c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f25435d;
        }
        re.c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            zVar = gVar.f25436e;
        }
        z zVar2 = zVar;
        if ((i14 & 8) != 0) {
            i11 = gVar.f25437f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f25438g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f25439h;
        }
        return gVar.b(i10, cVar2, zVar2, i15, i16, i13);
    }

    @Override // me.v.a
    public b0 a(z request) throws IOException {
        t.f(request, "request");
        if (!(this.f25434c < this.f25433b.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f25440i++;
        re.c cVar = this.f25435d;
        if (cVar != null) {
            if (!cVar.j().g(request.j())) {
                throw new IllegalStateException(("network interceptor " + this.f25433b.get(this.f25434c - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f25440i == 1)) {
                throw new IllegalStateException(("network interceptor " + this.f25433b.get(this.f25434c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f25434c + 1, null, request, 0, 0, 0, 58, null);
        v vVar = this.f25433b.get(this.f25434c);
        b0 b0VarIntercept = vVar.intercept(gVarC);
        if (b0VarIntercept == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f25435d != null) {
            if (!(this.f25434c + 1 >= this.f25433b.size() || gVarC.f25440i == 1)) {
                throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
            }
        }
        if (b0VarIntercept.b() != null) {
            return b0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i10, re.c cVar, z request, int i11, int i12, int i13) {
        t.f(request, "request");
        return new g(this.f25432a, this.f25433b, i10, cVar, request, i11, i12, i13);
    }

    @Override // me.v.a
    public me.e call() {
        return this.f25432a;
    }

    public final re.e d() {
        return this.f25432a;
    }

    public final int e() {
        return this.f25437f;
    }

    public final re.c f() {
        return this.f25435d;
    }

    public final int g() {
        return this.f25438g;
    }

    public final z h() {
        return this.f25436e;
    }

    public final int i() {
        return this.f25439h;
    }

    public int j() {
        return this.f25438g;
    }

    @Override // me.v.a
    public z request() {
        return this.f25436e;
    }
}
