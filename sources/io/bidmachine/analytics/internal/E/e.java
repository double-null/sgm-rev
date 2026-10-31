package io.bidmachine.analytics.internal.E;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.Closeable;
import java.io.Flushable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.j0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import od.h;
import org.json.JSONArray;
import org.json.JSONObject;
import qd.n;
import rd.f0;
import rd.h0;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f16837a = m.a(a.f16838a);

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16838a = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    private static final SimpleDateFormat a() {
        return (SimpleDateFormat) f16837a.getValue();
    }

    public static final byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes(rd.d.f24999b));
    }

    public static final String c(String str) {
        return Base64.encodeToString(str.getBytes(rd.d.f24999b), 2);
    }

    public static final String d(String str) {
        return e(c(str));
    }

    public static final String e(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iI0 = f0.i0(str, "=", 0, false, 6, null);
        if (iI0 == -1) {
            return h0.h1(str).toString();
        }
        return h0.h1(str.substring(0, iI0)).toString() + str.substring(iI0);
    }

    public static final Object a(Closeable closeable) {
        try {
            r.a aVar = r.f27774b;
            closeable.close();
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public static final String b(String str) {
        return a(e(str));
    }

    public static final Object a(Flushable flushable) {
        try {
            r.a aVar = r.f27774b;
            flushable.flush();
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public static final JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(a((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                r.a aVar = r.f27774b;
                String strValueOf = String.valueOf(key);
                if (strValueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = a((List) value);
                    } else if (value instanceof Map) {
                        value = a((Map) value);
                    }
                    jSONObject.put(strValueOf, value);
                }
                r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(s.a(th));
            }
        }
        return jSONObject;
    }

    public static final Map a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : n.d(jSONObject.keys())) {
            Object objA = a(jSONObject.get(str));
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final List a(JSONArray jSONArray) {
        h hVarN = od.k.n(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = hVarN.iterator();
        while (it.hasNext()) {
            Object objA = a(jSONArray.get(((j0) it).nextInt()));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static final Object a(Object obj) {
        if (t.a(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static final Map a(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object string = bundle.get(str);
            if (!(string instanceof Boolean)) {
                if (string instanceof Byte) {
                    string = Integer.valueOf(((Number) string).byteValue());
                } else if (!(string instanceof Character) && !(string instanceof Double) && !(string instanceof Float) && !(string instanceof Integer) && !(string instanceof Long)) {
                    if (string instanceof Short) {
                        string = Integer.valueOf(((Number) string).shortValue());
                    } else if (!(string instanceof String)) {
                        if (string instanceof Bundle) {
                            string = a((Bundle) string);
                        } else {
                            string = (!(string instanceof CharSequence) && string == null) ? null : string.toString();
                        }
                    }
                }
            }
            if (string != null) {
                linkedHashMap.put(str, string);
            }
        }
        return linkedHashMap;
    }

    public static final boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes(rd.d.f24999b));
    }

    private static final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }

    public static final String a(String str) {
        return new String(Base64.decode(str, 2), rd.d.f24999b);
    }

    public static final String a(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            String str = th.getClass().getName() + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return th.getClass().getName();
    }

    public static final String a(Date date) {
        return a().format(date);
    }
}
