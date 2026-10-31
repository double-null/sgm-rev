package com.google.zxing;

import java.util.Map;
import t4.f;
import t4.h;
import t4.j;
import t4.k;
import t4.l;
import t4.o;
import t4.s;

/* JADX INFO: compiled from: MultiFormatWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: compiled from: MultiFormatWriter.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12497a;

        static {
            int[] iArr = new int[com.google.zxing.a.values().length];
            f12497a = iArr;
            try {
                iArr[com.google.zxing.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12497a[com.google.zxing.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12497a[com.google.zxing.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12497a[com.google.zxing.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12497a[com.google.zxing.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12497a[com.google.zxing.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12497a[com.google.zxing.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12497a[com.google.zxing.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12497a[com.google.zxing.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12497a[com.google.zxing.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12497a[com.google.zxing.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12497a[com.google.zxing.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12497a[com.google.zxing.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.e
    public p4.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<c, ?> map) throws WriterException {
        e kVar;
        switch (a.f12497a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new w4.a();
                break;
            case 6:
                kVar = new f();
                break;
            case 7:
                kVar = new h();
                break;
            case 8:
                kVar = new t4.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new u4.a();
                break;
            case 11:
                kVar = new t4.b();
                break;
            case 12:
                kVar = new r4.a();
                break;
            case 13:
                kVar = new n4.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i10, i11, map);
    }
}
