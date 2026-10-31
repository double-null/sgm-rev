package u7;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f25984g = new e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f25985h = x7.l0.C0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25986i = x7.l0.C0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f25987j = x7.l0.C0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f25988k = x7.l0.C0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f25989l = x7.l0.C0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f25995f;

    /* JADX INFO: compiled from: AudioAttributes.java */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* JADX INFO: renamed from: u7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioAttributes.java */
    private static final class C0440c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f25996a;

        private d(c cVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(cVar.f25990a).setFlags(cVar.f25991b).setUsage(cVar.f25992c);
            int i10 = x7.l0.f28136a;
            if (i10 >= 29) {
                b.a(usage, cVar.f25993d);
            }
            if (i10 >= 32) {
                C0440c.a(usage, cVar.f25994e);
            }
            this.f25996a = usage.build();
        }
    }

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25997a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25998b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25999c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26000d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26001e = 0;

        public c a() {
            return new c(this.f25997a, this.f25998b, this.f25999c, this.f26000d, this.f26001e);
        }
    }

    public d a() {
        if (this.f25995f == null) {
            this.f25995f = new d();
        }
        return this.f25995f;
    }

    public int b() {
        if ((this.f25991b & 1) == 1) {
            return 1;
        }
        switch (this.f25992c) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25990a == cVar.f25990a && this.f25991b == cVar.f25991b && this.f25992c == cVar.f25992c && this.f25993d == cVar.f25993d && this.f25994e == cVar.f25994e;
    }

    public int hashCode() {
        return ((((((((527 + this.f25990a) * 31) + this.f25991b) * 31) + this.f25992c) * 31) + this.f25993d) * 31) + this.f25994e;
    }

    private c(int i10, int i11, int i12, int i13, int i14) {
        this.f25990a = i10;
        this.f25991b = i11;
        this.f25992c = i12;
        this.f25993d = i13;
        this.f25994e = i14;
    }
}
