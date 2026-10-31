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
import com.facebook.internal.ServerProtocol;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: TournamentUpdater.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TournamentUpdater {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$0(TaskCompletionSource task, GraphResponse response) {
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
        JSONObject jSONObject = response.getJSONObject();
        String strOptString = jSONObject != null ? jSONObject.optString(GraphResponse.SUCCESS_KEY) : null;
        if (strOptString != null) {
            if (!(strOptString.length() == 0)) {
                task.setResult(Boolean.valueOf(strOptString.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
                return;
            }
        }
        task.setError(new GraphAPIException("Graph API Error"));
    }

    public final TaskCompletionSource<Boolean> update(Tournament tournament, Number score) {
        t.f(tournament, "tournament");
        t.f(score, "score");
        return update(tournament.identifier, score);
    }

    public final TaskCompletionSource<Boolean> update(String identifier, Number score) {
        t.f(identifier, "identifier");
        t.f(score, "score");
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to fetch tournament with an invalid access token");
        }
        if (!(currentAccessToken.getGraphDomain() != null && t.a(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()))) {
            throw new FacebookException("User is not using gaming login");
        }
        final TaskCompletionSource<Boolean> taskCompletionSource = new TaskCompletionSource<>();
        Bundle bundle = new Bundle();
        bundle.putInt("score", score.intValue());
        new GraphRequest(currentAccessToken, identifier + "/update_score", bundle, HttpMethod.POST, new GraphRequest.Callback() { // from class: com.facebook.gamingservices.n
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                TournamentUpdater.update$lambda$0(taskCompletionSource, graphResponse);
            }
        }, null, 32, null).executeAsync();
        return taskCompletionSource;
    }
}
