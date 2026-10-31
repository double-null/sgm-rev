package g8;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: compiled from: FrameworkCryptoConfig.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements a8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15528d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f15529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f15531c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f15528d = z10;
    }

    public l(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public l(UUID uuid, byte[] bArr, boolean z10) {
        this.f15529a = uuid;
        this.f15530b = bArr;
        this.f15531c = z10;
    }
}
