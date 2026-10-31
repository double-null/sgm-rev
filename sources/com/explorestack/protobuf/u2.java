package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: UnknownFieldSet.java */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements MessageLite {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u2 f10814c = new u2(Collections.emptyMap(), Collections.emptyMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f10815d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, c> f10816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, c> f10817b;

    /* JADX INFO: compiled from: UnknownFieldSet.java */
    public static final class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final c f10821f = t().g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Long> f10822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<Integer> f10823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Long> f10824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<ByteString> f10825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<u2> f10826e;

        /* JADX INFO: compiled from: UnknownFieldSet.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private c f10827a;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static a h() {
                a aVar = new a();
                aVar.f10827a = new c();
                return aVar;
            }

            public a b(int i10) {
                if (this.f10827a.f10823b == null) {
                    this.f10827a.f10823b = new ArrayList();
                }
                this.f10827a.f10823b.add(Integer.valueOf(i10));
                return this;
            }

            public a c(long j10) {
                if (this.f10827a.f10824c == null) {
                    this.f10827a.f10824c = new ArrayList();
                }
                this.f10827a.f10824c.add(Long.valueOf(j10));
                return this;
            }

            public a d(u2 u2Var) {
                if (this.f10827a.f10826e == null) {
                    this.f10827a.f10826e = new ArrayList();
                }
                this.f10827a.f10826e.add(u2Var);
                return this;
            }

            public a e(ByteString byteString) {
                if (this.f10827a.f10825d == null) {
                    this.f10827a.f10825d = new ArrayList();
                }
                this.f10827a.f10825d.add(byteString);
                return this;
            }

            public a f(long j10) {
                if (this.f10827a.f10822a == null) {
                    this.f10827a.f10822a = new ArrayList();
                }
                this.f10827a.f10822a.add(Long.valueOf(j10));
                return this;
            }

            public c g() {
                if (this.f10827a.f10822a == null) {
                    this.f10827a.f10822a = Collections.emptyList();
                } else {
                    c cVar = this.f10827a;
                    cVar.f10822a = Collections.unmodifiableList(cVar.f10822a);
                }
                if (this.f10827a.f10823b == null) {
                    this.f10827a.f10823b = Collections.emptyList();
                } else {
                    c cVar2 = this.f10827a;
                    cVar2.f10823b = Collections.unmodifiableList(cVar2.f10823b);
                }
                if (this.f10827a.f10824c == null) {
                    this.f10827a.f10824c = Collections.emptyList();
                } else {
                    c cVar3 = this.f10827a;
                    cVar3.f10824c = Collections.unmodifiableList(cVar3.f10824c);
                }
                if (this.f10827a.f10825d == null) {
                    this.f10827a.f10825d = Collections.emptyList();
                } else {
                    c cVar4 = this.f10827a;
                    cVar4.f10825d = Collections.unmodifiableList(cVar4.f10825d);
                }
                if (this.f10827a.f10826e == null) {
                    this.f10827a.f10826e = Collections.emptyList();
                } else {
                    c cVar5 = this.f10827a;
                    cVar5.f10826e = Collections.unmodifiableList(cVar5.f10826e);
                }
                c cVar6 = this.f10827a;
                this.f10827a = null;
                return cVar6;
            }

            public a i(c cVar) {
                if (!cVar.f10822a.isEmpty()) {
                    if (this.f10827a.f10822a == null) {
                        this.f10827a.f10822a = new ArrayList();
                    }
                    this.f10827a.f10822a.addAll(cVar.f10822a);
                }
                if (!cVar.f10823b.isEmpty()) {
                    if (this.f10827a.f10823b == null) {
                        this.f10827a.f10823b = new ArrayList();
                    }
                    this.f10827a.f10823b.addAll(cVar.f10823b);
                }
                if (!cVar.f10824c.isEmpty()) {
                    if (this.f10827a.f10824c == null) {
                        this.f10827a.f10824c = new ArrayList();
                    }
                    this.f10827a.f10824c.addAll(cVar.f10824c);
                }
                if (!cVar.f10825d.isEmpty()) {
                    if (this.f10827a.f10825d == null) {
                        this.f10827a.f10825d = new ArrayList();
                    }
                    this.f10827a.f10825d.addAll(cVar.f10825d);
                }
                if (!cVar.f10826e.isEmpty()) {
                    if (this.f10827a.f10826e == null) {
                        this.f10827a.f10826e = new ArrayList();
                    }
                    this.f10827a.f10826e.addAll(cVar.f10826e);
                }
                return this;
            }
        }

        private c() {
        }

        private Object[] o() {
            return new Object[]{this.f10822a, this.f10823b, this.f10824c, this.f10825d, this.f10826e};
        }

        public static a t() {
            return a.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(int i10, e3 e3Var) throws IOException {
            if (e3Var.fieldOrder() != e3.a.DESCENDING) {
                Iterator<ByteString> it = this.f10825d.iterator();
                while (it.hasNext()) {
                    e3Var.writeMessageSetItem(i10, it.next());
                }
            } else {
                List<ByteString> list = this.f10825d;
                ListIterator<ByteString> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    e3Var.writeMessageSetItem(i10, listIterator.previous());
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Arrays.equals(o(), ((c) obj).o());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(o());
        }

        public List<Integer> l() {
            return this.f10823b;
        }

        public List<Long> m() {
            return this.f10824c;
        }

        public List<u2> n() {
            return this.f10826e;
        }

        public List<ByteString> p() {
            return this.f10825d;
        }

        public int q(int i10) {
            Iterator<Long> it = this.f10822a.iterator();
            int iT = 0;
            while (it.hasNext()) {
                iT += CodedOutputStream.a0(i10, it.next().longValue());
            }
            Iterator<Integer> it2 = this.f10823b.iterator();
            while (it2.hasNext()) {
                iT += CodedOutputStream.n(i10, it2.next().intValue());
            }
            Iterator<Long> it3 = this.f10824c.iterator();
            while (it3.hasNext()) {
                iT += CodedOutputStream.p(i10, it3.next().longValue());
            }
            Iterator<ByteString> it4 = this.f10825d.iterator();
            while (it4.hasNext()) {
                iT += CodedOutputStream.h(i10, it4.next());
            }
            Iterator<u2> it5 = this.f10826e.iterator();
            while (it5.hasNext()) {
                iT += CodedOutputStream.t(i10, it5.next());
            }
            return iT;
        }

        public int r(int i10) {
            Iterator<ByteString> it = this.f10825d.iterator();
            int iL = 0;
            while (it.hasNext()) {
                iL += CodedOutputStream.L(i10, it.next());
            }
            return iL;
        }

        public List<Long> s() {
            return this.f10822a;
        }

        public void u(int i10, CodedOutputStream codedOutputStream) throws IOException {
            Iterator<ByteString> it = this.f10825d.iterator();
            while (it.hasNext()) {
                codedOutputStream.P0(i10, it.next());
            }
        }

        public void w(int i10, CodedOutputStream codedOutputStream) throws IOException {
            Iterator<Long> it = this.f10822a.iterator();
            while (it.hasNext()) {
                codedOutputStream.e1(i10, it.next().longValue());
            }
            Iterator<Integer> it2 = this.f10823b.iterator();
            while (it2.hasNext()) {
                codedOutputStream.x0(i10, it2.next().intValue());
            }
            Iterator<Long> it3 = this.f10824c.iterator();
            while (it3.hasNext()) {
                codedOutputStream.z0(i10, it3.next().longValue());
            }
            Iterator<ByteString> it4 = this.f10825d.iterator();
            while (it4.hasNext()) {
                codedOutputStream.r0(i10, it4.next());
            }
            Iterator<u2> it5 = this.f10826e.iterator();
            while (it5.hasNext()) {
                codedOutputStream.D0(i10, it5.next());
            }
        }

        void x(int i10, e3 e3Var) throws IOException {
            e3Var.writeInt64List(i10, this.f10822a, false);
            e3Var.writeFixed32List(i10, this.f10823b, false);
            e3Var.writeFixed64List(i10, this.f10824c, false);
            e3Var.writeBytesList(i10, this.f10825d);
            if (e3Var.fieldOrder() == e3.a.ASCENDING) {
                for (int i11 = 0; i11 < this.f10826e.size(); i11++) {
                    e3Var.writeStartGroup(i10);
                    this.f10826e.get(i11).n(e3Var);
                    e3Var.writeEndGroup(i10);
                }
                return;
            }
            for (int size = this.f10826e.size() - 1; size >= 0; size--) {
                e3Var.writeEndGroup(i10);
                this.f10826e.get(size).n(e3Var);
                e3Var.writeStartGroup(i10);
            }
        }
    }

    /* JADX INFO: compiled from: UnknownFieldSet.java */
    public static final class d extends com.explorestack.protobuf.b<u2> {
        @Override // com.explorestack.protobuf.s1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u2 parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            b bVarG = u2.g();
            try {
                bVarG.mergeFrom(nVar);
                return bVarG.buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw e10.setUnfinishedMessage(bVarG.buildPartial());
            } catch (IOException e11) {
                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(bVarG.buildPartial());
            }
        }
    }

    private u2() {
        this.f10816a = null;
        this.f10817b = null;
    }

    public static u2 c() {
        return f10814c;
    }

    public static b g() {
        return b.j();
    }

    public static b h(u2 u2Var) {
        return g().u(u2Var);
    }

    public static u2 j(ByteString byteString) throws InvalidProtocolBufferException {
        return g().mergeFrom(byteString).build();
    }

    public Map<Integer, c> b() {
        return this.f10816a;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u2 mo164getDefaultInstanceForType() {
        return f10814c;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final d getParserForType() {
        return f10815d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2) && this.f10816a.equals(((u2) obj).f10816a);
    }

    public int f() {
        int iR = 0;
        for (Map.Entry<Integer, c> entry : this.f10816a.entrySet()) {
            iR += entry.getValue().r(entry.getKey().intValue());
        }
        return iR;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int iQ = 0;
        for (Map.Entry<Integer, c> entry : this.f10816a.entrySet()) {
            iQ += entry.getValue().q(entry.getKey().intValue());
        }
        return iQ;
    }

    public int hashCode() {
        return this.f10816a.hashCode();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return g();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return g().u(this);
    }

    public void l(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry<Integer, c> entry : this.f10816a.entrySet()) {
            entry.getValue().u(entry.getKey().intValue(), codedOutputStream);
        }
    }

    void m(e3 e3Var) throws IOException {
        if (e3Var.fieldOrder() == e3.a.DESCENDING) {
            for (Map.Entry<Integer, c> entry : this.f10817b.entrySet()) {
                entry.getValue().v(entry.getKey().intValue(), e3Var);
            }
            return;
        }
        for (Map.Entry<Integer, c> entry2 : this.f10816a.entrySet()) {
            entry2.getValue().v(entry2.getKey().intValue(), e3Var);
        }
    }

    void n(e3 e3Var) throws IOException {
        if (e3Var.fieldOrder() == e3.a.DESCENDING) {
            for (Map.Entry<Integer, c> entry : this.f10817b.entrySet()) {
                entry.getValue().x(entry.getKey().intValue(), e3Var);
            }
            return;
        }
        for (Map.Entry<Integer, c> entry2 : this.f10816a.entrySet()) {
            entry2.getValue().x(entry2.getKey().intValue(), e3Var);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamJ0 = CodedOutputStream.j0(bArr);
            writeTo(codedOutputStreamJ0);
            codedOutputStreamJ0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamH0 = CodedOutputStream.h0(outputStream);
        codedOutputStreamH0.Q0(getSerializedSize());
        writeTo(codedOutputStreamH0);
        codedOutputStreamH0.e0();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry<Integer, c> entry : this.f10816a.entrySet()) {
            entry.getValue().w(entry.getKey().intValue(), codedOutputStream);
        }
    }

    /* JADX INFO: compiled from: UnknownFieldSet.java */
    public static final class b implements MessageLite.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<Integer, c> f10818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c.a f10820c;

        private b() {
        }

        private void C() {
            this.f10818a = Collections.emptyMap();
            this.f10819b = 0;
            this.f10820c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b j() {
            b bVar = new b();
            bVar.C();
            return bVar;
        }

        private c.a l(int i10) {
            c.a aVar = this.f10820c;
            if (aVar != null) {
                int i11 = this.f10819b;
                if (i10 == i11) {
                    return aVar;
                }
                b(i11, aVar.g());
            }
            if (i10 == 0) {
                return null;
            }
            c cVar = this.f10818a.get(Integer.valueOf(i10));
            this.f10819b = i10;
            c.a aVarT = c.t();
            this.f10820c = aVarT;
            if (cVar != null) {
                aVarT.i(cVar);
            }
            return this.f10820c;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return mergeFrom(bArr);
        }

        public b B(int i10, int i11) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            l(i10).f(i11);
            return this;
        }

        public b b(int i10, c cVar) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.f10820c != null && this.f10819b == i10) {
                this.f10820c = null;
                this.f10819b = 0;
            }
            if (this.f10818a.isEmpty()) {
                this.f10818a = new TreeMap();
            }
            this.f10818a.put(Integer.valueOf(i10), cVar);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u2 build() {
            u2 u2Var;
            l(0);
            if (this.f10818a.isEmpty()) {
                u2Var = u2.c();
            } else {
                u2Var = new u2(Collections.unmodifiableMap(this.f10818a), Collections.unmodifiableMap(((TreeMap) this.f10818a).descendingMap()));
            }
            this.f10818a = null;
            return u2Var;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public u2 buildPartial() {
            return build();
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b clear() {
            C();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b m196clone() {
            l(0);
            return u2.g().u(new u2(this.f10818a, Collections.unmodifiableMap(((TreeMap) this.f10818a).descendingMap())));
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public boolean isInitialized() {
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public u2 mo164getDefaultInstanceForType() {
            return u2.c();
        }

        public boolean m(int i10) {
            if (i10 != 0) {
                return i10 == this.f10819b || this.f10818a.containsKey(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom(new com.explorestack.protobuf.a.AbstractC0128a.C0129a(inputStream, n.D(i10, inputStream)));
            return true;
        }

        public b n(int i10, c cVar) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (m(i10)) {
                l(i10).i(cVar);
            } else {
                b(i10, cVar);
            }
            return this;
        }

        public boolean o(int i10, n nVar) throws IOException {
            int iA = c3.a(i10);
            int iB = c3.b(i10);
            if (iB == 0) {
                l(iA).f(nVar.z());
                return true;
            }
            if (iB == 1) {
                l(iA).c(nVar.v());
                return true;
            }
            if (iB == 2) {
                l(iA).e(nVar.r());
                return true;
            }
            if (iB == 3) {
                b bVarG = u2.g();
                nVar.x(iA, bVarG, w.g());
                l(iA).d(bVarG.build());
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            l(iA).b(nVar.u());
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                n nVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(nVarNewCodedInput);
                nVarNewCodedInput.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return mergeFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(n nVar) throws IOException {
            int iK;
            do {
                iK = nVar.K();
                if (iK == 0) {
                    break;
                }
            } while (o(iK, nVar));
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(n nVar, y yVar) throws IOException {
            return mergeFrom(nVar);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(MessageLite messageLite) {
            if (messageLite instanceof u2) {
                return u((u2) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        public b u(u2 u2Var) {
            if (u2Var != u2.c()) {
                for (Map.Entry entry : u2Var.f10816a.entrySet()) {
                    n(((Integer) entry.getKey()).intValue(), (c) entry.getValue());
                }
            }
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(InputStream inputStream) throws IOException {
            n nVarG = n.g(inputStream);
            mergeFrom(nVarG);
            nVarG.a(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(InputStream inputStream, y yVar) throws IOException {
            return mergeFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            try {
                n nVarL = n.l(bArr);
                mergeFrom(nVarL);
                nVarL.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                n nVarM = n.m(bArr, i10, i11);
                mergeFrom(nVarM);
                nVarM.a(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(byte[] bArr, int i10, int i11, y yVar) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return mergeDelimitedFrom(inputStream);
        }
    }

    u2(Map<Integer, c> map, Map<Integer, c> map2) {
        this.f10816a = map;
        this.f10817b = map2;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamH0 = CodedOutputStream.h0(outputStream);
        writeTo(codedOutputStreamH0);
        codedOutputStreamH0.e0();
    }
}
