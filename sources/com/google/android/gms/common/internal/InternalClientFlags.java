package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface InternalClientFlags {
    public static final InternalClientFlags DEFAULT = new zzah();
    public static final InternalClientFlags zza = new zzai();

    boolean catchNetworkCallbackTooManyRequestsException();

    boolean enableGoogleSignatureVerifierUidShortCircuit();

    boolean isPhoneRefinedFoldableAndTabletLogic();

    boolean providerinstallerDynamiteLoadingDisabled();

    boolean skipClientThrottlingDryrun();

    boolean useApiExceptionOnMissingFeature();

    boolean zza();
}
