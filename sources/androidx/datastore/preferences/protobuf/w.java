package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: GeneratedMessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l1 unknownFields = l1.c();

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0039a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f2371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f2372b;

        protected a(MessageType messagetype) {
            this.f2371a = messagetype;
            if (messagetype.B()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f2372b = (MessageType) t();
        }

        private static <MessageType> void s(MessageType messagetype, MessageType messagetype2) {
            a1.a().d(messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType t() {
            return (MessageType) this.f2371a.H();
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        public final boolean isInitialized() {
            return w.A(this.f2372b, false);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0039a.i(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.f2372b.B()) {
                return this.f2372b;
            }
            this.f2372b.C();
            return this.f2372b;
        }

        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f2372b = (MessageType) buildPartial();
            return buildertype;
        }

        protected final void m() {
            if (this.f2372b.B()) {
                return;
            }
            n();
        }

        protected void n() {
            MessageType messagetype = (MessageType) t();
            s(messagetype, this.f2372b);
            this.f2372b = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.q0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f2371a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0039a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BuilderType g(MessageType messagetype) {
            return (BuilderType) r(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType e(h hVar, n nVar) throws IOException {
            m();
            try {
                a1.a().d(this.f2372b).a(this.f2372b, i.h(hVar), nVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType r(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            m();
            s(this.f2372b, messagetype);
            return this;
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    protected static class b<T extends w<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f2373b;

        public b(T t10) {
            this.f2373b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.x0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(h hVar, n nVar) throws InvalidProtocolBufferException {
            return (T) w.J(this.f2373b, hVar, nVar);
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements q0 {
        protected s<d> extensions = s.h();

        s<d> N() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.q0
        public /* bridge */ /* synthetic */ p0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.p0
        public /* bridge */ /* synthetic */ p0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.w, androidx.datastore.preferences.protobuf.p0
        public /* bridge */ /* synthetic */ p0.a toBuilder() {
            return super.toBuilder();
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    static final class d implements s.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p1.b f2375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f2376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f2377d;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f2374a - dVar.f2374a;
        }

        public y.d<?> b() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.s.b
        public p0.a f(p0.a aVar, p0 p0Var) {
            return ((a) aVar).r((w) p0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public p1.c getLiteJavaType() {
            return this.f2375b.b();
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public p1.b getLiteType() {
            return this.f2375b;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public int getNumber() {
            return this.f2374a;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean isPacked() {
            return this.f2377d;
        }

        @Override // androidx.datastore.preferences.protobuf.s.b
        public boolean isRepeated() {
            return this.f2376c;
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static class e<ContainingType extends p0, Type> extends l<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p0 f2378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d f2379b;

        public p1.b a() {
            return this.f2379b.getLiteType();
        }

        public p0 b() {
            return this.f2378a;
        }

        public int c() {
            return this.f2379b.getNumber();
        }

        public boolean d() {
            return this.f2379b.f2376c;
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    /* JADX INFO: loaded from: classes2.dex */
    public enum f {
        f2380a,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final <T extends w<T, ?>> boolean A(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.r(f.f2380a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = a1.a().d(t10).isInitialized(t10);
        if (z10) {
            t10.s(f.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t10 : null);
        }
        return zIsInitialized;
    }

    protected static <E> y.i<E> E(y.i<E> iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object G(p0 p0Var, String str, Object[] objArr) {
        return new c1(p0Var, str, objArr);
    }

    protected static <T extends w<T, ?>> T I(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) l(J(t10, h.g(inputStream), n.b()));
    }

    static <T extends w<T, ?>> T J(T t10, h hVar, n nVar) throws InvalidProtocolBufferException {
        T t11 = (T) t10.H();
        try {
            e1 e1VarD = a1.a().d(t11);
            e1VarD.a(t11, i.h(hVar), nVar);
            e1VarD.makeImmutable(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.b()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.s(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.b().s(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).s(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends w<?, ?>> void K(Class<T> cls, T t10) {
        t10.D();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends w<T, ?>> T l(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.h().b().s(t10);
    }

    private int p(e1<?> e1Var) {
        return e1Var == null ? a1.a().d(this).getSerializedSize(this) : e1Var.getSerializedSize(this);
    }

    protected static <E> y.i<E> u() {
        return b1.d();
    }

    static <T extends w<?, ?>> T v(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar == null) {
            wVar = (T) ((w) n1.i(cls)).getDefaultInstanceForType();
            if (wVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, wVar);
        }
        return (T) wVar;
    }

    static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    boolean B() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void C() {
        a1.a().d(this).makeImmutable(this);
        D();
    }

    void D() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) r(f.NEW_BUILDER);
    }

    MessageType H() {
        return (MessageType) r(f.NEW_MUTABLE_INSTANCE);
    }

    void L(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        return (BuilderType) ((a) r(f.NEW_BUILDER)).r(this);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public void a(CodedOutputStream codedOutputStream) throws IOException {
        a1.a().d(this).b(this, j.g(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a1.a().d(this).equals(this, (w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int f(e1 e1Var) {
        if (!B()) {
            if (d() != Integer.MAX_VALUE) {
                return d();
            }
            int iP = p(e1Var);
            i(iP);
            return iP;
        }
        int iP2 = p(e1Var);
        if (iP2 >= 0) {
            return iP2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iP2);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final x0<MessageType> getParserForType() {
        return (x0) r(f.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public int getSerializedSize() {
        return f(null);
    }

    public int hashCode() {
        if (B()) {
            return o();
        }
        if (y()) {
            L(o());
        }
        return x();
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void i(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean isInitialized() {
        return A(this, true);
    }

    Object k() throws Exception {
        return r(f.BUILD_MESSAGE_INFO);
    }

    void m() {
        this.memoizedHashCode = 0;
    }

    void n() {
        i(Integer.MAX_VALUE);
    }

    int o() {
        return a1.a().d(this).hashCode(this);
    }

    protected final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType q() {
        return (BuilderType) r(f.NEW_BUILDER);
    }

    protected Object r(f fVar) {
        return t(fVar, null, null);
    }

    protected Object s(f fVar, Object obj) {
        return t(fVar, obj, null);
    }

    protected abstract Object t(f fVar, Object obj, Object obj2);

    public String toString() {
        return r0.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) r(f.GET_DEFAULT_INSTANCE);
    }

    int x() {
        return this.memoizedHashCode;
    }

    boolean y() {
        return x() == 0;
    }
}
