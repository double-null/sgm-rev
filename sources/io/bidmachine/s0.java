package io.bidmachine;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AppIdDataManager.java */
/* JADX INFO: loaded from: classes4.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f20408a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f20409b;

    /* JADX INFO: compiled from: AppIdDataManager.java */
    class a implements OnSuccessListener<AppSetIdInfo> {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo.getScope() == 2) {
                s0.this.f20409b = appSetIdInfo.getId();
            }
        }
    }

    s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Context context) throws Throwable {
        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
    }

    public String c() {
        return this.f20409b;
    }

    public void e(final Context context) {
        if (this.f20408a.compareAndSet(false, true)) {
            o2.a().execute(new q7.a() { // from class: io.bidmachine.r0
                @Override // oc.o
                public final void p() throws Throwable {
                    this.f20397a.d(context);
                }
            });
        }
    }
}
