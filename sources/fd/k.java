package fd;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes5.dex */
final class k implements qd.g<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f14953a;

    /* JADX INFO: compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f14954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f14955b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f14954a;
            this.f14954a = null;
            t.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f14954a == null && !this.f14955b) {
                String line = k.this.f14953a.readLine();
                this.f14954a = line;
                if (line == null) {
                    this.f14955b = true;
                }
            }
            return this.f14954a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(BufferedReader reader) {
        t.f(reader, "reader");
        this.f14953a = reader;
    }

    @Override // qd.g
    public Iterator<String> iterator() {
        return new a();
    }
}
