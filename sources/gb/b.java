package gb;

import android.graphics.RectF;
import android.graphics.RuntimeShader;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends RuntimeShader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15548a = new a(null);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RectF bounds, int[] colors) {
        super("\n            layout(color) uniform vec4 c00; // top-left\n            layout(color) uniform vec4 c10; // top-right\n            layout(color) uniform vec4 c01; // bottom-left\n            layout(color) uniform vec4 c11; // bottom-right\n            uniform float w;\n            uniform float h;\n            \n            half4 main(float2 p) {\n                float u = clamp(p.x / max(w, 1.0), 0.0, 1.0);\n                float v = clamp(p.y / max(h, 1.0), 0.0, 1.0);\n                vec4 col = (1.0 - u) * (1.0 - v) * c00\n                         + u * (1.0 - v) * c10\n                         + (1.0 - u) * v * c01\n                         + u * v * c11;\n                return half4(col);\n            }\n            ");
        t.f(bounds, "bounds");
        t.f(colors, "colors");
        setFloatUniform("w", bounds.width());
        setFloatUniform("h", bounds.height());
        setColorUniform("c00", colors[0]);
        setColorUniform("c10", colors[1]);
        setColorUniform("c01", colors[2]);
        setColorUniform("c11", colors[3]);
    }
}
