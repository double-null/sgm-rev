package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Data.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3658b = l.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3659c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Object> f3660a;

    /* JADX INFO: compiled from: Data.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f3661a = new HashMap();

        public e a() throws Throwable {
            e eVar = new e((Map<String, ?>) this.f3661a);
            e.k(eVar);
            return eVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f3661a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f3661a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f3661a.put(str, e.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f3661a.put(str, e.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f3661a.put(str, e.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f3661a.put(str, e.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f3661a.put(str, e.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f3661a.put(str, e.c((double[]) obj));
                }
            }
            return this;
        }

        public a c(e eVar) {
            d(eVar.f3660a);
            return this;
        }

        public a d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.f3661a.put(str, str2);
            return this;
        }
    }

    e() {
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static e g(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e10;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(f3658b, "Error in Data#fromByteArray: ", e11);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e10 = e12;
                        Log.e(f3658b, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                Log.e(f3658b, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        Log.e(f3658b, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e15) {
                            Log.e(f3658b, "Error in Data#fromByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f3658b, "Error in Data#fromByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th3 = e;
                objectInputStream = null;
                e10 = th3;
                Log.e(f3658b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new e(map);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th4 = e;
                objectInputStream = null;
                e10 = th4;
                Log.e(f3658b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new e(map);
            } catch (Throwable th5) {
                th = th5;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e19) {
            Log.e(f3658b, "Error in Data#fromByteArray: ", e19);
        }
        return new e(map);
    }

    public static byte[] k(e eVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(eVar.j());
                    for (Map.Entry<String, Object> entry : eVar.f3660a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f3658b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f3658b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f3658b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f3658b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f3658b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f3658b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f3658b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> setKeySet = this.f3660a.keySet();
        if (!setKeySet.equals(eVar.f3660a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f3660a.get(str);
            Object obj3 = eVar.f3660a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Object> h() {
        return Collections.unmodifiableMap(this.f3660a);
    }

    public int hashCode() {
        return this.f3660a.hashCode() * 31;
    }

    public String i(String str) {
        Object obj = this.f3660a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int j() {
        return this.f3660a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f3660a.isEmpty()) {
            for (String str : this.f3660a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f3660a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public e(e eVar) {
        this.f3660a = new HashMap(eVar.f3660a);
    }

    public e(Map<String, ?> map) {
        this.f3660a = new HashMap(map);
    }
}
