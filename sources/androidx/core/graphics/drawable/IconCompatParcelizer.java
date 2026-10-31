package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1838a = versionedParcel.p(iconCompat.f1838a, 1);
        iconCompat.f1840c = versionedParcel.j(iconCompat.f1840c, 2);
        iconCompat.f1841d = versionedParcel.r(iconCompat.f1841d, 3);
        iconCompat.f1842e = versionedParcel.p(iconCompat.f1842e, 4);
        iconCompat.f1843f = versionedParcel.p(iconCompat.f1843f, 5);
        iconCompat.f1844g = (ColorStateList) versionedParcel.r(iconCompat.f1844g, 6);
        iconCompat.f1846i = versionedParcel.t(iconCompat.f1846i, 7);
        iconCompat.f1847j = versionedParcel.t(iconCompat.f1847j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.q(versionedParcel.f());
        int i10 = iconCompat.f1838a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1840c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1841d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f1842e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f1843f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1844g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f1846i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f1847j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
