package je;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h1<K, V> extends x0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f20929c;

    /* JADX INFO: compiled from: Tuples.kt */
    private static final class a<K, V> implements Map.Entry<K, V>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f20930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f20931b;

        public a(K k10, V v10) {
            this.f20930a = k10;
            this.f20931b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.a(this.f20930a, aVar.f20930a) && kotlin.jvm.internal.t.a(this.f20931b, aVar.f20931b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20930a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20931b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f20930a;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f20931b;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f20930a + ", value=" + this.f20931b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(final fe.d<K> keySerializer, final fe.d<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.t.f(keySerializer, "keySerializer");
        kotlin.jvm.internal.t.f(valueSerializer, "valueSerializer");
        this.f20929c = he.l.d("kotlin.collections.Map.Entry", he.n.c.f15866a, new he.f[0], new id.l() { // from class: je.g1
            @Override // id.l
            public final Object invoke(Object obj) {
                return h1.g(keySerializer, valueSerializer, (he.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 g(fe.d dVar, fe.d dVar2, he.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        he.a.b(buildSerialDescriptor, SDKConstants.PARAM_KEY, dVar.getDescriptor(), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "value", dVar2.getDescriptor(), null, false, 12, null);
        return wc.g0.f27756a;
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20929c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public K a(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.t.f(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public V c(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.t.f(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> e(K k10, V v10) {
        return new a(k10, v10);
    }
}
