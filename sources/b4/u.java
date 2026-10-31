package b4;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: compiled from: InstallationId.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4019c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4021b;

    /* JADX INFO: compiled from: InstallationId.kt */
    public static final class a {

        /* JADX INFO: renamed from: b4.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InstallationId.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {31, 39}, m = "create")
        static final class C0081a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f4022h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f4023i;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f4025k;

            C0081a(zc.f<? super C0081a> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4023i = obj;
                this.f4025k |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:36:0x008c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public final Object a(FirebaseInstallationsApi firebaseInstallationsApi, zc.f<? super u> fVar) throws Throwable {
            C0081a c0081a;
            ?? r10;
            String str;
            ?? r11;
            String str2;
            if (fVar instanceof C0081a) {
                c0081a = (C0081a) fVar;
                int i10 = c0081a.f4025k;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0081a.f4025k = i10 - Integer.MIN_VALUE;
                } else {
                    c0081a = new C0081a(fVar);
                }
            } else {
                c0081a = new C0081a(fVar);
            }
            Object objA = c0081a.f4023i;
            Object objF = ad.d.f();
            int i11 = c0081a.f4025k;
            String str3 = "";
            try {
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) c0081a.f4022h;
                            wc.s.b(objA);
                            firebaseInstallationsApi = firebaseInstallationsApi2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str4 = (String) c0081a.f4022h;
                            wc.s.b(objA);
                            firebaseInstallationsApi = str4;
                        }
                        str2 = (String) objA;
                        r11 = firebaseInstallationsApi;
                        if (str2 != null) {
                            str3 = str2;
                            r11 = firebaseInstallationsApi;
                        }
                        return new u(str3, r11, null);
                    }
                    wc.s.b(objA);
                    Task<com.google.firebase.installations.f> taskA = firebaseInstallationsApi.a(false);
                    kotlin.jvm.internal.t.e(taskA, "getToken(...)");
                    c0081a.f4022h = firebaseInstallationsApi;
                    c0081a.f4025k = 1;
                    objA = ee.b.a(taskA, c0081a);
                    firebaseInstallationsApi = firebaseInstallationsApi;
                    if (objA == objF) {
                        return objF;
                    }
                    String strB = ((com.google.firebase.installations.f) objA).b();
                    kotlin.jvm.internal.t.c(strB);
                    r10 = firebaseInstallationsApi;
                    str = strB;
                } catch (Exception e10) {
                    Log.w("FirebaseSessions", "Error getting authentication token.", e10);
                    r10 = firebaseInstallationsApi;
                    str = "";
                }
                Task<String> id2 = r10.getId();
                kotlin.jvm.internal.t.e(id2, "getId(...)");
                c0081a.f4022h = str;
                c0081a.f4025k = 2;
                objA = ee.b.a(id2, c0081a);
                firebaseInstallationsApi = str;
                if (objA == objF) {
                    return objF;
                }
                str2 = (String) objA;
                r11 = firebaseInstallationsApi;
                if (str2 != null) {
                    str3 = str2;
                    r11 = firebaseInstallationsApi;
                }
            } catch (Exception e11) {
                Log.w("FirebaseSessions", "Error getting Firebase installation id .", e11);
                r11 = firebaseInstallationsApi;
            }
            return new u(str3, r11, null);
        }
    }

    public /* synthetic */ u(String str, String str2, kotlin.jvm.internal.k kVar) {
        this(str, str2);
    }

    public final String a() {
        return this.f4021b;
    }

    public final String b() {
        return this.f4020a;
    }

    private u(String str, String str2) {
        this.f4020a = str;
        this.f4021b = str2;
    }
}
