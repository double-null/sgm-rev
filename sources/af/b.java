package af;

import com.facebook.appevents.AppEventsConstants;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e.a f331a = new e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f332b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.t.f(a10, "a");
        kotlin.jvm.internal.t.f(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f332b;
    }

    public static final int d(h hVar, int i10) {
        kotlin.jvm.internal.t.f(hVar, "<this>");
        return i10 == f332b ? hVar.F() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        kotlin.jvm.internal.t.f(bArr, "<this>");
        return i10 == f332b ? bArr.length : i10;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short g(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String h(byte b10) {
        return rd.c0.t(new char[]{bf.b.f()[(b10 >> 4) & 15], bf.b.f()[b10 & 15]});
    }

    public static final String i(int i10) {
        if (i10 == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i11 = 0;
        char[] cArr = {bf.b.f()[(i10 >> 28) & 15], bf.b.f()[(i10 >> 24) & 15], bf.b.f()[(i10 >> 20) & 15], bf.b.f()[(i10 >> 16) & 15], bf.b.f()[(i10 >> 12) & 15], bf.b.f()[(i10 >> 8) & 15], bf.b.f()[(i10 >> 4) & 15], bf.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return rd.c0.u(cArr, i11, 8);
    }
}
