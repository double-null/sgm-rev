package ib;

import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16225a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f16226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f16227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f16228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f16229d;

        public a(Integer num, float f10, float f11, float f12) {
            this.f16226a = num;
            this.f16227b = f10;
            this.f16228c = f11;
            this.f16229d = f12;
        }

        public final float a() {
            return this.f16227b;
        }

        public final Integer b() {
            return this.f16226a;
        }

        public final float c() {
            return this.f16229d;
        }

        public final float d() {
            return this.f16228c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f16226a, aVar.f16226a) && Float.compare(this.f16227b, aVar.f16227b) == 0 && Float.compare(this.f16228c, aVar.f16228c) == 0 && Float.compare(this.f16229d, aVar.f16229d) == 0;
        }

        public int hashCode() {
            Integer num = this.f16226a;
            return ((((((num == null ? 0 : num.hashCode()) * 31) + Float.hashCode(this.f16227b)) * 31) + Float.hashCode(this.f16228c)) * 31) + Float.hashCode(this.f16229d);
        }

        public String toString() {
            return "Config(backgroundColor=" + this.f16226a + ", alphaThreshold=" + this.f16227b + ", tolerance=" + this.f16228c + ", brightnessThreshold=" + this.f16229d + ')';
        }
    }

    public c(a config) {
        t.f(config, "config");
        this.f16225a = config;
    }

    public final boolean a(int i10, boolean z10) {
        return !(z10 && this.f16225a.b() == null) ? this.f16225a.b() == null ? wb.e.f27687a.h(i10) < this.f16225a.c() : wb.e.f27687a.i(i10, this.f16225a.b().intValue()) <= this.f16225a.d() : wb.e.f27687a.b(i10) <= this.f16225a.a();
    }
}
