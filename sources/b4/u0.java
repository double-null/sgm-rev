package b4;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;

/* JADX INFO: compiled from: SharedSessionRepository.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4026a = a.f4027a;

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4027a = new a();

        private a() {
        }

        public final u0 a() {
            return ((com.google.firebase.sessions.b) FirebaseKt.getApp(Firebase.INSTANCE).get(com.google.firebase.sessions.b.class)).a();
        }
    }

    boolean a();

    void b();

    void c();
}
