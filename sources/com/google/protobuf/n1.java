package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SchemaUtil.java */
/* JADX INFO: loaded from: classes4.dex */
final class n1 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final r1<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final r1<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new t1();

    private n1() {
    }

    static int computeSizeBoolList(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(i10, true);
    }

    static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    static int computeSizeByteStringList(int i10, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i11));
        }
        return iComputeTagSize;
    }

    static int computeSizeEnumList(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) : iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeEnumListNoTag(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(zVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    static int computeSizeFixed32List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(i10, 0);
    }

    static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    static int computeSizeFixed64List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(i10, 0L);
    }

    static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i10, List<s0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i10, list.get(i11));
        }
        return iComputeGroupSize;
    }

    static int computeSizeInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) : iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeInt32ListNoTag(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(zVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    static int computeSizeInt64List(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) : iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeInt64ListNoTag(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(j0Var.getLong(i10));
                i10++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    static int computeSizeMessage(int i10, Object obj, l1 l1Var) {
        return obj instanceof f0 ? CodedOutputStream.computeLazyFieldSize(i10, (f0) obj) : CodedOutputStream.computeMessageSize(i10, (s0) obj, l1Var);
    }

    static int computeSizeMessageList(int i10, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iComputeTagSize += obj instanceof f0 ? CodedOutputStream.computeLazyFieldSizeNoTag((f0) obj) : CodedOutputStream.computeMessageSizeNoTag((s0) obj);
        }
        return iComputeTagSize;
    }

    static int computeSizeSInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) : iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(zVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    static int computeSizeSInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) : iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeSInt64ListNoTag(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(j0Var.getLong(i10));
                i10++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    static int computeSizeStringList(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i11 < size) {
                Object raw = h0Var.getRaw(i11);
                iComputeTagSize += raw instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iComputeTagSize += obj instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i11++;
            }
        }
        return iComputeTagSize;
    }

    static int computeSizeUInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) : iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(zVar.getInt(i10));
                i10++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    static int computeSizeUInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        return z10 ? CodedOutputStream.computeTagSize(i10) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) : iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i10));
    }

    static int computeSizeUInt64ListNoTag(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(j0Var.getLong(i10));
                i10++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, a0.d<?> dVar, UB ub2, r1<UT, UB> r1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (dVar.findValueByNumber(iIntValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue, ub2, r1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue2) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue2, ub2, r1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return v1.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static r1<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (r1) unknownFieldSetSchemaClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends u.c<FT>> void mergeExtensions(q<FT> qVar, T t10, T t11) {
        u<T> extensions = qVar.getExtensions(t11);
        if (extensions.isEmpty()) {
            return;
        }
        qVar.getMutableExtensions(t10).mergeFrom(extensions);
    }

    static <T> void mergeMap(n0 n0Var, T t10, T t11, long j10) {
        v1.putObject(t10, j10, n0Var.mergeFrom(v1.getObject(t10, j10), v1.getObject(t11, j10)));
    }

    static <T, UT, UB> void mergeUnknownFields(r1<UT, UB> r1Var, T t10, T t11) {
        r1Var.setToMessage(t10, r1Var.merge(r1Var.getFromMessage(t10), r1Var.getFromMessage(t11)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = (((long) i11) - ((long) i10)) + 1;
        long j11 = i12;
        return j10 + 9 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    static <UT, UB> UB storeUnknownEnum(Object obj, int i10, int i11, UB ub2, r1<UT, UB> r1Var) {
        if (ub2 == null) {
            ub2 = r1Var.getBuilderFromMessage(obj);
        }
        r1Var.addVarint(ub2, i10, i11);
        return ub2;
    }

    static String toCamelCase(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static r1<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static r1<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i10, boolean z10, y1 y1Var) throws IOException {
        if (z10) {
            y1Var.writeBool(i10, true);
        }
    }

    public static void writeBoolList(int i10, List<Boolean> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeBoolList(i10, list, z10);
    }

    public static void writeBytes(int i10, i iVar, y1 y1Var) throws IOException {
        if (iVar == null || iVar.isEmpty()) {
            return;
        }
        y1Var.writeBytes(i10, iVar);
    }

    public static void writeBytesList(int i10, List<i> list, y1 y1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeBytesList(i10, list);
    }

    public static void writeDouble(int i10, double d10, y1 y1Var) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            y1Var.writeDouble(i10, d10);
        }
    }

    public static void writeDoubleList(int i10, List<Double> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeDoubleList(i10, list, z10);
    }

    public static void writeEnum(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeEnum(i10, i11);
        }
    }

    public static void writeEnumList(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeEnumList(i10, list, z10);
    }

    public static void writeFixed32(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeFixed32(i10, i11);
        }
    }

    public static void writeFixed32List(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeFixed32List(i10, list, z10);
    }

    public static void writeFixed64(int i10, long j10, y1 y1Var) throws IOException {
        if (j10 != 0) {
            y1Var.writeFixed64(i10, j10);
        }
    }

    public static void writeFixed64List(int i10, List<Long> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeFixed64List(i10, list, z10);
    }

    public static void writeFloat(int i10, float f10, y1 y1Var) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            y1Var.writeFloat(i10, f10);
        }
    }

    public static void writeFloatList(int i10, List<Float> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeFloatList(i10, list, z10);
    }

    public static void writeGroupList(int i10, List<?> list, y1 y1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeGroupList(i10, list);
    }

    public static void writeInt32(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeInt32(i10, i11);
        }
    }

    public static void writeInt32List(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeInt32List(i10, list, z10);
    }

    public static void writeInt64(int i10, long j10, y1 y1Var) throws IOException {
        if (j10 != 0) {
            y1Var.writeInt64(i10, j10);
        }
    }

    public static void writeInt64List(int i10, List<Long> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeInt64List(i10, list, z10);
    }

    public static void writeLazyFieldList(int i10, List<?> list, y1 y1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).writeTo(y1Var, i10);
        }
    }

    public static void writeMessage(int i10, Object obj, y1 y1Var) throws IOException {
        if (obj != null) {
            y1Var.writeMessage(i10, obj);
        }
    }

    public static void writeMessageList(int i10, List<?> list, y1 y1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeMessageList(i10, list);
    }

    public static void writeSFixed32(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeSFixed32(i10, i11);
        }
    }

    public static void writeSFixed32List(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeSFixed32List(i10, list, z10);
    }

    public static void writeSFixed64(int i10, long j10, y1 y1Var) throws IOException {
        if (j10 != 0) {
            y1Var.writeSFixed64(i10, j10);
        }
    }

    public static void writeSFixed64List(int i10, List<Long> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeSFixed64List(i10, list, z10);
    }

    public static void writeSInt32(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeSInt32(i10, i11);
        }
    }

    public static void writeSInt32List(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeSInt32List(i10, list, z10);
    }

    public static void writeSInt64(int i10, long j10, y1 y1Var) throws IOException {
        if (j10 != 0) {
            y1Var.writeSInt64(i10, j10);
        }
    }

    public static void writeSInt64List(int i10, List<Long> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeSInt64List(i10, list, z10);
    }

    public static void writeString(int i10, Object obj, y1 y1Var) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i10, (String) obj, y1Var);
        } else {
            writeBytes(i10, (i) obj, y1Var);
        }
    }

    private static void writeStringInternal(int i10, String str, y1 y1Var) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        y1Var.writeString(i10, str);
    }

    public static void writeStringList(int i10, List<String> list, y1 y1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeStringList(i10, list);
    }

    public static void writeUInt32(int i10, int i11, y1 y1Var) throws IOException {
        if (i11 != 0) {
            y1Var.writeUInt32(i10, i11);
        }
    }

    public static void writeUInt32List(int i10, List<Integer> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeUInt32List(i10, list, z10);
    }

    public static void writeUInt64(int i10, long j10, y1 y1Var) throws IOException {
        if (j10 != 0) {
            y1Var.writeUInt64(i10, j10);
        }
    }

    public static void writeUInt64List(int i10, List<Long> list, y1 y1Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeUInt64List(i10, list, z10);
    }

    public static boolean shouldUseTableSwitch(t[] tVarArr) {
        if (tVarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(tVarArr[0].getFieldNumber(), tVarArr[tVarArr.length - 1].getFieldNumber(), tVarArr.length);
    }

    static int computeSizeGroupList(int i10, List<s0> list, l1 l1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i10, list.get(i11), l1Var);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i10, List<?> list, y1 y1Var, l1 l1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeGroupList(i10, list, l1Var);
    }

    public static void writeMessageList(int i10, List<?> list, y1 y1Var, l1 l1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.writeMessageList(i10, list, l1Var);
    }

    static int computeSizeMessageList(int i10, List<?> list, l1 l1Var) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof f0) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((f0) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((s0) obj, l1Var);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, a0.e eVar, UB ub2, r1<UT, UB> r1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue, ub2, r1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.isInRange(iIntValue2)) {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue2, ub2, r1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
