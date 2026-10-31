package h8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u7.v;

/* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f15729c;

    /* JADX INFO: compiled from: HlsTrackMetadataEntry.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f15733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f15734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f15735f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f15730a = i10;
            this.f15731b = i11;
            this.f15732c = str;
            this.f15733d = str2;
            this.f15734e = str3;
            this.f15735f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15730a == aVar.f15730a && this.f15731b == aVar.f15731b && TextUtils.equals(this.f15732c, aVar.f15732c) && TextUtils.equals(this.f15733d, aVar.f15733d) && TextUtils.equals(this.f15734e, aVar.f15734e) && TextUtils.equals(this.f15735f, aVar.f15735f);
        }

        public int hashCode() {
            int i10 = ((this.f15730a * 31) + this.f15731b) * 31;
            String str = this.f15732c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f15733d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f15734e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f15735f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List<a> list) {
        this.f15727a = str;
        this.f15728b = str2;
        this.f15729c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return TextUtils.equals(this.f15727a, hVar.f15727a) && TextUtils.equals(this.f15728b, hVar.f15728b) && this.f15729c.equals(hVar.f15729c);
    }

    public int hashCode() {
        String str = this.f15727a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15728b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f15729c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f15727a != null) {
            str = " [" + this.f15727a + ", " + this.f15728b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
