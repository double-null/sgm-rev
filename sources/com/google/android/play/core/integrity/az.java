package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f11277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt f11278b;

    az(bn bnVar, bt btVar) {
        this.f11277a = bnVar;
        this.f11278b = btVar;
    }

    final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) throws Exception {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l10.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f11278b;
        final int i10 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i10) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f11321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f11322c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f11320a.a(this.f11321b, this.f11322c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f11277a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f11275a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
