package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes.dex */
final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f1888a;

    j(Object obj) {
        this.f1888a = (LocaleList) obj;
    }

    @Override // androidx.core.os.i
    public Object a() {
        return this.f1888a;
    }

    public boolean equals(Object obj) {
        return this.f1888a.equals(((i) obj).a());
    }

    @Override // androidx.core.os.i
    public Locale get(int i10) {
        return this.f1888a.get(i10);
    }

    public int hashCode() {
        return this.f1888a.hashCode();
    }

    public String toString() {
        return this.f1888a.toString();
    }
}
