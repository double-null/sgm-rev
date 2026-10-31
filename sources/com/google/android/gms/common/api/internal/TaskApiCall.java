package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private RemoteCall zaa;
        private Feature[] zad;
        private boolean zab = false;
        private boolean zac = false;
        private int zae = 0;

        private Builder() {
        }

        public TaskApiCall<A, ResultT> build() {
            boolean z10 = true;
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            if (!this.zac) {
                Feature[] featureArr = this.zad;
                if (featureArr == null || (featureArr.length) == 0) {
                    z10 = false;
                    break;
                }
                for (Feature feature : featureArr) {
                    if (!feature.getIsFullyRolledOut()) {
                        z10 = false;
                        break;
                    }
                }
                this.zab = z10;
            }
            return new zacm(this, this.zad, this.zab, this.zae);
        }

        @Deprecated
        public Builder<A, ResultT> execute(final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zacn
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    biConsumer.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z10) {
            this.zac = true;
            this.zab = z10;
            return this;
        }

        public Builder<A, ResultT> setFeatures(Feature... featureArr) {
            this.zad = featureArr;
            return this;
        }

        public Builder<A, ResultT> setMethodKey(int i10) {
            this.zae = i10;
            return this;
        }

        final /* synthetic */ RemoteCall zaa() {
            return this.zaa;
        }

        /* synthetic */ Builder(byte[] bArr) {
        }
    }

    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(null);
    }

    protected abstract void doExecute(A a10, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }

    protected TaskApiCall(Feature[] featureArr, boolean z10, int i10) {
        this.zaa = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.zab = z11;
        this.zac = i10;
    }
}
