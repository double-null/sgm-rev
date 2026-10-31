package d3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: KeysMap.java */
/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f13262a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13264c;

    public e(int i10, int i11) {
        this.f13263b = i10;
        this.f13264c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f13264c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f13262a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f13262a.size() >= this.f13263b && !this.f13262a.containsKey(strB)) {
            z2.f.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13263b);
            return false;
        }
        String strC = c(str2, this.f13264c);
        if (com.google.firebase.crashlytics.internal.common.h.z(this.f13262a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f13262a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strB = b(entry.getKey());
            if (this.f13262a.size() < this.f13263b || this.f13262a.containsKey(strB)) {
                String value = entry.getValue();
                this.f13262a.put(strB, value == null ? "" : c(value, this.f13264c));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            z2.f.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f13263b);
        }
    }
}
