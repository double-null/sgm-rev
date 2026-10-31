package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private final androidx.collection.a zaa;

    public AvailabilityException(androidx.collection.a aVar) {
        this.zaa = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        androidx.collection.a aVar = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        Object obj = aVar.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZaa).length() + 58);
        sb2.append("The given API (");
        sb2.append(strZaa);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(obj != null, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) aVar.get(apiKey));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        androidx.collection.a aVar = this.zaa;
        boolean z10 = true;
        for (ApiKey apiKey : aVar.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) aVar.get(apiKey));
            z10 &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZaa).length() + 2 + strValueOf.length());
            sb2.append(strZaa);
            sb2.append(": ");
            sb2.append(strValueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        androidx.collection.a aVar = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        Object obj = aVar.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZaa).length() + 58);
        sb2.append("The given API (");
        sb2.append(strZaa);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(obj != null, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) aVar.get(apiKey));
    }
}
