package kotlin.jvm.internal;

import com.adjust.sdk.Constants;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements pd.c<Object>, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21515b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends wc.g<?>>, Integer> f21516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f21517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f21518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f21519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f21520g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f21521a;

    /* JADX INFO: compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            t.f(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) i.f21519f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) i.f21519f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.t.f(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb4
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.t.c(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = rd.r.T0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb4
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.t.c(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = rd.r.T0(r0, r7, r1, r3, r1)
                goto Lb4
            L62:
                kotlin.jvm.internal.t.c(r0)
                java.lang.String r1 = rd.r.S0(r0, r4, r1, r3, r1)
                goto Lb4
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9f
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9c
                java.util.Map r0 = kotlin.jvm.internal.i.j()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r7 = r0.toString()
                r1 = r7
            L9c:
                if (r1 != 0) goto Lb4
                goto L3e
            L9f:
                java.util.Map r0 = kotlin.jvm.internal.i.j()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb4
                java.lang.String r1 = r7.getSimpleName()
            Lb4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class<?> jClass) {
            t.f(jClass, "jClass");
            Map map = i.f21516c;
            t.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return m0.i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = hd.a.b(hd.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    public i(Class<?> jClass) {
        t.f(jClass, "jClass");
        this.f21521a = jClass;
    }

    @Override // kotlin.jvm.internal.h
    public Class<?> a() {
        return this.f21521a;
    }

    @Override // pd.c
    public boolean e(Object obj) {
        return f21515b.c(obj, a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && t.a(hd.a.b(this), hd.a.b((pd.c) obj));
    }

    @Override // pd.c
    public String f() {
        return f21515b.a(a());
    }

    @Override // pd.c
    public String g() {
        return f21515b.b(a());
    }

    @Override // pd.c
    public int hashCode() {
        return hd.a.b(this).hashCode();
    }

    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listN = kotlin.collections.t.n(id.a.class, id.l.class, id.p.class, id.q.class, id.r.class, id.s.class, id.t.class, id.u.class, id.v.class, id.w.class, id.b.class, id.c.class, id.d.class, id.e.class, id.f.class, id.g.class, id.h.class, id.i.class, id.j.class, id.k.class, id.m.class, id.n.class, id.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listN, 10));
        for (Object obj : listN) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.t.t();
            }
            arrayList.add(wc.w.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f21516c = kotlin.collections.o0.q(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(Constants.LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        f21517d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f21518e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", KBBdKxoAiHo.UrpJggG);
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        t.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            t.c(str);
            sb2.append(rd.f0.V0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            wc.q qVarA = wc.w.a(sb2.toString(), str + ".Companion");
            map3.put(qVarA.e(), qVarA.f());
        }
        for (Map.Entry<Class<? extends wc.g<?>>, Integer> entry : f21516c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f21519f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.n0.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            t.c(str2);
            linkedHashMap.put(key, rd.f0.V0(str2, '.', null, 2, null));
        }
        f21520g = linkedHashMap;
    }
}
