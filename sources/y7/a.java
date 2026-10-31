package y7;

import com.google.android.gms.internal.ads.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u7.v;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: MdtaMetadataEntry.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f28680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28682d;

    public a(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f28679a = str;
        this.f28680b = bArr;
        this.f28681c = i10;
        this.f28682d = i11;
    }

    private static String e(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        com.google.common.base.i.f(',').b(sb2, list);
        return sb2.toString();
    }

    private static void f(String str, byte[] bArr, int i10) {
        byte b10;
        str.hashCode();
        boolean z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                x7.a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                x7.a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                x7.a.a(z10);
                break;
            case "auxiliary.tracks.map":
                x7.a.a(i10 == 0);
                break;
        }
    }

    public List<Integer> d() {
        x7.a.h(this.f28679a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f28680b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f28680b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28679a.equals(aVar.f28679a) && Arrays.equals(this.f28680b, aVar.f28680b) && this.f28681c == aVar.f28681c && this.f28682d == aVar.f28682d;
    }

    public int hashCode() {
        return ((((((527 + this.f28679a.hashCode()) * 31) + Arrays.hashCode(this.f28680b)) * 31) + this.f28681c) * 31) + this.f28682d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String strE;
        int i10 = this.f28682d;
        if (i10 != 0) {
            if (i10 == 1) {
                strE = l0.H(this.f28680b);
            } else if (i10 == 23) {
                strE = String.valueOf(Float.intBitsToFloat(com.google.common.primitives.f.f(this.f28680b)));
            } else if (i10 == 67) {
                strE = String.valueOf(com.google.common.primitives.f.f(this.f28680b));
            } else if (i10 == 75) {
                strE = String.valueOf(w.a(this.f28680b[0]));
            } else if (i10 != 78) {
                strE = l0.q1(this.f28680b);
            } else {
                strE = String.valueOf(new a0(this.f28680b).O());
            }
        } else if (this.f28679a.equals("auxiliary.tracks.map")) {
            strE = e(d());
        } else {
            strE = l0.q1(this.f28680b);
        }
        return "mdta: key=" + this.f28679a + ", value=" + strE;
    }
}
