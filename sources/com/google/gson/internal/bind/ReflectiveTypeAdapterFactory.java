package com.google.gson.internal.bind;

import b2.Bo.yeILL;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import g4.e;
import g4.f;
import g4.s;
import g4.t;
import i4.h;
import i4.j;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.c f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f12363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Excluder f12364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f12365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k4.b f12366e = k4.b.a();

    class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f12367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f12368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f12369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f12370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l4.a f12371h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f12372i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, s sVar, f fVar, l4.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f12367d = field;
            this.f12368e = z12;
            this.f12369f = sVar;
            this.f12370g = fVar;
            this.f12371h = aVar;
            this.f12372i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void a(m4.a aVar, Object obj) throws IllegalAccessException, IOException {
            Object objB = this.f12369f.b(aVar);
            if (objB == null && this.f12372i) {
                return;
            }
            this.f12367d.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void b(m4.c cVar, Object obj) throws IllegalAccessException, IOException {
            (this.f12368e ? this.f12369f : new com.google.gson.internal.bind.c(this.f12370g, this.f12369f, this.f12371h.e())).d(cVar, this.f12367d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public boolean c(Object obj) throws IllegalAccessException, IOException {
            return this.f12377b && this.f12367d.get(obj) != obj;
        }
    }

    public static final class b<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h<T> f12374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, c> f12375b;

        b(h<T> hVar, Map<String, c> map) {
            this.f12374a = hVar;
            this.f12375b = map;
        }

        @Override // g4.s
        public T b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            T tA = this.f12374a.a();
            try {
                aVar.c();
                while (aVar.p()) {
                    c cVar = this.f12375b.get(aVar.F());
                    if (cVar == null || !cVar.f12378c) {
                        aVar.n0();
                    } else {
                        cVar.a(aVar, tA);
                    }
                }
                aVar.n();
                return tA;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // g4.s
        public void d(m4.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.u();
                return;
            }
            cVar.f();
            try {
                for (c cVar2 : this.f12375b.values()) {
                    if (cVar2.c(t10)) {
                        cVar.s(cVar2.f12376a);
                        cVar2.b(cVar, t10);
                    }
                }
                cVar.n();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f12376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f12377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f12378c;

        protected c(String str, boolean z10, boolean z11) {
            this.f12376a = str;
            this.f12377b = z10;
            this.f12378c = z11;
        }

        abstract void a(m4.a aVar, Object obj) throws IllegalAccessException, IOException;

        abstract void b(m4.c cVar, Object obj) throws IllegalAccessException, IOException;

        abstract boolean c(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(i4.c cVar, e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f12362a = cVar;
        this.f12363b = eVar;
        this.f12364c = excluder;
        this.f12365d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private c b(f fVar, Field field, String str, l4.a<?> aVar, boolean z10, boolean z11) {
        boolean zA = j.a(aVar.c());
        h4.b bVar = (h4.b) field.getAnnotation(h4.b.class);
        s<?> sVarB = bVar != null ? this.f12365d.b(this.f12362a, fVar, aVar, bVar) : null;
        boolean z12 = sVarB != null;
        if (sVarB == null) {
            sVarB = fVar.l(aVar);
        }
        return new a(str, z10, z11, field, z12, sVarB, fVar, aVar, zA);
    }

    static boolean d(Field field, boolean z10, Excluder excluder) {
        return (excluder.d(field.getType(), z10) || excluder.i(field, z10)) ? false : true;
    }

    private List<String> f(Field field) {
        h4.c cVar = (h4.c) field.getAnnotation(h4.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f12363b.b(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // g4.t
    public <T> s<T> a(f fVar, l4.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (Object.class.isAssignableFrom(clsC)) {
            return new b(this.f12362a.a(aVar), e(fVar, aVar, clsC));
        }
        return null;
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f12364c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    private Map<String, c> e(f fVar, l4.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeE = aVar.e();
        l4.a<?> aVarB = aVar;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z10);
                if (zC || zC2) {
                    this.f12366e.b(field);
                    Type typeP = i4.b.p(aVarB.e(), clsC, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    ?? r10 = z10;
                    while (r10 < size) {
                        String str = listF.get(r10);
                        boolean z11 = r10 != 0 ? z10 : zC;
                        ?? r20 = r10;
                        c cVar2 = cVar;
                        int i11 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(fVar, field, str, l4.a.b(typeP), z11, zC2)) : cVar2;
                        zC = z11;
                        listF = list;
                        size = i11;
                        field = field2;
                        z10 = false;
                        r10 = (r20 == true ? 1 : 0) + 1;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(typeE + yeILL.frhWCFB + cVar3.f12376a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVarB = l4.a.b(i4.b.p(aVarB.e(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
        }
        return linkedHashMap;
    }
}
