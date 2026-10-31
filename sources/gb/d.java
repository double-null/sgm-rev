package gb;

import android.graphics.Shader;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f15552a;

    public d(Shader shader) {
        t.f(shader, "shader");
        this.f15552a = shader;
    }

    @Override // gb.e
    public Shader a(boolean z10) {
        return this.f15552a;
    }
}
