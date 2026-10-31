package com.google.gson.internal;

import com.vungle.ads.internal.protos.Sdk;
import g4.b;
import g4.f;
import g4.s;
import g4.t;
import h4.d;
import h4.e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m4.c;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements t, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Excluder f12331g = new Excluder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12335d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f12332a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12333b = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12334c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<b> f12336e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<b> f12337f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s<T> f12338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f12341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l4.a f12342e;

        a(boolean z10, boolean z11, f fVar, l4.a aVar) {
            this.f12339b = z10;
            this.f12340c = z11;
            this.f12341d = fVar;
            this.f12342e = aVar;
        }

        private s<T> e() {
            s<T> sVar = this.f12338a;
            if (sVar != null) {
                return sVar;
            }
            s<T> sVarM = this.f12341d.m(Excluder.this, this.f12342e);
            this.f12338a = sVarM;
            return sVarM;
        }

        @Override // g4.s
        public T b(m4.a aVar) throws IOException {
            if (!this.f12339b) {
                return e().b(aVar);
            }
            aVar.n0();
            return null;
        }

        @Override // g4.s
        public void d(c cVar, T t10) throws IOException {
            if (this.f12340c) {
                cVar.u();
            } else {
                e().d(cVar, t10);
            }
        }
    }

    private boolean g(Class<?> cls) {
        if (this.f12332a == -1.0d || o((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f12334c && k(cls)) || j(cls);
        }
        return true;
    }

    private boolean h(Class<?> cls, boolean z10) {
        Iterator<b> it = (z10 ? this.f12336e : this.f12337f).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean j(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean k(Class<?> cls) {
        return cls.isMemberClass() && !l(cls);
    }

    private boolean l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean m(d dVar) {
        return dVar == null || dVar.value() <= this.f12332a;
    }

    private boolean n(e eVar) {
        return eVar == null || eVar.value() > this.f12332a;
    }

    private boolean o(d dVar, e eVar) {
        return m(dVar) && n(eVar);
    }

    @Override // g4.t
    public <T> s<T> a(f fVar, l4.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zG = g(clsC);
        boolean z10 = zG || h(clsC, true);
        boolean z11 = zG || h(clsC, false);
        if (z10 || z11) {
            return new a(z11, z10, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class<?> cls, boolean z10) {
        return g(cls) || h(cls, z10);
    }

    public boolean i(Field field, boolean z10) {
        h4.a aVar;
        if ((this.f12333b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f12332a != -1.0d && !o((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f12335d && ((aVar = (h4.a) field.getAnnotation(h4.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f12334c && k(field.getType())) || j(field.getType())) {
            return true;
        }
        List<b> list = z10 ? this.f12336e : this.f12337f;
        if (list.isEmpty()) {
            return false;
        }
        g4.c cVar = new g4.c(field);
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
