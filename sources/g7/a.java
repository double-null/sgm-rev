package g7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import com.vungle.ads.internal.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15389a = Color.parseColor("#B4FFFFFF");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15390b = Color.parseColor("#5c000000");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15391c = Color.parseColor("#52000000");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f15392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f15393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f15394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f15395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f15396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f15397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f15398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f15399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f15400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n f15401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f15402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f15403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n f15404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n f15405q;

    static {
        n nVar = new n();
        f15392d = nVar;
        nVar.p0(5);
        nVar.z0(48);
        Float fValueOf = Float.valueOf(2.0f);
        nVar.x0(fValueOf);
        nVar.y0("cross");
        nVar.q0(8, 8, 8, 8);
        Float fValueOf2 = Float.valueOf(30.0f);
        nVar.B0(fValueOf2);
        nVar.n0(fValueOf2);
        Float fValueOf3 = Float.valueOf(3.0f);
        nVar.o0(fValueOf3);
        n nVar2 = new n();
        f15393e = nVar2;
        nVar2.p0(5);
        nVar2.z0(48);
        nVar2.x0(fValueOf);
        nVar2.y0("skip");
        nVar2.q0(8, 8, 8, 8);
        nVar2.B0(fValueOf2);
        nVar2.n0(fValueOf2);
        nVar2.o0(fValueOf3);
        n nVar3 = new n();
        f15396h = nVar3;
        nVar3.p0(5);
        nVar3.z0(48);
        nVar3.x0(fValueOf);
        nVar3.y0("circular");
        nVar3.q0(8, 8, 8, 8);
        nVar3.B0(fValueOf2);
        nVar3.n0(fValueOf2);
        nVar3.m0(1);
        nVar3.o0(fValueOf3);
        n nVar4 = new n();
        f15397i = nVar4;
        nVar4.p0(5);
        nVar4.z0(48);
        Float fValueOf4 = Float.valueOf(16.0f);
        nVar4.l0(fValueOf4);
        nVar4.x0(fValueOf);
        nVar4.u0(12, 2, 12, 2);
        nVar4.j0("%1.0f%");
        nVar4.y0("text");
        nVar4.q0(8, 8, 8, 8);
        nVar4.m0(1);
        nVar4.o0(fValueOf3);
        n nVar5 = new n();
        f15395g = nVar5;
        nVar5.p0(3);
        nVar5.z0(48);
        nVar5.x0(fValueOf);
        nVar5.q0(8, 8, 8, 8);
        nVar5.B0(fValueOf2);
        nVar5.n0(fValueOf2);
        nVar5.o0(fValueOf3);
        n nVar6 = new n();
        f15394f = nVar6;
        nVar6.p0(17);
        nVar6.z0(48);
        nVar6.x0(fValueOf);
        nVar6.q0(8, 8, 8, 8);
        nVar6.B0(fValueOf2);
        nVar6.n0(fValueOf2);
        nVar6.A0(Boolean.FALSE);
        nVar6.o0(fValueOf3);
        n nVar7 = new n();
        f15402n = nVar7;
        nVar7.p0(17);
        nVar7.z0(80);
        nVar7.k0(0);
        nVar7.x0(fValueOf3);
        nVar7.B0(-1);
        nVar7.n0(3);
        nVar7.y0("linear");
        nVar7.o0(fValueOf3);
        n nVar8 = new n();
        f15401m = nVar8;
        nVar8.p0(17);
        nVar8.z0(80);
        nVar8.l0(fValueOf4);
        nVar8.x0(fValueOf);
        nVar8.u0(12, 2, 12, 2);
        nVar8.j0("%1.0f%");
        nVar8.y0("text");
        nVar8.q0(3, 3, 3, 3);
        nVar8.m0(1);
        nVar8.o0(fValueOf3);
        n nVar9 = new n();
        f15403o = nVar9;
        nVar9.p0(17);
        nVar9.z0(80);
        nVar9.x0(fValueOf);
        nVar9.t0(Boolean.TRUE);
        nVar9.y0("circular");
        nVar9.q0(8, 8, 8, 8);
        nVar9.B0(fValueOf2);
        nVar9.n0(fValueOf2);
        nVar9.m0(1);
        nVar9.o0(fValueOf3);
        n nVar10 = new n();
        f15398j = nVar10;
        nVar10.p0(5);
        nVar10.z0(80);
        nVar10.l0(fValueOf4);
        nVar10.x0(fValueOf);
        nVar10.u0(16, 6, 16, 6);
        nVar10.y0("text");
        nVar10.q0(3, 3, 3, 3);
        nVar10.m0(1);
        nVar10.o0(fValueOf3);
        n nVar11 = new n();
        f15399k = nVar11;
        nVar11.p0(17);
        nVar11.z0(80);
        nVar11.k0(0);
        nVar11.q0(3, 3, 3, 3);
        n nVar12 = new n(nVar11);
        f15400l = nVar12;
        nVar12.q0(0, 0, 0, 0);
        n nVar13 = new n();
        f15404p = nVar13;
        nVar13.p0(1);
        nVar13.z0(16);
        nVar13.u0(8, 8, 8, 8);
        nVar13.x0(fValueOf3);
        nVar13.B0(48);
        nVar13.n0(48);
        n nVar14 = new n();
        f15405q = nVar14;
        nVar14.p0(3);
        nVar14.z0(48);
        nVar14.k0(-16777216);
        nVar14.y0(Constants.TEMPLATE_TYPE_FULLSCREEN);
    }

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static n b(Context context, n nVar) {
        if (nVar == null || !("crossfill".equals(nVar.K()) || "skipfill".equals(nVar.K()))) {
            return f15392d;
        }
        n nVar2 = new n();
        nVar2.t0(Boolean.TRUE);
        return f15392d.g(nVar2);
    }
}
