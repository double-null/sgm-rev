package ib;

import android.graphics.Rect;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16215a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f16218c;

        public a(int i10, int i11, d samplingStrategy) {
            t.f(samplingStrategy, "samplingStrategy");
            this.f16216a = i10;
            this.f16217b = i11;
            this.f16218c = samplingStrategy;
        }

        public final int b(Rect rect) {
            t.f(rect, "rect");
            return this.f16218c.a(rect.width(), rect.height(), this.f16217b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16216a == aVar.f16216a && this.f16217b == aVar.f16217b && t.a(this.f16218c, aVar.f16218c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f16216a) * 31) + Integer.hashCode(this.f16217b)) * 31) + this.f16218c.hashCode();
        }

        public final int a(Rect rect) {
            t.f(rect, GEmOVMyH.soJAdUImHZPzWf);
            return this.f16218c.a(rect.width(), rect.height(), this.f16216a);
        }

        public String toString() {
            return "Config(maxOffsetPx=" + this.f16216a + sRGQSqxgxlS.VPeauSSsTv + this.f16217b + ", samplingStrategy=" + this.f16218c + ')';
        }
    }

    /* JADX INFO: renamed from: ib.b$b, reason: collision with other inner class name */
    public enum EnumC0257b {
        TopLeft,
        TopRight,
        BottomLeft,
        BottomRight
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16224a;

        static {
            int[] iArr = new int[EnumC0257b.values().length];
            try {
                iArr[EnumC0257b.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0257b.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0257b.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0257b.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16224a = iArr;
        }
    }

    public b(a config) {
        t.f(config, "config");
        this.f16215a = config;
    }

    private final Rect a(EnumC0257b enumC0257b, Rect rect, int i10, int i11) {
        int i12 = c.f16224a[enumC0257b.ordinal()];
        if (i12 == 1) {
            int i13 = rect.left + i10;
            int i14 = rect.top + i10;
            return new Rect(i13, i14, i13 + i11, i11 + i14);
        }
        if (i12 == 2) {
            int i15 = rect.right - i10;
            int i16 = rect.top + i10;
            return new Rect(i15 - i11, i16, i15, i11 + i16);
        }
        if (i12 == 3) {
            int i17 = rect.left + i10;
            int i18 = rect.bottom - i10;
            return new Rect(i17, i18 - i11, i11 + i17, i18);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i19 = rect.right - i10;
        int i20 = rect.bottom - i10;
        return new Rect(i19 - i11, i20 - i11, i19, i20);
    }

    public final List b(Rect contentBounds) {
        t.f(contentBounds, "contentBounds");
        if (contentBounds.isEmpty()) {
            return kotlin.collections.t.k();
        }
        EnumC0257b[] enumC0257bArrValues = EnumC0257b.values();
        ArrayList arrayList = new ArrayList(enumC0257bArrValues.length);
        for (EnumC0257b enumC0257b : enumC0257bArrValues) {
            arrayList.add(a(enumC0257b, contentBounds, this.f16215a.a(contentBounds), this.f16215a.b(contentBounds)));
        }
        return arrayList;
    }
}
