package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.o0;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2934f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class<? extends Object>[] f2935g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f2936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, androidx.savedstate.a.c> f2937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f2938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, xd.n<Object>> f2939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.savedstate.a.c f2940e;

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final v a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new v();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    kotlin.jvm.internal.t.e(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new v(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new v(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : v.f2935g) {
                kotlin.jvm.internal.t.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public v(Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.t.f(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2936a = linkedHashMap;
        this.f2937b = new LinkedHashMap();
        this.f2938c = new LinkedHashMap();
        this.f2939d = new LinkedHashMap();
        this.f2940e = new androidx.savedstate.a.c() { // from class: androidx.lifecycle.u
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return v.d(this.f2933a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(v this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        for (Map.Entry entry : o0.s(this$0.f2937b).entrySet()) {
            this$0.e((String) entry.getKey(), ((androidx.savedstate.a.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f2936a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f2936a.get(str));
        }
        return androidx.core.os.c.a(wc.w.a("keys", arrayList), wc.w.a("values", arrayList2));
    }

    public final androidx.savedstate.a.c c() {
        return this.f2940e;
    }

    public final <T> void e(String key, T t10) {
        kotlin.jvm.internal.t.f(key, "key");
        if (!f2934f.b(t10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            kotlin.jvm.internal.t.c(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f2938c.get(key);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            pVar.n(t10);
        } else {
            this.f2936a.put(key, t10);
        }
        xd.n<Object> nVar = this.f2939d.get(key);
        if (nVar == null) {
            return;
        }
        nVar.setValue(t10);
    }

    public v() {
        this.f2936a = new LinkedHashMap();
        this.f2937b = new LinkedHashMap();
        this.f2938c = new LinkedHashMap();
        this.f2939d = new LinkedHashMap();
        this.f2940e = new androidx.savedstate.a.c() { // from class: androidx.lifecycle.u
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return v.d(this.f2933a);
            }
        };
    }
}
