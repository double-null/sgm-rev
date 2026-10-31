package e1;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: StartupApiFeature.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<o> f13880c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13882b;

    /* JADX INFO: compiled from: StartupApiFeature.java */
    public static class a extends o {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: compiled from: StartupApiFeature.java */
    public static class b extends o {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    o(String str, String str2) {
        this.f13881a = str;
        this.f13882b = str2;
        f13880c.add(this);
    }
}
