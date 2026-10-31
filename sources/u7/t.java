package u7;

import java.util.HashSet;

/* JADX INFO: compiled from: MediaLibraryInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f26434a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f26435b = "media3.common";

    public static synchronized void a(String str) {
        if (f26434a.add(str)) {
            f26435b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f26435b;
    }
}
