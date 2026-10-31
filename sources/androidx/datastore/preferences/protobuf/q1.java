package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Writer.java */
/* JADX INFO: loaded from: classes.dex */
interface q1 {

    /* JADX INFO: compiled from: Writer.java */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    @Deprecated
    void a(int i10, List<?> list, e1 e1Var) throws IOException;

    void b(int i10, g gVar) throws IOException;

    void c(int i10, Object obj, e1 e1Var) throws IOException;

    <K, V> void d(int i10, i0.a<K, V> aVar, Map<K, V> map) throws IOException;

    @Deprecated
    void e(int i10, Object obj, e1 e1Var) throws IOException;

    void f(int i10, List<?> list, e1 e1Var) throws IOException;

    a fieldOrder();

    void writeBool(int i10, boolean z10) throws IOException;

    void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException;

    void writeBytesList(int i10, List<g> list) throws IOException;

    void writeDouble(int i10, double d10) throws IOException;

    void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException;

    @Deprecated
    void writeEndGroup(int i10) throws IOException;

    void writeEnum(int i10, int i11) throws IOException;

    void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeFixed32(int i10, int i11) throws IOException;

    void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeFixed64(int i10, long j10) throws IOException;

    void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException;

    void writeFloat(int i10, float f10) throws IOException;

    void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException;

    void writeInt32(int i10, int i11) throws IOException;

    void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeInt64(int i10, long j10) throws IOException;

    void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException;

    void writeMessageSetItem(int i10, Object obj) throws IOException;

    void writeSFixed32(int i10, int i11) throws IOException;

    void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeSFixed64(int i10, long j10) throws IOException;

    void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException;

    void writeSInt32(int i10, int i11) throws IOException;

    void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeSInt64(int i10, long j10) throws IOException;

    void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException;

    @Deprecated
    void writeStartGroup(int i10) throws IOException;

    void writeString(int i10, String str) throws IOException;

    void writeStringList(int i10, List<String> list) throws IOException;

    void writeUInt32(int i10, int i11) throws IOException;

    void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException;

    void writeUInt64(int i10, long j10) throws IOException;

    void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException;
}
