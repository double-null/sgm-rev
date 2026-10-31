package v8;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27387c;

    private n(int i10, int i11, String str) {
        this.f27385a = i10;
        this.f27386b = i11;
        this.f27387c = str;
    }

    public static n a(x7.a0 a0Var) {
        String str;
        a0Var.X(2);
        int iH = a0Var.H();
        int i10 = iH >> 1;
        int iH2 = ((a0Var.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = UyXgnuLGEkgnZE.aZuwGnMxuodkjCV;
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iH2 >= 10 ? "." : ".0");
        sb2.append(iH2);
        return new n(i10, iH2, sb2.toString());
    }
}
