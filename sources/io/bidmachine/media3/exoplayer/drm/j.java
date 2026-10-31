package io.bidmachine.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import io.bidmachine.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.util.List;
import java.util.Map;
import x7.l0;

/* JADX INFO: compiled from: DrmUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: compiled from: DrmUtil.java */
    private static final class a {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static byte[] a(z7.d dVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        z7.n nVar = new z7.n(dVar);
        z7.g gVarA = new z7.g.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        z7.g gVarA2 = gVarA;
        while (true) {
            try {
                z7.e eVar = new z7.e(nVar, gVarA2);
                try {
                    try {
                        byte[] bArrB = t2.a.b(eVar);
                        l0.m(eVar);
                        return bArrB;
                    } catch (HttpDataSource$InvalidResponseCodeException e10) {
                        String strC = c(e10, i10);
                        if (strC == null) {
                            throw e10;
                        }
                        i10++;
                        gVarA2 = gVarA2.a().j(strC).a();
                        l0.m(eVar);
                    }
                } catch (Throwable th) {
                    l0.m(eVar);
                    throw th;
                }
            } catch (Exception e11) {
                throw new MediaDrmCallbackException(gVarA, nVar.p(), nVar.c(), nVar.o(), e11);
            }
        }
    }

    public static int b(Throwable th, int i10) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return l0.b0(l0.c0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (l0.f28136a >= 23 && a.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || d(th)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof UnsupportedDrmException) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (th instanceof KeysExpiredException) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }

    private static String c(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = httpDataSource$InvalidResponseCodeException.f18036d;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = httpDataSource$InvalidResponseCodeException.f18038f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th) {
        return l0.f28136a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th) {
        return l0.f28136a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
