package i0;

import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import id.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import od.k;
import wc.q;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<f.a<?>, Object> f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15871b;

    /* JADX INFO: compiled from: Preferences.kt */
    /* JADX INFO: loaded from: classes.dex */
    static final class a extends u implements l<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f15872d = new a();

        a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            t.f(entry, "entry");
            Object value = entry.getValue();
            return "  " + entry.getKey().a() + " = " + (value instanceof byte[] ? o.P((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // i0.f
    public Map<f.a<?>, Object> a() {
        q qVar;
        Set<Map.Entry<f.a<?>, Object>> setEntrySet = this.f15870a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(n0.e(kotlin.collections.u.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                t.e(bArrCopyOf, "copyOf(this, size)");
                qVar = new q(key, bArrCopyOf);
            } else {
                qVar = new q(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(qVar.e(), qVar.f());
        }
        return i0.a.b(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i0.f
    public <T> T b(f.a<T> key) {
        t.f(key, "key");
        T t10 = (T) this.f15870a.get(key);
        if (!(t10 instanceof byte[])) {
            return t10;
        }
        byte[] bArr = (byte[]) t10;
        T t11 = (T) Arrays.copyOf(bArr, bArr.length);
        t.e(t11, "copyOf(this, size)");
        return t11;
    }

    public final void e() {
        if (!(!this.f15871b.a())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    public boolean equals(Object obj) {
        boolean zA;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map<f.a<?>, Object> map = cVar.f15870a;
        if (map == this.f15870a) {
            return true;
        }
        if (map.size() != this.f15870a.size()) {
            return false;
        }
        Map<f.a<?>, Object> map2 = cVar.f15870a;
        if (!map2.isEmpty()) {
            for (Map.Entry<f.a<?>, Object> entry : map2.entrySet()) {
                Object obj2 = this.f15870a.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zA = t.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = false;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f() {
        this.f15871b.b(true);
    }

    public final void g(f.b<?>... pairs) {
        t.f(pairs, "pairs");
        e();
        for (f.b<?> bVar : pairs) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(f.a<T> key) {
        t.f(key, "key");
        e();
        return (T) this.f15870a.remove(key);
    }

    public int hashCode() {
        Iterator<T> it = this.f15870a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final <T> void i(f.a<T> key, T t10) {
        t.f(key, "key");
        j(key, t10);
    }

    public String toString() {
        return b0.V(this.f15870a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f15872d, 24, null);
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public final void j(f.a<?> key, Object obj) {
        t.f(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f15870a.put(key, i0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f15870a.put(key, obj);
            return;
        }
        Map<f.a<?>, Object> map = this.f15870a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        t.e(bArrCopyOf, UomBEukHFwrS.nSFzWsuHNj);
        map.put(key, bArrCopyOf);
    }

    public c(Map<f.a<?>, Object> preferencesMap, boolean z10) {
        t.f(preferencesMap, "preferencesMap");
        this.f15870a = preferencesMap;
        this.f15871b = new b(z10);
    }
}
