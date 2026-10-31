package e5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f14474b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f14475a = new ArrayList();

    public List<e> a() {
        return this.f14475a;
    }

    public void b() {
        this.f14475a.clear();
    }
}
