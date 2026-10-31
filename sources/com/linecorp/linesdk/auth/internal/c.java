package com.linecorp.linesdk.auth.internal;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.login.CustomTabLoginMethodHandler;
import d6.e;
import d6.f;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LineAuthenticationActivity f12683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i6.a f12684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e6.b f12685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e6.d f12686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.linecorp.linesdk.auth.internal.a f12687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final d6.a f12688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String[] f12689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final d f12690h;

    /* JADX INFO: Access modifiers changed from: private */
    class a extends AsyncTask<String, Void, i6.c> {
        private a() {
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ i6.c doInBackground(String[] strArr) {
            String[] strArr2 = strArr;
            String str = (strArr2 == null || strArr2.length != 1) ? null : strArr2[0];
            d dVar = c.this.f12690h;
            f fVar = dVar.f12694a;
            String str2 = dVar.f12695b;
            if (TextUtils.isEmpty(str) || fVar == null || TextUtils.isEmpty(str2)) {
                return new i6.c(c6.d.INTERNAL_ERROR, new c6.b("Requested data is missing."));
            }
            c cVar = c.this;
            e6.b bVar = cVar.f12685c;
            String strA = cVar.f12684b.a();
            Uri uriBuild = bVar.f14499a.buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath(SDKConstants.PARAM_ACCESS_TOKEN).build();
            HashMap map = new HashMap(5);
            map.put("grant_type", "authorization_code");
            map.put("code", str);
            map.put(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
            map.put("client_id", strA);
            map.put("otp", fVar.f13348b);
            c6.c cVarA = bVar.f14500b.a(uriBuild, Collections.emptyMap(), map, e6.b.f14495d);
            if (!cVarA.g()) {
                return c.a(cVarA);
            }
            e eVar = (e) cVarA.e();
            d6.d dVar2 = eVar.f13345a;
            c6.c<c6.f> cVarA2 = c.this.f12686d.a(dVar2);
            if (!cVarA2.g()) {
                return c.a(cVarA2);
            }
            c.this.f12688f.d(dVar2);
            return new i6.c(cVarA2.e(), new c6.e(new c6.a(dVar2.f13341a, dVar2.f13342b, dVar2.f13343c), eVar.f13346b));
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(i6.c cVar) {
            c cVar2 = c.this;
            cVar2.f12690h.f12697d = d.b.f12701d;
            cVar2.f12683a.c(cVar);
        }

        /* synthetic */ a(c cVar, byte b10) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.f12690h.f12697d == d.b.f12700c || cVar.f12683a.isFinishing()) {
                return;
            }
            c.this.f12683a.c(i6.c.f16004e);
        }

        /* synthetic */ b(c cVar, byte b10) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.linecorp.linesdk.auth.internal.c$c, reason: collision with other inner class name */
    class AsyncTaskC0167c extends AsyncTask<Void, Void, c6.c<f>> {
        private AsyncTaskC0167c() {
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ c6.c<f> doInBackground(Void[] voidArr) {
            c cVar = c.this;
            e6.b bVar = cVar.f12685c;
            String strA = cVar.f12684b.a();
            Uri uriBuild = bVar.f14499a.buildUpon().appendPath(CustomTabLoginMethodHandler.OAUTH_DIALOG).appendPath("otp").build();
            HashMap map = new HashMap(1);
            map.put("client_id", strA);
            return bVar.f14500b.a(uriBuild, Collections.emptyMap(), map, e6.b.f14494c);
        }

        /* synthetic */ AsyncTaskC0167c(c cVar, byte b10) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(c6.c<f> cVar) {
            boolean z10;
            com.linecorp.linesdk.auth.internal.a.C0166a c0166a;
            boolean z11;
            c6.c<f> cVar2 = cVar;
            if (!cVar2.g()) {
                c cVar3 = c.this;
                cVar3.f12690h.f12697d = d.b.f12701d;
                cVar3.f12683a.c(c.a(cVar2));
                return;
            }
            f fVarE = cVar2.e();
            c cVar4 = c.this;
            cVar4.f12690h.f12694a = fVarE;
            try {
                com.linecorp.linesdk.auth.internal.a aVar = cVar4.f12687e;
                LineAuthenticationActivity lineAuthenticationActivity = cVar4.f12683a;
                i6.a aVar2 = cVar4.f12684b;
                String[] strArr = cVar4.f12689g;
                byte[] bArr = new byte[8];
                long jNextLong = new SecureRandom().nextLong();
                for (int i10 = 0; i10 < 8; i10++) {
                    bArr[i10] = (byte) jNextLong;
                    jNextLong >>= 8;
                }
                String strEncodeToString = Base64.encodeToString(bArr, 11);
                aVar.f12668a.f12696c = strEncodeToString;
                String str = "intent://result#Intent;package=" + lineAuthenticationActivity.getPackageName() + ";scheme=lineauth;end";
                Uri.Builder builderAppendQueryParameter = aVar2.c().buildUpon().appendQueryParameter(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code").appendQueryParameter(KBBdKxoAiHo.HSDqaWHDPtVM, aVar2.a()).appendQueryParameter(ServerProtocol.DIALOG_PARAM_STATE, strEncodeToString).appendQueryParameter("otpId", fVarE.f13347a).appendQueryParameter(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str);
                if (strArr != null && strArr.length > 0) {
                    builderAppendQueryParameter.appendQueryParameter("scope", TextUtils.join(" ", strArr));
                }
                Uri uriBuild = builderAppendQueryParameter.build();
                boolean zE = aVar2.e();
                androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0023d().p(androidx.core.content.a.d(lineAuthenticationActivity, R.color.white)).a();
                Intent data = dVarA.f1558a.setData(uriBuild);
                Bundle bundle = dVarA.f1559b;
                com.linecorp.linesdk.auth.internal.b bVarA = com.linecorp.linesdk.auth.internal.b.a(lineAuthenticationActivity);
                if (bVarA == null) {
                    c0166a = new com.linecorp.linesdk.auth.internal.a.C0166a(data, bundle, false);
                } else {
                    if (zE) {
                        z10 = false;
                    } else {
                        com.linecorp.linesdk.auth.internal.b bVar = com.linecorp.linesdk.auth.internal.a.f12667b;
                        if (bVar == null) {
                            z11 = false;
                        } else {
                            int i11 = bVarA.f12680a;
                            int i12 = bVar.f12680a;
                            if (i11 == i12) {
                                int i13 = bVarA.f12681b;
                                int i14 = bVar.f12681b;
                                if (i13 != i14) {
                                    if (i13 >= i14) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                } else if (bVarA.f12682c >= bVar.f12682c) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            } else if (i11 >= i12) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uriBuild);
                        intent.setPackage("jp.naver.line.android");
                        c0166a = new com.linecorp.linesdk.auth.internal.a.C0166a(intent, bundle, true);
                    } else {
                        List<Intent> listA = com.linecorp.linesdk.auth.internal.a.a(uriBuild, lineAuthenticationActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0), data.getExtras());
                        int size = listA.size();
                        if (size == 0) {
                            throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=" + uriBuild);
                        }
                        if (size == 1) {
                            c0166a = new com.linecorp.linesdk.auth.internal.a.C0166a(listA.get(0), bundle, false);
                        } else {
                            Intent intentCreateChooser = Intent.createChooser(listA.remove(0), null);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listA.toArray(new Parcelable[listA.size()]));
                            c0166a = new com.linecorp.linesdk.auth.internal.a.C0166a(intentCreateChooser, bundle, false);
                        }
                    }
                }
                com.linecorp.linesdk.auth.internal.a.b bVar2 = new com.linecorp.linesdk.auth.internal.a.b(c0166a.f12669a, c0166a.f12670b, str, c0166a.f12671c);
                if (bVar2.f12675d) {
                    c.this.f12683a.startActivity(bVar2.f12672a, bVar2.f12673b);
                } else {
                    c.this.f12683a.startActivityForResult(bVar2.f12672a, 3, bVar2.f12673b);
                }
                c.this.f12690h.f12695b = bVar2.f12674c;
            } catch (ActivityNotFoundException e10) {
                c cVar5 = c.this;
                cVar5.f12690h.f12697d = d.b.f12701d;
                cVar5.f12683a.c(new i6.c(c6.d.INTERNAL_ERROR, new c6.b(e10)));
            }
        }
    }

    c(LineAuthenticationActivity lineAuthenticationActivity, i6.a aVar, d dVar, String[] strArr) {
        this(lineAuthenticationActivity, aVar, new e6.b(lineAuthenticationActivity.getApplicationContext(), aVar.b()), new e6.d(lineAuthenticationActivity.getApplicationContext(), aVar.b()), new com.linecorp.linesdk.auth.internal.a(dVar), new d6.a(lineAuthenticationActivity.getApplicationContext(), aVar.a()), dVar, strArr);
    }

    static /* synthetic */ i6.c a(c6.c cVar) {
        return new i6.c(cVar.d(), cVar.c());
    }

    private c(LineAuthenticationActivity lineAuthenticationActivity, i6.a aVar, e6.b bVar, e6.d dVar, com.linecorp.linesdk.auth.internal.a aVar2, d6.a aVar3, d dVar2, String[] strArr) {
        this.f12683a = lineAuthenticationActivity;
        this.f12684b = aVar;
        this.f12685c = bVar;
        this.f12686d = dVar;
        this.f12687e = aVar2;
        this.f12688f = aVar3;
        this.f12690h = dVar2;
        this.f12689g = strArr;
    }
}
