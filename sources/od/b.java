package od;

import java.util.NoSuchElementException;
import kotlin.collections.q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23380d;

    public b(char c10, char c11, int i10) {
        this.f23377a = i10;
        this.f23378b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? t.g(c10, c11) < 0 : t.g(c10, c11) > 0) {
            z10 = false;
        }
        this.f23379c = z10;
        this.f23380d = z10 ? c10 : c11;
    }

    @Override // kotlin.collections.q
    public char a() {
        int i10 = this.f23380d;
        if (i10 != this.f23378b) {
            this.f23380d = this.f23377a + i10;
        } else {
            if (!this.f23379c) {
                throw new NoSuchElementException();
            }
            this.f23379c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23379c;
    }
}
