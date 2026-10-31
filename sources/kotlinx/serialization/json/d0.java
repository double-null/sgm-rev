package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import ke.k1;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@fe.l(with = f0.class)
public final class d0 extends i implements Map<String, i>, jd.a {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, i> f21563a;

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<d0> serializer() {
            return f0.f21582a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(Map<String, ? extends i> content) {
        super(null);
        kotlin.jvm.internal.t.f(content, "content");
        this.f21563a = content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        kotlin.jvm.internal.t.f(entry, "<destruct>");
        String str = (String) entry.getKey();
        i iVar = (i) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        k1.c(sb2, str);
        sb2.append(':');
        sb2.append(iVar);
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    public boolean c(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return this.f21563a.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i compute(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfAbsent(String str, Function<? super String, ? extends i> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfPresent(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return c((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i) {
            return d((i) obj);
        }
        return false;
    }

    public boolean d(i value) {
        kotlin.jvm.internal.t.f(value, "value");
        return this.f21563a.containsValue(value);
    }

    public i e(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return this.f21563a.get(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, i>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.t.a(this.f21563a, obj);
    }

    public Set<Map.Entry<String, i>> f() {
        return this.f21563a.entrySet();
    }

    public Set<String> g() {
        return this.f21563a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i get(Object obj) {
        if (obj instanceof String) {
            return e((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f21563a.hashCode();
    }

    public int i() {
        return this.f21563a.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f21563a.isEmpty();
    }

    public Collection<i> j() {
        return this.f21563a.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return g();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i merge(String str, i iVar, BiFunction<? super i, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i putIfAbsent(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i replace(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<i> values() {
        return j();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, i iVar, i iVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return kotlin.collections.b0.V(this.f21563a.entrySet(), ",", "{", XDucgbzInpQa.xfSpAuZUXm, 0, null, new id.l() { // from class: kotlinx.serialization.json.c0
            @Override // id.l
            public final Object invoke(Object obj) {
                return d0.m((Map.Entry) obj);
            }
        }, 24, null);
    }
}
