package com.google.gson.internal.bind;

import g4.f;
import g4.s;
import g4.t;
import i4.g;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectTypeAdapter extends s<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12359b = new t() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // g4.t
        public <T> s<T> a(f fVar, l4.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new ObjectTypeAdapter(fVar);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f12360a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12361a;

        static {
            int[] iArr = new int[m4.b.values().length];
            f12361a = iArr;
            try {
                iArr[m4.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12361a[m4.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12361a[m4.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12361a[m4.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12361a[m4.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12361a[m4.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    ObjectTypeAdapter(f fVar) {
        this.f12360a = fVar;
    }

    @Override // g4.s
    public Object b(m4.a aVar) throws IOException {
        switch (a.f12361a[aVar.L().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.p()) {
                    arrayList.add(b(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.c();
                while (aVar.p()) {
                    gVar.put(aVar.F(), b(aVar));
                }
                aVar.n();
                return gVar;
            case 3:
                return aVar.J();
            case 4:
                return Double.valueOf(aVar.z());
            case 5:
                return Boolean.valueOf(aVar.v());
            case 6:
                aVar.H();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // g4.s
    public void d(m4.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.u();
            return;
        }
        s sVarK = this.f12360a.k(obj.getClass());
        if (!(sVarK instanceof ObjectTypeAdapter)) {
            sVarK.d(cVar, obj);
        } else {
            cVar.f();
            cVar.n();
        }
    }
}
