package ke;

import c2.YDwL.tFQWuE;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends ie.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f21366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le.c f21367b;

    public i0(a lexer, kotlinx.serialization.json.b json) {
        kotlin.jvm.internal.t.f(lexer, "lexer");
        kotlin.jvm.internal.t.f(json, "json");
        this.f21366a = lexer;
        this.f21367b = json.a();
    }

    @Override // ie.a, ie.e
    public byte G() {
        a aVar = this.f21366a;
        String strQ = aVar.q();
        try {
            return rd.m0.a(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UByte' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.e, ie.c
    public le.c a() {
        return this.f21367b;
    }

    @Override // ie.a, ie.e
    public int h() {
        a aVar = this.f21366a;
        String strQ = aVar.q();
        try {
            return rd.m0.d(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UInt' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.a, ie.e
    public long k() {
        a aVar = this.f21366a;
        String strQ = aVar.q();
        try {
            return rd.m0.g(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'ULong' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.a, ie.e
    public short s() {
        a aVar = this.f21366a;
        String strQ = aVar.q();
        try {
            return rd.m0.j(strQ);
        } catch (IllegalArgumentException unused) {
            a.x(aVar, "Failed to parse type 'UShort' for input '" + strQ + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // ie.c
    public int f(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        throw new IllegalStateException(tFQWuE.Zvyvk.toString());
    }
}
