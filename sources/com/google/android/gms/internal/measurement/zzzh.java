package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzzh {
    static final Locale zza = Locale.ROOT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    public static String zza(Object obj) {
        if (obj == 0) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                obj = string != null ? string : zzf(obj, "toString() returned null");
            } else if (obj instanceof int[]) {
                obj = Arrays.toString((int[]) obj);
            } else if (obj instanceof long[]) {
                obj = Arrays.toString((long[]) obj);
            } else if (obj instanceof byte[]) {
                obj = Arrays.toString((byte[]) obj);
            } else if (obj instanceof char[]) {
                obj = Arrays.toString((char[]) obj);
            } else if (obj instanceof short[]) {
                obj = Arrays.toString((short[]) obj);
            } else if (obj instanceof float[]) {
                obj = Arrays.toString((float[]) obj);
            } else if (obj instanceof double[]) {
                obj = Arrays.toString((double[]) obj);
            } else {
                obj = obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            return obj;
        } catch (RuntimeException e10) {
            return zze(obj, e10);
        }
    }

    public static void zzb(Formattable formattable, StringBuilder sb2, zzza zzzaVar) {
        int iZzj = zzzaVar.zzj() & 162;
        if (iZzj != 0) {
            iZzj = ((iZzj & 32) != 0 ? 1 : 0) | ((iZzj & 128) != 0 ? 2 : 0) | ((iZzj & 2) != 0 ? 4 : 0);
        }
        int length = sb2.length();
        Formatter formatter = new Formatter(sb2, zza);
        try {
            formattable.formatTo(formatter, iZzj, zzzaVar.zzf(), zzzaVar.zzg());
        } catch (RuntimeException e10) {
            sb2.setLength(length);
            try {
                formatter.out().append(zze(formattable, e10));
            } catch (IOException unused) {
            }
        }
    }

    static void zzc(StringBuilder sb2, Number number, zzza zzzaVar) {
        boolean zZzk = zzzaVar.zzk();
        long jLongValue = number.longValue();
        if (number instanceof Long) {
            zzd(sb2, jLongValue, zZzk);
            return;
        }
        if (number instanceof Integer) {
            zzd(sb2, jLongValue & 4294967295L, zZzk);
            return;
        }
        if (number instanceof Byte) {
            zzd(sb2, jLongValue & 255, zZzk);
            return;
        }
        if (number instanceof Short) {
            zzd(sb2, jLongValue & WebSocketProtocol.PAYLOAD_SHORT_MAX, zZzk);
        } else {
            if (!(number instanceof BigInteger)) {
                throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
            }
            String string = ((BigInteger) number).toString(16);
            if (zZzk) {
                string = string.toUpperCase(zza);
            }
            sb2.append(string);
        }
    }

    private static void zzd(StringBuilder sb2, long j10, boolean z10) {
        if (j10 == 0) {
            sb2.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            return;
        }
        String str = true != z10 ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j10)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb2.append(str.charAt((int) ((j10 >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static String zze(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
        }
        return zzf(obj, simpleName);
    }

    private static String zzf(Object obj, String str) {
        String name = obj.getClass().getName();
        int iIdentityHashCode = System.identityHashCode(obj);
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(iIdentityHashCode).length() + 2 + String.valueOf(str).length() + 1);
        sb2.append("{");
        sb2.append(name);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        sb2.append(": ");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
