package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MessageReflection.java */
/* JADX INFO: loaded from: classes.dex */
class h1 {

    /* JADX INFO: compiled from: MessageReflection.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10469a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f10469a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10469a[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10469a[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: MessageReflection.java */
    static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Message.Builder f10470a;

        public b(Message.Builder builder) {
            this.f10470a = builder;
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object a(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f10470a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            nVar.B(builderNewBuilderForType, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.h1.d
        public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f10470a.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.h1.d
        public w.b b(w wVar, Descriptors.Descriptor descriptor, int i10) {
            return wVar.f(descriptor, i10);
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object c() {
            return this.f10470a.buildPartial();
        }

        @Override // com.explorestack.protobuf.h1.d
        public d d(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f10470a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            return new b(builderNewBuilderForType);
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object e(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f10470a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            nVar.x(fieldDescriptor.getNumber(), builderNewBuilderForType, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.h1.d
        public w.b f(w wVar, String str) {
            return wVar.e(str);
        }

        @Override // com.explorestack.protobuf.h1.d
        public c3.d g(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.needsUtf8Check()) {
                return c3.d.f10287b;
            }
            fieldDescriptor.isRepeated();
            return c3.d.f10286a;
        }

        @Override // com.explorestack.protobuf.h1.d
        public Descriptors.Descriptor getDescriptorForType() {
            return this.f10470a.getDescriptorForType();
        }

        @Override // com.explorestack.protobuf.h1.d
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.f10470a.getOneofFieldDescriptor(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public d.a h() {
            return d.a.MESSAGE;
        }

        @Override // com.explorestack.protobuf.h1.d
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f10470a.hasField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return this.f10470a.hasOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object i(ByteString byteString, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message != null ? message.newBuilderForType() : this.f10470a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            builderNewBuilderForType.mergeFrom(byteString, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        public Object j(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f10470a.getField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f10470a.setField(fieldDescriptor, obj);
            return this;
        }
    }

    /* JADX INFO: compiled from: MessageReflection.java */
    static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0<Descriptors.FieldDescriptor> f10471a;

        c(e0<Descriptors.FieldDescriptor> e0Var) {
            this.f10471a = e0Var;
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object a(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            nVar.B(builderNewBuilderForType, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.h1.d
        public d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f10471a.g(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.h1.d
        public w.b b(w wVar, Descriptors.Descriptor descriptor, int i10) {
            return wVar.f(descriptor, i10);
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object c() {
            throw new UnsupportedOperationException("finish() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.h1.d
        public d d(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
            throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object e(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            nVar.x(fieldDescriptor.getNumber(), builderNewBuilderForType, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        @Override // com.explorestack.protobuf.h1.d
        public w.b f(w wVar, String str) {
            return wVar.e(str);
        }

        @Override // com.explorestack.protobuf.h1.d
        public c3.d g(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.needsUtf8Check() ? c3.d.f10287b : c3.d.f10286a;
        }

        @Override // com.explorestack.protobuf.h1.d
        public Descriptors.Descriptor getDescriptorForType() {
            throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
        }

        @Override // com.explorestack.protobuf.h1.d
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            return null;
        }

        @Override // com.explorestack.protobuf.h1.d
        public d.a h() {
            return d.a.EXTENSION_SET;
        }

        @Override // com.explorestack.protobuf.h1.d
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f10471a.A(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return false;
        }

        @Override // com.explorestack.protobuf.h1.d
        public Object i(ByteString byteString, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
            Message message2;
            Message.Builder builderNewBuilderForType = message.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (message2 = (Message) j(fieldDescriptor)) != null) {
                builderNewBuilderForType.mergeFrom(message2);
            }
            builderNewBuilderForType.mergeFrom(byteString, yVar);
            return builderNewBuilderForType.buildPartial();
        }

        public Object j(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f10471a.t(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.h1.d
        public d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f10471a.N(fieldDescriptor, obj);
            return this;
        }
    }

    /* JADX INFO: compiled from: MessageReflection.java */
    interface d {

        /* JADX INFO: compiled from: MessageReflection.java */
        public enum a {
            MESSAGE,
            EXTENSION_SET
        }

        Object a(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        d addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        w.b b(w wVar, Descriptors.Descriptor descriptor, int i10);

        Object c();

        d d(Descriptors.FieldDescriptor fieldDescriptor, Message message);

        Object e(n nVar, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        w.b f(w wVar, String str);

        c3.d g(Descriptors.FieldDescriptor fieldDescriptor);

        Descriptors.Descriptor getDescriptorForType();

        Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

        a h();

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

        Object i(ByteString byteString, y yVar, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

        d setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);
    }

    static String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private static void b(n nVar, w.b bVar, y yVar, d dVar) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = bVar.f10847a;
        dVar.setField(fieldDescriptor, dVar.a(nVar, yVar, fieldDescriptor, bVar.f10848b));
    }

    static List<String> c(MessageOrBuilder messageOrBuilder) {
        ArrayList arrayList = new ArrayList();
        d(messageOrBuilder, "", arrayList);
        return arrayList;
    }

    private static void d(MessageOrBuilder messageOrBuilder, String str, List<String> list) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.getName());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        d((MessageOrBuilder) it.next(), j(str, key, i10), list);
                        i10++;
                    }
                } else if (messageOrBuilder.hasField(key)) {
                    d((MessageOrBuilder) value, j(str, key, -1), list);
                }
            }
        }
    }

    static int e(Message message, Map<Descriptors.FieldDescriptor, Object> map) {
        boolean zC = message.getDescriptorForType().getOptions().C();
        int iF = 0;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            iF += (zC && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) ? CodedOutputStream.F(key.getNumber(), (Message) value) : e0.p(key, value);
        }
        u2 unknownFields = message.getUnknownFields();
        return iF + (zC ? unknownFields.f() : unknownFields.getSerializedSize());
    }

    static boolean f(MessageOrBuilder messageOrBuilder) {
        for (Descriptors.FieldDescriptor fieldDescriptor : messageOrBuilder.getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !messageOrBuilder.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    static boolean g(n nVar, u2.b bVar, y yVar, Descriptors.Descriptor descriptor, d dVar, int i10) throws IOException {
        Message message;
        boolean z10;
        Object objE;
        w.b bVarB;
        if (descriptor.getOptions().C() && i10 == c3.f10249a) {
            i(nVar, bVar, yVar, descriptor, dVar);
            return true;
        }
        int iB = c3.b(i10);
        int iA = c3.a(i10);
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = null;
        if (descriptor.isExtensionNumber(iA)) {
            if (!(yVar instanceof w) || (bVarB = dVar.b((w) yVar, descriptor, iA)) == null) {
                message = null;
            } else {
                Descriptors.FieldDescriptor fieldDescriptor = bVarB.f10847a;
                Message message2 = bVarB.f10848b;
                if (message2 == null && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    throw new IllegalStateException("Message-typed extension lacked default instance: " + fieldDescriptor.getFullName());
                }
                message = message2;
                fieldDescriptorFindFieldByNumber = fieldDescriptor;
            }
        } else if (dVar.h() == d.a.MESSAGE) {
            fieldDescriptorFindFieldByNumber = descriptor.findFieldByNumber(iA);
            message = null;
        } else {
            message = null;
        }
        boolean z11 = false;
        if (fieldDescriptorFindFieldByNumber == null) {
            z10 = false;
            z11 = true;
        } else if (iB == e0.z(fieldDescriptorFindFieldByNumber.getLiteType(), false)) {
            z10 = false;
        } else if (fieldDescriptorFindFieldByNumber.isPackable() && iB == e0.z(fieldDescriptorFindFieldByNumber.getLiteType(), true)) {
            z10 = true;
        } else {
            z10 = false;
            z11 = true;
        }
        if (z11) {
            return bVar != null ? bVar.o(i10, nVar) : nVar.O(i10);
        }
        if (z10) {
            int iP = nVar.p(nVar.C());
            if (fieldDescriptorFindFieldByNumber.getLiteType() == c3.b.f10267p) {
                while (nVar.d() > 0) {
                    int iT = nVar.t();
                    if (fieldDescriptorFindFieldByNumber.getFile().supportsUnknownEnumValue()) {
                        dVar.addRepeatedField(fieldDescriptorFindFieldByNumber, fieldDescriptorFindFieldByNumber.m163getEnumType().findValueByNumberCreatingIfUnknown(iT));
                    } else {
                        Descriptors.EnumValueDescriptor enumValueDescriptorFindValueByNumber = fieldDescriptorFindFieldByNumber.m163getEnumType().findValueByNumber(iT);
                        if (enumValueDescriptorFindValueByNumber != null) {
                            dVar.addRepeatedField(fieldDescriptorFindFieldByNumber, enumValueDescriptorFindValueByNumber);
                        } else if (bVar != null) {
                            bVar.B(iA, iT);
                        }
                    }
                }
            } else {
                while (nVar.d() > 0) {
                    dVar.addRepeatedField(fieldDescriptorFindFieldByNumber, c3.d(nVar, fieldDescriptorFindFieldByNumber.getLiteType(), dVar.g(fieldDescriptorFindFieldByNumber)));
                }
            }
            nVar.o(iP);
        } else {
            int i11 = a.f10469a[fieldDescriptorFindFieldByNumber.getType().ordinal()];
            if (i11 == 1) {
                objE = dVar.e(nVar, yVar, fieldDescriptorFindFieldByNumber, message);
            } else if (i11 == 2) {
                objE = dVar.a(nVar, yVar, fieldDescriptorFindFieldByNumber, message);
            } else if (i11 != 3) {
                objE = c3.d(nVar, fieldDescriptorFindFieldByNumber.getLiteType(), dVar.g(fieldDescriptorFindFieldByNumber));
            } else {
                int iT2 = nVar.t();
                if (fieldDescriptorFindFieldByNumber.getFile().supportsUnknownEnumValue()) {
                    objE = fieldDescriptorFindFieldByNumber.m163getEnumType().findValueByNumberCreatingIfUnknown(iT2);
                } else {
                    Descriptors.EnumValueDescriptor enumValueDescriptorFindValueByNumber2 = fieldDescriptorFindFieldByNumber.m163getEnumType().findValueByNumber(iT2);
                    if (enumValueDescriptorFindValueByNumber2 == null) {
                        if (bVar != null) {
                            bVar.B(iA, iT2);
                        }
                        return true;
                    }
                    objE = enumValueDescriptorFindValueByNumber2;
                }
            }
            if (fieldDescriptorFindFieldByNumber.isRepeated()) {
                dVar.addRepeatedField(fieldDescriptorFindFieldByNumber, objE);
            } else {
                dVar.setField(fieldDescriptorFindFieldByNumber, objE);
            }
        }
        return true;
    }

    private static void h(ByteString byteString, w.b bVar, y yVar, d dVar) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = bVar.f10847a;
        if (dVar.hasField(fieldDescriptor) || y.c()) {
            dVar.setField(fieldDescriptor, dVar.i(byteString, yVar, fieldDescriptor, bVar.f10848b));
        } else {
            dVar.setField(fieldDescriptor, new o0(bVar.f10848b, yVar, byteString));
        }
    }

    private static void i(n nVar, u2.b bVar, y yVar, Descriptors.Descriptor descriptor, d dVar) throws IOException {
        int iL = 0;
        ByteString byteStringR = null;
        w.b bVarB = null;
        while (true) {
            int iK = nVar.K();
            if (iK == 0) {
                break;
            }
            if (iK == c3.f10251c) {
                iL = nVar.L();
                if (iL != 0 && (yVar instanceof w)) {
                    bVarB = dVar.b((w) yVar, descriptor, iL);
                }
            } else if (iK == c3.f10252d) {
                if (iL == 0 || bVarB == null || !y.c()) {
                    byteStringR = nVar.r();
                } else {
                    b(nVar, bVarB, yVar, dVar);
                    byteStringR = null;
                }
            } else if (!nVar.O(iK)) {
                break;
            }
        }
        nVar.a(c3.f10250b);
        if (byteStringR == null || iL == 0) {
            return;
        }
        if (bVarB != null) {
            h(byteStringR, bVarB, yVar, dVar);
        } else if (bVar != null) {
            bVar.n(iL, u2.c.t().e(byteStringR).g());
        }
    }

    private static String j(String str, Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        if (fieldDescriptor.isExtension()) {
            sb2.append('(');
            sb2.append(fieldDescriptor.getFullName());
            sb2.append(')');
        } else {
            sb2.append(fieldDescriptor.getName());
        }
        if (i10 != -1) {
            sb2.append('[');
            sb2.append(i10);
            sb2.append(']');
        }
        sb2.append('.');
        return sb2.toString();
    }

    static void k(Message message, Map<Descriptors.FieldDescriptor, Object> map, CodedOutputStream codedOutputStream, boolean z10) throws IOException {
        boolean zC = message.getDescriptorForType().getOptions().C();
        if (z10) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor fieldDescriptor : message.getDescriptorForType().getFields()) {
                if (fieldDescriptor.isRequired() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, message.getField(fieldDescriptor));
                }
            }
            map = treeMap;
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (zC && key.isExtension() && key.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) {
                codedOutputStream.O0(key.getNumber(), (Message) value);
            } else {
                e0.S(key, value, codedOutputStream);
            }
        }
        u2 unknownFields = message.getUnknownFields();
        if (zC) {
            unknownFields.l(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }
}
