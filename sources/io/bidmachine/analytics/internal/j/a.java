package io.bidmachine.analytics.internal.j;

import android.content.Context;
import io.bidmachine.analytics.internal.g.c;
import io.bidmachine.analytics.internal.g.g;
import io.bidmachine.analytics.internal.g.h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends io.bidmachine.analytics.internal.i.a implements io.bidmachine.analytics.internal.h.b, io.bidmachine.analytics.internal.h.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f16961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.bidmachine.analytics.internal.h.b f16962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f16963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0282a f16964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f16965h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f16966i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f16967j;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.j.a$a, reason: collision with other inner class name */
    public static final class C0282a implements io.bidmachine.analytics.internal.i.a.InterfaceC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f16969b;

        public /* synthetic */ C0282a(String str, long j10, k kVar) {
            this(str, j10);
        }

        public final long a() {
            return this.f16969b;
        }

        public final String b() {
            return this.f16968a;
        }

        private C0282a(String str, long j10) {
            this.f16968a = str;
            this.f16969b = j10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f16971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Float f16973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g f16974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f16975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f16976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f16977h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Float f16978i;

        public b(String str, long j10, int i10, Float f10, g gVar, String str2, String str3, boolean z10) {
            this.f16970a = str;
            this.f16971b = j10;
            this.f16972c = i10;
            this.f16973d = f10;
            this.f16974e = gVar;
            this.f16975f = str2;
            this.f16976g = str3;
            this.f16977h = z10;
            this.f16978i = f10 != null ? Float.valueOf(f10.floatValue() * 1000) : null;
        }

        public final b a(String str, long j10, int i10, Float f10, g gVar, String str2, String str3, boolean z10) {
            return new b(str, j10, i10, f10, gVar, str2, str3, z10);
        }

        public final int b() {
            return this.f16972c;
        }

        public final Float c() {
            return this.f16978i;
        }

        public final String d() {
            return this.f16970a;
        }

        public final String e() {
            return this.f16975f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.a(this.f16970a, bVar.f16970a) && this.f16971b == bVar.f16971b && this.f16972c == bVar.f16972c && t.a(this.f16973d, bVar.f16973d) && this.f16974e == bVar.f16974e && t.a(this.f16975f, bVar.f16975f) && t.a(this.f16976g, bVar.f16976g) && this.f16977h == bVar.f16977h;
        }

        public final Float f() {
            return this.f16973d;
        }

        public final g g() {
            return this.f16974e;
        }

        public final long h() {
            return this.f16971b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [int] */
        /* JADX WARN: Type inference failed for: r1v15, types: [int] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v20 */
        public int hashCode() {
            int iHashCode = ((((this.f16970a.hashCode() * 31) + Long.hashCode(this.f16971b)) * 31) + Integer.hashCode(this.f16972c)) * 31;
            Float f10 = this.f16973d;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            g gVar = this.f16974e;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str = this.f16975f;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16976g;
            int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.f16977h;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode5 + r10;
        }

        public final boolean i() {
            return this.f16977h;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ b a(b bVar, String str, long j10, int i10, Float f10, g gVar, String str2, String str3, boolean z10, int i11, Object obj) {
            return bVar.a((i11 & 1) != 0 ? bVar.f16970a : str, (i11 & 2) != 0 ? bVar.f16971b : j10, (i11 & 4) != 0 ? bVar.f16972c : i10, (i11 & 8) != 0 ? bVar.f16973d : f10, (i11 & 16) != 0 ? bVar.f16974e : gVar, (i11 & 32) != 0 ? bVar.f16975f : str2, (i11 & 64) != 0 ? bVar.f16976g : str3, (i11 & 128) != 0 ? bVar.f16977h : z10);
        }

        public final String a() {
            return this.f16976g;
        }

        public /* synthetic */ b(String str, long j10, int i10, Float f10, g gVar, String str2, String str3, boolean z10, int i11, k kVar) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j10, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : f10, (i11 & 16) != 0 ? null : gVar, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? false : z10);
        }
    }

    public a(io.bidmachine.analytics.internal.p002a.a aVar) {
        this.f16961d = aVar;
    }

    private final void b(io.bidmachine.analytics.internal.g.a aVar, b bVar) {
        Float f10;
        g gVarG;
        String str = this.f16963f;
        if (str == null || (f10 = bVar.f()) == null) {
            return;
        }
        float fFloatValue = f10.floatValue();
        if (fFloatValue > 0.0f && (gVarG = bVar.g()) != null) {
            this.f16961d.b().c().a(new c(bVar.d(), str, bVar.h(), aVar, fFloatValue, gVarG));
        }
    }

    private final void c(io.bidmachine.analytics.internal.g.a aVar, b bVar) {
        b bVarA;
        b bVarA2;
        synchronized (this.f16965h) {
            b bVar2 = this.f16967j;
            if (t.a(bVar2 != null ? bVar2.d() : null, bVar.d())) {
                b bVar3 = this.f16967j;
                bVarA = b.a(bVar, null, 0L, bVar3 != null ? bVar3.b() : 0, null, null, null, null, false, 251, null);
            } else {
                b bVar4 = this.f16967j;
                bVarA = b.a(bVar, null, 0L, (bVar4 != null ? bVar4.b() : 0) + 1, null, null, null, null, false, 251, null);
            }
            this.f16967j = bVarA;
            b bVar5 = (b) this.f16966i.get(aVar);
            Map map = this.f16966i;
            if (bVar5 == null) {
                bVarA2 = b.a(bVar, null, 0L, 1, null, null, null, null, false, 251, null);
            } else {
                bVarA2 = t.a(bVar.d(), bVar5.d()) ? b.a(bVar, null, 0L, bVar5.b(), null, null, null, null, false, 251, null) : b.a(bVar, null, 0L, bVar5.b() + 1, null, null, null, null, false, 251, null);
            }
            map.put(aVar, bVarA2);
            g0 g0Var = g0.f27756a;
        }
    }

    public void a(io.bidmachine.analytics.internal.i.a.b bVar) {
        this.f16963f = bVar.c();
        this.f16962e = bVar.a();
        io.bidmachine.analytics.internal.i.a.InterfaceC0281a interfaceC0281aB = bVar.b();
        C0282a c0282a = interfaceC0281aB instanceof C0282a ? (C0282a) interfaceC0281aB : null;
        this.f16964g = c0282a;
        if (c0282a != null) {
            r.b(this.f16961d.b().c().a(c0282a.a()));
        }
    }

    public abstract b b(Map map);

    public abstract io.bidmachine.analytics.internal.g.a c(Map map);

    @Override // io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        synchronized (this.f16965h) {
            this.f16966i.clear();
            this.f16967j = null;
            g0 g0Var = g0.f27756a;
        }
    }

    @Override // io.bidmachine.analytics.internal.h.b
    public void a(Map map) {
        b bVarB;
        io.bidmachine.analytics.internal.h.b bVar = this.f16962e;
        if (bVar != null) {
            bVar.a(map);
        }
        io.bidmachine.analytics.internal.g.a aVarC = c(map);
        if (aVarC == null || (bVarB = b(map)) == null) {
            return;
        }
        a(aVarC, bVarB);
    }

    private final void a(io.bidmachine.analytics.internal.g.a aVar, b bVar) {
        c(aVar, bVar);
        b(aVar, bVar);
    }

    public final b b() {
        b bVar;
        synchronized (this.f16965h) {
            bVar = this.f16967j;
        }
        return bVar;
    }

    @Override // io.bidmachine.analytics.internal.h.b
    public void a(h hVar) {
        io.bidmachine.analytics.internal.h.b bVar = this.f16962e;
        if (bVar != null) {
            bVar.a(hVar);
        }
    }

    public final b a(io.bidmachine.analytics.internal.g.a aVar) {
        b bVar;
        synchronized (this.f16965h) {
            bVar = (b) this.f16966i.get(aVar);
        }
        return bVar;
    }

    @Override // io.bidmachine.analytics.internal.h.a
    public Object a(String str) {
        C0282a c0282a;
        String strB;
        if (!t.a(str, "iaa") || (c0282a = this.f16964g) == null || (strB = c0282a.b()) == null) {
            return null;
        }
        Object objA = this.f16961d.b().c().a(strB);
        Boolean bool = (Boolean) (r.k(objA) ? null : objA);
        a();
        return bool;
    }
}
