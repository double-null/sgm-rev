package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MapEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class w0<K, V> extends AbstractMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f10849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f10850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c<K, V> f10851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f10852d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MapEntry.java */
    static final class c<K, V> extends x0.b<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Descriptors.Descriptor f10858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final s1<w0<K, V>> f10859f;

        /* JADX INFO: compiled from: MapEntry.java */
        class a extends com.explorestack.protobuf.b<w0<K, V>> {
            a() {
            }

            @Override // com.explorestack.protobuf.s1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public w0<K, V> parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new w0<>(c.this, nVar, yVar);
            }
        }

        public c(Descriptors.Descriptor descriptor, w0<K, V> w0Var, c3.b bVar, c3.b bVar2) {
            super(bVar, ((w0) w0Var).f10849a, bVar2, ((w0) w0Var).f10850b);
            this.f10858e = descriptor;
            this.f10859f = new a();
        }
    }

    private void f(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() == this.f10851c.f10858e) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.f10851c.f10858e.getFullName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> boolean o(c cVar, V v10) {
        if (cVar.f10866c.b() == c3.c.MESSAGE) {
            return ((MessageLite) v10).isInitialized();
        }
        return true;
    }

    public static <K, V> w0<K, V> s(Descriptors.Descriptor descriptor, c3.b bVar, K k10, c3.b bVar2, V v10) {
        return new w0<>(descriptor, bVar, k10, bVar2, v10);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w0<K, V> mo164getDefaultInstanceForType() {
        c<K, V> cVar = this.f10851c;
        return new w0<>(cVar, cVar.f10865b, cVar.f10867d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.f10851c.f10858e.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f10851c.f10858e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        f(fieldDescriptor);
        Object objH = fieldDescriptor.getNumber() == 1 ? h() : n();
        return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m163getEnumType().findValueByNumberCreatingIfUnknown(((Integer) objH).intValue()) : objH;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<w0<K, V>> getParserForType() {
        return this.f10851c.f10859f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.f10852d != -1) {
            return this.f10852d;
        }
        int iB = x0.b(this.f10851c, this.f10849a, this.f10850b);
        this.f10852d = iB;
        return iB;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public u2 getUnknownFields() {
        return u2.c();
    }

    public K h() {
        return this.f10849a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        f(fieldDescriptor);
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return o(this.f10851c, this.f10850b);
    }

    final c<K, V> k() {
        return this.f10851c;
    }

    public V n() {
        return this.f10850b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b<K, V> newBuilderForType() {
        return new b<>(this.f10851c);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b<K, V> toBuilder() {
        return new b<>(this.f10851c, this.f10849a, this.f10850b, true, true);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        x0.f(codedOutputStream, this.f10851c, this.f10849a, this.f10850b);
    }

    /* JADX INFO: compiled from: MapEntry.java */
    public static class b<K, V> extends AbstractMessage.Builder<b<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c<K, V> f10853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private K f10854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f10855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10857e;

        private void g(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() == this.f10853a.f10858e) {
                return;
            }
            throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.f10853a.f10858e.getFullName());
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<K, V> addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w0<K, V> build() {
            w0<K, V> w0VarBuildPartial = buildPartial();
            if (w0VarBuildPartial.isInitialized()) {
                return w0VarBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) w0VarBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w0<K, V> buildPartial() {
            return new w0<>(this.f10853a, this.f10854b, this.f10855c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (Descriptors.FieldDescriptor fieldDescriptor : this.f10853a.f10858e.getFields()) {
                if (hasField(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f10853a.f10858e;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            g(fieldDescriptor);
            Object objM = fieldDescriptor.getNumber() == 1 ? m() : n();
            return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.m163getEnumType().findValueByNumberCreatingIfUnknown(((Integer) objM).intValue()) : objM;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public u2 getUnknownFields() {
            return u2.c();
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<K, V> clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            g(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                i();
            } else {
                j();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            g(fieldDescriptor);
            return fieldDescriptor.getNumber() == 1 ? this.f10856d : this.f10857e;
        }

        public b<K, V> i() {
            this.f10854b = this.f10853a.f10865b;
            this.f10856d = false;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return w0.o(this.f10853a, this.f10855c);
        }

        public b<K, V> j() {
            this.f10855c = this.f10853a.f10867d;
            this.f10857e = false;
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b<K, V> mo162clone() {
            return new b<>(this.f10853a, this.f10854b, this.f10855c, this.f10856d, this.f10857e);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public w0<K, V> mo164getDefaultInstanceForType() {
            c<K, V> cVar = this.f10853a;
            return new w0<>(cVar, cVar.f10865b, cVar.f10867d);
        }

        public K m() {
            return this.f10854b;
        }

        public V n() {
            return this.f10855c;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            g(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 2 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return ((Message) this.f10855c).newBuilderForType();
            }
            throw new RuntimeException("\"" + fieldDescriptor.getFullName() + "\" is not a message value field.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b<K, V> setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            g(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                p(obj);
            } else {
                if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                    obj = Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber());
                } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null && !this.f10853a.f10867d.getClass().isInstance(obj)) {
                    obj = ((Message) this.f10853a.f10867d).toBuilder().mergeFrom((Message) obj).build();
                }
                s(obj);
            }
            return this;
        }

        public b<K, V> p(K k10) {
            this.f10854b = k10;
            this.f10856d = true;
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b<K, V> setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public b<K, V> s(V v10) {
            this.f10855c = v10;
            this.f10857e = true;
            return this;
        }

        private b(c<K, V> cVar) {
            this(cVar, cVar.f10865b, cVar.f10867d, false, false);
        }

        private b(c<K, V> cVar, K k10, V v10, boolean z10, boolean z11) {
            this.f10853a = cVar;
            this.f10854b = k10;
            this.f10855c = v10;
            this.f10856d = z10;
            this.f10857e = z11;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b<K, V> setUnknownFields(u2 u2Var) {
            return this;
        }
    }

    private w0(Descriptors.Descriptor descriptor, c3.b bVar, K k10, c3.b bVar2, V v10) {
        this.f10852d = -1;
        this.f10849a = k10;
        this.f10850b = v10;
        this.f10851c = new c<>(descriptor, this, bVar, bVar2);
    }

    private w0(c cVar, K k10, V v10) {
        this.f10852d = -1;
        this.f10849a = k10;
        this.f10850b = v10;
        this.f10851c = cVar;
    }

    private w0(c<K, V> cVar, n nVar, y yVar) throws InvalidProtocolBufferException {
        this.f10852d = -1;
        try {
            this.f10851c = cVar;
            Map.Entry entryD = x0.d(nVar, cVar, yVar);
            this.f10849a = (K) entryD.getKey();
            this.f10850b = (V) entryD.getValue();
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }
}
