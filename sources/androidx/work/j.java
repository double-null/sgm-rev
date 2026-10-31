package androidx.work;

import java.util.List;

/* JADX INFO: compiled from: InputMerger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3813a = l.f("InputMerger");

    public static j a(String str) {
        try {
            return (j) Class.forName(str).newInstance();
        } catch (Exception e10) {
            l.c().b(f3813a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
