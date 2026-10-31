package le;

import fe.m;
import id.l;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<pd.c<?>, a> f22020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<pd.c<?>, Map<pd.c<?>, fe.d<?>>> f22021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<pd.c<?>, l<?, m<?>>> f22022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<pd.c<?>, Map<String, fe.d<?>>> f22023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<pd.c<?>, l<String, fe.c<?>>> f22024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<pd.c<?>, ? extends a> class2ContextualFactory, Map<pd.c<?>, ? extends Map<pd.c<?>, ? extends fe.d<?>>> polyBase2Serializers, Map<pd.c<?>, ? extends l<?, ? extends m<?>>> polyBase2DefaultSerializerProvider, Map<pd.c<?>, ? extends Map<String, ? extends fe.d<?>>> polyBase2NamedSerializers, Map<pd.c<?>, ? extends l<? super String, ? extends fe.c<?>>> polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        t.f(class2ContextualFactory, "class2ContextualFactory");
        t.f(polyBase2Serializers, "polyBase2Serializers");
        t.f(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        t.f(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        t.f(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f22020a = class2ContextualFactory;
        this.f22021b = polyBase2Serializers;
        this.f22022c = polyBase2DefaultSerializerProvider;
        this.f22023d = polyBase2NamedSerializers;
        this.f22024e = polyBase2DefaultDeserializerProvider;
        this.f22025f = z10;
    }

    @Override // le.c
    public void a(f collector) {
        t.f(collector, "collector");
        for (Map.Entry<pd.c<?>, a> entry : this.f22020a.entrySet()) {
            pd.c<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0360a) {
                t.d(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                fe.d<?> dVarB = ((a.C0360a) value).b();
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.c(key, dVarB);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.a(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<pd.c<?>, Map<pd.c<?>, fe.d<?>>> entry2 : this.f22021b.entrySet()) {
            pd.c<?> key2 = entry2.getKey();
            for (Map.Entry<pd.c<?>, fe.d<?>> entry3 : entry2.getValue().entrySet()) {
                pd.c<?> key3 = entry3.getKey();
                fe.d<?> value2 = entry3.getValue();
                t.d(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.d(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.d(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.e(key2, key3, value2);
            }
        }
        for (Map.Entry<pd.c<?>, l<?, m<?>>> entry4 : this.f22022c.entrySet()) {
            pd.c<?> key4 = entry4.getKey();
            l<?, m<?>> value3 = entry4.getValue();
            t.d(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.d(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.b(key4, (l) m0.d(value3, 1));
        }
        for (Map.Entry<pd.c<?>, l<String, fe.c<?>>> entry5 : this.f22024e.entrySet()) {
            pd.c<?> key5 = entry5.getKey();
            l<String, fe.c<?>> value4 = entry5.getValue();
            t.d(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.d(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.d(key5, (l) m0.d(value4, 1));
        }
    }

    @Override // le.c
    public <T> fe.d<T> b(pd.c<T> kClass, List<? extends fe.d<?>> typeArgumentsSerializers) {
        t.f(kClass, "kClass");
        t.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f22020a.get(kClass);
        fe.d<?> dVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (dVarA instanceof fe.d) {
            return (fe.d<T>) dVarA;
        }
        return null;
    }

    @Override // le.c
    public boolean d() {
        return this.f22025f;
    }

    @Override // le.c
    public <T> fe.c<T> e(pd.c<? super T> baseClass, String str) {
        t.f(baseClass, "baseClass");
        Map<String, fe.d<?>> map = this.f22023d.get(baseClass);
        fe.d<?> dVar = map != null ? map.get(str) : null;
        if (!(dVar instanceof fe.d)) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        l<String, fe.c<?>> lVar = this.f22024e.get(baseClass);
        l<String, fe.c<?>> lVar2 = m0.i(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (fe.c) lVar2.invoke(str);
        }
        return null;
    }

    @Override // le.c
    public <T> m<T> f(pd.c<? super T> baseClass, T value) {
        t.f(baseClass, "baseClass");
        t.f(value, "value");
        if (!baseClass.e(value)) {
            return null;
        }
        Map<pd.c<?>, fe.d<?>> map = this.f22021b.get(baseClass);
        fe.d<?> dVar = map != null ? map.get(i0.b(value.getClass())) : null;
        if (!(dVar instanceof m)) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        l<?, m<?>> lVar = this.f22022c.get(baseClass);
        l<?, m<?>> lVar2 = m0.i(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (m) lVar2.invoke(value);
        }
        return null;
    }
}
