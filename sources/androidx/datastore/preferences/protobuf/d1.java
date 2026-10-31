package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Reader.java */
/* JADX INFO: loaded from: classes.dex */
interface d1 {
    <T> void a(T t10, e1<T> e1Var, n nVar) throws IOException;

    <T> void b(List<T> list, e1<T> e1Var, n nVar) throws IOException;

    <T> T c(Class<T> cls, n nVar) throws IOException;

    @Deprecated
    <T> T d(Class<T> cls, n nVar) throws IOException;

    <K, V> void e(Map<K, V> map, i0.a<K, V> aVar, n nVar) throws IOException;

    <T> void f(T t10, e1<T> e1Var, n nVar) throws IOException;

    @Deprecated
    <T> void g(List<T> list, e1<T> e1Var, n nVar) throws IOException;

    int getFieldNumber() throws IOException;

    int getTag();

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    g readBytes() throws IOException;

    void readBytesList(List<g> list) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> list) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> list) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> list) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> list) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> list) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> list) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> list) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> list) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> list) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    void readStringListRequireUtf8(List<String> list) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> list) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> list) throws IOException;

    boolean skipField() throws IOException;
}
