package com.hiddenvariable.linelogin;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import c6.a;
import c6.c;
import c6.d;
import g6.b;

/* JADX INFO: loaded from: classes4.dex */
public class LineLoginBinding {
    private static String channelId;
    static a lineAccessToken;
    private static g6.a lineApiClient;

    public static String GetAccessToken() {
        if (IsAccessTokenValid(lineAccessToken)) {
            return lineAccessToken.a();
        }
        g6.a aVar = lineApiClient;
        if (aVar == null) {
            return "";
        }
        c<a> cVarD = aVar.d();
        return cVarD.g() ? cVarD.e().a() : "";
    }

    public static void Init(Context context, String str) {
        channelId = str;
        if (lineApiClient == null) {
            lineApiClient = new b(context, str).a();
        }
    }

    private static boolean IsAccessTokenValid(a aVar) {
        String strA;
        return (aVar == null || (strA = aVar.a()) == null || strA.length() == 0 || aVar.b() <= 0) ? false : true;
    }

    public static boolean IsLoggedIn() {
        return lineAccessToken != null;
    }

    public static void Login(Context context, LineLoginCallback lineLoginCallback) {
        if (lineApiClient == null) {
            if (lineLoginCallback != null) {
                lineLoginCallback.onResult(d.INTERNAL_ERROR.ordinal(), "Call Init(...) first!");
                return;
            }
            return;
        }
        if (IsAccessTokenValid(lineAccessToken)) {
            if (lineLoginCallback != null) {
                lineLoginCallback.onResult(d.SUCCESS.ordinal(), "");
                return;
            }
            return;
        }
        c<a> cVarD = lineApiClient.d();
        if (cVarD.g()) {
            if (lineApiClient.b().g()) {
                lineAccessToken = cVarD.e();
                Log.i("LINE", lineAccessToken.a() + " - " + lineAccessToken.toString());
                c<a> cVarC = lineApiClient.c();
                if (cVarC.g()) {
                    lineAccessToken = cVarC.e();
                }
                if (lineLoginCallback != null) {
                    lineLoginCallback.onResult(d.SUCCESS.ordinal(), "");
                    return;
                }
                return;
            }
            Log.i("LINE", "Failed to validate token with LINE.");
        }
        Intent intent = new Intent(context, (Class<?>) LineLoginBindingActivity.class);
        intent.putExtra("channelId", channelId);
        LineLoginBindingActivity.lineLoginCallback = lineLoginCallback;
        context.startActivity(intent);
    }

    public static void Logout() {
        g6.a aVar = lineApiClient;
        if (aVar != null) {
            aVar.a();
        }
        lineAccessToken = null;
    }
}
