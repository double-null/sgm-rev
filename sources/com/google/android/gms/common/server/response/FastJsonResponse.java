package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FastJsonResponse {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        Object zac(Object obj);

        Object zad(Object obj);
    }

    protected static final Object zaD(Field field, Object obj) {
        return field.zaj() != null ? field.zai(obj) : obj;
    }

    private final void zaE(Field field, Object obj) {
        int i10 = field.zac;
        Object objZah = field.zah(obj);
        String str = field.zae;
        switch (i10) {
            case 0:
                if (objZah != null) {
                    setIntegerInternal(field, str, ((Integer) objZah).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zat(field, str, (BigInteger) objZah);
                return;
            case 2:
                if (objZah != null) {
                    setLongInternal(field, str, ((Long) objZah).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 33);
                sb2.append("Unsupported type for conversion: ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            case 4:
                if (objZah != null) {
                    zay(field, str, ((Double) objZah).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zaA(field, str, (BigDecimal) objZah);
                return;
            case 6:
                if (objZah != null) {
                    setBooleanInternal(field, str, ((Boolean) objZah).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) objZah);
                return;
            case 8:
            case 9:
                if (objZah != null) {
                    setDecodedBytesInternal(field, str, (byte[]) objZah);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb2, Field field, Object obj) {
        int i10 = field.zaa;
        if (i10 == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(JsonUtils.escapeString((String) obj));
            sb2.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58);
            sb2.append("Output field (");
            sb2.append(str);
            sb2.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb2.toString());
        }
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field field, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, Field<?, ?>> getFieldMappings();

    protected Object getFieldValue(Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", str);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(strSubstring).length());
            sb2.append("get");
            sb2.append(upperCase);
            sb2.append(strSubstring);
            return getClass().getMethod(sb2.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    protected abstract Object getValueObject(String str);

    protected boolean isFieldSet(Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(Field<?, ?> field, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(Field<?, ?> field, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(Field<?, ?> field, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaD = zaD(field, getFieldValue(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (objZaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64Utils.encode((byte[]) objZaD));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64Utils.encodeUrlSafe((byte[]) objZaD));
                            sb2.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb2, (HashMap) objZaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                            } else {
                                zaF(sb2, field, objZaD);
                            }
                            break;
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append(com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
        }
        return sb2.toString();
    }

    protected void zaA(Field field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    protected void zaB(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    protected void zaC(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zaa(Field field, int i10) {
        if (field.zaj() != null) {
            zaE(field, Integer.valueOf(i10));
        } else {
            setIntegerInternal(field, field.zae, i10);
        }
    }

    public final void zab(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zas(field, field.zae, arrayList);
        }
    }

    public final void zac(Field field, BigInteger bigInteger) {
        if (field.zaj() != null) {
            zaE(field, bigInteger);
        } else {
            zat(field, field.zae, bigInteger);
        }
    }

    public final void zad(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zau(field, field.zae, arrayList);
        }
    }

    public final void zae(Field field, long j10) {
        if (field.zaj() != null) {
            zaE(field, Long.valueOf(j10));
        } else {
            setLongInternal(field, field.zae, j10);
        }
    }

    public final void zaf(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zav(field, field.zae, arrayList);
        }
    }

    public final void zag(Field field, float f10) {
        if (field.zaj() != null) {
            zaE(field, Float.valueOf(f10));
        } else {
            zaw(field, field.zae, f10);
        }
    }

    public final void zah(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zax(field, field.zae, arrayList);
        }
    }

    public final void zai(Field field, double d10) {
        if (field.zaj() != null) {
            zaE(field, Double.valueOf(d10));
        } else {
            zay(field, field.zae, d10);
        }
    }

    public final void zaj(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public final void zak(Field field, BigDecimal bigDecimal) {
        if (field.zaj() != null) {
            zaE(field, bigDecimal);
        } else {
            zaA(field, field.zae, bigDecimal);
        }
    }

    public final void zal(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaB(field, field.zae, arrayList);
        }
    }

    public final void zam(Field field, boolean z10) {
        if (field.zaj() != null) {
            zaE(field, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(field, field.zae, z10);
        }
    }

    public final void zan(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            zaC(field, field.zae, arrayList);
        }
    }

    public final void zao(Field field, String str) {
        if (field.zaj() != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zap(Field field, ArrayList arrayList) {
        if (field.zaj() != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaq(Field field, byte[] bArr) {
        if (field.zaj() != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zar(Field field, Map map) {
        if (field.zaj() != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    protected void zat(Field field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    protected void zau(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    protected void zav(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    protected void zaw(Field field, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    protected void zax(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    protected void zay(Field field, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    protected void zaz(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    protected void zas(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException(vgmm.ubPJNwjvZCrAdX);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final String zae;
        protected final int zaf;
        protected final Class zag;
        protected final String zah;
        private final int zai;
        private zan zaj;
        private final FieldConverter zak;

        Field(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i10;
            this.zaa = i11;
            this.zab = z10;
            this.zac = i12;
            this.zad = z11;
            this.zae = str;
            this.zaf = i13;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        public static Field<byte[], byte[]> forBase64(String str, int i10) {
            return new Field<>(8, false, 8, false, str, i10, null, null);
        }

        public static Field<Boolean, Boolean> forBoolean(String str, int i10) {
            return new Field<>(6, false, 6, false, str, i10, null, null);
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i10, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i10, cls, null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i10, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i10, cls, null);
        }

        public static Field<Double, Double> forDouble(String str, int i10) {
            return new Field<>(4, false, 4, false, str, i10, null, null);
        }

        public static Field<Float, Float> forFloat(String str, int i10) {
            return new Field<>(3, false, 3, false, str, i10, null, null);
        }

        public static Field<Integer, Integer> forInteger(String str, int i10) {
            return new Field<>(0, false, 0, false, str, i10, null, null);
        }

        public static Field<Long, Long> forLong(String str, int i10) {
            return new Field<>(2, false, 2, false, str, i10, null, null);
        }

        public static Field<String, String> forString(String str, int i10) {
            return new Field<>(7, false, 7, false, str, i10, null, null);
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i10) {
            return new Field<>(10, false, 10, false, str, i10, null, null);
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i10) {
            return new Field<>(7, true, 7, true, str, i10, null, null);
        }

        public static Field withConverter(String str, int i10, FieldConverter<?, ?> fieldConverter, boolean z10) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z10, 0, false, str, i10, null, fieldConverter);
        }

        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zab());
            Class cls = this.zag;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.zai;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i11);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zab(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zae(), i10, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public final Field zaa() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zae());
        }

        final String zab() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean zac() {
            return this.zak != null;
        }

        public final void zad(zan zanVar) {
            this.zaj = zanVar;
        }

        final com.google.android.gms.common.server.converter.zaa zae() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        public final FastJsonResponse zaf() throws IllegalAccessException, InstantiationException {
            Class cls = this.zag;
            Preconditions.checkNotNull(cls);
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            String str = this.zah;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaj, str);
        }

        public final Map zag() {
            String str = this.zah;
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zad(str));
        }

        public final Object zah(Object obj) {
            FieldConverter fieldConverter = this.zak;
            Preconditions.checkNotNull(fieldConverter);
            return Preconditions.checkNotNull(fieldConverter.zad(obj));
        }

        public final Object zai(Object obj) {
            FieldConverter fieldConverter = this.zak;
            Preconditions.checkNotNull(fieldConverter);
            return fieldConverter.zac(obj);
        }

        final /* synthetic */ FieldConverter zaj() {
            return this.zak;
        }

        protected Field(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i10;
            this.zab = z10;
            this.zac = i11;
            this.zad = z11;
            this.zae = str;
            this.zaf = i12;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
