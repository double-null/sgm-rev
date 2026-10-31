package je;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w1<K, V> extends x0<K, V, wc.q<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f21027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(final fe.d<K> keySerializer, final fe.d<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.t.f(keySerializer, "keySerializer");
        kotlin.jvm.internal.t.f(valueSerializer, "valueSerializer");
        this.f21027c = he.l.c("kotlin.Pair", new he.f[0], new id.l() { // from class: je.v1
            @Override // id.l
            public final Object invoke(Object obj) {
                return w1.g(keySerializer, valueSerializer, (he.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.g0 g(fe.d dVar, fe.d dVar2, he.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        he.a.b(buildClassSerialDescriptor, "first", dVar.getDescriptor(), null, false, 12, null);
        he.a.b(buildClassSerialDescriptor, "second", dVar2.getDescriptor(), null, false, 12, null);
        return wc.g0.f27756a;
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f21027c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public K a(wc.q<? extends K, ? extends V> qVar) {
        kotlin.jvm.internal.t.f(qVar, "<this>");
        return qVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public V c(wc.q<? extends K, ? extends V> qVar) {
        kotlin.jvm.internal.t.f(qVar, "<this>");
        return qVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public wc.q<K, V> e(K k10, V v10) {
        return wc.w.a(k10, v10);
    }
}
