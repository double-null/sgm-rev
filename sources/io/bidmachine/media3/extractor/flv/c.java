package io.bidmachine.media3.extractor.flv;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v8.m;
import x7.a0;

/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class c extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f20038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f20039d;

    public c() {
        super(new m());
        this.f20037b = -9223372036854775807L;
        this.f20038c = new long[0];
        this.f20039d = new long[0];
    }

    private static Boolean g(a0 a0Var) {
        return Boolean.valueOf(a0Var.H() == 1);
    }

    private static Object h(a0 a0Var, int i10) {
        if (i10 == 0) {
            return j(a0Var);
        }
        if (i10 == 1) {
            return g(a0Var);
        }
        if (i10 == 2) {
            return n(a0Var);
        }
        if (i10 == 3) {
            return l(a0Var);
        }
        if (i10 == 8) {
            return k(a0Var);
        }
        if (i10 == 10) {
            return m(a0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(a0Var);
    }

    private static Date i(a0 a0Var) {
        Date date = new Date((long) j(a0Var).doubleValue());
        a0Var.X(2);
        return date;
    }

    private static Double j(a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.A()));
    }

    private static HashMap<String, Object> k(a0 a0Var) {
        int iL = a0Var.L();
        HashMap<String, Object> map = new HashMap<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            String strN = n(a0Var);
            Object objH = h(a0Var, o(a0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap<String, Object> l(a0 a0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(a0Var);
            int iO = o(a0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(a0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList<Object> m(a0 a0Var) {
        int iL = a0Var.L();
        ArrayList<Object> arrayList = new ArrayList<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            Object objH = h(a0Var, o(a0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(a0 a0Var) {
        int iP = a0Var.P();
        int iF = a0Var.f();
        a0Var.X(iP);
        return new String(a0Var.e(), iF, iP);
    }

    private static int o(a0 a0Var) {
        return a0Var.H();
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean b(a0 a0Var) {
        return true;
    }

    @Override // io.bidmachine.media3.extractor.flv.TagPayloadReader
    protected boolean c(a0 a0Var, long j10) {
        if (o(a0Var) != 2 || !"onMetaData".equals(n(a0Var)) || a0Var.a() == 0 || o(a0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(a0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f20037b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f20038c = new long[size];
                this.f20039d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f20038c = new long[0];
                        this.f20039d = new long[0];
                        break;
                    }
                    this.f20038c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f20039d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f20037b;
    }

    public long[] e() {
        return this.f20039d;
    }

    public long[] f() {
        return this.f20038c;
    }
}
