package com.explorestack.protobuf;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: GeneratedMessageV3.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected u2 unknownFields;

    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractMessage.BuilderParent f10523a;

        a(AbstractMessage.BuilderParent builderParent) {
            this.f10523a = builderParent;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
        public void markDirty() {
            this.f10523a.markDirty();
        }
    }

    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public static abstract class b<BuilderType extends b<BuilderType>> extends AbstractMessage.Builder<BuilderType> {
        private c builderParent;
        private boolean isClean;
        private b<BuilderType>.a meAsParent;
        private u2 unknownFields;

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private class a implements c {
            private a() {
            }

            @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                b.this.onChanged();
            }

            /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        protected b() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().f10532a.getFields();
            int fieldCount = 0;
            while (fieldCount < fields.size()) {
                Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
                Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
                if (containingOneof != null) {
                    fieldCount += containingOneof.getFieldCount() - 1;
                    if (hasOneof(containingOneof)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.isRepeated()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                fieldCount++;
            }
            return treeMap;
        }

        private BuilderType setUnknownFieldsInternal(u2 u2Var) {
            this.unknownFields = u2Var;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        void dispose() {
            this.builderParent = null;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return internalGetFieldAccessorTable().f10532a;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object objC = internalGetFieldAccessorTable().e(fieldDescriptor).c(this);
            return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) objC) : objC;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).m(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().f(oneofDescriptor).b(this);
        }

        protected c getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new a(this, null);
            }
            return this.meAsParent;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).d(this, i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).p(this, i10);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).k(this);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).j(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return internalGetFieldAccessorTable().f(oneofDescriptor).d(this);
        }

        protected abstract f internalGetFieldAccessorTable();

        protected y0 internalGetMapField(int i10) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected y0 internalGetMutableMapField(int i10) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected boolean isClean() {
            return this.isClean;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                    return false;
                }
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (fieldDescriptor.isRepeated()) {
                        Iterator it = ((List) getField(fieldDescriptor)).iterator();
                        while (it.hasNext()) {
                            if (!((Message) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        protected void markClean() {
            this.isClean = true;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return internalGetFieldAccessorTable().e(fieldDescriptor).o();
        }

        protected void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        protected final void onChanged() {
            c cVar;
            if (!this.isClean || (cVar = this.builderParent) == null) {
                return;
            }
            cVar.markDirty();
            this.isClean = false;
        }

        protected BuilderType setUnknownFieldsProto3(u2 u2Var) {
            return (BuilderType) setUnknownFieldsInternal(u2Var);
        }

        protected b(c cVar) {
            this.unknownFields = u2.c();
            this.builderParent = cVar;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).g(this, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            internalGetFieldAccessorTable().e(fieldDescriptor).b(this);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).f(this, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            internalGetFieldAccessorTable().e(fieldDescriptor).i(this, i10, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType setUnknownFields(u2 u2Var) {
            return (BuilderType) setUnknownFieldsInternal(u2Var);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            internalGetFieldAccessorTable().f(oneofDescriptor).a(this);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeUnknownFields(u2 u2Var) {
            return (BuilderType) setUnknownFields(u2.h(this.unknownFields).u(u2Var).build());
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType clear() {
            this.unknownFields = u2.c();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo162clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.mergeFrom(buildPartial());
            return buildertype;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public interface c extends AbstractMessage.BuilderParent {
    }

    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public static abstract class d<MessageType extends e, BuilderType extends d<MessageType, BuilderType>> extends b<BuilderType> implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e0.b<Descriptors.FieldDescriptor> f10526a;

        protected d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e0<Descriptors.FieldDescriptor> d() {
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            return bVar == null ? e0.r() : bVar.b();
        }

        private void i() {
            if (this.f10526a == null) {
                this.f10526a = e0.K();
            }
        }

        private void n(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BuilderType addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderType) super.addRepeatedField(fieldDescriptor, obj);
            }
            n(fieldDescriptor);
            i();
            this.f10526a.a(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType clear() {
            this.f10526a = null;
            return (BuilderType) super.clear();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            if (bVar != null) {
                allFieldsMutable.putAll(bVar.e());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            n(fieldDescriptor);
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            Object objF = bVar == null ? null : bVar.f(fieldDescriptor);
            if (objF == null) {
                return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? t.g(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
            }
            return objF;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getFieldBuilder(fieldDescriptor);
            }
            n(fieldDescriptor);
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            i();
            Object objG = this.f10526a.g(fieldDescriptor);
            if (objG == null) {
                t.b bVarN = t.n(fieldDescriptor.getMessageType());
                this.f10526a.s(fieldDescriptor, bVarN);
                onChanged();
                return bVarN;
            }
            if (objG instanceof Message.Builder) {
                return (Message.Builder) objG;
            }
            if (!(objG instanceof Message)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Message.Builder builder = ((Message) objG).toBuilder();
            this.f10526a.s(fieldDescriptor, builder);
            onChanged();
            return builder;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i10);
            }
            n(fieldDescriptor);
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            if (bVar != null) {
                return bVar.h(fieldDescriptor, i10);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldBuilder(fieldDescriptor, i10);
            }
            n(fieldDescriptor);
            i();
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objI = this.f10526a.i(fieldDescriptor, i10);
            if (objI instanceof Message.Builder) {
                return (Message.Builder) objI;
            }
            if (!(objI instanceof Message)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Message.Builder builder = ((Message) objI).toBuilder();
            this.f10526a.t(fieldDescriptor, i10, builder);
            onChanged();
            return builder;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            n(fieldDescriptor);
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            if (bVar == null) {
                return 0;
            }
            return bVar.j(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public BuilderType clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderType) super.clearField(fieldDescriptor);
            }
            n(fieldDescriptor);
            i();
            this.f10526a.c(fieldDescriptor);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            n(fieldDescriptor);
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            if (bVar == null) {
                return false;
            }
            return bVar.k(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && j();
        }

        protected boolean j() {
            e0.b<Descriptors.FieldDescriptor> bVar = this.f10526a;
            if (bVar == null) {
                return true;
            }
            return bVar.l();
        }

        protected final void k(e eVar) {
            if (eVar.f10527a != null) {
                i();
                this.f10526a.m(eVar.f10527a);
                onChanged();
            }
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderType) super.setField(fieldDescriptor, obj);
            }
            n(fieldDescriptor);
            i();
            this.f10526a.s(fieldDescriptor, obj);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            if (!fieldDescriptor.isExtension()) {
                return (BuilderType) super.setRepeatedField(fieldDescriptor, i10, obj);
            }
            n(fieldDescriptor);
            i();
            this.f10526a.t(fieldDescriptor, i10, obj);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.isExtension() ? t.n(fieldDescriptor.getMessageType()) : super.newBuilderForField(fieldDescriptor);
        }

        protected d(c cVar) {
            super(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f10590a = new g();

        private g() {
        }
    }

    protected j0() {
        this.unknownFields = u2.c();
    }

    protected static boolean canUseUnsafe() {
        return z2.J() && z2.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends e<MessageType>, T> u<MessageType, T> checkNotLite(v<MessageType, T> vVar) {
        if (vVar.a()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (u) vVar;
    }

    protected static int computeStringSize(int i10, Object obj) {
        return obj instanceof String ? CodedOutputStream.V(i10, (String) obj) : CodedOutputStream.h(i10, (ByteString) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? CodedOutputStream.W((String) obj) : CodedOutputStream.i((ByteString) obj);
    }

    protected static l0.a emptyBooleanList() {
        return j.f();
    }

    protected static l0.b emptyDoubleList() {
        return r.f();
    }

    protected static l0.f emptyFloatList() {
        return g0.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static l0.g emptyIntList() {
        return k0.f();
    }

    protected static l0.i emptyLongList() {
        return u0.f();
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsMutable(boolean z10) {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().f10532a.getFields();
        int fieldCount = 0;
        while (fieldCount < fields.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
            Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                fieldCount += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    if (z10 || oneofFieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.STRING) {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (z10) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                } else {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            fieldCount++;
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    private static <V> void maybeSerializeBooleanEntryTo(CodedOutputStream codedOutputStream, Map<Boolean, V> map, w0<Boolean, V> w0Var, int i10, boolean z10) throws IOException {
        if (map.containsKey(Boolean.valueOf(z10))) {
            codedOutputStream.L0(i10, w0Var.newBuilderForType().p(Boolean.valueOf(z10)).s(map.get(Boolean.valueOf(z10))).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.explorestack.protobuf.l0$g] */
    public static l0.g mutableCopy(l0.g gVar) {
        int size = gVar.size();
        return gVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static l0.a newBooleanList() {
        return new j();
    }

    protected static l0.b newDoubleList() {
        return new r();
    }

    protected static l0.f newFloatList() {
        return new g0();
    }

    protected static l0.g newIntList() {
        return new k0();
    }

    protected static l0.i newLongList() {
        return new u0();
    }

    protected static <M extends Message> M parseDelimitedWithIOException(s1<M> s1Var, InputStream inputStream) throws IOException {
        try {
            return s1Var.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(s1<M> s1Var, InputStream inputStream) throws IOException {
        try {
            return s1Var.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <V> void serializeBooleanMapTo(CodedOutputStream codedOutputStream, y0<Boolean, V> y0Var, w0<Boolean, V> w0Var, int i10) throws IOException {
        Map<Boolean, V> mapJ = y0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, w0Var, i10);
        } else {
            maybeSerializeBooleanEntryTo(codedOutputStream, mapJ, w0Var, i10, false);
            maybeSerializeBooleanEntryTo(codedOutputStream, mapJ, w0Var, i10, true);
        }
    }

    protected static <V> void serializeIntegerMapTo(CodedOutputStream codedOutputStream, y0<Integer, V> y0Var, w0<Integer, V> w0Var, int i10) throws IOException {
        Map<Integer, V> mapJ = y0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, w0Var, i10);
            return;
        }
        int size = mapJ.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = mapJ.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            codedOutputStream.L0(i10, w0Var.newBuilderForType().p(Integer.valueOf(i13)).s(mapJ.get(Integer.valueOf(i13))).build());
        }
    }

    protected static <V> void serializeLongMapTo(CodedOutputStream codedOutputStream, y0<Long, V> y0Var, w0<Long, V> w0Var, int i10) throws IOException {
        Map<Long, V> mapJ = y0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, w0Var, i10);
            return;
        }
        int size = mapJ.size();
        long[] jArr = new long[size];
        Iterator<Long> it = mapJ.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            codedOutputStream.L0(i10, w0Var.newBuilderForType().p(Long.valueOf(j10)).s(mapJ.get(Long.valueOf(j10))).build());
        }
    }

    private static <K, V> void serializeMapTo(CodedOutputStream codedOutputStream, Map<K, V> map, w0<K, V> w0Var, int i10) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            codedOutputStream.L0(i10, w0Var.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
    }

    protected static <V> void serializeStringMapTo(CodedOutputStream codedOutputStream, y0<String, V> y0Var, w0<String, V> w0Var, int i10) throws IOException {
        Map<String, V> mapJ = y0Var.j();
        if (!codedOutputStream.g0()) {
            serializeMapTo(codedOutputStream, mapJ, w0Var, i10);
            return;
        }
        String[] strArr = (String[]) mapJ.keySet().toArray(new String[mapJ.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            codedOutputStream.L0(i10, w0Var.newBuilderForType().p(str).s(mapJ.get(str)).build());
        }
    }

    static void setAlwaysUseFieldBuildersForTesting(boolean z10) {
        alwaysUseFieldBuilders = z10;
    }

    protected static void writeString(CodedOutputStream codedOutputStream, int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.Z0(i10, (String) obj);
        } else {
            codedOutputStream.r0(i10, (ByteString) obj);
        }
    }

    protected static void writeStringNoTag(CodedOutputStream codedOutputStream, Object obj) throws IOException {
        if (obj instanceof String) {
            codedOutputStream.a1((String) obj);
        } else {
            codedOutputStream.s0((ByteString) obj);
        }
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().f10532a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).a(this);
    }

    Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).n(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().f(oneofDescriptor).c(this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<? extends j0> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).e(this, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).l(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iE = h1.e(this, getAllFieldsRaw());
        this.memoizedSize = iE;
        return iE;
    }

    public u2 getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return internalGetFieldAccessorTable().e(fieldDescriptor).h(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return internalGetFieldAccessorTable().f(oneofDescriptor).e(this);
    }

    protected abstract f internalGetFieldAccessorTable();

    protected y0 internalGetMapField(int i10) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) getField(fieldDescriptor)).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    protected void mergeFromAndMakeImmutableInternal(n nVar, y yVar) throws InvalidProtocolBufferException {
        b2 b2VarE = v1.a().e(this);
        try {
            b2VarE.a(this, o.h(nVar), yVar);
            b2VarE.makeImmutable(this);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage
    protected Message.Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType((c) new a(builderParent));
    }

    protected abstract Message.Builder newBuilderForType(c cVar);

    protected Object newInstance(g gVar) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    protected boolean parseUnknownField(n nVar, u2.b bVar, y yVar, int i10) throws IOException {
        return nVar.N() ? nVar.O(i10) : bVar.o(i10, nVar);
    }

    protected boolean parseUnknownFieldProto3(n nVar, u2.b bVar, y yVar, int i10) throws IOException {
        return parseUnknownField(nVar, bVar, yVar, i10);
    }

    protected Object writeReplace() throws ObjectStreamException {
        return new i0.f(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        h1.k(this, getAllFieldsRaw(), codedOutputStream, false);
    }

    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public static abstract class e<MessageType extends e> extends j0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0<Descriptors.FieldDescriptor> f10527a;

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> f10528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<Descriptors.FieldDescriptor, Object> f10529b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f10530c;

            /* synthetic */ a(e eVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<Descriptors.FieldDescriptor, Object> entry = this.f10529b;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    Descriptors.FieldDescriptor key = this.f10529b.getKey();
                    if (!this.f10530c || key.getLiteJavaType() != c3.c.MESSAGE || key.isRepeated()) {
                        e0.S(key, this.f10529b.getValue(), codedOutputStream);
                    } else if (this.f10529b instanceof o0.b) {
                        codedOutputStream.P0(key.getNumber(), ((o0.b) this.f10529b).a().f());
                    } else {
                        codedOutputStream.O0(key.getNumber(), (Message) this.f10529b.getValue());
                    }
                    if (this.f10528a.hasNext()) {
                        this.f10529b = this.f10528a.next();
                    } else {
                        this.f10529b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> itG = e.this.f10527a.G();
                this.f10528a = itG;
                if (itG.hasNext()) {
                    this.f10529b = itG.next();
                }
                this.f10530c = z10;
            }
        }

        protected e() {
            this.f10527a = e0.L();
        }

        private void h(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        protected boolean c() {
            return this.f10527a.D();
        }

        protected int e() {
            return this.f10527a.y();
        }

        protected Map<Descriptors.FieldDescriptor, Object> f() {
            return this.f10527a.s();
        }

        protected e<MessageType>.a g() {
            return new a(this, false, null);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(f());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.j0
        public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(f());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getField(fieldDescriptor);
            }
            h(fieldDescriptor);
            Object objT = this.f10527a.t(fieldDescriptor);
            if (objT != null) {
                return objT;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? t.g(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedField(fieldDescriptor, i10);
            }
            h(fieldDescriptor);
            return this.f10527a.w(fieldDescriptor, i10);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.getRepeatedFieldCount(fieldDescriptor);
            }
            h(fieldDescriptor);
            return this.f10527a.x(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            if (!fieldDescriptor.isExtension()) {
                return super.hasField(fieldDescriptor);
            }
            h(fieldDescriptor);
            return this.f10527a.A(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return super.isInitialized() && c();
        }

        @Override // com.explorestack.protobuf.j0
        protected void makeExtensionsImmutable() {
            this.f10527a.H();
        }

        @Override // com.explorestack.protobuf.j0
        protected boolean parseUnknownField(n nVar, u2.b bVar, y yVar, int i10) throws IOException {
            if (nVar.N()) {
                bVar = null;
            }
            return h1.g(nVar, bVar, yVar, getDescriptorForType(), new h1.c(this.f10527a), i10);
        }

        @Override // com.explorestack.protobuf.j0
        protected boolean parseUnknownFieldProto3(n nVar, u2.b bVar, y yVar, int i10) throws IOException {
            return parseUnknownField(nVar, bVar, yVar, i10);
        }

        protected e(d<MessageType, ?> dVar) {
            super(dVar);
            this.f10527a = dVar.d();
        }
    }

    protected j0(b<?> bVar) {
        this.unknownFields = bVar.getUnknownFields();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.explorestack.protobuf.l0$i] */
    protected static l0.i mutableCopy(l0.i iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseDelimitedWithIOException(s1<M> s1Var, InputStream inputStream, y yVar) throws IOException {
        try {
            return s1Var.parseDelimitedFrom(inputStream, yVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    protected static <M extends Message> M parseWithIOException(s1<M> s1Var, InputStream inputStream, y yVar) throws IOException {
        try {
            return s1Var.parseFrom(inputStream, yVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.explorestack.protobuf.l0$f] */
    protected static l0.f mutableCopy(l0.f fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseWithIOException(s1<M> s1Var, n nVar) throws IOException {
        try {
            return s1Var.parseFrom(nVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.explorestack.protobuf.l0$b] */
    protected static l0.b mutableCopy(l0.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <M extends Message> M parseWithIOException(s1<M> s1Var, n nVar, y yVar) throws IOException {
        try {
            return s1Var.parseFrom(nVar, yVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.explorestack.protobuf.l0$a] */
    protected static l0.a mutableCopy(l0.a aVar) {
        int size = aVar.size();
        return aVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected void makeExtensionsImmutable() {
    }

    /* JADX INFO: compiled from: GeneratedMessageV3.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptors.Descriptor f10532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a[] f10533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f10534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c[] f10535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f10536e = false;

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private interface a {
            Object a(j0 j0Var);

            void b(b bVar);

            Object c(b bVar);

            Object d(b bVar, int i10);

            Object e(j0 j0Var, int i10);

            void f(b bVar, Object obj);

            void g(b bVar, Object obj);

            boolean h(j0 j0Var);

            void i(b bVar, int i10, Object obj);

            boolean j(b bVar);

            int k(b bVar);

            int l(j0 j0Var);

            Message.Builder m(b bVar);

            Object n(j0 j0Var);

            Message.Builder o();

            Message.Builder p(b bVar, int i10);
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Descriptors.FieldDescriptor f10537a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Message f10538b;

            b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                this.f10537a = fieldDescriptor;
                this.f10538b = s((j0) j0.invokeOrDie(j0.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).k();
            }

            private Message q(Message message) {
                if (message == null) {
                    return null;
                }
                return this.f10538b.getClass().isInstance(message) ? message : this.f10538b.toBuilder().mergeFrom(message).build();
            }

            private y0<?, ?> r(b bVar) {
                return bVar.internalGetMapField(this.f10537a.getNumber());
            }

            private y0<?, ?> s(j0 j0Var) {
                return j0Var.internalGetMapField(this.f10537a.getNumber());
            }

            private y0<?, ?> t(b bVar) {
                return bVar.internalGetMutableMapField(this.f10537a.getNumber());
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object a(j0 j0Var) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < l(j0Var); i10++) {
                    arrayList.add(e(j0Var, i10));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void b(b bVar) {
                t(bVar).l().clear();
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < k(bVar); i10++) {
                    arrayList.add(d(bVar, i10));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object d(b bVar, int i10) {
                return r(bVar).i().get(i10);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object e(j0 j0Var, int i10) {
                return s(j0Var).i().get(i10);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                b(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    g(bVar, it.next());
                }
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void g(b bVar, Object obj) {
                t(bVar).l().add(q((Message) obj));
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean h(j0 j0Var) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void i(b bVar, int i10, Object obj) {
                t(bVar).l().set(i10, q((Message) obj));
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean j(b bVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int k(b bVar) {
                return r(bVar).i().size();
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int l(j0 j0Var) {
                return s(j0Var).i().size();
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object n(j0 j0Var) {
                return a(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder o() {
                return this.f10538b.newBuilderForType();
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder p(b bVar, int i10) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Descriptors.Descriptor f10539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Method f10540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Method f10541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f10542d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Descriptors.FieldDescriptor f10543e;

            c(Descriptors.Descriptor descriptor, int i10, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                this.f10539a = descriptor;
                Descriptors.OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(i10);
                if (oneofDescriptor.isSynthetic()) {
                    this.f10540b = null;
                    this.f10541c = null;
                    this.f10543e = oneofDescriptor.getFields().get(0);
                } else {
                    this.f10540b = j0.getMethodOrDie(cls, "get" + str + "Case", new Class[0]);
                    this.f10541c = j0.getMethodOrDie(cls2, "get" + str + "Case", new Class[0]);
                    this.f10543e = null;
                }
                this.f10542d = j0.getMethodOrDie(cls2, "clear" + str, new Class[0]);
            }

            public void a(b bVar) {
                j0.invokeOrDie(this.f10542d, bVar, new Object[0]);
            }

            public Descriptors.FieldDescriptor b(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f10543e;
                if (fieldDescriptor != null) {
                    if (bVar.hasField(fieldDescriptor)) {
                        return this.f10543e;
                    }
                    return null;
                }
                int number = ((l0.c) j0.invokeOrDie(this.f10541c, bVar, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f10539a.findFieldByNumber(number);
                }
                return null;
            }

            public Descriptors.FieldDescriptor c(j0 j0Var) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f10543e;
                if (fieldDescriptor != null) {
                    if (j0Var.hasField(fieldDescriptor)) {
                        return this.f10543e;
                    }
                    return null;
                }
                int number = ((l0.c) j0.invokeOrDie(this.f10540b, j0Var, new Object[0])).getNumber();
                if (number > 0) {
                    return this.f10539a.findFieldByNumber(number);
                }
                return null;
            }

            public boolean d(b bVar) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f10543e;
                if (fieldDescriptor != null) {
                    return bVar.hasField(fieldDescriptor);
                }
                return ((l0.c) j0.invokeOrDie(this.f10541c, bVar, new Object[0])).getNumber() != 0;
            }

            public boolean e(j0 j0Var) {
                Descriptors.FieldDescriptor fieldDescriptor = this.f10543e;
                if (fieldDescriptor != null) {
                    return j0Var.hasField(fieldDescriptor);
                }
                return ((l0.c) j0.invokeOrDie(this.f10540b, j0Var, new Object[0])).getNumber() != 0;
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static final class d extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Descriptors.EnumDescriptor f10544c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f10545d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Method f10546e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f10547f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Method f10548g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Method f10549h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Method f10550i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Method f10551j;

            d(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f10544c = fieldDescriptor.m163getEnumType();
                this.f10545d = j0.getMethodOrDie(this.f10552a, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.f10546e = j0.getMethodOrDie(this.f10552a, "getValueDescriptor", new Class[0]);
                boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.f10547f = zSupportsUnknownEnumValue;
                if (zSupportsUnknownEnumValue) {
                    Class cls3 = Integer.TYPE;
                    this.f10548g = j0.getMethodOrDie(cls, "get" + str + "Value", cls3);
                    this.f10549h = j0.getMethodOrDie(cls2, "get" + str + "Value", cls3);
                    this.f10550i = j0.getMethodOrDie(cls2, "set" + str + "Value", cls3, cls3);
                    this.f10551j = j0.getMethodOrDie(cls2, "add" + str + "Value", cls3);
                }
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Object a(j0 j0Var) {
                ArrayList arrayList = new ArrayList();
                int iL = l(j0Var);
                for (int i10 = 0; i10 < iL; i10++) {
                    arrayList.add(e(j0Var, i10));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Object c(b bVar) {
                ArrayList arrayList = new ArrayList();
                int iK = k(bVar);
                for (int i10 = 0; i10 < iK; i10++) {
                    arrayList.add(d(bVar, i10));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Object d(b bVar, int i10) {
                return this.f10547f ? this.f10544c.findValueByNumberCreatingIfUnknown(((Integer) j0.invokeOrDie(this.f10549h, bVar, Integer.valueOf(i10))).intValue()) : j0.invokeOrDie(this.f10546e, super.d(bVar, i10), new Object[0]);
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Object e(j0 j0Var, int i10) {
                return this.f10547f ? this.f10544c.findValueByNumberCreatingIfUnknown(((Integer) j0.invokeOrDie(this.f10548g, j0Var, Integer.valueOf(i10))).intValue()) : j0.invokeOrDie(this.f10546e, super.e(j0Var, i10), new Object[0]);
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public void g(b bVar, Object obj) {
                if (this.f10547f) {
                    j0.invokeOrDie(this.f10551j, bVar, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.g(bVar, j0.invokeOrDie(this.f10545d, null, obj));
                }
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public void i(b bVar, int i10, Object obj) {
                if (this.f10547f) {
                    j0.invokeOrDie(this.f10550i, bVar, Integer.valueOf(i10), Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.i(bVar, i10, j0.invokeOrDie(this.f10545d, null, obj));
                }
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.j0$f$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static final class C0131f extends e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Method f10563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Method f10564d;

            C0131f(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                super(fieldDescriptor, str, cls, cls2);
                this.f10563c = j0.getMethodOrDie(this.f10552a, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
                this.f10564d = j0.getMethodOrDie(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object r(Object obj) {
                return this.f10552a.isInstance(obj) ? obj : ((Message.Builder) j0.invokeOrDie(this.f10563c, null, new Object[0])).mergeFrom((Message) obj).build();
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public void g(b bVar, Object obj) {
                super.g(bVar, r(obj));
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public void i(b bVar, int i10, Object obj) {
                super.i(bVar, i10, r(obj));
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Message.Builder o() {
                return (Message.Builder) j0.invokeOrDie(this.f10563c, null, new Object[0]);
            }

            @Override // com.explorestack.protobuf.j0.f.e, com.explorestack.protobuf.j0.f.a
            public Message.Builder p(b bVar, int i10) {
                return (Message.Builder) j0.invokeOrDie(this.f10564d, bVar, Integer.valueOf(i10));
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static final class g extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Descriptors.EnumDescriptor f10565f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Method f10566g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Method f10567h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f10568i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Method f10569j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Method f10570k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Method f10571l;

            g(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f10565f = fieldDescriptor.m163getEnumType();
                this.f10566g = j0.getMethodOrDie(this.f10572a, "valueOf", Descriptors.EnumValueDescriptor.class);
                this.f10567h = j0.getMethodOrDie(this.f10572a, "getValueDescriptor", new Class[0]);
                boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
                this.f10568i = zSupportsUnknownEnumValue;
                if (zSupportsUnknownEnumValue) {
                    this.f10569j = j0.getMethodOrDie(cls, "get" + str + "Value", new Class[0]);
                    this.f10570k = j0.getMethodOrDie(cls2, "get" + str + "Value", new Class[0]);
                    this.f10571l = j0.getMethodOrDie(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public Object a(j0 j0Var) {
                if (!this.f10568i) {
                    return j0.invokeOrDie(this.f10567h, super.a(j0Var), new Object[0]);
                }
                return this.f10565f.findValueByNumberCreatingIfUnknown(((Integer) j0.invokeOrDie(this.f10569j, j0Var, new Object[0])).intValue());
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public Object c(b bVar) {
                if (!this.f10568i) {
                    return j0.invokeOrDie(this.f10567h, super.c(bVar), new Object[0]);
                }
                return this.f10565f.findValueByNumberCreatingIfUnknown(((Integer) j0.invokeOrDie(this.f10570k, bVar, new Object[0])).intValue());
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                if (this.f10568i) {
                    j0.invokeOrDie(this.f10571l, bVar, Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber()));
                } else {
                    super.f(bVar, j0.invokeOrDie(this.f10566g, null, obj));
                }
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static final class i extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Method f10585f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Method f10586g;

            i(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f10585f = j0.getMethodOrDie(this.f10572a, InAppPurchaseConstants.METHOD_NEW_BUILDER, new Class[0]);
                this.f10586g = j0.getMethodOrDie(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object r(Object obj) {
                return this.f10572a.isInstance(obj) ? obj : ((Message.Builder) j0.invokeOrDie(this.f10585f, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                super.f(bVar, r(obj));
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public Message.Builder m(b bVar) {
                return (Message.Builder) j0.invokeOrDie(this.f10586g, bVar, new Object[0]);
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public Message.Builder o() {
                return (Message.Builder) j0.invokeOrDie(this.f10585f, null, new Object[0]);
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static final class j extends h {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final Method f10587f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final Method f10588g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Method f10589h;

            j(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2, String str2) {
                super(fieldDescriptor, str, cls, cls2, str2);
                this.f10587f = j0.getMethodOrDie(cls, "get" + str + "Bytes", new Class[0]);
                this.f10588g = j0.getMethodOrDie(cls2, "get" + str + "Bytes", new Class[0]);
                this.f10589h = j0.getMethodOrDie(cls2, "set" + str + "Bytes", ByteString.class);
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                if (obj instanceof ByteString) {
                    j0.invokeOrDie(this.f10589h, bVar, obj);
                } else {
                    super.f(bVar, obj);
                }
            }

            @Override // com.explorestack.protobuf.j0.f.h, com.explorestack.protobuf.j0.f.a
            public Object n(j0 j0Var) {
                return j0.invokeOrDie(this.f10587f, j0Var, new Object[0]);
            }
        }

        public f(Descriptors.Descriptor descriptor, String[] strArr) {
            this.f10532a = descriptor;
            this.f10534c = strArr;
            this.f10533b = new a[descriptor.getFields().size()];
            this.f10535d = new c[descriptor.getOneofs().size()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a e(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.f10532a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fieldDescriptor.isExtension()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f10533b[fieldDescriptor.getIndex()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c f(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() == this.f10532a) {
                return this.f10535d[oneofDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public f d(Class<? extends j0> cls, Class<? extends b> cls2) {
            if (this.f10536e) {
                return this;
            }
            synchronized (this) {
                if (this.f10536e) {
                    return this;
                }
                int length = this.f10533b.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = this.f10532a.getFields().get(i10);
                    String str = fieldDescriptor.getContainingOneof() != null ? this.f10534c[fieldDescriptor.getContainingOneof().getIndex() + length] : null;
                    if (fieldDescriptor.isRepeated()) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            if (fieldDescriptor.isMapField()) {
                                this.f10533b[i10] = new b(fieldDescriptor, this.f10534c[i10], cls, cls2);
                            } else {
                                this.f10533b[i10] = new C0131f(fieldDescriptor, this.f10534c[i10], cls, cls2);
                            }
                        } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                            this.f10533b[i10] = new d(fieldDescriptor, this.f10534c[i10], cls, cls2);
                        } else {
                            this.f10533b[i10] = new e(fieldDescriptor, this.f10534c[i10], cls, cls2);
                        }
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.f10533b[i10] = new i(fieldDescriptor, this.f10534c[i10], cls, cls2, str);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.f10533b[i10] = new g(fieldDescriptor, this.f10534c[i10], cls, cls2, str);
                    } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.f10533b[i10] = new j(fieldDescriptor, this.f10534c[i10], cls, cls2, str);
                    } else {
                        this.f10533b[i10] = new h(fieldDescriptor, this.f10534c[i10], cls, cls2, str);
                    }
                    i10++;
                }
                int length2 = this.f10535d.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f10535d[i11] = new c(this.f10532a, i11, this.f10534c[i11 + length], cls, cls2);
                }
                this.f10536e = true;
                this.f10534c = null;
                return this;
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected final Class f10552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected final a f10553b;

            /* JADX INFO: compiled from: GeneratedMessageV3.java */
            interface a {
                Object a(j0 j0Var);

                void b(b<?> bVar);

                Object c(b<?> bVar);

                Object d(b<?> bVar, int i10);

                Object e(j0 j0Var, int i10);

                void g(b<?> bVar, Object obj);

                void i(b<?> bVar, int i10, Object obj);

                int k(b<?> bVar);

                int l(j0 j0Var);
            }

            /* JADX INFO: compiled from: GeneratedMessageV3.java */
            private static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                protected final Method f10554a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                protected final Method f10555b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                protected final Method f10556c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                protected final Method f10557d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                protected final Method f10558e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                protected final Method f10559f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                protected final Method f10560g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                protected final Method f10561h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                protected final Method f10562i;

                b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                    this.f10554a = j0.getMethodOrDie(cls, "get" + str + "List", new Class[0]);
                    this.f10555b = j0.getMethodOrDie(cls2, "get" + str + "List", new Class[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    sb2.append(str);
                    String string = sb2.toString();
                    Class cls3 = Integer.TYPE;
                    Method methodOrDie = j0.getMethodOrDie(cls, string, cls3);
                    this.f10556c = methodOrDie;
                    this.f10557d = j0.getMethodOrDie(cls2, "get" + str, cls3);
                    Class<?> returnType = methodOrDie.getReturnType();
                    this.f10558e = j0.getMethodOrDie(cls2, "set" + str, cls3, returnType);
                    this.f10559f = j0.getMethodOrDie(cls2, "add" + str, returnType);
                    this.f10560g = j0.getMethodOrDie(cls, "get" + str + "Count", new Class[0]);
                    this.f10561h = j0.getMethodOrDie(cls2, "get" + str + "Count", new Class[0]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("clear");
                    sb3.append(str);
                    this.f10562i = j0.getMethodOrDie(cls2, sb3.toString(), new Class[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public Object a(j0 j0Var) {
                    return j0.invokeOrDie(this.f10554a, j0Var, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public void b(b<?> bVar) {
                    j0.invokeOrDie(this.f10562i, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public Object c(b<?> bVar) {
                    return j0.invokeOrDie(this.f10555b, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public Object d(b<?> bVar, int i10) {
                    return j0.invokeOrDie(this.f10557d, bVar, Integer.valueOf(i10));
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public Object e(j0 j0Var, int i10) {
                    return j0.invokeOrDie(this.f10556c, j0Var, Integer.valueOf(i10));
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public void g(b<?> bVar, Object obj) {
                    j0.invokeOrDie(this.f10559f, bVar, obj);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public void i(b<?> bVar, int i10, Object obj) {
                    j0.invokeOrDie(this.f10558e, bVar, Integer.valueOf(i10), obj);
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public int k(b<?> bVar) {
                    return ((Integer) j0.invokeOrDie(this.f10561h, bVar, new Object[0])).intValue();
                }

                @Override // com.explorestack.protobuf.j0.f.e.a
                public int l(j0 j0Var) {
                    return ((Integer) j0.invokeOrDie(this.f10560g, j0Var, new Object[0])).intValue();
                }
            }

            e(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2) {
                b bVar = new b(fieldDescriptor, str, cls, cls2);
                this.f10552a = bVar.f10556c.getReturnType();
                this.f10553b = q(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object a(j0 j0Var) {
                return this.f10553b.a(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void b(b bVar) {
                this.f10553b.b(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object c(b bVar) {
                return this.f10553b.c(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object d(b bVar, int i10) {
                return this.f10553b.d(bVar, i10);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object e(j0 j0Var, int i10) {
                return this.f10553b.e(j0Var, i10);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                b(bVar);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    g(bVar, it.next());
                }
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void g(b bVar, Object obj) {
                this.f10553b.g(bVar, obj);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean h(j0 j0Var) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void i(b bVar, int i10, Object obj) {
                this.f10553b.i(bVar, i10, obj);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean j(b bVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int k(b bVar) {
                return this.f10553b.k(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int l(j0 j0Var) {
                return this.f10553b.l(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object n(j0 j0Var) {
                return a(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder o() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder p(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            static a q(b bVar) {
                return bVar;
            }
        }

        /* JADX INFO: compiled from: GeneratedMessageV3.java */
        private static class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            protected final Class<?> f10572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            protected final Descriptors.FieldDescriptor f10573b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            protected final boolean f10574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            protected final boolean f10575d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            protected final a f10576e;

            /* JADX INFO: compiled from: GeneratedMessageV3.java */
            private interface a {
                Object a(j0 j0Var);

                void b(b<?> bVar);

                Object c(b<?> bVar);

                int d(j0 j0Var);

                int e(b<?> bVar);

                void f(b<?> bVar, Object obj);

                boolean h(j0 j0Var);

                boolean j(b<?> bVar);
            }

            /* JADX INFO: compiled from: GeneratedMessageV3.java */
            private static final class b implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                protected final Method f10577a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                protected final Method f10578b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                protected final Method f10579c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                protected final Method f10580d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                protected final Method f10581e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                protected final Method f10582f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                protected final Method f10583g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                protected final Method f10584h;

                b(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2, String str2, boolean z10, boolean z11) {
                    Method methodOrDie;
                    Method methodOrDie2;
                    Method methodOrDie3;
                    Method methodOrDie4 = j0.getMethodOrDie(cls, "get" + str, new Class[0]);
                    this.f10577a = methodOrDie4;
                    this.f10578b = j0.getMethodOrDie(cls2, "get" + str, new Class[0]);
                    this.f10579c = j0.getMethodOrDie(cls2, "set" + str, methodOrDie4.getReturnType());
                    Method methodOrDie5 = null;
                    if (z11) {
                        methodOrDie = j0.getMethodOrDie(cls, "has" + str, new Class[0]);
                    } else {
                        methodOrDie = null;
                    }
                    this.f10580d = methodOrDie;
                    if (z11) {
                        methodOrDie2 = j0.getMethodOrDie(cls2, "has" + str, new Class[0]);
                    } else {
                        methodOrDie2 = null;
                    }
                    this.f10581e = methodOrDie2;
                    this.f10582f = j0.getMethodOrDie(cls2, "clear" + str, new Class[0]);
                    if (z10) {
                        methodOrDie3 = j0.getMethodOrDie(cls, "get" + str2 + "Case", new Class[0]);
                    } else {
                        methodOrDie3 = null;
                    }
                    this.f10583g = methodOrDie3;
                    if (z10) {
                        methodOrDie5 = j0.getMethodOrDie(cls2, "get" + str2 + "Case", new Class[0]);
                    }
                    this.f10584h = methodOrDie5;
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public Object a(j0 j0Var) {
                    return j0.invokeOrDie(this.f10577a, j0Var, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public void b(b<?> bVar) {
                    j0.invokeOrDie(this.f10582f, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public Object c(b<?> bVar) {
                    return j0.invokeOrDie(this.f10578b, bVar, new Object[0]);
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public int d(j0 j0Var) {
                    return ((l0.c) j0.invokeOrDie(this.f10583g, j0Var, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public int e(b<?> bVar) {
                    return ((l0.c) j0.invokeOrDie(this.f10584h, bVar, new Object[0])).getNumber();
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public void f(b<?> bVar, Object obj) {
                    j0.invokeOrDie(this.f10579c, bVar, obj);
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public boolean h(j0 j0Var) {
                    return ((Boolean) j0.invokeOrDie(this.f10580d, j0Var, new Object[0])).booleanValue();
                }

                @Override // com.explorestack.protobuf.j0.f.h.a
                public boolean j(b<?> bVar) {
                    return ((Boolean) j0.invokeOrDie(this.f10581e, bVar, new Object[0])).booleanValue();
                }
            }

            h(Descriptors.FieldDescriptor fieldDescriptor, String str, Class<? extends j0> cls, Class<? extends b> cls2, String str2) {
                boolean z10 = (fieldDescriptor.getContainingOneof() == null || fieldDescriptor.getContainingOneof().isSynthetic()) ? false : true;
                this.f10574c = z10;
                boolean z11 = fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z10 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
                this.f10575d = z11;
                b bVar = new b(fieldDescriptor, str, cls, cls2, str2, z10, z11);
                this.f10573b = fieldDescriptor;
                this.f10572a = bVar.f10577a.getReturnType();
                this.f10576e = q(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object a(j0 j0Var) {
                return this.f10576e.a(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void b(b bVar) {
                this.f10576e.b(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object c(b bVar) {
                return this.f10576e.c(bVar);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object d(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object e(j0 j0Var, int i10) {
                throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void f(b bVar, Object obj) {
                this.f10576e.f(bVar, obj);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void g(b bVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean h(j0 j0Var) {
                if (this.f10575d) {
                    return this.f10576e.h(j0Var);
                }
                if (this.f10574c) {
                    return this.f10576e.d(j0Var) == this.f10573b.getNumber();
                }
                return !a(j0Var).equals(this.f10573b.getDefaultValue());
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public void i(b bVar, int i10, Object obj) {
                throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public boolean j(b bVar) {
                if (this.f10575d) {
                    return this.f10576e.j(bVar);
                }
                if (this.f10574c) {
                    return this.f10576e.e(bVar) == this.f10573b.getNumber();
                }
                return !c(bVar).equals(this.f10573b.getDefaultValue());
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int k(b bVar) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public int l(j0 j0Var) {
                throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder m(b bVar) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Object n(j0 j0Var) {
                return a(j0Var);
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder o() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.explorestack.protobuf.j0.f.a
            public Message.Builder p(b bVar, int i10) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }

            static a q(b bVar) {
                return bVar;
            }
        }
    }
}
