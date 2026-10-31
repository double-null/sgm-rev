package od;

import java.util.NoSuchElementException;
import kotlin.collections.j0;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23392d;

    public g(int i10, int i11, int i12) {
        this.f23389a = i12;
        this.f23390b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f23391c = z10;
        this.f23392d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23391c;
    }

    @Override // kotlin.collections.j0
    public int nextInt() {
        int i10 = this.f23392d;
        if (i10 != this.f23390b) {
            this.f23392d = this.f23389a + i10;
        } else {
            if (!this.f23391c) {
                throw new NoSuchElementException();
            }
            this.f23391c = false;
        }
        return i10;
    }
}
