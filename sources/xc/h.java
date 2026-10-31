package xc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.s;
import kotlin.collections.t0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28467c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection<?> f28468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28469b;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public h(Collection<?> collection, int i10) {
        t.f(collection, "collection");
        this.f28468a = collection;
        this.f28469b = i10;
    }

    private final Object readResolve() {
        return this.f28468a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Collection<?> collectionA;
        t.f(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            List listD = s.d(i11);
            while (i12 < i11) {
                listD.add(input.readObject());
                i12++;
            }
            collectionA = s.a(listD);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setC = t0.c(i11);
            while (i12 < i11) {
                setC.add(input.readObject());
                i12++;
            }
            collectionA = t0.a(setC);
        }
        this.f28468a = collectionA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        t.f(output, "output");
        output.writeByte(this.f28469b);
        output.writeInt(this.f28468a.size());
        Iterator<?> it = this.f28468a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public h() {
        this(kotlin.collections.t.k(), 0);
    }
}
