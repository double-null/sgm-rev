package pc;

/* JADX INFO: compiled from: SmartDataConverter.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f24254a = new a();

    @Override // pc.b
    public String a(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        String strM = this.f24254a.m(obj);
        if (strM != null) {
            return strM;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            return str;
        }
    }

    @Override // pc.b
    public Boolean d(Object obj, Boolean bool) {
        if (obj == null) {
            return bool;
        }
        Boolean boolE = this.f24254a.e(obj);
        if (boolE != null) {
            return boolE;
        }
        String strM = this.f24254a.m(obj);
        if (strM == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(strM);
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            return bool;
        }
    }

    @Override // pc.b
    public Integer i(Object obj, Integer num) {
        if (obj == null) {
            return num;
        }
        Integer numG = this.f24254a.g(obj);
        if (numG != null) {
            return numG;
        }
        Double dC = this.f24254a.c(obj);
        if (dC != null) {
            return Integer.valueOf(dC.intValue());
        }
        Float fK = this.f24254a.k(obj);
        if (fK != null) {
            return Integer.valueOf(fK.intValue());
        }
        String strM = this.f24254a.m(obj);
        if (strM != null) {
            try {
                return Integer.valueOf(strM);
            } catch (Exception e10) {
                io.bidmachine.core.a.o(e10);
            }
        }
        return num;
    }

    @Override // pc.b
    public Float j(Object obj, Float f10) {
        if (obj == null) {
            return f10;
        }
        Float fK = this.f24254a.k(obj);
        if (fK != null) {
            return fK;
        }
        Integer numG = this.f24254a.g(obj);
        if (numG != null) {
            return Float.valueOf(numG.floatValue());
        }
        String strM = m(obj);
        if (strM != null) {
            try {
                return Float.valueOf(strM);
            } catch (Exception e10) {
                io.bidmachine.core.a.o(e10);
            }
        }
        return f10;
    }

    @Override // pc.b
    public Double l(Object obj, Double d10) {
        if (obj == null) {
            return d10;
        }
        Double dC = this.f24254a.c(obj);
        if (dC != null) {
            return dC;
        }
        Integer numG = this.f24254a.g(obj);
        if (numG != null) {
            return Double.valueOf(numG.doubleValue());
        }
        String strM = m(obj);
        if (strM != null) {
            try {
                return Double.valueOf(strM);
            } catch (Exception e10) {
                io.bidmachine.core.a.o(e10);
            }
        }
        return d10;
    }
}
