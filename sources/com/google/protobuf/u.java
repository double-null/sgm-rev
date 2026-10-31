package com.google.protobuf;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.google.protobuf.u.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FieldSet.java */
/* JADX INFO: loaded from: classes4.dex */
final class u<T extends c<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final u DEFAULT_INSTANCE = new u(true);
    private final o1<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: compiled from: FieldSet.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[x1.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[x1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[x1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[x1.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[x1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[x1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    static final class b<T extends c<T>> {
        private o1<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ b(a aVar) {
            this();
        }

        private u<T> buildImpl(boolean z10) {
            if (this.fields.isEmpty()) {
                return u.emptySet();
            }
            this.isMutable = false;
            o1<T, Object> o1VarCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                o1VarCloneAllFieldsMap = u.cloneAllFieldsMap(o1VarCloneAllFieldsMap, false);
                replaceBuilders(o1VarCloneAllFieldsMap, z10);
            }
            u<T> uVar = new u<>(o1VarCloneAllFieldsMap, null);
            ((u) uVar).hasLazyField = this.hasLazyField;
            return uVar;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = u.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends c<T>> b<T> fromFieldSet(u<T> uVar) {
            b<T> bVar = new b<>(u.cloneAllFieldsMap(((u) uVar).fields, true));
            ((b) bVar).hasLazyField = ((u) uVar).hasLazyField;
            return bVar;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof e0) {
                value = ((e0) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.fields.put(key, arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(u.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != x1.c.MESSAGE) {
                this.fields.put(key, u.cloneIfMutable(value));
                return;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put(key, u.cloneIfMutable(value));
            } else if (fieldAllowBuilders instanceof s0.a) {
                key.internalMergeFrom((s0.a) fieldAllowBuilders, (s0) value);
            } else {
                this.fields.put(key, key.internalMergeFrom(((s0) fieldAllowBuilders).toBuilder(), (s0) value).build());
            }
        }

        private static Object replaceBuilder(Object obj, boolean z10) {
            if (!(obj instanceof s0.a)) {
                return obj;
            }
            s0.a aVar = (s0.a) obj;
            return z10 ? aVar.buildPartial() : aVar.build();
        }

        private static <T extends c<T>> void replaceBuilders(o1<T, Object> o1Var, boolean z10) {
            for (int i10 = 0; i10 < o1Var.getNumArrayEntries(); i10++) {
                replaceBuilders(o1Var.getArrayEntryAt(i10), z10);
            }
            Iterator it = o1Var.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next(), z10);
            }
        }

        private void verifyType(T t10, Object obj) {
            if (u.isValidType(t10.getLiteType(), obj)) {
                return;
            }
            if (t10.getLiteType().getJavaType() != x1.c.MESSAGE || !(obj instanceof s0.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public void addRepeatedField(T t10, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            verifyType(t10, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                arrayList = new ArrayList();
                this.fields.put(t10, arrayList);
            } else {
                arrayList = (List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        public u<T> build() {
            return buildImpl(false);
        }

        public u<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(T t10) {
            ensureIsMutable();
            this.fields.remove(t10);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            o1 o1VarCloneAllFieldsMap = u.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                o1VarCloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(o1VarCloneAllFieldsMap, true);
            }
            return o1VarCloneAllFieldsMap;
        }

        public Object getField(T t10) {
            return replaceBuilders(t10, getFieldAllowBuilders(t10), true);
        }

        Object getFieldAllowBuilders(T t10) {
            Object obj = this.fields.get(t10);
            return obj instanceof e0 ? ((e0) obj).getValue() : obj;
        }

        public Object getRepeatedField(T t10, int i10) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t10, i10), true);
        }

        Object getRepeatedFieldAllowBuilders(T t10, int i10) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int getRepeatedFieldCount(T t10) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(T t10) {
            if (t10.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(t10) != null;
        }

        public boolean isInitialized() {
            for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
                if (!u.isInitialized(this.fields.getArrayEntryAt(i10))) {
                    return false;
                }
            }
            Iterator it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!u.isInitialized((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(u<T> uVar) {
            ensureIsMutable();
            for (int i10 = 0; i10 < ((u) uVar).fields.getNumArrayEntries(); i10++) {
                mergeFromField(((u) uVar).fields.getArrayEntryAt(i10));
            }
            Iterator it = ((u) uVar).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t10, Object obj) {
            ensureIsMutable();
            if (!t10.isRepeated()) {
                verifyType(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                for (Object obj2 : arrayList) {
                    verifyType(t10, obj2);
                    this.hasNestedBuilders = this.hasNestedBuilders || (obj2 instanceof s0.a);
                }
                obj = arrayList;
            }
            if (obj instanceof e0) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            this.fields.put(t10, obj);
        }

        public void setRepeatedField(T t10, int i10, Object obj) {
            ensureIsMutable();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof s0.a);
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(t10, obj);
            ((List) fieldAllowBuilders).set(i10, obj);
        }

        private b() {
            this(o1.newFieldMap(16));
        }

        private b(o1<T, Object> o1Var) {
            this.fields = o1Var;
            this.isMutable = true;
        }

        private static <T extends c<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z10) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z10));
        }

        private static <T extends c<T>> Object replaceBuilders(T t10, Object obj, boolean z10) {
            if (obj == null || t10.getLiteJavaType() != x1.c.MESSAGE) {
                return obj;
            }
            if (t10.isRepeated()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Object obj2 = arrayList.get(i10);
                        Object objReplaceBuilder = replaceBuilder(obj2, z10);
                        if (objReplaceBuilder != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i10, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj, z10);
        }
    }

    /* JADX INFO: compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        a0.d<?> getEnumType();

        x1.c getLiteJavaType();

        x1.b getLiteType();

        int getNumber();

        s0.a internalMergeFrom(s0.a aVar, s0 s0Var);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ u(o1 o1Var, a aVar) {
        this(o1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> o1<T, Object> cloneAllFieldsMap(o1<T, Object> o1Var, boolean z10) {
        o1<T, Object> o1VarNewFieldMap = o1.newFieldMap(16);
        for (int i10 = 0; i10 < o1Var.getNumArrayEntries(); i10++) {
            cloneFieldEntry(o1VarNewFieldMap, o1Var.getArrayEntryAt(i10), z10);
        }
        Iterator it = o1Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(o1VarNewFieldMap, (Map.Entry) it.next(), z10);
        }
        return o1VarNewFieldMap;
    }

    private static <T extends c<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            map.put(key, ((e0) value).getValue());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int computeElementSize(x1.b bVar, int i10, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        if (bVar == x1.b.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(bVar, obj);
    }

    static int computeElementSizeNoTag(x1.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((s0) obj);
            case 10:
                return obj instanceof e0 ? CodedOutputStream.computeLazyFieldSizeNoTag((e0) obj) : CodedOutputStream.computeMessageSizeNoTag((s0) obj);
            case 11:
                return obj instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof i ? CodedOutputStream.computeBytesSizeNoTag((i) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? CodedOutputStream.computeEnumSizeNoTag(((a0.c) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(c<?> cVar, Object obj) {
        x1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        List list = (List) obj;
        int iComputeElementSize = 0;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it.next());
            }
            return iComputeElementSize;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iComputeElementSize += computeElementSizeNoTag(liteType, it2.next());
        }
        return CodedOutputStream.computeTagSize(number) + iComputeElementSize + CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize);
    }

    public static <T extends c<T>> u<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    static int getWireFormatForFieldType(x1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof t0) {
            return ((t0) obj).isInitialized();
        }
        if (obj instanceof e0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(x1.b bVar, Object obj) {
        a0.checkNotNull(obj);
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != x1.c.MESSAGE) {
            this.fields.put(key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put(key, cloneIfMutable(value));
        } else {
            this.fields.put(key, key.internalMergeFrom(((s0) field2).toBuilder(), (s0) value).build());
        }
    }

    public static <T extends c<T>> b<T> newBuilder() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> u<T> newFieldSet() {
        return new u<>();
    }

    public static Object readPrimitiveField(j jVar, x1.b bVar, boolean z10) throws IOException {
        return z10 ? x1.readPrimitiveField(jVar, bVar, x1.d.STRICT) : x1.readPrimitiveField(jVar, bVar, x1.d.LOOSE);
    }

    private void verifyType(T t10, Object obj) {
        if (!isValidType(t10.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    static void writeElement(CodedOutputStream codedOutputStream, x1.b bVar, int i10, Object obj) throws IOException {
        if (bVar == x1.b.GROUP) {
            codedOutputStream.writeGroup(i10, (s0) obj);
        } else {
            codedOutputStream.writeTag(i10, getWireFormatForFieldType(bVar, false));
            writeElementNoTag(codedOutputStream, bVar, obj);
        }
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, x1.b bVar, Object obj) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((s0) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((s0) obj);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((i) obj);
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((i) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof a0.c)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((a0.c) obj).getNumber());
                }
                break;
        }
    }

    public static void writeField(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        x1.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof e0) {
                writeElement(codedOutputStream, liteType, number, ((e0) obj).getValue());
                return;
            } else {
                writeElement(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it.next());
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            codedOutputStream.writeTag(number, 2);
            Iterator it2 = list.iterator();
            int iComputeElementSizeNoTag = 0;
            while (it2.hasNext()) {
                iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it2.next());
            }
            codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElementNoTag(codedOutputStream, liteType, it3.next());
            }
        }
    }

    public void addRepeatedField(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(t10, obj);
        Object field = getField(t10);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put(t10, arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(T t10) {
        this.fields.remove(t10);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    Iterator<Map.Entry<T, Object>> descendingIterator() {
        return this.hasLazyField ? new e0.c(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.fields.equals(((u) obj).fields);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        o1 o1VarCloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            o1VarCloneAllFieldsMap.makeImmutable();
        }
        return o1VarCloneAllFieldsMap;
    }

    public Object getField(T t10) {
        Object obj = this.fields.get(t10);
        return obj instanceof e0 ? ((e0) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i10));
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(T t10, int i10) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(t10);
        if (field != null) {
            return ((List) field).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            iComputeFieldSize += computeFieldSize((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(T t10) {
        if (t10.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(t10) != null;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i10))) {
                return false;
            }
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return this.hasLazyField ? new e0.c(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            if (arrayEntryAt.getValue() instanceof y) {
                ((y) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(u<T> uVar) {
        for (int i10 = 0; i10 < uVar.fields.getNumArrayEntries(); i10++) {
            mergeFromField(uVar.fields.getArrayEntryAt(i10));
        }
        Iterator it = uVar.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    public void setField(T t10, Object obj) {
        if (!t10.isRepeated()) {
            verifyType(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.hasLazyField = true;
        }
        this.fields.put(t10, obj);
    }

    public void setRepeatedField(T t10, int i10, Object obj) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(t10);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(t10, obj);
        ((List) field).set(i10, obj);
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i10), codedOutputStream);
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            writeField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            writeField((c) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    private u() {
        this.fields = o1.newFieldMap(16);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u<T> m204clone() {
        u<T> uVarNewFieldSet = newFieldSet();
        for (int i10 = 0; i10 < this.fields.getNumArrayEntries(); i10++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i10);
            uVarNewFieldSet.setField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            uVarNewFieldSet.setField((c) entry.getKey(), entry.getValue());
        }
        uVarNewFieldSet.hasLazyField = this.hasLazyField;
        return uVarNewFieldSet;
    }

    public int getRepeatedFieldCount(T t10) {
        if (t10.isRepeated()) {
            Object field = getField(t10);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException(ljglrLUdGZhMhQ.neUsVF);
    }

    private u(boolean z10) {
        this(o1.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == x1.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof e0) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (e0) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (s0) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != x1.c.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == x1.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof e0) {
                codedOutputStream.writeRawMessageSetExtension(entry.getKey().getNumber(), ((e0) value).toByteString());
                return;
            } else {
                codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (s0) value);
                return;
            }
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    private u(o1<T, Object> o1Var) {
        this.fields = o1Var;
        makeImmutable();
    }
}
