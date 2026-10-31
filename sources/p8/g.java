package p8;

import java.util.Objects;
import s9.l;
import s9.r;
import u7.q;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f23511a = new a();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s9.h f23512b = new s9.h();

        a() {
        }

        @Override // p8.g
        public boolean a(q qVar) {
            String str = qVar.f26252o;
            return this.f23512b.a(qVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // p8.g
        public l b(q qVar) {
            String str = qVar.f26252o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new t9.a(str, qVar.J, 16000L);
                    case "application/cea-708":
                        return new t9.c(qVar.J, qVar.f26255r);
                }
            }
            if (!this.f23512b.a(qVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarC = this.f23512b.c(qVar);
            return new b(rVarC.getClass().getSimpleName() + "Decoder", rVarC);
        }
    }

    boolean a(q qVar);

    l b(q qVar);
}
