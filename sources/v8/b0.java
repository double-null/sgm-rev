package v8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f27241c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27242a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27243b = -1;

    private boolean b(String str) {
        Matcher matcher = f27241c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) x7.l0.i(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) x7.l0.i(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f27242a = i10;
            this.f27243b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f27242a == -1 || this.f27243b == -1) ? false : true;
    }

    public boolean c(u7.v vVar) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            u7.v.a aVarD = vVar.d(i10);
            if (aVarD instanceof j9.e) {
                j9.e eVar = (j9.e) aVarD;
                if ("iTunSMPB".equals(eVar.f20713c) && b(eVar.f20714d)) {
                    return true;
                }
            } else if (aVarD instanceof j9.k) {
                j9.k kVar = (j9.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f20726b) && "iTunSMPB".equals(kVar.f20727c) && b(kVar.f20728d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
