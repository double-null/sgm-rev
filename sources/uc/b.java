package uc;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: VersionRange.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f26708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26710d;

    public b(a aVar, a aVar2, boolean z10, boolean z11) {
        this.f26707a = aVar;
        this.f26708b = aVar2;
        this.f26709c = z10;
        this.f26710d = z11;
    }

    static boolean b(a aVar, a aVar2, boolean z10) {
        return (z10 && aVar2.c(aVar)) || (!z10 && aVar2.b(aVar));
    }

    static boolean c(a aVar, a aVar2, boolean z10) {
        return (z10 && aVar2.e(aVar)) || (!z10 && aVar2.d(aVar));
    }

    public static b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith("[");
            boolean zStartsWith2 = str.startsWith("(");
            if (zStartsWith || zStartsWith2) {
                str = str.substring(1);
            } else {
                zStartsWith = true;
            }
            boolean zEndsWith = str.endsWith("]");
            boolean zEndsWith2 = str.endsWith(")");
            if (zEndsWith || zEndsWith2) {
                str = str.substring(0, str.length() - 1);
            } else {
                zEndsWith = true;
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length >= 2) {
                return new b(a.g(strArrSplit[0]), a.g(strArrSplit[1]), zStartsWith, zEndsWith);
            }
            a aVarG = a.g(str);
            if (aVarG != null) {
                return new b(aVarG, aVarG, zStartsWith, zEndsWith);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(a aVar) {
        a aVar2;
        a aVar3 = this.f26707a;
        if (aVar3 != null && this.f26708b != null && b(aVar3, aVar, this.f26709c) && c(this.f26708b, aVar, this.f26710d)) {
            return true;
        }
        a aVar4 = this.f26707a;
        if (aVar4 != null && this.f26708b == null && b(aVar4, aVar, this.f26709c)) {
            return true;
        }
        if (this.f26707a == null && (aVar2 = this.f26708b) != null && c(aVar2, aVar, this.f26710d)) {
            return true;
        }
        return this.f26707a == null && this.f26708b == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26709c == bVar.f26709c && this.f26710d == bVar.f26710d && Objects.equals(this.f26707a, bVar.f26707a) && Objects.equals(this.f26708b, bVar.f26708b);
    }
}
