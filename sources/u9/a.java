package u9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.u;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;
import x7.z;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f26633h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f26634i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f26635j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f26636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f26637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Canvas f26638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f26639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0441a f26640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f26641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f26642g;

    /* JADX INFO: renamed from: u9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    private static final class C0441a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f26644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f26645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f26646d;

        public C0441a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f26643a = i10;
            this.f26644b = iArr;
            this.f26645c = iArr2;
            this.f26646d = iArr3;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26652f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f26647a = i10;
            this.f26648b = i11;
            this.f26649c = i12;
            this.f26650d = i13;
            this.f26651e = i14;
            this.f26652f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f26655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f26656d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f26653a = i10;
            this.f26654b = z10;
            this.f26655c = bArr;
            this.f26656d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f26660d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f26657a = i10;
            this.f26658b = i11;
            this.f26659c = i12;
            this.f26660d = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26662b;

        public e(int i10, int i11) {
            this.f26661a = i10;
            this.f26662b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f26669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f26670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f26671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f26672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f26673k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f26663a = i10;
            this.f26664b = z10;
            this.f26665c = i11;
            this.f26666d = i12;
            this.f26667e = i13;
            this.f26668f = i14;
            this.f26669g = i15;
            this.f26670h = i16;
            this.f26671i = i17;
            this.f26672j = i18;
            this.f26673k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f26673k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f26673k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26679f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f26674a = i10;
            this.f26675b = i11;
            this.f26676c = i12;
            this.f26677d = i13;
            this.f26678e = i14;
            this.f26679f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f26682c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C0441a> f26683d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f26684e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C0441a> f26685f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f26686g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f26687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f26688i;

        public h(int i10, int i11) {
            this.f26680a = i10;
            this.f26681b = i11;
        }

        public void a() {
            this.f26682c.clear();
            this.f26683d.clear();
            this.f26684e.clear();
            this.f26685f.clear();
            this.f26686g.clear();
            this.f26687h = null;
            this.f26688i = null;
        }
    }

    public a(List<byte[]> list) {
        a0 a0Var = new a0(list.get(0));
        int iP = a0Var.P();
        int iP2 = a0Var.P();
        Paint paint = new Paint();
        this.f26636a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f26637b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f26638c = new Canvas();
        this.f26639d = new b(719, 575, 0, 719, 0, 575);
        this.f26640e = new C0441a(0, e(), f(), g());
        this.f26641f = new h(iP, iP2);
    }

    private static byte[] d(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = h(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = h(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int i(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH3 = zVar.h(2);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else {
                if (zVar.g()) {
                    iH = zVar.h(3) + 3;
                    iH2 = zVar.h(2);
                } else {
                    if (zVar.g()) {
                        i12 = 1;
                    } else {
                        int iH4 = zVar.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = zVar.h(4) + 12;
                            iH2 = zVar.h(2);
                        } else if (iH4 != 3) {
                            z10 = z10;
                        } else {
                            iH = zVar.h(8) + 29;
                            iH2 = zVar.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int j(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12;
        int iH;
        int iH2;
        int i13 = i10;
        boolean z10 = false;
        while (true) {
            int iH3 = zVar.h(4);
            if (iH3 != 0) {
                z10 = z10;
                i12 = 1;
            } else if (zVar.g()) {
                if (zVar.g()) {
                    int iH4 = zVar.h(2);
                    if (iH4 == 0) {
                        i12 = 1;
                    } else if (iH4 == 1) {
                        i12 = 2;
                    } else if (iH4 == 2) {
                        iH = zVar.h(4) + 9;
                        iH2 = zVar.h(4);
                    } else if (iH4 != 3) {
                        z10 = z10;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = zVar.h(8) + 25;
                        iH2 = zVar.h(4);
                    }
                    iH3 = 0;
                } else {
                    iH = zVar.h(2) + 4;
                    iH2 = zVar.h(4);
                }
                z10 = z10;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = zVar.h(3);
                if (iH5 != 0) {
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z10 = z10;
        }
    }

    private static int k(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int iH2 = zVar.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (zVar.g()) {
                z10 = z11;
                iH = zVar.h(7);
                iH2 = zVar.h(8);
            } else {
                int iH3 = zVar.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i12, i11, i12 + iH, i11 + 1, paint);
            }
            i12 += iH;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        z zVar = new z(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        byte[] bArrD3 = null;
        while (zVar.b() != 0) {
            int iH = zVar.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArrD3 == null ? f26633h : bArrD3;
                            } else {
                                bArr2 = null;
                            }
                            i13 = i(zVar, iArr, bArr2, i13, i14, paint, canvas);
                            zVar.c();
                        } else {
                            bArr3 = bArrD == null ? f26634i : bArrD;
                        }
                        bArr2 = bArr3;
                        i13 = i(zVar, iArr, bArr2, i13, i14, paint, canvas);
                        zVar.c();
                        break;
                    case 17:
                        i13 = j(zVar, iArr, i10 == 3 ? bArrD2 == null ? f26635j : bArrD2 : null, i13, i14, paint, canvas);
                        zVar.c();
                        break;
                    case 18:
                        i13 = k(zVar, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrD3 = d(4, 4, zVar);
                                break;
                            case 33:
                                bArrD = d(4, 8, zVar);
                                break;
                            case 34:
                                bArrD2 = d(16, 8, zVar);
                                break;
                        }
                        break;
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void m(c cVar, C0441a c0441a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = c0441a.f26646d;
        } else {
            iArr = i10 == 2 ? c0441a.f26645c : c0441a.f26644b;
        }
        int[] iArr2 = iArr;
        l(cVar.f26655c, iArr2, i10, i11, i12, paint, canvas);
        l(cVar.f26656d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private s9.e n(z zVar) {
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            t(zVar, this.f26641f);
        }
        h hVar = this.f26641f;
        d dVar = hVar.f26688i;
        if (dVar == null) {
            return new s9.e(u.H(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f26687h;
        if (bVar == null) {
            bVar = this.f26639d;
        }
        Bitmap bitmap = this.f26642g;
        if (bitmap == null || bVar.f26647a + 1 != bitmap.getWidth() || bVar.f26648b + 1 != this.f26642g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f26647a + 1, bVar.f26648b + 1, Bitmap.Config.ARGB_8888);
            this.f26642g = bitmapCreateBitmap;
            this.f26638c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.f26660d;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            this.f26638c.save();
            e eVarValueAt = sparseArray.valueAt(i10);
            f fVar = this.f26641f.f26682c.get(sparseArray.keyAt(i10));
            int i11 = eVarValueAt.f26661a + bVar.f26649c;
            int i12 = eVarValueAt.f26662b + bVar.f26651e;
            this.f26638c.clipRect(i11, i12, Math.min(fVar.f26665c + i11, bVar.f26650d), Math.min(fVar.f26666d + i12, bVar.f26652f));
            C0441a c0441a = this.f26641f.f26683d.get(fVar.f26669g);
            if (c0441a == null && (c0441a = this.f26641f.f26685f.get(fVar.f26669g)) == null) {
                c0441a = this.f26640e;
            }
            int i13 = 0;
            for (SparseArray<g> sparseArray2 = fVar.f26673k; i13 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i13);
                g gVarValueAt = sparseArray2.valueAt(i13);
                c cVar = this.f26641f.f26684e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f26641f.f26686g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    m(cVar2, c0441a, fVar.f26668f, gVarValueAt.f26676c + i11, i12 + gVarValueAt.f26677d, cVar2.f26654b ? null : this.f26636a, this.f26638c);
                }
                i13++;
            }
            if (fVar.f26664b) {
                int i14 = fVar.f26668f;
                this.f26637b.setColor(i14 == 3 ? c0441a.f26646d[fVar.f26670h] : i14 == 2 ? c0441a.f26645c[fVar.f26671i] : c0441a.f26644b[fVar.f26672j]);
                this.f26638c.drawRect(i11, i12, fVar.f26665c + i11, fVar.f26666d + i12, this.f26637b);
            }
            arrayList.add(new w7.a.b().f(Bitmap.createBitmap(this.f26642g, i11, i12, fVar.f26665c, fVar.f26666d)).k(i11 / bVar.f26647a).l(0).h(i12 / bVar.f26648b, 0).i(0).n(fVar.f26665c / bVar.f26647a).g(fVar.f26666d / bVar.f26648b).a());
            this.f26638c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f26638c.restore();
        }
        return new s9.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0441a o(z zVar, int i10) {
        int[] iArr;
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = zVar.h(8);
        zVar.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i14 > 0) {
            int iH6 = zVar.h(i12);
            int iH7 = zVar.h(i12);
            int i15 = i14 - 2;
            if ((iH7 & 128) != 0) {
                iArr = iArrE;
            } else {
                iArr = (iH7 & 64) != 0 ? iArrF : iArrG;
            }
            if ((iH7 & 1) != 0) {
                iH3 = zVar.h(i12);
                iH4 = zVar.h(i12);
                iH = zVar.h(i12);
                iH2 = zVar.h(i12);
                i11 = i15 - 4;
            } else {
                int iH8 = zVar.h(6) << i13;
                int iH9 = zVar.h(4) << 4;
                iH = zVar.h(4) << 4;
                i11 = i15 - 2;
                iH2 = zVar.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = h((byte) (255 - (iH2 & 255)), l0.p((int) (d10 + (1.402d * d11)), 0, 255), l0.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), l0.p((int) (d10 + (d12 * 1.772d)), 0, 255));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0441a(iH5, iArrE, iArrF, iArrG);
    }

    private static b p(z zVar) {
        int i10;
        int i11;
        int i12;
        int iH;
        zVar.r(4);
        boolean zG = zVar.g();
        zVar.r(3);
        int iH2 = zVar.h(16);
        int iH3 = zVar.h(16);
        if (zG) {
            int iH4 = zVar.h(16);
            int iH5 = zVar.h(16);
            int iH6 = zVar.h(16);
            iH = zVar.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    private static c q(z zVar) {
        byte[] bArr;
        int iH = zVar.h(16);
        zVar.r(4);
        int iH2 = zVar.h(2);
        boolean zG = zVar.g();
        zVar.r(1);
        byte[] bArr2 = l0.f28141f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = zVar.h(16);
                int iH4 = zVar.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    zVar.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    zVar.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        zVar.r(zVar.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(z zVar, int i10) {
        int iH = zVar.h(8);
        int iH2 = zVar.h(4);
        int iH3 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(z zVar, int i10) {
        int iH;
        int iH2;
        int iH3 = zVar.h(8);
        zVar.r(4);
        boolean zG = zVar.g();
        zVar.r(3);
        int i11 = 16;
        int iH4 = zVar.h(16);
        int iH5 = zVar.h(16);
        int iH6 = zVar.h(3);
        int iH7 = zVar.h(3);
        int i12 = 2;
        zVar.r(2);
        int iH8 = zVar.h(8);
        int iH9 = zVar.h(8);
        int iH10 = zVar.h(4);
        int iH11 = zVar.h(2);
        zVar.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int iH12 = zVar.h(i11);
            int iH13 = zVar.h(i12);
            int iH14 = zVar.h(i12);
            int iH15 = zVar.h(12);
            int i14 = iH11;
            zVar.r(4);
            int iH16 = zVar.h(12);
            i13 -= 6;
            if (iH13 == 1 || iH13 == 2) {
                i13 -= 2;
                iH = zVar.h(8);
                iH2 = zVar.h(8);
            } else {
                iH = 0;
                iH2 = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH, iH2));
            iH11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(z zVar, h hVar) {
        f fVar;
        int iH = zVar.h(8);
        int iH2 = zVar.h(16);
        int iH3 = zVar.h(16);
        int iD = zVar.d() + iH3;
        if (iH3 * 8 > zVar.b()) {
            x7.r.h("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f26680a) {
                    d dVar = hVar.f26688i;
                    d dVarR = r(zVar, iH3);
                    if (dVarR.f26659c != 0) {
                        hVar.f26688i = dVarR;
                        hVar.f26682c.clear();
                        hVar.f26683d.clear();
                        hVar.f26684e.clear();
                    } else if (dVar != null && dVar.f26658b != dVarR.f26658b) {
                        hVar.f26688i = dVarR;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f26688i;
                if (iH2 == hVar.f26680a && dVar2 != null) {
                    f fVarS = s(zVar, iH3);
                    if (dVar2.f26659c == 0 && (fVar = hVar.f26682c.get(fVarS.f26663a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f26682c.put(fVarS.f26663a, fVarS);
                }
                break;
            case 18:
                if (iH2 == hVar.f26680a) {
                    C0441a c0441aO = o(zVar, iH3);
                    hVar.f26683d.put(c0441aO.f26643a, c0441aO);
                } else if (iH2 == hVar.f26681b) {
                    C0441a c0441aO2 = o(zVar, iH3);
                    hVar.f26685f.put(c0441aO2.f26643a, c0441aO2);
                }
                break;
            case 19:
                if (iH2 == hVar.f26680a) {
                    c cVarQ = q(zVar);
                    hVar.f26684e.put(cVarQ.f26653a, cVarQ);
                } else if (iH2 == hVar.f26681b) {
                    c cVarQ2 = q(zVar);
                    hVar.f26686g.put(cVarQ2.f26653a, cVarQ2);
                }
                break;
            case 20:
                if (iH2 == hVar.f26680a) {
                    hVar.f26687h = p(zVar);
                }
                break;
        }
        zVar.s(iD - zVar.d());
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<s9.e> lVar) {
        z zVar = new z(bArr, i11 + i10);
        zVar.p(i10);
        lVar.accept(n(zVar));
    }

    @Override // s9.r
    public int c() {
        return 2;
    }

    @Override // s9.r
    public void reset() {
        this.f26641f.a();
    }
}
