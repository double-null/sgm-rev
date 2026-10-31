package g4;

import java.math.BigInteger;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15375a;

    public o(Boolean bool) {
        this.f15375a = i4.a.b(bool);
    }

    private static boolean r(o oVar) {
        Object obj = oVar.f15375a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f15375a == null) {
            return oVar.f15375a == null;
        }
        if (r(this) && r(oVar)) {
            return o().longValue() == oVar.o().longValue();
        }
        Object obj2 = this.f15375a;
        if (!(obj2 instanceof Number) || !(oVar.f15375a instanceof Number)) {
            return obj2.equals(oVar.f15375a);
        }
        double dDoubleValue = o().doubleValue();
        double dDoubleValue2 = oVar.o().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f15375a == null) {
            return 31;
        }
        if (r(this)) {
            jDoubleToLongBits = o().longValue();
        } else {
            Object obj = this.f15375a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(o().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean i() {
        return q() ? ((Boolean) this.f15375a).booleanValue() : Boolean.parseBoolean(p());
    }

    public double j() {
        return s() ? o().doubleValue() : Double.parseDouble(p());
    }

    public int l() {
        return s() ? o().intValue() : Integer.parseInt(p());
    }

    public long m() {
        return s() ? o().longValue() : Long.parseLong(p());
    }

    public Number o() {
        Object obj = this.f15375a;
        return obj instanceof String ? new i4.f((String) obj) : (Number) obj;
    }

    public String p() {
        if (s()) {
            return o().toString();
        }
        return q() ? ((Boolean) this.f15375a).toString() : (String) this.f15375a;
    }

    public boolean q() {
        return this.f15375a instanceof Boolean;
    }

    public boolean s() {
        return this.f15375a instanceof Number;
    }

    public boolean t() {
        return this.f15375a instanceof String;
    }

    public o(Number number) {
        this.f15375a = i4.a.b(number);
    }

    public o(String str) {
        this.f15375a = i4.a.b(str);
    }
}
