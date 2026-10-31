package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i10, int i11) {
        this.zaa = i10;
        this.zab = i11;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        sb2.append("Invalid Size: \"");
        sb2.append(str);
        sb2.append("\"");
        throw new NumberFormatException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i10 = this.zaa;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zab;
    }

    public String toString() {
        int i10 = this.zaa;
        int length = String.valueOf(i10).length();
        int i11 = this.zab;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i11).length());
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return sb2.toString();
    }
}
