package zd;

import kotlin.KotlinNothingValueException;
import ud.g1;
import ud.k2;
import ud.x0;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
final class v extends k2 implements x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f29241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29242d;

    public v(Throwable th, String str) {
        this.f29241c = th;
        this.f29242d = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    private final Void t0() {
        String str;
        if (this.f29241c == null) {
            u.d();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f29242d;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString(), this.f29241c);
    }

    @Override // ud.x0
    public g1 L(long j10, Runnable runnable, zc.j jVar) {
        t0();
        throw new KotlinNothingValueException();
    }

    @Override // ud.k0
    public boolean n0(zc.j jVar) {
        t0();
        throw new KotlinNothingValueException();
    }

    @Override // ud.k2, ud.k0
    public ud.k0 o0(int i10, String str) {
        t0();
        throw new KotlinNothingValueException();
    }

    @Override // ud.k0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public Void m0(zc.j jVar, Runnable runnable) {
        t0();
        throw new KotlinNothingValueException();
    }

    @Override // ud.k2, ud.k0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f29241c != null) {
            str = ", cause=" + this.f29241c;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // ud.x0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Void u(long j10, ud.n<? super wc.g0> nVar) {
        t0();
        throw new KotlinNothingValueException();
    }

    @Override // ud.k2
    public k2 q0() {
        return this;
    }
}
