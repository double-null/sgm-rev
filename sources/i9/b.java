package i9;

import com.facebook.appevents.AppEventsConstants;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import u7.u;
import u7.v;
import x7.r;

/* JADX INFO: compiled from: IcyHeaders.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16113f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        x7.a.a(i11 == -1 || i11 > 0);
        this.f16108a = i10;
        this.f16109b = str;
        this.f16110c = str2;
        this.f16111d = str3;
        this.f16112e = z10;
        this.f16113f = i11;
    }

    public static b d(Map<String, List<String>> map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        r.h("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        r.h("IcyHeaders", "Invalid bitrate header: " + str4);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals(AppEventsConstants.EVENT_PARAM_VALUE_YES);
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        r.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        r.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z10) {
            return new b(i10, str, str2, str3, zEquals, i12);
        }
        return null;
    }

    @Override // u7.v.a
    public void b(u.b bVar) {
        String str = this.f16110c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f16109b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16108a == bVar.f16108a && Objects.equals(this.f16109b, bVar.f16109b) && Objects.equals(this.f16110c, bVar.f16110c) && Objects.equals(this.f16111d, bVar.f16111d) && this.f16112e == bVar.f16112e && this.f16113f == bVar.f16113f;
    }

    public int hashCode() {
        int i10 = (527 + this.f16108a) * 31;
        String str = this.f16109b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16110c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16111d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f16112e ? 1 : 0)) * 31) + this.f16113f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f16110c + "\", genre=\"" + this.f16109b + "\", bitrate=" + this.f16108a + ", metadataInterval=" + this.f16113f;
    }
}
