package ca;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<u7.q> f5158b;

    public j(int i10) {
        this(i10, com.google.common.collect.u.H());
    }

    private g0 c(l0.b bVar) {
        return new g0(e(bVar), "video/mp2t");
    }

    private n0 d(l0.b bVar) {
        return new n0(e(bVar), "video/mp2t");
    }

    private List<u7.q> e(l0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f5158b;
        }
        x7.a0 a0Var = new x7.a0(bVar.f5219e);
        List<u7.q> arrayList = this.f5158b;
        while (a0Var.a() > 0) {
            int iH = a0Var.H();
            int iF = a0Var.f() + a0Var.H();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = a0Var.H() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strE = a0Var.E(3);
                    int iH3 = a0Var.H();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bH = (byte) a0Var.H();
                    a0Var.X(1);
                    arrayList.add(new u7.q.b().u0(str).j0(strE).O(i10).g0(z10 ? x7.i.e((bH & 64) != 0) : null).N());
                }
            }
            a0Var.W(iF);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (i10 & this.f5157a) != 0;
    }

    @Override // ca.l0.c
    public SparseArray<l0> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    @Override // ca.l0.c
    public l0 b(int i10, l0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new y(new t(bVar.f5216b, bVar.a(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new y(new r("video/mp2t"));
            }
            if (i10 == 27) {
                if (f(4)) {
                    return null;
                }
                return new y(new p(c(bVar), f(1), f(8), "video/mp2t"));
            }
            if (i10 == 36) {
                return new y(new q(c(bVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new y(new u("video/mp2t"));
            }
            if (i10 == 89) {
                return new y(new l(bVar.f5218d, "video/mp2t"));
            }
            if (i10 == 172) {
                return new y(new f(bVar.f5216b, bVar.a(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new e0(new x("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new y(new k(bVar.f5216b, bVar.a(), 5408, "video/mp2t"));
                }
                switch (i10) {
                    case 15:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new i(false, bVar.f5216b, bVar.a(), "video/mp2t"));
                    case 16:
                        return new y(new o(d(bVar), "video/mp2t"));
                    case 17:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new s(bVar.f5216b, bVar.a(), "video/mp2t"));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case EMPTY_TPAT_ERROR_VALUE:
                                return new y(new c(bVar.f5216b, bVar.a(), "video/mp2t"));
                            case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                if (!f(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case STORE_REGION_CODE_ERROR_VALUE:
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new e0(new x("application/x-scte35", "video/mp2t"));
                                    case INVALID_CONFIG_RESPONSE_VALUE:
                                        return new y(new c(bVar.f5216b, bVar.a(), "video/mp2t"));
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new y(new k(bVar.f5216b, bVar.a(), 4096, "video/mp2t"));
        }
        return new y(new n(d(bVar), "video/mp2t"));
    }

    public j(int i10, List<u7.q> list) {
        this.f5157a = i10;
        this.f5158b = list;
    }
}
