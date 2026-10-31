package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import c2.YDwL.tFQWuE;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.time.Instant;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TournamentShareDialogURIBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TournamentShareDialogURIBuilder {
    public static final TournamentShareDialogURIBuilder INSTANCE = new TournamentShareDialogURIBuilder();
    public static final String authority = "fb.gg";

    /* JADX INFO: renamed from: me, reason: collision with root package name */
    public static final String f11075me = "me";
    public static final String scheme = "https";
    public static final String tournament = "instant_tournament";

    private TournamentShareDialogURIBuilder() {
    }

    public final Bundle bundleForUpdating$facebook_gamingservices_release(String tournamentID, Number score, String appID) {
        t.f(tournamentID, "tournamentID");
        t.f(score, "score");
        t.f(appID, "appID");
        Bundle bundle = new Bundle();
        bundle.putString("deeplink", SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", appID);
        bundle.putString("score", score.toString());
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID);
        return bundle;
    }

    public final Uri uriForCreating$facebook_gamingservices_release(TournamentConfig config, Number score, String appID) {
        t.f(config, "config");
        t.f(score, "score");
        t.f(appID, "appID");
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority("fb.gg").appendPath(f11075me).appendPath(tournament).appendPath(appID).appendQueryParameter("score", score.toString());
        Instant endTime = config.getEndTime();
        if (endTime != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_END_TIME, endTime.toString());
        }
        TournamentSortOrder sortOrder = config.getSortOrder();
        if (sortOrder != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            builderAppendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        t.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    public final Uri uriForUpdating$facebook_gamingservices_release(String tournamentID, Number score, String appID) {
        t.f(tournamentID, "tournamentID");
        t.f(score, "score");
        t.f(appID, "appID");
        Uri uriBuild = new Uri.Builder().scheme("https").authority("fb.gg").appendPath(f11075me).appendPath(tournament).appendPath(appID).appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID).appendQueryParameter("score", score.toString()).build();
        t.e(uriBuild, "Builder()\n        .schem…tring())\n        .build()");
        return uriBuild;
    }

    public final Bundle bundleForCreating$facebook_gamingservices_release(TournamentConfig config, Number score, String appID) {
        Instant endTime;
        t.f(config, "config");
        t.f(score, "score");
        t.f(appID, "appID");
        Bundle bundle = new Bundle();
        bundle.putString("deeplink", SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString(tFQWuE.uhbsmVxIR, appID);
        bundle.putString("score", score.toString());
        TournamentSortOrder sortOrder = config.getSortOrder();
        if (sortOrder != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        if (Build.VERSION.SDK_INT >= 26 && (endTime = config.getEndTime()) != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_END_TIME, String.valueOf((int) endTime.getEpochSecond()));
        }
        return bundle;
    }
}
