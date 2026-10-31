package com.explorestack.protobuf;

import com.explorestack.protobuf.i0;
import com.explorestack.protobuf.i0.a;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: GeneratedMessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0<MessageType extends i0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.explorestack.protobuf.a<MessageType, BuilderType> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Object, i0<?, ?>> f10475c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected v2 f10476a = v2.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f10477b = -1;

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static abstract class a<MessageType extends i0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.explorestack.protobuf.a.AbstractC0128a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f10478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f10479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f10480c;

        private void p(MessageType messagetype, MessageType messagetype2) {
            v1.a().e(messagetype).mergeFrom(messagetype, messagetype2);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.explorestack.protobuf.a.AbstractC0128a.newUninitializedMessageException(messagetype);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (this.f10480c) {
                return this.f10479b;
            }
            this.f10479b.n();
            this.f10480c = true;
            return this.f10479b;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType clear() {
            this.f10479b = (MessageType) this.f10479b.c(e.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType mo162clone() {
            BuilderType buildertype = (BuilderType) mo164getDefaultInstanceForType().newBuilderForType();
            buildertype.m(buildPartial());
            return buildertype;
        }

        protected final void h() {
            if (this.f10480c) {
                i();
                this.f10480c = false;
            }
        }

        protected void i() {
            MessageType messagetype = (MessageType) this.f10479b.c(e.NEW_MUTABLE_INSTANCE);
            p(messagetype, this.f10479b);
            this.f10479b = messagetype;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return i0.k(this.f10479b, false);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public MessageType mo164getDefaultInstanceForType() {
            return this.f10478a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) m(messagetype);
        }

        @Override // com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(n nVar, y yVar) throws IOException {
            h();
            try {
                v1.a().e(this.f10479b).a(this.f10479b, o.h(nVar), yVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType m(MessageType messagetype) {
            h();
            p(this.f10479b, messagetype);
            return this;
        }

        @Override // com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i10, i11, y.b());
        }

        @Override // com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, y yVar) throws InvalidProtocolBufferException {
            h();
            try {
                v1.a().e(this.f10479b).b(this.f10479b, bArr, i10, i10 + i11, new g.b(yVar));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends i0<MessageType, BuilderType> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected e0<c> f10481d = e0.r();

        @Override // com.explorestack.protobuf.i0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public /* bridge */ /* synthetic */ MessageLite mo164getDefaultInstanceForType() {
            return super.mo164getDefaultInstanceForType();
        }

        @Override // com.explorestack.protobuf.i0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        e0<c> s() {
            if (this.f10481d.C()) {
                this.f10481d = this.f10481d.clone();
            }
            return this.f10481d;
        }

        @Override // com.explorestack.protobuf.i0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    static final class c implements e0.c<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l0.d<?> f10482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f10483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c3.b f10484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f10485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f10486e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f10483b - cVar.f10483b;
        }

        public l0.d<?> b() {
            return this.f10482a;
        }

        @Override // com.explorestack.protobuf.e0.c
        public c3.c getLiteJavaType() {
            return this.f10484c.b();
        }

        @Override // com.explorestack.protobuf.e0.c
        public c3.b getLiteType() {
            return this.f10484c;
        }

        @Override // com.explorestack.protobuf.e0.c
        public int getNumber() {
            return this.f10483b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.e0.c
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((a) builder).m((i0) messageLite);
        }

        @Override // com.explorestack.protobuf.e0.c
        public boolean isPacked() {
            return this.f10486e;
        }

        @Override // com.explorestack.protobuf.e0.c
        public boolean isRepeated() {
            return this.f10485d;
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public static class d<ContainingType extends MessageLite, Type> extends v<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageLite f10487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f10488b;

        public c3.b b() {
            return this.f10488b.getLiteType();
        }

        public MessageLite c() {
            return this.f10487a;
        }

        public int d() {
            return this.f10488b.getNumber();
        }

        public boolean e() {
            return this.f10488b.f10485d;
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    public enum e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: compiled from: GeneratedMessageLite.java */
    protected static final class f implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f10497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f10499c;

        f(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.f10497a = cls;
            this.f10498b = cls.getName();
            this.f10499c = messageLite.toByteArray();
        }

        @Deprecated
        private Object b() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = c().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.f10499c).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f10498b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f10498b, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f10498b, e14);
            }
        }

        private Class<?> c() throws ClassNotFoundException {
            Class<?> cls = this.f10497a;
            return cls != null ? cls : Class.forName(this.f10498b);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = c().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.f10499c).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f10498b, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return b();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f10498b, e13);
            }
        }
    }

    static <T extends i0<?, ?>> T g(Class<T> cls) {
        i0<?, ?> i0Var = f10475c.get(cls);
        if (i0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i0Var = f10475c.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (i0Var == null) {
            i0Var = (T) ((i0) z2.l(cls)).mo164getDefaultInstanceForType();
            if (i0Var == null) {
                throw new IllegalStateException();
            }
            f10475c.put(cls, i0Var);
        }
        return (T) i0Var;
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends i0<T, ?>> boolean k(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.c(e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = v1.a().e(t10).isInitialized(t10);
        if (z10) {
            t10.e(e.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t10 : null);
        }
        return zIsInitialized;
    }

    Object b() throws Exception {
        return c(e.BUILD_MESSAGE_INFO);
    }

    protected Object c(e eVar) {
        return f(eVar, null, null);
    }

    protected Object e(e eVar, Object obj) {
        return f(eVar, obj, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return v1.a().e(this).equals(this, (i0) obj);
        }
        return false;
    }

    protected abstract Object f(e eVar, Object obj, Object obj2);

    @Override // com.explorestack.protobuf.a
    int getMemoizedSerializedSize() {
        return this.f10477b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final s1<MessageType> getParserForType() {
        return (s1) c(e.GET_PARSER);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.f10477b == -1) {
            this.f10477b = v1.a().e(this).getSerializedSize(this);
        }
        return this.f10477b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final MessageType mo164getDefaultInstanceForType() {
        return (MessageType) c(e.GET_DEFAULT_INSTANCE);
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = v1.a().e(this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return k(this, true);
    }

    protected void n() {
        v1.a().e(this).makeImmutable(this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) c(e.NEW_BUILDER);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) c(e.NEW_BUILDER);
        buildertype.m(this);
        return buildertype;
    }

    @Override // com.explorestack.protobuf.a
    void setMemoizedSerializedSize(int i10) {
        this.f10477b = i10;
    }

    public String toString() {
        return g1.e(this, super.toString());
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        v1.a().e(this).c(this, p.g(codedOutputStream));
    }
}
