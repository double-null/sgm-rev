package com.google.android.gms.internal.measurement;

import com.google.common.base.i;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsp {
    private static final Pattern zza = Pattern.compile("(\\w+).*");

    public static String zza(String str) {
        Matcher matcher = zza.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
    }

    public static String zzb(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(String.valueOf(i.g("+").d(list)));
    }
}
