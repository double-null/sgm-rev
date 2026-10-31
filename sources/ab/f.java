package ab;

import android.view.View;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f219c;

    public f(float f10, float f11, float f12) {
        this.f217a = f10;
        this.f218b = f11;
        this.f219c = f12;
    }

    public final float a() {
        return this.f217a;
    }

    public final float b() {
        return this.f218b;
    }

    public final float c() {
        return this.f219c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f217a, fVar.f217a) == 0 && Float.compare(this.f218b, fVar.f218b) == 0 && Float.compare(this.f219c, fVar.f219c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f217a) * 31) + Float.hashCode(this.f218b)) * 31) + Float.hashCode(this.f219c);
    }

    public String toString() {
        return "AdAnimationValues(alpha=" + this.f217a + ", translationX=" + this.f218b + ", translationY=" + this.f219c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        t.f(view, "view");
    }
}
