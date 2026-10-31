package com.explorestack.protobuf.compiler;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.DescriptorProtos;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.z1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PluginProtos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Descriptors.Descriptor f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j0.f f10291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Descriptors.Descriptor f10292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j0.f f10293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Descriptors.Descriptor f10294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j0.f f10295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Descriptors.Descriptor f10296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j0.f f10297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Descriptors.FileDescriptor f10298i = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"Á\u0002\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012supported_features\u0018\u0002 \u0001(\u0004\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a\u007f\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\t\u0012?\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfo\"8\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001BW\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpb"}, new Descriptors.FileDescriptor[]{DescriptorProtos.a0()});

    public static final class CodeGeneratorResponse extends j0 implements MessageOrBuilder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final CodeGeneratorResponse f10299f = new CodeGeneratorResponse();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public static final s1<CodeGeneratorResponse> f10300g = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f10302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<c> f10304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f10305e;

        public enum Feature implements l0.c {
            FEATURE_NONE(0),
            FEATURE_PROTO3_OPTIONAL(1);

            public static final int FEATURE_NONE_VALUE = 0;
            public static final int FEATURE_PROTO3_OPTIONAL_VALUE = 1;
            private final int value;
            private static final l0.d<Feature> internalValueMap = new a();
            private static final Feature[] VALUES = values();

            static class a implements l0.d<Feature> {
                a() {
                }

                @Override // com.explorestack.protobuf.l0.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Feature findValueByNumber(int i10) {
                    return Feature.forNumber(i10);
                }
            }

            Feature(int i10) {
                this.value = i10;
            }

            public static Feature forNumber(int i10) {
                if (i10 == 0) {
                    return FEATURE_NONE;
                }
                if (i10 != 1) {
                    return null;
                }
                return FEATURE_PROTO3_OPTIONAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CodeGeneratorResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static l0.d<Feature> internalGetValueMap() {
                return internalValueMap;
            }

            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.explorestack.protobuf.l0.c
            public final int getNumber() {
                return this.value;
            }

            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Feature valueOf(int i10) {
                return forNumber(i10);
            }

            public static Feature valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static class a extends com.explorestack.protobuf.b<CodeGeneratorResponse> {
            a() {
            }

            @Override // com.explorestack.protobuf.s1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new CodeGeneratorResponse(nVar, yVar);
            }
        }

        public static final class c extends j0 implements MessageOrBuilder {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final c f10311g = new c();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @Deprecated
            public static final s1<c> f10312h = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f10313a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private volatile Object f10314b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private volatile Object f10315c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private volatile Object f10316d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private DescriptorProtos.i f10317e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private byte f10318f;

            static class a extends com.explorestack.protobuf.b<c> {
                a() {
                }

                @Override // com.explorestack.protobuf.s1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new c(nVar, yVar);
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PluginProtos.f10296g;
            }

            public static c p() {
                return f10311g;
            }

            public static b z() {
                return f10311g.toBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return z();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType(j0.c cVar) {
                return new b(cVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return this == f10311g ? new b() : new b().p(this);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (hasName() != cVar.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(cVar.getName())) || x() != cVar.x()) {
                    return false;
                }
                if ((x() && !v().equals(cVar.v())) || hasContent() != cVar.hasContent()) {
                    return false;
                }
                if ((!hasContent() || getContent().equals(cVar.getContent())) && w() == cVar.w()) {
                    return (!w() || t().equals(cVar.t())) && this.unknownFields.equals(cVar.unknownFields);
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f10316d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f10316d = stringUtf8;
                }
                return stringUtf8;
            }

            public String getName() {
                Object obj = this.f10314b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f10314b = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<c> getParserForType() {
                return f10312h;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = (this.f10313a & 1) != 0 ? 0 + j0.computeStringSize(1, this.f10314b) : 0;
                if ((this.f10313a & 2) != 0) {
                    iComputeStringSize += j0.computeStringSize(2, this.f10315c);
                }
                if ((this.f10313a & 4) != 0) {
                    iComputeStringSize += j0.computeStringSize(15, this.f10316d);
                }
                if ((this.f10313a & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.G(16, t());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            public boolean hasContent() {
                return (this.f10313a & 4) != 0;
            }

            public boolean hasName() {
                return (this.f10313a & 1) != 0;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasName()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
                }
                if (x()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + v().hashCode();
                }
                if (hasContent()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getContent().hashCode();
                }
                if (w()) {
                    iHashCode = (((iHashCode * 37) + 16) * 53) + t().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return PluginProtos.f10297h.d(c.class, b.class);
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f10318f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f10318f = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.j0
            protected Object newInstance(j0.g gVar) {
                return new c();
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public c mo164getDefaultInstanceForType() {
                return f10311g;
            }

            public DescriptorProtos.i t() {
                DescriptorProtos.i iVar = this.f10317e;
                return iVar == null ? DescriptorProtos.i.g() : iVar;
            }

            public String v() {
                Object obj = this.f10315c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f10315c = stringUtf8;
                }
                return stringUtf8;
            }

            public boolean w() {
                return (this.f10313a & 8) != 0;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if ((this.f10313a & 1) != 0) {
                    j0.writeString(codedOutputStream, 1, this.f10314b);
                }
                if ((this.f10313a & 2) != 0) {
                    j0.writeString(codedOutputStream, 2, this.f10315c);
                }
                if ((this.f10313a & 4) != 0) {
                    j0.writeString(codedOutputStream, 15, this.f10316d);
                }
                if ((this.f10313a & 8) != 0) {
                    codedOutputStream.L0(16, t());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public boolean x() {
                return (this.f10313a & 2) != 0;
            }

            public static final class b extends j0.b<b> implements MessageOrBuilder {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f10319a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private Object f10320b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Object f10321c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Object f10322d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private DescriptorProtos.i f10323e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> f10324f;

                private e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> m() {
                    if (this.f10324f == null) {
                        this.f10324f = new e2<>(l(), getParentForChildren(), isClean());
                        this.f10323e = null;
                    }
                    return this.f10324f;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        m();
                    }
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cVarBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public c buildPartial() {
                    c cVar = new c(this);
                    int i10 = this.f10319a;
                    int i11 = (i10 & 1) != 0 ? 1 : 0;
                    cVar.f10314b = this.f10320b;
                    if ((i10 & 2) != 0) {
                        i11 |= 2;
                    }
                    cVar.f10315c = this.f10321c;
                    if ((i10 & 4) != 0) {
                        i11 |= 4;
                    }
                    cVar.f10316d = this.f10322d;
                    if ((i10 & 8) != 0) {
                        e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> e2Var = this.f10324f;
                        if (e2Var == null) {
                            cVar.f10317e = this.f10323e;
                        } else {
                            cVar.f10317e = (DescriptorProtos.i) e2Var.a();
                        }
                        i11 |= 8;
                    }
                    cVar.f10313a = i11;
                    onBuilt();
                    return cVar;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public b clear() {
                    super.clear();
                    this.f10320b = "";
                    int i10 = this.f10319a & (-2);
                    this.f10321c = "";
                    this.f10322d = "";
                    this.f10319a = i10 & (-3) & (-5);
                    e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> e2Var = this.f10324f;
                    if (e2Var == null) {
                        this.f10323e = null;
                    } else {
                        e2Var.b();
                    }
                    this.f10319a &= -9;
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return PluginProtos.f10296g;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (b) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return PluginProtos.f10297h.d(c.class, b.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public b mo162clone() {
                    return (b) super.mo162clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public c mo164getDefaultInstanceForType() {
                    return c.p();
                }

                public DescriptorProtos.i l() {
                    e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> e2Var = this.f10324f;
                    if (e2Var != null) {
                        return (DescriptorProtos.i) e2Var.e();
                    }
                    DescriptorProtos.i iVar = this.f10323e;
                    return iVar == null ? DescriptorProtos.i.g() : iVar;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(n nVar, y yVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c partialFrom = c.f10312h.parsePartialFrom(nVar, yVar);
                            if (partialFrom != null) {
                                p(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            c cVar2 = (c) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                cVar = cVar2;
                                if (cVar != null) {
                                    p(cVar);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cVar != null) {
                            p(cVar);
                        }
                        throw th;
                    }
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b mergeFrom(Message message) {
                    if (message instanceof c) {
                        return p((c) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public b p(c cVar) {
                    if (cVar == c.p()) {
                        return this;
                    }
                    if (cVar.hasName()) {
                        this.f10319a |= 1;
                        this.f10320b = cVar.f10314b;
                        onChanged();
                    }
                    if (cVar.x()) {
                        this.f10319a |= 2;
                        this.f10321c = cVar.f10315c;
                        onChanged();
                    }
                    if (cVar.hasContent()) {
                        this.f10319a |= 4;
                        this.f10322d = cVar.f10316d;
                        onChanged();
                    }
                    if (cVar.w()) {
                        q(cVar.t());
                    }
                    mergeUnknownFields(((j0) cVar).unknownFields);
                    onChanged();
                    return this;
                }

                public b q(DescriptorProtos.i iVar) {
                    DescriptorProtos.i iVar2;
                    e2<DescriptorProtos.i, DescriptorProtos.i.c, Object> e2Var = this.f10324f;
                    if (e2Var == null) {
                        if ((this.f10319a & 8) == 0 || (iVar2 = this.f10323e) == null || iVar2 == DescriptorProtos.i.g()) {
                            this.f10323e = iVar;
                        } else {
                            this.f10323e = DescriptorProtos.i.n(this.f10323e).o(iVar).buildPartial();
                        }
                        onChanged();
                    } else {
                        e2Var.g(iVar);
                    }
                    this.f10319a |= 8;
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public final b mergeUnknownFields(u2 u2Var) {
                    return (b) super.mergeUnknownFields(u2Var);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final b setUnknownFields(u2 u2Var) {
                    return (b) super.setUnknownFields(u2Var);
                }

                private b() {
                    this.f10320b = "";
                    this.f10321c = "";
                    this.f10322d = "";
                    maybeForceBuilderInitialization();
                }

                private b(j0.c cVar) {
                    super(cVar);
                    this.f10320b = "";
                    this.f10321c = "";
                    this.f10322d = "";
                    maybeForceBuilderInitialization();
                }
            }

            private c(j0.b<?> bVar) {
                super(bVar);
                this.f10318f = (byte) -1;
            }

            private c() {
                this.f10318f = (byte) -1;
                this.f10314b = "";
                this.f10315c = "";
                this.f10316d = "";
            }

            private c(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    ByteString byteStringR = nVar.r();
                                    this.f10313a = 1 | this.f10313a;
                                    this.f10314b = byteStringR;
                                } else if (iK == 18) {
                                    ByteString byteStringR2 = nVar.r();
                                    this.f10313a |= 2;
                                    this.f10315c = byteStringR2;
                                } else if (iK == 122) {
                                    ByteString byteStringR3 = nVar.r();
                                    this.f10313a |= 4;
                                    this.f10316d = byteStringR3;
                                } else if (iK != 130) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    DescriptorProtos.i.c builder = (this.f10313a & 8) != 0 ? this.f10317e.toBuilder() : null;
                                    DescriptorProtos.i iVar = (DescriptorProtos.i) nVar.A(DescriptorProtos.i.f9996d, yVar);
                                    this.f10317e = iVar;
                                    if (builder != null) {
                                        builder.o(iVar);
                                        this.f10317e = builder.buildPartial();
                                    }
                                    this.f10313a |= 8;
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PluginProtos.f10294e;
        }

        public static CodeGeneratorResponse n() {
            return f10299f;
        }

        public static b x() {
            return f10299f.toBuilder();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType(j0.c cVar) {
            return new b(cVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return this == f10299f ? new b() : new b().p(this);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CodeGeneratorResponse)) {
                return super.equals(obj);
            }
            CodeGeneratorResponse codeGeneratorResponse = (CodeGeneratorResponse) obj;
            if (hasError() != codeGeneratorResponse.hasError()) {
                return false;
            }
            if ((!hasError() || p().equals(codeGeneratorResponse.p())) && w() == codeGeneratorResponse.w()) {
                return (!w() || v() == codeGeneratorResponse.v()) && t().equals(codeGeneratorResponse.t()) && this.unknownFields.equals(codeGeneratorResponse.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<CodeGeneratorResponse> getParserForType() {
            return f10300g;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f10301a & 1) != 0 ? j0.computeStringSize(1, this.f10302b) + 0 : 0;
            if ((this.f10301a & 2) != 0) {
                iComputeStringSize += CodedOutputStream.a0(2, this.f10303c);
            }
            for (int i11 = 0; i11 < this.f10304d.size(); i11++) {
                iComputeStringSize += CodedOutputStream.G(15, this.f10304d.get(i11));
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasError() {
            return (this.f10301a & 1) != 0;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + p().hashCode();
            }
            if (w()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + l0.i(v());
            }
            if (s() > 0) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return PluginProtos.f10295f.d(CodeGeneratorResponse.class, b.class);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f10305e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f10305e = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.j0
        protected Object newInstance(j0.g gVar) {
            return new CodeGeneratorResponse();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public CodeGeneratorResponse mo164getDefaultInstanceForType() {
            return f10299f;
        }

        public String p() {
            Object obj = this.f10302b;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f10302b = stringUtf8;
            }
            return stringUtf8;
        }

        public int s() {
            return this.f10304d.size();
        }

        public List<c> t() {
            return this.f10304d;
        }

        public long v() {
            return this.f10303c;
        }

        public boolean w() {
            return (this.f10301a & 2) != 0;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f10301a & 1) != 0) {
                j0.writeString(codedOutputStream, 1, this.f10302b);
            }
            if ((this.f10301a & 2) != 0) {
                codedOutputStream.e1(2, this.f10303c);
            }
            for (int i10 = 0; i10 < this.f10304d.size(); i10++) {
                codedOutputStream.L0(15, this.f10304d.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return x();
        }

        public static final class b extends j0.b<b> implements MessageOrBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f10306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f10307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f10308c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<c> f10309d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private z1<c, c.b, Object> f10310e;

            private void k() {
                if ((this.f10306a & 4) == 0) {
                    this.f10309d = new ArrayList(this.f10309d);
                    this.f10306a |= 4;
                }
            }

            private z1<c, c.b, Object> m() {
                if (this.f10310e == null) {
                    this.f10310e = new z1<>(this.f10309d, (this.f10306a & 4) != 0, getParentForChildren(), isClean());
                    this.f10309d = null;
                }
                return this.f10310e;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    m();
                }
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse build() {
                CodeGeneratorResponse codeGeneratorResponseBuildPartial = buildPartial();
                if (codeGeneratorResponseBuildPartial.isInitialized()) {
                    return codeGeneratorResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) codeGeneratorResponseBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse buildPartial() {
                CodeGeneratorResponse codeGeneratorResponse = new CodeGeneratorResponse(this);
                int i10 = this.f10306a;
                int i11 = (i10 & 1) != 0 ? 1 : 0;
                codeGeneratorResponse.f10302b = this.f10307b;
                if ((i10 & 2) != 0) {
                    codeGeneratorResponse.f10303c = this.f10308c;
                    i11 |= 2;
                }
                z1<c, c.b, Object> z1Var = this.f10310e;
                if (z1Var == null) {
                    if ((this.f10306a & 4) != 0) {
                        this.f10309d = Collections.unmodifiableList(this.f10309d);
                        this.f10306a &= -5;
                    }
                    codeGeneratorResponse.f10304d = this.f10309d;
                } else {
                    codeGeneratorResponse.f10304d = z1Var.f();
                }
                codeGeneratorResponse.f10301a = i11;
                onBuilt();
                return codeGeneratorResponse;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public b clear() {
                super.clear();
                this.f10307b = "";
                int i10 = this.f10306a & (-2);
                this.f10308c = 0L;
                this.f10306a = i10 & (-3);
                z1<c, c.b, Object> z1Var = this.f10310e;
                if (z1Var == null) {
                    this.f10309d = Collections.emptyList();
                    this.f10306a &= -5;
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return PluginProtos.f10294e;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (b) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return PluginProtos.f10295f.d(CodeGeneratorResponse.class, b.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b mo162clone() {
                return (b) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public CodeGeneratorResponse mo164getDefaultInstanceForType() {
                return CodeGeneratorResponse.n();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(n nVar, y yVar) throws Throwable {
                CodeGeneratorResponse codeGeneratorResponse = null;
                try {
                    try {
                        CodeGeneratorResponse partialFrom = CodeGeneratorResponse.f10300g.parsePartialFrom(nVar, yVar);
                        if (partialFrom != null) {
                            p(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        CodeGeneratorResponse codeGeneratorResponse2 = (CodeGeneratorResponse) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            codeGeneratorResponse = codeGeneratorResponse2;
                            if (codeGeneratorResponse != null) {
                                p(codeGeneratorResponse);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (codeGeneratorResponse != null) {
                        p(codeGeneratorResponse);
                    }
                    throw th;
                }
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b mergeFrom(Message message) {
                if (message instanceof CodeGeneratorResponse) {
                    return p((CodeGeneratorResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public b p(CodeGeneratorResponse codeGeneratorResponse) {
                if (codeGeneratorResponse == CodeGeneratorResponse.n()) {
                    return this;
                }
                if (codeGeneratorResponse.hasError()) {
                    this.f10306a |= 1;
                    this.f10307b = codeGeneratorResponse.f10302b;
                    onChanged();
                }
                if (codeGeneratorResponse.w()) {
                    t(codeGeneratorResponse.v());
                }
                if (this.f10310e == null) {
                    if (!codeGeneratorResponse.f10304d.isEmpty()) {
                        if (this.f10309d.isEmpty()) {
                            this.f10309d = codeGeneratorResponse.f10304d;
                            this.f10306a &= -5;
                        } else {
                            k();
                            this.f10309d.addAll(codeGeneratorResponse.f10304d);
                        }
                        onChanged();
                    }
                } else if (!codeGeneratorResponse.f10304d.isEmpty()) {
                    if (this.f10310e.t()) {
                        this.f10310e.h();
                        this.f10310e = null;
                        this.f10309d = codeGeneratorResponse.f10304d;
                        this.f10306a &= -5;
                        this.f10310e = j0.alwaysUseFieldBuilders ? m() : null;
                    } else {
                        this.f10310e.a(codeGeneratorResponse.f10304d);
                    }
                }
                mergeUnknownFields(((j0) codeGeneratorResponse).unknownFields);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final b mergeUnknownFields(u2 u2Var) {
                return (b) super.mergeUnknownFields(u2Var);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public b t(long j10) {
                this.f10306a |= 2;
                this.f10308c = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final b setUnknownFields(u2 u2Var) {
                return (b) super.setUnknownFields(u2Var);
            }

            private b() {
                this.f10307b = "";
                this.f10309d = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private b(j0.c cVar) {
                super(cVar);
                this.f10307b = "";
                this.f10309d = Collections.emptyList();
                maybeForceBuilderInitialization();
            }
        }

        private CodeGeneratorResponse(j0.b<?> bVar) {
            super(bVar);
            this.f10305e = (byte) -1;
        }

        private CodeGeneratorResponse() {
            this.f10305e = (byte) -1;
            this.f10302b = "";
            this.f10304d = Collections.emptyList();
        }

        private CodeGeneratorResponse(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                ByteString byteStringR = nVar.r();
                                this.f10301a = 1 | this.f10301a;
                                this.f10302b = byteStringR;
                            } else if (iK == 16) {
                                this.f10301a |= 2;
                                this.f10303c = nVar.M();
                            } else if (iK != 122) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                if ((i10 & 4) == 0) {
                                    this.f10304d = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f10304d.add((c) nVar.A(c.f10312h, yVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 4) != 0) {
                        this.f10304d = Collections.unmodifiableList(this.f10304d);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 4) != 0) {
                this.f10304d = Collections.unmodifiableList(this.f10304d);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    static {
        Descriptors.Descriptor descriptor = e().getMessageTypes().get(0);
        f10290a = descriptor;
        f10291b = new j0.f(descriptor, new String[]{"Major", "Minor", "Patch", "Suffix"});
        Descriptors.Descriptor descriptor2 = e().getMessageTypes().get(1);
        f10292c = descriptor2;
        f10293d = new j0.f(descriptor2, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
        Descriptors.Descriptor descriptor3 = e().getMessageTypes().get(2);
        f10294e = descriptor3;
        f10295f = new j0.f(descriptor3, new String[]{"Error", "SupportedFeatures", "File"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f10296g = descriptor4;
        f10297h = new j0.f(descriptor4, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        DescriptorProtos.a0();
    }

    public static Descriptors.FileDescriptor e() {
        return f10298i;
    }
}
