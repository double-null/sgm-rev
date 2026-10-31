package i4;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: compiled from: LazilyParsedNumber.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15954a;

    public f(String str) {
        this.f15954a = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f15954a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f15954a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f15954a;
        String str2 = ((f) obj).f15954a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f15954a);
    }

    public int hashCode() {
        return this.f15954a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f15954a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f15954a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f15954a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f15954a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f15954a).longValue();
        }
    }

    public String toString() {
        return this.f15954a;
    }
}
