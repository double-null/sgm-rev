package je;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s2 extends j2<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f21007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21008b;

    public s2(short[] bufferWithData) {
        kotlin.jvm.internal.t.f(bufferWithData, "bufferWithData");
        this.f21007a = bufferWithData;
        this.f21008b = bufferWithData.length;
        b(10);
    }

    @Override // je.j2
    public void b(int i10) {
        short[] sArr = this.f21007a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, od.k.d(i10, sArr.length * 2));
            kotlin.jvm.internal.t.e(sArrCopyOf, "copyOf(...)");
            this.f21007a = sArrCopyOf;
        }
    }

    @Override // je.j2
    public int d() {
        return this.f21008b;
    }

    public final void e(short s10) {
        j2.c(this, 0, 1, null);
        short[] sArr = this.f21007a;
        int iD = d();
        this.f21008b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // je.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f21007a, d());
        kotlin.jvm.internal.t.e(sArrCopyOf, yhXxbqGRMeI.jCkWtQ);
        return sArrCopyOf;
    }
}
