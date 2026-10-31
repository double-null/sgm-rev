package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2999a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3000b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3001c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3002d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f3000b;
    }

    public int b() {
        int i10 = this.f3001c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f3002d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f3001c, this.f2999a);
    }

    public int d() {
        return this.f2999a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3000b == audioAttributesImplBase.a() && this.f3001c == audioAttributesImplBase.b() && this.f2999a == audioAttributesImplBase.d() && this.f3002d == audioAttributesImplBase.f3002d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3000b), Integer.valueOf(this.f3001c), Integer.valueOf(this.f2999a), Integer.valueOf(this.f3002d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3002d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3002d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f2999a));
        sb2.append(" content=");
        sb2.append(this.f3000b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3001c).toUpperCase());
        return sb2.toString();
    }
}
