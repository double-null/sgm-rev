package o8;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: MediaChunkIterator.java */
/* JADX INFO: loaded from: classes4.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f23223a = new a();

    /* JADX INFO: compiled from: MediaChunkIterator.java */
    class a implements n {
        a() {
        }

        @Override // o8.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // o8.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // o8.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
