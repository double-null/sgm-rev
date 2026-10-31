package t4;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: compiled from: UPCAWriter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements com.google.zxing.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f25515a = new j();

    @Override // com.google.zxing.e
    public p4.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.c, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.UPC_A) {
            return this.f25515a.a(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), com.google.zxing.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
