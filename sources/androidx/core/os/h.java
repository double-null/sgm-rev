package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f1886b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1887a;

    /* JADX INFO: compiled from: LocaleListCompat.java */
    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private h(i iVar) {
        this.f1887a = iVar;
    }

    public static h a(Locale... localeArr) {
        return d(a.a(localeArr));
    }

    public static h d(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale b(int i10) {
        return this.f1887a.get(i10);
    }

    public Object c() {
        return this.f1887a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f1887a.equals(((h) obj).f1887a);
    }

    public int hashCode() {
        return this.f1887a.hashCode();
    }

    public String toString() {
        return this.f1887a.toString();
    }
}
