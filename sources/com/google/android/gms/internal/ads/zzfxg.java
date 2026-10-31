package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzfxg {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfxg(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfxg zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfxg.zza;
                    taskCompletionSource.setResult(zzfzc.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfxg.zza;
                    taskCompletionSource.setResult(zzfzc.zzc());
                }
            });
        }
        return new zzfxg(context, executor, taskCompletionSource.getTask(), z10);
    }

    static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfxf.zza);
        }
        Context context = this.zzb;
        final zzaws zzawsVarZza = zzaww.zza();
        zzawsVarZza.zza(context.getPackageName());
        zzawsVarZza.zzb(j10);
        zzawsVarZza.zzg(zzf);
        if (exc != null) {
            int i11 = zzgug.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzawsVarZza.zzc(stringWriter.toString());
            zzawsVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzawsVarZza.zze(str2);
        }
        if (str != null) {
            zzawsVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfxd
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i12 = zzfxg.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i13 = i10;
                zzfzb zzfzbVarZza = ((zzfzc) task.getResult()).zza(((zzaww) zzawsVarZza.zzbu()).zzaN());
                zzfzbVarZza.zzc(i13);
                zzfzbVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }

    public Task zze(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }
}
