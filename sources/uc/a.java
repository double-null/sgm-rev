package uc;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: Version.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26706c;

    public a(int i10, int i11, int i12) {
        this.f26704a = i10;
        this.f26705b = i11;
        this.f26706c = i12;
    }

    public static a g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i10 < strArrSplit.length) {
                if (i10 == 0) {
                    i11 = Integer.parseInt(strArrSplit[0]);
                } else if (i10 != 1) {
                    i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArrSplit[i10]) : Integer.parseInt(strArrSplit[2]);
                } else {
                    i12 = Integer.parseInt(strArrSplit[1]);
                }
                i10++;
            }
            return new a(i11, i12, i13);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int iCompare = Integer.compare(this.f26704a, aVar.f26704a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f26705b, aVar.f26705b);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.f26706c, aVar.f26706c);
    }

    public boolean b(a aVar) {
        return compareTo(aVar) > 0;
    }

    public boolean c(a aVar) {
        return compareTo(aVar) >= 0;
    }

    public boolean d(a aVar) {
        return compareTo(aVar) < 0;
    }

    public boolean e(a aVar) {
        return compareTo(aVar) <= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26704a == aVar.f26704a && this.f26705b == aVar.f26705b && this.f26706c == aVar.f26706c;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26704a), Integer.valueOf(this.f26705b), Integer.valueOf(this.f26706c));
    }

    public String toString() {
        return this.f26704a + "." + this.f26705b + "." + this.f26706c;
    }
}
