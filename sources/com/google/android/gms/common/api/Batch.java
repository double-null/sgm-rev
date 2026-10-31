package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Batch extends BasePendingResult<BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final PendingResult[] zah;
    private final Object zai;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static final class Builder {
        private final List zaa = new ArrayList();
        private final GoogleApiClient zab;

        public Builder(GoogleApiClient googleApiClient) {
            this.zab = googleApiClient;
        }

        public <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            List list = this.zaa;
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(list.size());
            list.add(pendingResult);
            return batchResultToken;
        }

        public Batch build() {
            return new Batch(this.zaa, this.zab, null);
        }
    }

    /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, byte[] bArr) {
        super(googleApiClient);
        this.zai = new Object();
        int size = list.size();
        this.zae = size;
        PendingResult[] pendingResultArr = new PendingResult[size];
        this.zah = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            PendingResult pendingResult = (PendingResult) list.get(i10);
            this.zah[i10] = pendingResult;
            pendingResult.addStatusListener(new zaa(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        int i10 = 0;
        while (true) {
            PendingResult[] pendingResultArr = this.zah;
            if (i10 >= pendingResultArr.length) {
                return;
            }
            pendingResultArr[i10].cancel();
            i10++;
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zah);
    }

    final /* synthetic */ int zab() {
        return this.zae;
    }

    final /* synthetic */ void zac(int i10) {
        this.zae = i10;
    }

    final /* synthetic */ boolean zad() {
        return this.zaf;
    }

    final /* synthetic */ void zae(boolean z10) {
        this.zaf = true;
    }

    final /* synthetic */ boolean zaf() {
        return this.zag;
    }

    final /* synthetic */ void zag(boolean z10) {
        this.zag = true;
    }

    final /* synthetic */ PendingResult[] zah() {
        return this.zah;
    }

    final /* synthetic */ Object zai() {
        return this.zai;
    }
}
