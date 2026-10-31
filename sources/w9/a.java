package w9;

import android.text.TextUtils;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27626e;

    private a(int i10, int i11, int i12, int i13, int i14) {
        this.f27622a = i10;
        this.f27623b = i11;
        this.f27624c = i12;
        this.f27625d = i13;
        this.f27626e = i14;
    }

    public static a a(String str) {
        x7.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strE = com.google.common.base.c.e(strArrSplit[i14].trim());
            strE.hashCode();
            switch (strE) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, strArrSplit.length);
    }
}
