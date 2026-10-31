package ke;

import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ke.a f21430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21433d;

    /* JADX INFO: compiled from: JsonTreeReader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f21437h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f21438i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f21439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f21440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f21441l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21443n;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21441l = obj;
            this.f21443n |= Integer.MIN_VALUE;
            return y0.this.h(null, this);
        }
    }

    public y0(kotlinx.serialization.json.g configuration, ke.a lexer) {
        kotlin.jvm.internal.t.f(configuration, "configuration");
        kotlin.jvm.internal.t.f(lexer, "lexer");
        this.f21430a = lexer;
        this.f21431b = configuration.q();
        this.f21432c = configuration.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.i f() {
        byte bJ = this.f21430a.j();
        if (this.f21430a.G() == 4) {
            ke.a.x(this.f21430a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f21430a.e()) {
            arrayList.add(e());
            bJ = this.f21430a.j();
            if (bJ != 4) {
                ke.a aVar = this.f21430a;
                boolean z10 = bJ == 9;
                int i10 = aVar.f21315a;
                if (!z10) {
                    ke.a.x(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bJ == 8) {
            this.f21430a.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.f21432c) {
                k0.h(this.f21430a, "array");
                throw new KotlinNothingValueException();
            }
            this.f21430a.k((byte) 9);
        }
        return new kotlinx.serialization.json.c(arrayList);
    }

    private final kotlinx.serialization.json.i g() {
        return (kotlinx.serialization.json.i) wc.b.b(new wc.a(new a(null)), wc.g0.f27756a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(wc.c<wc.g0, kotlinx.serialization.json.i> r21, zc.f<? super kotlinx.serialization.json.i> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.y0.h(wc.c, zc.f):java.lang.Object");
    }

    private final kotlinx.serialization.json.i i() {
        byte bK = this.f21430a.k((byte) 6);
        if (this.f21430a.G() == 4) {
            ke.a.x(this.f21430a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.f21430a.e()) {
            String strQ = this.f21431b ? this.f21430a.q() : this.f21430a.o();
            this.f21430a.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.f21430a.j();
            if (bK != 4) {
                if (bK == 7) {
                    break;
                }
                ke.a.x(this.f21430a, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bK == 6) {
            this.f21430a.k((byte) 7);
        } else if (bK == 4) {
            if (!this.f21432c) {
                k0.i(this.f21430a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f21430a.k((byte) 7);
        }
        return new kotlinx.serialization.json.d0(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.serialization.json.g0 j(boolean z10) {
        String strQ = (this.f21431b || !z10) ? this.f21430a.q() : this.f21430a.o();
        return (z10 || !kotlin.jvm.internal.t.a(strQ, "null")) ? new kotlinx.serialization.json.w(strQ, z10, null, 4, null) : kotlinx.serialization.json.a0.INSTANCE;
    }

    public final kotlinx.serialization.json.i e() {
        byte bG = this.f21430a.G();
        if (bG == 1) {
            return j(true);
        }
        if (bG == 0) {
            return j(false);
        }
        if (bG == 6) {
            int i10 = this.f21433d + 1;
            this.f21433d = i10;
            kotlinx.serialization.json.i iVarG = i10 == 200 ? g() : i();
            this.f21433d--;
            return iVarG;
        }
        if (bG == 8) {
            return f();
        }
        ke.a.x(this.f21430a, "Cannot read Json element because of unexpected " + ke.b.c(bG), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: compiled from: JsonTreeReader.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.k implements id.q<wc.c<wc.g0, kotlinx.serialization.json.i>, wc.g0, zc.f<? super kotlinx.serialization.json.i>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f21434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f21435i;

        a(zc.f<? super a> fVar) {
            super(3, fVar);
        }

        @Override // id.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wc.c<wc.g0, kotlinx.serialization.json.i> cVar, wc.g0 g0Var, zc.f<? super kotlinx.serialization.json.i> fVar) {
            a aVar = y0.this.new a(fVar);
            aVar.f21435i = cVar;
            return aVar.invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f21434h;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                } else {
                    throw new IllegalStateException(EFLCCdIRcb.VuHKTVKm);
                }
            } else {
                wc.s.b(obj);
                wc.c cVar = (wc.c) this.f21435i;
                byte bG = y0.this.f21430a.G();
                if (bG == 1) {
                    return y0.this.j(true);
                }
                if (bG == 0) {
                    return y0.this.j(false);
                }
                if (bG == 6) {
                    y0 y0Var = y0.this;
                    this.f21434h = 1;
                    obj = y0Var.h(cVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (bG == 8) {
                        return y0.this.f();
                    }
                    ke.a.x(y0.this.f21430a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return (kotlinx.serialization.json.i) obj;
        }
    }
}
