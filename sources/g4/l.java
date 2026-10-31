package g4;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: JsonElement.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public i a() {
        if (e()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n c() {
        if (g()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o d() {
        if (h()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean e() {
        return this instanceof i;
    }

    public boolean f() {
        return this instanceof m;
    }

    public boolean g() {
        return this instanceof n;
    }

    public boolean h() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m4.c cVar = new m4.c(stringWriter);
            cVar.F(true);
            i4.k.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
