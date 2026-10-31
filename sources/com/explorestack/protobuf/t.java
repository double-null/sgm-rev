package com.explorestack.protobuf;

import com.applovin.mediation.ads.Zfi.OgqfiHA;
import d5.LXP.wcAlQCOdREZdI;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DynamicMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Descriptors.Descriptor f10798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0<Descriptors.FieldDescriptor> f10799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Descriptors.FieldDescriptor[] f10800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u2 f10801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10802e = -1;

    /* JADX INFO: compiled from: DynamicMessage.java */
    class a extends com.explorestack.protobuf.b<t> {
        a() {
        }

        @Override // com.explorestack.protobuf.s1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            b bVarN = t.n(t.this.f10798a);
            try {
                bVarN.mergeFrom(nVar, yVar);
                return bVarN.buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(bVarN.buildPartial());
            } catch (IOException e11) {
                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(bVarN.buildPartial());
            }
        }
    }

    /* JADX INFO: compiled from: DynamicMessage.java */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends AbstractMessage.Builder<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptors.Descriptor f10804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e0<Descriptors.FieldDescriptor> f10805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Descriptors.FieldDescriptor[] f10806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u2 f10807d;

        /* synthetic */ b(Descriptors.Descriptor descriptor, a aVar) {
            this(descriptor);
        }

        private void k(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isRepeated()) {
                m(fieldDescriptor, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m(fieldDescriptor, it.next());
            }
        }

        private void l() {
            if (this.f10805b.C()) {
                this.f10805b = this.f10805b.clone();
            }
        }

        private void m(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            l0.a(obj);
            if (!(obj instanceof Descriptors.EnumValueDescriptor)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void u(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.f10804a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void v(Descriptors.OneofDescriptor oneofDescriptor) {
            if (oneofDescriptor.getContainingType() != this.f10804a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            u(fieldDescriptor);
            l();
            this.f10805b.g(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t build() {
            if (isInitialized()) {
                return buildPartial();
            }
            Descriptors.Descriptor descriptor = this.f10804a;
            e0<Descriptors.FieldDescriptor> e0Var = this.f10805b;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f10806c;
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) new t(descriptor, e0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f10807d));
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t buildPartial() {
            if (this.f10804a.getOptions().B()) {
                for (Descriptors.FieldDescriptor fieldDescriptor : this.f10804a.getFields()) {
                    if (fieldDescriptor.isOptional() && !this.f10805b.A(fieldDescriptor)) {
                        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f10805b.N(fieldDescriptor, t.g(fieldDescriptor.getMessageType()));
                        } else {
                            this.f10805b.N(fieldDescriptor, fieldDescriptor.getDefaultValue());
                        }
                    }
                }
            }
            this.f10805b.H();
            Descriptors.Descriptor descriptor = this.f10804a;
            e0<Descriptors.FieldDescriptor> e0Var = this.f10805b;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f10806c;
            return new t(descriptor, e0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f10807d);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b clear() {
            if (this.f10805b.C()) {
                this.f10805b = e0.L();
            } else {
                this.f10805b.h();
            }
            this.f10807d = u2.c();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return this.f10805b.s();
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f10804a;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            u(fieldDescriptor);
            Object objT = this.f10805b.t(fieldDescriptor);
            if (objT != null) {
                return objT;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? t.g(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            v(oneofDescriptor);
            return this.f10806c[oneofDescriptor.getIndex()];
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            u(fieldDescriptor);
            return this.f10805b.w(fieldDescriptor, i10);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            u(fieldDescriptor);
            return this.f10805b.x(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public u2 getUnknownFields() {
            return this.f10807d;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            u(fieldDescriptor);
            l();
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f10806c;
                if (fieldDescriptorArr[index] == fieldDescriptor) {
                    fieldDescriptorArr[index] = null;
                }
            }
            this.f10805b.i(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            u(fieldDescriptor);
            return this.f10805b.A(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            v(oneofDescriptor);
            return this.f10806c[oneofDescriptor.getIndex()] != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            v(oneofDescriptor);
            Descriptors.FieldDescriptor fieldDescriptor = this.f10806c[oneofDescriptor.getIndex()];
            if (fieldDescriptor != null) {
                clearField(fieldDescriptor);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return t.k(this.f10804a, this.f10805b);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b mo162clone() {
            b bVar = new b(this.f10804a);
            bVar.f10805b.I(this.f10805b);
            bVar.mergeUnknownFields(this.f10807d);
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f10806c;
            System.arraycopy(fieldDescriptorArr, 0, bVar.f10806c, 0, fieldDescriptorArr.length);
            return bVar;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public t mo164getDefaultInstanceForType() {
            return t.g(this.f10804a);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(Message message) {
            if (!(message instanceof t)) {
                return (b) super.mergeFrom(message);
            }
            t tVar = (t) message;
            if (tVar.f10798a != this.f10804a) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            l();
            this.f10805b.I(tVar.f10799b);
            mergeUnknownFields(tVar.f10801d);
            int i10 = 0;
            while (true) {
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f10806c;
                if (i10 >= fieldDescriptorArr.length) {
                    return this;
                }
                if (fieldDescriptorArr[i10] == null) {
                    fieldDescriptorArr[i10] = tVar.f10800c[i10];
                } else if (tVar.f10800c[i10] != null && this.f10806c[i10] != tVar.f10800c[i10]) {
                    this.f10805b.i(this.f10806c[i10]);
                    this.f10806c[i10] = tVar.f10800c[i10];
                }
                i10++;
            }
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b mergeUnknownFields(u2 u2Var) {
            this.f10807d = u2.h(this.f10807d).u(u2Var).build();
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            u(fieldDescriptor);
            l();
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                k(fieldDescriptor, obj);
            }
            Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                int index = containingOneof.getIndex();
                Descriptors.FieldDescriptor fieldDescriptor2 = this.f10806c[index];
                if (fieldDescriptor2 != null && fieldDescriptor2 != fieldDescriptor) {
                    this.f10805b.i(fieldDescriptor2);
                }
                this.f10806c[index] = fieldDescriptor;
            } else if (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fieldDescriptor.getDefaultValue())) {
                this.f10805b.i(fieldDescriptor);
                return this;
            }
            this.f10805b.N(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            u(fieldDescriptor);
            l();
            this.f10805b.O(fieldDescriptor, i10, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b setUnknownFields(u2 u2Var) {
            this.f10807d = u2Var;
            return this;
        }

        private b(Descriptors.Descriptor descriptor) {
            this.f10804a = descriptor;
            this.f10805b = e0.L();
            this.f10807d = u2.c();
            this.f10806c = new Descriptors.FieldDescriptor[descriptor.toProto().p0()];
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new UnsupportedOperationException(wcAlQCOdREZdI.IAUrKZ);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            u(fieldDescriptor);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return new b(fieldDescriptor.getMessageType());
            }
            throw new IllegalArgumentException(OgqfiHA.gYFXjg);
        }
    }

    t(Descriptors.Descriptor descriptor, e0<Descriptors.FieldDescriptor> e0Var, Descriptors.FieldDescriptor[] fieldDescriptorArr, u2 u2Var) {
        this.f10798a = descriptor;
        this.f10799b = e0Var;
        this.f10800c = fieldDescriptorArr;
        this.f10801d = u2Var;
    }

    public static t g(Descriptors.Descriptor descriptor) {
        return new t(descriptor, e0.r(), new Descriptors.FieldDescriptor[descriptor.toProto().p0()], u2.c());
    }

    static boolean k(Descriptors.Descriptor descriptor, e0<Descriptors.FieldDescriptor> e0Var) {
        for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
            if (fieldDescriptor.isRequired() && !e0Var.A(fieldDescriptor)) {
                return false;
            }
        }
        return e0Var.D();
    }

    public static b n(Descriptors.Descriptor descriptor) {
        return new b(descriptor, null);
    }

    private void s(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.f10798a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    private void t(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() != this.f10798a) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.f10799b.s();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f10798a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        s(fieldDescriptor);
        Object objT = this.f10799b.t(fieldDescriptor);
        if (objT != null) {
            return objT;
        }
        if (fieldDescriptor.isRepeated()) {
            return Collections.emptyList();
        }
        return fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? g(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        t(oneofDescriptor);
        return this.f10800c[oneofDescriptor.getIndex()];
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<t> getParserForType() {
        return new a();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        s(fieldDescriptor);
        return this.f10799b.w(fieldDescriptor, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        s(fieldDescriptor);
        return this.f10799b.x(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int iY;
        int serializedSize;
        int i10 = this.f10802e;
        if (i10 != -1) {
            return i10;
        }
        if (this.f10798a.getOptions().C()) {
            iY = this.f10799b.u();
            serializedSize = this.f10801d.f();
        } else {
            iY = this.f10799b.y();
            serializedSize = this.f10801d.getSerializedSize();
        }
        int i11 = iY + serializedSize;
        this.f10802e = i11;
        return i11;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public u2 getUnknownFields() {
        return this.f10801d;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t mo164getDefaultInstanceForType() {
        return g(this.f10798a);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        s(fieldDescriptor);
        return this.f10799b.A(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        t(oneofDescriptor);
        return this.f10800c[oneofDescriptor.getIndex()] != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return k(this.f10798a, this.f10799b);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return new b(this.f10798a, null);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return newBuilderForType().mergeFrom(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f10798a.getOptions().C()) {
            this.f10799b.T(codedOutputStream);
            this.f10801d.l(codedOutputStream);
        } else {
            this.f10799b.V(codedOutputStream);
            this.f10801d.writeTo(codedOutputStream);
        }
    }
}
