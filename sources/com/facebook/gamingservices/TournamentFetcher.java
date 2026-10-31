package com.facebook.gamingservices;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.bolts.TaskCompletionSource;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: TournamentFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TournamentFetcher {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchTournaments$lambda$1(TaskCompletionSource task, GraphResponse response) {
        t.f(task, "$task");
        t.f(response, "response");
        if (response.getError() != null) {
            FacebookRequestError error = response.getError();
            if ((error != null ? error.getException() : null) == null) {
                task.setError(new GraphAPIException("Graph API Error"));
                return;
            } else {
                FacebookRequestError error2 = response.getError();
                task.setError(error2 != null ? error2.getException() : null);
                return;
            }
        }
        try {
            JSONObject jSONObject = response.getJSONObject();
            if (jSONObject == null) {
                task.setError(new GraphAPIException("Failed to get response"));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray.length() < 1) {
                l0 l0Var = l0.f21527a;
                String str = String.format(Locale.ROOT, "No tournament found", Arrays.copyOf(new Object[]{Integer.valueOf(jSONArray.length()), 1}, 2));
                t.e(str, "format(locale, format, *args)");
                task.setError(new GraphAPIException(str));
                return;
            }
            g4.f fVarB = new g4.g().b();
            String string = jSONArray.toString();
            t.e(string, "data.toString()");
            Object objH = fVarB.h(string, Tournament[].class);
            t.e(objH, "gson.fromJson(dataString…<Tournament>::class.java)");
            task.setResult(o.W((Object[]) objH));
        } catch (JSONException e10) {
            task.setError(e10);
        }
    }

    public final TaskCompletionSource<List<Tournament>> fetchTournaments() {
        final TaskCompletionSource<List<Tournament>> taskCompletionSource = new TaskCompletionSource<>();
        Bundle bundle = new Bundle();
        AccessToken.Companion companion = AccessToken.Companion;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to fetch tournament with an invalid access token");
        }
        if (!(currentAccessToken.getGraphDomain() != null && t.a(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
            throw new FacebookException("User is not using gaming login");
        }
        GraphRequest graphRequest = new GraphRequest(companion.getCurrentAccessToken(), "me/tournaments", bundle, HttpMethod.GET, new GraphRequest.Callback() { // from class: com.facebook.gamingservices.k
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                TournamentFetcher.fetchTournaments$lambda$1(taskCompletionSource, graphResponse);
            }
        }, null, 32, null);
        graphRequest.setParameters(bundle);
        graphRequest.executeAsync();
        return taskCompletionSource;
    }
}
