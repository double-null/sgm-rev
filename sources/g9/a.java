package g9;

import java.util.Arrays;
import java.util.Objects;
import u7.q;
import u7.v;

/* JADX INFO: compiled from: EventMessage.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final q f15534g = new q.b().u0("application/id3").N();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final q f15535h = new q.b().u0("application/x-scte35").N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f15540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15541f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f15536a = str;
        this.f15537b = str2;
        this.f15538c = j10;
        this.f15539d = j11;
        this.f15540e = bArr;
    }

    @Override // u7.v.a
    public q a() {
        String str = this.f15536a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f15535h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f15534g;
            default:
                return null;
        }
    }

    @Override // u7.v.a
    public byte[] c() {
        if (a() != null) {
            return this.f15540e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15538c == aVar.f15538c && this.f15539d == aVar.f15539d && Objects.equals(this.f15536a, aVar.f15536a) && Objects.equals(this.f15537b, aVar.f15537b) && Arrays.equals(this.f15540e, aVar.f15540e);
    }

    public int hashCode() {
        if (this.f15541f == 0) {
            String str = this.f15536a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f15537b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f15538c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f15539d;
            this.f15541f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f15540e);
        }
        return this.f15541f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f15536a + ", id=" + this.f15539d + ", durationMs=" + this.f15538c + ", value=" + this.f15537b;
    }
}
