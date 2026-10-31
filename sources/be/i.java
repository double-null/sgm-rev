package be;

import pb.vBC.NyXuoef;
import ud.s0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f4495c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f4495c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4495c.run();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Task[");
        sb2.append(s0.a(this.f4495c));
        sb2.append('@');
        sb2.append(s0.b(this.f4495c));
        String str = NyXuoef.KHRZtdAY;
        sb2.append(str);
        sb2.append(this.f4493a);
        sb2.append(str);
        sb2.append(j.c(this.f4494b));
        sb2.append(']');
        return sb2.toString();
    }
}
