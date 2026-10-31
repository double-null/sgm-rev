package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.p;
import com.google.common.util.concurrent.g0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkk extends GoogleApi {
    public static final /* synthetic */ int zza = 0;

    static {
        Pair.create(zzkm.zza(0L), Tasks.forResult(null));
    }

    protected zzkk(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzjx.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task zza(final String str, int i10, final String[] strArr, byte[] bArr) {
        final int i11 = 0;
        final byte[] bArr2 = null;
        return doRead(TaskApiCall.builder().run(new RemoteCall(str, i11, strArr, bArr2) { // from class: com.google.android.gms.internal.measurement.zzki
            private final /* synthetic */ String zza;
            private final /* synthetic */ String[] zzb;

            {
                this.zzb = strArr;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                int i12 = zzkk.zza;
                zzkj zzkjVar = new zzkj((TaskCompletionSource) obj2, null);
                ((zzkt) ((zzku) obj).getService()).zze(zzkjVar, this.zza, 0, this.zzb, null);
            }
        }).build());
    }

    public final Task zzb(final String str, String str2, String str3) {
        final String str4 = null;
        final String str5 = "";
        return doRead(TaskApiCall.builder().run(new RemoteCall(str, str5, str4) { // from class: com.google.android.gms.internal.measurement.zzkb
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb = "";

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = zzkk.zza;
                ((zzkt) ((zzku) obj).getService()).zzf(new zzkj((TaskCompletionSource) obj2, null), this.zza, this.zzb, null);
            }
        }).build());
    }

    public final Task zzc(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = zzkk.zza;
                ((zzkt) ((zzku) obj).getService()).zzg(new zzkj((TaskCompletionSource) obj2, null), str);
            }
        }).build());
    }

    public final Task zzd(final zzme zzmeVar) {
        p.l(zzmeVar);
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = zzkk.zza;
                ((zzkt) ((zzku) obj).getService()).zzh(new zzkj((TaskCompletionSource) obj2, null), zzmeVar.zzcd());
            }
        }).setFeatures(zzjn.zza).setAutoResolveMissingFeatures(false).build()).continueWithTask(g0.a(), new Continuation() { // from class: com.google.android.gms.internal.measurement.zzke
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                boolean z10 = task.getException() instanceof UnsupportedApiCallException;
                zzme zzmeVar2 = zzmeVar;
                zzkk zzkkVar = this.zza;
                if (z10) {
                    return zzkkVar.zzc(zzmeVar2.zza());
                }
                return ((task.getException() instanceof ApiException) && ((ApiException) p.l((ApiException) task.getException())).getStatusCode() == 29514) ? zzkkVar.zzc(zzmeVar2.zza()) : task;
            }
        });
    }

    public final Task zze() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzkt) ((zzku) obj).getService()).zzi(new zzjy(this.zza, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzjn.zzi).setAutoResolveMissingFeatures(false).build());
    }

    public final Task zzf(zzpm zzpmVar) throws Throwable {
        final String string;
        final ListenerHolder listenerHolderRegisterListener = registerListener(zzpmVar, zzku.class.getSimpleName());
        String myProcessName = ProcessUtils.getMyProcessName();
        if (myProcessName == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = myProcessName.length() + 1;
            int iIdentityHashCode = System.identityHashCode(zzku.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb2.append(myProcessName);
            sb2.append("|");
            sb2.append(iIdentityHashCode);
            string = sb2.toString();
        }
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzkt) ((zzku) obj).getService()).zzj(string, new zzka(this.zza, listenerHolderRegisterListener));
            }
        }).unregister(zzkh.zza).setFeatures(zzjn.zzd).setAutoResolveMissingFeatures(false).build());
    }
}
