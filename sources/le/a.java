package le;

import id.l;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: le.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class C0360a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fe.d<?> f22018a;

        @Override // le.a
        public fe.d<?> a(List<? extends fe.d<?>> typeArgumentsSerializers) {
            t.f(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f22018a;
        }

        public final fe.d<?> b() {
            return this.f22018a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0360a) && t.a(((C0360a) obj).f22018a, this.f22018a);
        }

        public int hashCode() {
            return this.f22018a.hashCode();
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<List<? extends fe.d<?>>, fe.d<?>> f22019a;

        @Override // le.a
        public fe.d<?> a(List<? extends fe.d<?>> typeArgumentsSerializers) {
            t.f(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f22019a.invoke(typeArgumentsSerializers);
        }

        public final l<List<? extends fe.d<?>>, fe.d<?>> b() {
            return this.f22019a;
        }
    }

    private a() {
    }

    public abstract fe.d<?> a(List<? extends fe.d<?>> list);
}
