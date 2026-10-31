package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zaaj extends RemoteCreator {
    private static final zaaj zaa = new zaaj();

    private zaaj() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i10, int i11) throws RemoteCreator.RemoteCreatorException {
        zaaj zaajVar = zaa;
        try {
            zaah zaahVar = new zaah(1, i10, i11, null);
            return (View) ObjectWrapper.unwrap(((zaw) zaajVar.getRemoteCreatorInstance(context)).zae(ObjectWrapper.wrap(context), zaahVar));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 42 + String.valueOf(i11).length());
            sb2.append("Could not get button with size ");
            sb2.append(i10);
            sb2.append(" and color ");
            sb2.append(i11);
            throw new RemoteCreator.RemoteCreatorException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zaw ? (zaw) iInterfaceQueryLocalInterface : new zaw(iBinder);
    }
}
