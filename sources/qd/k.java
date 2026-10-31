package qd;

import java.util.Iterator;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.p f24762a;

        public a(id.p pVar) {
            this.f24762a = pVar;
        }

        @Override // qd.g
        public Iterator<T> iterator() {
            return k.a(this.f24762a);
        }
    }

    public static <T> Iterator<T> a(id.p<? super i<? super T>, ? super zc.f<? super g0>, ? extends Object> block) {
        t.f(block, "block");
        h hVar = new h();
        hVar.i(ad.c.a(block, hVar, hVar));
        return hVar;
    }

    public static <T> g<T> b(id.p<? super i<? super T>, ? super zc.f<? super g0>, ? extends Object> block) {
        t.f(block, "block");
        return new a(block);
    }
}
