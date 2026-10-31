package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f12680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f12681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12682c;

    public b(int i10, int i11, int i12) {
        this.f12680a = i10;
        this.f12681b = i11;
        this.f12682c = i12;
    }

    public static b a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", 128).versionName;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            return new b(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException | NullPointerException | NumberFormatException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12680a == bVar.f12680a && this.f12681b == bVar.f12681b && this.f12682c == bVar.f12682c;
    }

    public final int hashCode() {
        return (((this.f12680a * 31) + this.f12681b) * 31) + this.f12682c;
    }
}
