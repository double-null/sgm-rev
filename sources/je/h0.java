package je;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0<T extends Enum<T>> implements fe.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T[] f20926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private he.f f20927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc.k f20928c;

    public h0(final String serialName, T[] values) {
        kotlin.jvm.internal.t.f(serialName, "serialName");
        kotlin.jvm.internal.t.f(values, "values");
        this.f20926a = values;
        this.f20928c = wc.m.a(new id.a() { // from class: je.g0
            @Override // id.a
            public final Object invoke() {
                return h0.c(this.f20907a, serialName);
            }
        });
    }

    private final he.f b(String str) {
        f0 f0Var = new f0(str, this.f20926a.length);
        for (T t10 : this.f20926a) {
            g2.q(f0Var, t10.name(), false, 2, null);
        }
        return f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f c(h0 h0Var, String str) {
        he.f fVar = h0Var.f20927b;
        return fVar == null ? h0Var.b(str) : fVar;
    }

    @Override // fe.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        int iH = decoder.H(getDescriptor());
        boolean z10 = false;
        if (iH >= 0 && iH < this.f20926a.length) {
            z10 = true;
        }
        if (z10) {
            return this.f20926a[iH];
        }
        throw new SerializationException(iH + " is not among valid " + getDescriptor().i() + " enum values, values size is " + this.f20926a.length);
    }

    @Override // fe.m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        int iJ = kotlin.collections.o.J(this.f20926a, value);
        if (iJ != -1) {
            encoder.l(getDescriptor(), iJ);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().i());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f20926a);
        kotlin.jvm.internal.t.e(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return (he.f) this.f20928c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().i() + '>';
    }
}
