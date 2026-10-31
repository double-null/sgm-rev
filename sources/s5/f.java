package s5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f25254b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f25255a = new ArrayList();

    public List<e> a() {
        return this.f25255a;
    }

    public void b() {
        this.f25255a.clear();
    }
}
