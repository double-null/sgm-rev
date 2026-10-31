package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaw extends zzos {
    private final zzav zzm;
    private final zzog zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", CwEo.rXxthGy, "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    zzaw(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzn = new zzog(this.zzu.zzba());
        this.zzu.zzc();
        this.zzm = new zzav(this, this.zzu.zzaZ(), "google_app_measurement.db");
    }

    private final long zzaA(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaB(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    private final String zzaC(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    private final void zzaD(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.zzu.zzaW().zzd().zzb("Value of the primary key is not set.", zzgu.zzl("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseZze.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zzb().zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzd("Error storing into table. key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    private final zzbd zzaE(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    long j11 = cursorQuery.getLong(1);
                    long j12 = cursorQuery.getLong(2);
                    long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    cursor = cursorQuery;
                    try {
                        zzbd zzbdVar = new zzbd(str2, str3, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursor.moveToNext()) {
                            this.zzu.zzaW().zzb().zzb("Got multiple records for event aggregates, expected one. appId", zzgu.zzl(str2));
                        }
                        cursor.close();
                        return zzbdVar;
                    } catch (SQLiteException e10) {
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursor = cursorQuery;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                }
                cursorQuery = cursor;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
            }
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzd("Error querying events. appId", zzgu.zzl(str2), zzicVar.zzl().zza(str3), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor2 = cursorQuery;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private final void zzaF(String str, zzbd zzbdVar) {
        Preconditions.checkNotNull(zzbdVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbdVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbdVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbdVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbdVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbdVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbdVar.zzg));
        contentValues.put("last_bundled_day", zzbdVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.zzi);
        contentValues.put("last_sampling_rate", zzbdVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbdVar.zze));
        Boolean bool = zzbdVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaW().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", zzgu.zzl(str2));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing event aggregates. appId", zzgu.zzl(zzbdVar.zza), e10);
        }
    }

    private final void zzaG(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error deleting snapshot. appId", zzgu.zzl(str2), e10);
        }
    }

    private final zzpj zzaH(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaW().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzi(), bArr);
            zzls zzlsVarZzb = zzls.zzb(i10);
            if (zzlsVarZzb != zzls.GOOGLE_SIGNAL && zzlsVarZzb != zzls.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzco();
                    zzicVar.zzao(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbd());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.zzu.zzaW().zzb().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.zzb(j10);
            zzpiVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbd());
            zzpiVar.zzd(str2);
            zzpiVar.zze(map);
            zzpiVar.zzf(zzlsVarZzb);
            zzpiVar.zzg(j11);
            zzpiVar.zzh(j12);
            zzpiVar.zzi(j13);
            zzpiVar.zzj(i11);
            return zzpiVar.zza();
        } catch (IOException e10) {
            this.zzu.zzaW().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final String zzaI() {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        zzicVar.zzc();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(zzlsVar.zza()), lValueOf, Long.valueOf(((Long) zzfy.zzS.zzb(null)).longValue()));
        zzicVar.zzc();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(zzlsVar.zza()), lValueOf, Long.valueOf(zzal.zzI()));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    private static final String zzaJ(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    static final void zzaw(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long zzA(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l10) {
        int iDelete;
        zzg();
        zzay();
        Preconditions.checkNotNull(zzibVar);
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zzb.zza();
            zzic zzicVar = this.zzu;
            long jElapsedRealtime = zzicVar.zzba().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zzb.zzb(jElapsedRealtime);
                zzg();
                zzay();
                if (zzai() && (iDelete = zze().delete("upload_queue", zzaI(), new String[0])) > 0) {
                    zzicVar.zzaW().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                Preconditions.checkNotEmpty(str);
                zzg();
                zzay();
                try {
                    int iZzm = zzicVar.zzc().zzm(str, zzfy.zzz);
                    if (iZzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZzm)});
                    }
                } catch (SQLiteException e10) {
                    this.zzu.zzaW().zzb().zzc("Error deleting over the limit queued batches. appId", zzgu.zzl(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrZzcd = zzibVar.zzcd();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzcd);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        zzic zzicVar2 = this.zzu;
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar2.zzba().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = zze().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzicVar2.zzaW().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.zzu.zzaW().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    public final zzpj zzB(long j10) throws Throwable {
        Cursor cursorQuery;
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, AppEventsConstants.EVENT_PARAM_VALUE_YES);
            try {
                if (cursorQuery.moveToFirst()) {
                    zzpj zzpjVarZzaH = zzaH((String) Preconditions.checkNotNull(cursorQuery.getString(1)), j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return zzpjVarZzaH;
                }
            } catch (SQLiteException e10) {
                e = e10;
                try {
                    this.zzu.zzaW().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    public final List zzC(String str, zzoo zzooVar, int i10) {
        Cursor cursorQuery;
        List listEmptyList;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"};
            String strZzaJ = zzaJ(zzooVar.zza);
            String strZzaI = zzaI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzaJ).length() + 17 + strZzaI.length());
            sb2.append("app_id=?");
            sb2.append(strZzaJ);
            sb2.append(" AND NOT ");
            sb2.append(strZzaI);
            int i11 = 0;
            cursorQuery = sQLiteDatabaseZze.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            try {
                listEmptyList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    long j10 = cursorQuery.getLong(i11);
                    List list = listEmptyList;
                    cursor = cursorQuery;
                    try {
                        zzpj zzpjVarZzaH = zzaH(str, j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                        if (zzpjVarZzaH != null) {
                            list.add(zzpjVarZzaH);
                        }
                        listEmptyList = list;
                        cursorQuery = cursor;
                        i11 = 0;
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor2 = cursor;
                        try {
                            this.zzu.zzaW().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                            listEmptyList = Collections.emptyList();
                            cursorQuery = cursor2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursor = cursorQuery;
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e12) {
            e = e12;
        } catch (Throwable th4) {
            th = th4;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return listEmptyList;
    }

    public final boolean zzD(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strZzaJ = zzaJ(arrayList);
        String strZzaI = zzaI();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzaJ).length() + 61 + strZzaI.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strZzaJ);
        sb2.append(" AND NOT ");
        sb2.append(strZzaI);
        return zzaA(sb2.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    public final String zzF() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            cursorRawQuery = zze().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.zzu.zzaW().zzb().zzb("Database error getting next bundle app id", e10);
                }
            } catch (Throwable th) {
                cursor = cursorRawQuery;
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final boolean zzG() {
        return zzaA("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void zzH(long j10) {
        zzg();
        zzay();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    final void zzI() {
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zza.zza();
            zzic zzicVar = this.zzu;
            long jElapsedRealtime = zzicVar.zzba().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zza.zzb(jElapsedRealtime);
                zzg();
                zzay();
                if (zzai()) {
                    SQLiteDatabase sQLiteDatabaseZze = zze();
                    zzicVar.zzc();
                    int iDelete = sQLiteDatabaseZze.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzicVar.zzba().currentTimeMillis()), String.valueOf(zzal.zzI())});
                    if (iDelete > 0) {
                        zzicVar.zzaW().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    final void zzJ(List list) {
        zzg();
        zzay();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzai()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb2.append("(");
            sb2.append(strJoin);
            sb2.append(")");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb3.toString(), null) > 0) {
                this.zzu.zzaW().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseZze.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    final void zzK(Long l10) {
        zzg();
        zzay();
        Preconditions.checkNotNull(l10);
        if (zzai()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb2.toString(), null) > 0) {
                this.zzu.zzaW().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                long jCurrentTimeMillis = this.zzu.zzba().currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseZze.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    final Object zzL(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.zzu.zzaW().zzb().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.zzu.zzaW().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.zzu.zzaW().zzb().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long zzM() {
        return zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0097 A[Catch: SQLiteException -> 0x00b0, all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x001b, B:6:0x0043, B:8:0x0061, B:11:0x0076, B:13:0x0097, B:14:0x00ab, B:21:0x00b6), top: B:27:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:14:0x00ab A[Catch: SQLiteException -> 0x00b0, all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x001b, B:6:0x0043, B:8:0x0061, B:11:0x0076, B:13:0x0097, B:14:0x00ab, B:21:0x00b6), top: B:27:0x001b }] */
    protected final long zzN(String str, String str2) {
        long j10;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzay();
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        long j11 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j10 = -1;
                long jZzaB = zzaB(sb2.toString(), new String[]{str}, -1L);
                if (jZzaB == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZze.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzu.zzaW().zzb().zzc("Failed to insert column (got -1). appId", zzgu.zzl(str), "first_open_count");
                    } else {
                        jZzaB = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
                            if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.zzu.zzaW().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                            } else {
                                sQLiteDatabaseZze.setTransactionSuccessful();
                                j10 = jZzaB;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            j11 = jZzaB;
                            this.zzu.zzaW().zzb().zzd("Error inserting column. appId", zzgu.zzl(str), "first_open_count", e);
                            j10 = j11;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
                    if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.zzu.zzaW().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                    } else {
                        sQLiteDatabaseZze.setTransactionSuccessful();
                        j10 = jZzaB;
                    }
                }
            } finally {
                sQLiteDatabaseZze.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
        return j10;
    }

    public final long zzO() {
        return zzaB("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean zzP() {
        return zzaA("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzQ(String str, String str2) {
        return zzaA("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final boolean zzR() {
        return zzaA("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void zzS(List list) {
        Preconditions.checkNotNull(list);
        zzg();
        zzay();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i10)).longValue());
        }
        sb2.append(")");
        int iDelete = zze().delete("raw_events", sb2.toString(), null);
        if (iDelete != list.size()) {
            this.zzu.zzaW().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final long zzT(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaB("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final boolean zzW(String str, long j10) {
        try {
            return zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) <= 0 && zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzb("Error checking backfill conditions", e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:2: B:47:0x0104->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    public final void zzX(String str, Long l10, String str2, Bundle bundle) {
        zzic zzicVar;
        Bundle bundle2;
        zzbc zzbcVar;
        long j10;
        String str3;
        ContentValues contentValues;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        Iterator it;
        String str4 = str;
        Preconditions.checkNotNull(bundle);
        zzg();
        zzay();
        zzau zzauVar = l10 != null ? new zzau(this, str4, l10.longValue()) : new zzau(this, str4);
        List<zzat> listZza = zzauVar.zza();
        while (!listZza.isEmpty()) {
            for (zzat zzatVar : listZza) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.zzid zzidVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = zze().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(zzatVar.zzb)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorQuery.getBlob(0))).zzbd();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.zzu.zzaW().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor2 = cursorQuery;
                                                    this.zzu.zzaW().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                zzidVar2 = zzidVar;
                                            } catch (IOException e11) {
                                                this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str), e11);
                                                cursorQuery.close();
                                            }
                                            if (zzidVar2 != null) {
                                                it = zzidVar2.zzf().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).zzc().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(str));
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        zzidVar = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                zzidVar = null;
                            }
                            if (zzidVar2 != null) {
                                it = zzidVar2.zzf().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).zzc().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = zze().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (jUpdate != 1) {
                        zzicVar.zzaW().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e14) {
                    this.zzu.zzaW().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbcVar.zza), e14);
                }
                zzpg zzpgVar = this.zzg;
                zzpk zzpkVarZzp = zzpgVar.zzp();
                com.google.android.gms.internal.measurement.zzhs zzhsVar = zzatVar.zzd;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
                    if (zzhwVar.zzj()) {
                        bundle3.putDouble(zzhwVar.zzb(), zzhwVar.zzk());
                    } else if (zzhwVar.zzh()) {
                        bundle3.putFloat(zzhwVar.zzb(), zzhwVar.zzi());
                    } else if (zzhwVar.zze()) {
                        bundle3.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle3.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzl().isEmpty()) {
                        zzpkVarZzp.zzu.zzaW().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle3.putParcelableArray(zzhwVar.zzb(), zzpk.zzy(zzhwVar.zzl()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strZzd = zzhsVar.zzd();
                if (string == null) {
                    string = "";
                }
                zzgv zzgvVar = new zzgv(strZzd, string, bundle3, zzhsVar.zzf(), zzhsVar.zzo());
                zzicVar = this.zzu;
                Bundle bundle4 = zzgvVar.zze;
                String str5 = zzgvVar.zza;
                zzpp zzppVarZzk = zzicVar.zzk();
                if (str5.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                    }
                } else {
                    bundle2 = bundle;
                }
                zzppVarZzk.zzK(bundle4, bundle2);
                zzbcVar = new zzbc(this.zzu, zzgvVar.zzb, str, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzo(), zzhsVar.zzi(), bundle4);
                j10 = zzatVar.zza;
                long j11 = zzatVar.zzb;
                boolean z10 = zzatVar.zzc;
                zzg();
                zzay();
                Preconditions.checkNotNull(zzbcVar);
                str3 = zzbcVar.zza;
                Preconditions.checkNotEmpty(str3);
                byte[] bArrZzcd = zzpgVar.zzp().zzh(zzbcVar).zzcd();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", zzbcVar.zzb);
                contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(zzbcVar.zzd));
                contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                contentValues.put("data", bArrZzcd);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                str4 = str;
            }
            listZza = zzauVar.zza();
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.database.Cursor] */
    public final zzjl zzY(String str) {
        Throwable th;
        SQLiteException e10;
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        String[] strArr = {str};
        ?? RawQuery = "select consent_state, consent_source from consent_settings where app_id=? limit 1;";
        ?? r10 = 0;
        zzjlVarZzf = null;
        zzjlVarZzf = null;
        zzjl zzjlVarZzf = null;
        try {
            try {
                RawQuery = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", strArr);
                try {
                    if (RawQuery.moveToFirst()) {
                        zzjlVarZzf = zzjl.zzf(RawQuery.getString(0), RawQuery.getInt(1));
                    } else {
                        this.zzu.zzaW().zzk().zza("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.zzu.zzaW().zzb().zzb("Error querying database.", e10);
                    if (RawQuery != 0) {
                    }
                    if (zzjlVarZzf == null) {
                        return zzjl.zza;
                    }
                    return zzjlVarZzf;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = RawQuery;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        RawQuery.close();
        if (zzjlVarZzf == null) {
            return zzjl.zza;
        }
        return zzjlVarZzf;
    }

    public final void zzaa(String str, zzjl zzjlVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.zzb()));
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzba zzab(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return zzba.zzg(zzaC("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List zzac(String str) {
        zzg();
        zzay();
        List arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            sQLiteDatabaseZze.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseZze.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string = cursorQuery.getString(0);
                            String str2 = cursorQuery.isNull(1) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(1));
                            if (string == null) {
                                this.zzu.zzaW().zzb().zzb("Read null value from diagnostic signals table, ignoring it. appId", zzgu.zzl(str));
                            } else {
                                long j10 = cursorQuery.getLong(2);
                                com.google.android.gms.internal.measurement.zzfa zzfaVarZza = com.google.android.gms.internal.measurement.zzfb.zza();
                                zzfaVarZza.zza(string);
                                zzfaVarZza.zzd(j10);
                                zzfaVarZza.zzc(str2);
                                if (zIsEmpty) {
                                    zzfaVarZza.zzb(true);
                                }
                                arrayList.add((com.google.android.gms.internal.measurement.zzfb) zzfaVarZza.zzbd());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseZze.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseZze.setTransactionSuccessful();
                    } else {
                        sQLiteDatabaseZze.setTransactionSuccessful();
                    }
                } catch (SQLiteException e10) {
                    this.zzu.zzaW().zzb().zzc("Error querying or deleting diagnostic signals. appId", zzgu.zzl(str), e10);
                    arrayList = Collections.emptyList();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseZze.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseZze.endTransaction();
                throw th;
            }
        } catch (SQLiteException e11) {
            this.zzu.zzaW().zzb().zzc("Error opening database for diagnostic signals. appId", zzgu.zzl(str), e11);
            return Collections.emptyList();
        }
    }

    public final void zzad(String str, zzba zzbaVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzbaVar);
        zzg();
        zzay();
        zzjl zzjlVarZzY = zzY(str);
        zzjl zzjlVar = zzjl.zza;
        if (zzjlVarZzY == zzjlVar) {
            zzaa(str, zzjlVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzbaVar.zze());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final void zzae(String str, zzjl zzjlVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjlVar);
        zzg();
        zzay();
        zzaa(str, zzY(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.zzl());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzjl zzaf(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return zzjl.zzf(zzaC("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    final zzbd zzah(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) throws Throwable {
        zzbd zzbdVarZzaE = zzaE("events", str, zzhsVar.zzd());
        if (zzbdVarZzaE == null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgu.zzl(str), zzicVar.zzl().zza(str2));
            return new zzbd(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j10 = zzbdVarZzaE.zze + 1;
        long j11 = zzbdVarZzaE.zzd + 1;
        return new zzbd(zzbdVarZzaE.zza, zzbdVarZzaE.zzb, zzbdVarZzaE.zzc + 1, j11, j10, zzbdVarZzaE.zzf, zzbdVarZzaE.zzg, zzbdVarZzaE.zzh, zzbdVarZzaE.zzi, zzbdVarZzaE.zzj, zzbdVarZzaE.zzk);
    }

    protected final boolean zzai() {
        zzic zzicVar = this.zzu;
        Context contextZzaZ = zzicVar.zzaZ();
        zzicVar.zzc();
        return contextZzaZ.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long zzaj(String str, String[] strArr, long j10) {
        return zzaB("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    final /* synthetic */ zzog zzau() {
        return this.zzn;
    }

    public final void zzb() {
        zzay();
        zze().beginTransaction();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbc() {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(null, zzfy.zzbe)) {
            return false;
        }
        zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzaw zzawVar = this.zza;
                try {
                    SQLiteDatabase sQLiteDatabaseZze = zzawVar.zze();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseZze.update("raw_events", contentValues, null, null);
                } catch (SQLiteException e10) {
                    zzawVar.zzu.zzaW().zzb().zzb("Failed to remove elapsed times from raw events table", e10);
                }
            }
        });
        return false;
    }

    public final void zzc() {
        zzay();
        zze().setTransactionSuccessful();
    }

    public final void zzd() {
        zzay();
        zze().endTransaction();
    }

    final SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zze().zzb("Error opening database", e10);
            throw e10;
        }
    }

    public final zzbd zzf(String str, String str2) {
        return zzaE("events", str, str2);
    }

    public final void zzh(zzbd zzbdVar) {
        zzaF("events", zzbdVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[ADDED_TO_REGION] */
    public final void zzj(String str) throws Throwable {
        boolean z10;
        zzbd zzbdVarZzaE;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbd zzbdVarZzaE2 = zzaE("events", str, "_f");
        zzbd zzbdVarZzaE3 = zzaE("events", str, "_v");
        zzaG("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = zze().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (zzbdVarZzaE = zzaE("events_snapshot", str, string)) != null) {
                            zzaF("events", zzbdVarZzaE);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            this.zzu.zzaW().zzb().zzc("Error querying snapshot. appId", zzgu.zzl(str), e);
                            z12 = z11;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && zzbdVarZzaE2 != null) {
                                zzaF("events", zzbdVarZzaE2);
                            } else if (!z10 && zzbdVarZzaE3 != null) {
                                zzaF("events", zzbdVarZzaE3);
                            }
                            zzaG("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                zzaF("events", zzbdVarZzaE3);
                            }
                        } else if (!z10) {
                            zzaF("events", zzbdVarZzaE3);
                        }
                        zzaG("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && zzbdVarZzaE2 != null) {
                    zzaF("events", zzbdVarZzaE2);
                } else if (!z10 && zzbdVarZzaE3 != null) {
                    zzaF("events", zzbdVarZzaE3);
                }
            } else {
                cursorQuery.close();
                if (zzbdVarZzaE2 != null) {
                    zzaF("events", zzbdVarZzaE2);
                } else if (zzbdVarZzaE3 != null) {
                    zzaF("events", zzbdVarZzaE3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
        zzaG("events_snapshot", str);
    }

    public final void zzk(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzd("Error deleting user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e10);
        }
    }

    public final boolean zzl(zzpn zzpnVar) {
        Preconditions.checkNotNull(zzpnVar);
        zzg();
        zzay();
        String str = zzpnVar.zza;
        String str2 = zzpnVar.zzc;
        if (zzm(str, str2) == null) {
            if (zzpp.zzh(str2)) {
                if (zzaA("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzc().zzn(str, zzfy.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzaA = zzaA("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzpnVar.zzb});
                this.zzu.zzc();
                if (jZzaA >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpnVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.zzd));
        zzaw(contentValues, "value", zzpnVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zzb().zzb("Failed to insert/update user property (got -1). appId", zzgu.zzl(str));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing user property. appId", zzgu.zzl(zzpnVar.zza), e10);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    public final zzpn zzm(String str, String str2) {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        Object objZzL = zzL(cursorQuery, 1);
                        if (objZzL != null) {
                            zzpn zzpnVar = new zzpn(str, cursorQuery.getString(2), str2, j10, objZzL);
                            if (cursorQuery.moveToNext()) {
                                this.zzu.zzaW().zzb().zzb("Got multiple records for user property, expected one. appId", zzgu.zzl(str));
                            }
                            cursorQuery.close();
                            return zzpnVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaW().zzb().zzd("Error querying user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
    public final List zzo(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(str);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = null;
                        try {
                            this.zzu.zzaW().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                            arrayList = Collections.emptyList();
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb3.append(str3);
                    sb3.append("*");
                    arrayList2.add(sb3.toString());
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String string = sb2.toString();
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = zze().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                zzicVar.zzc();
                                if (size >= 1000) {
                                    zzgs zzgsVarZzb = zzicVar.zzaW().zzb();
                                    zzicVar.zzc();
                                    zzgsVarZzb.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j10 = cursorQuery.getLong(1);
                                Object objZzL = zzL(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objZzL == null) {
                                    try {
                                        zzicVar.zzaW().zzb().zzd("(2)Read invalid user property value, ignoring it", zzgu.zzl(str), string3, str3);
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        cursor = cursorQuery;
                                        str4 = string3;
                                        this.zzu.zzaW().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                        arrayList = Collections.emptyList();
                                        cursorQuery = cursor;
                                    }
                                } else {
                                    arrayList.add(new zzpn(str, string3, string2, j10, objZzL));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str4 = string3;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = cursorQuery;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str4 = str2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean zzp(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzay();
        String str = zzahVar.zza;
        Preconditions.checkNotNull(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long jZzaA = zzaA("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzu.zzc();
            if (jZzaA >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put("name", zzahVar.zzc.zzb);
        zzaw(contentValues, "value", Preconditions.checkNotNull(zzahVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzahVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzahVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzahVar.zzh));
        zzic zzicVar = this.zzu;
        contentValues.put("timed_out_event", zzicVar.zzk().zzah(zzahVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzahVar.zzd));
        contentValues.put("triggered_event", zzicVar.zzk().zzah(zzahVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzicVar.zzk().zzah(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert/update conditional user property (got -1)", zzgu.zzl(str));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing conditional user property", zzgu.zzl(str), e10);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011d  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x011a: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:283), block:B:30:0x011a */
    public final zzah zzq(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        String str3 = string;
                        Object objZzL = zzL(cursorQuery, 1);
                        boolean z10 = cursorQuery.getInt(2) != 0;
                        String string2 = cursorQuery.getString(3);
                        long j10 = cursorQuery.getLong(4);
                        zzpg zzpgVar = this.zzg;
                        zzpk zzpkVarZzp = zzpgVar.zzp();
                        byte[] blob = cursorQuery.getBlob(5);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzah zzahVar = new zzah(str, str3, new zzpl(str2, cursorQuery.getLong(8), objZzL, str3), cursorQuery.getLong(6), z10, string2, (zzbh) zzpkVarZzp.zzl(blob, creator), j10, (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzic zzicVar = this.zzu;
                            zzicVar.zzaW().zzb().zzc("Got multiple records for conditional property, expected one", zzgu.zzl(str), zzicVar.zzl().zzc(str2));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    zzic zzicVar2 = this.zzu;
                    zzicVar2.zzaW().zzb().zzd("Error querying conditional property", zzgu.zzl(str), zzicVar2.zzl().zzc(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final int zzr(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            return zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzd("Error deleting conditional property", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e10);
            return 0;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List zzt(String str, String[] strArr) {
        zzg();
        zzay();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = sQLiteDatabaseZze.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        zzicVar.zzc();
                        if (size >= 1000) {
                            zzgs zzgsVarZzb = zzicVar.zzaW().zzb();
                            zzicVar.zzc();
                            zzgsVarZzb.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objZzL = zzL(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j10 = cursorQuery.getLong(6);
                        zzpg zzpgVar = this.zzg;
                        zzpk zzpkVarZzp = zzpgVar.zzp();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzpkVarZzp.zzl(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, cursorQuery.getLong(10), objZzL, string2), cursorQuery.getLong(8), z10, string4, zzbhVar, j10, (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzb("Error querying conditional user property value", e10);
                arrayList = Collections.emptyList();
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0321  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x031e: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:799), block:B:98:0x031e */
    public final zzh zzu(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                boolean z10 = true;
                cursorQuery = zze().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpg zzpgVar = this.zzg;
                        zzh zzhVar = new zzh(zzpgVar.zzah(), str);
                        zzjl zzjlVarZzB = zzpgVar.zzB(str);
                        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                        if (zzjlVarZzB.zzo(zzjkVar)) {
                            zzhVar.zze(cursorQuery.getString(0));
                        }
                        zzhVar.zzg(cursorQuery.getString(1));
                        if (zzpgVar.zzB(str).zzo(zzjk.AD_STORAGE)) {
                            zzhVar.zzk(cursorQuery.getString(2));
                        }
                        zzhVar.zzF(cursorQuery.getLong(3));
                        zzhVar.zzo(cursorQuery.getLong(4));
                        zzhVar.zzq(cursorQuery.getLong(5));
                        zzhVar.zzs(cursorQuery.getString(6));
                        zzhVar.zzw(cursorQuery.getString(7));
                        zzhVar.zzy(cursorQuery.getLong(8));
                        zzhVar.zzA(cursorQuery.getLong(9));
                        zzhVar.zzE(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.zzO(cursorQuery.getLong(11));
                        zzhVar.zzQ(cursorQuery.getLong(12));
                        zzhVar.zzS(cursorQuery.getLong(13));
                        zzhVar.zzU(cursorQuery.getLong(14));
                        zzhVar.zzI(cursorQuery.getLong(15));
                        zzhVar.zzK(cursorQuery.getLong(16));
                        zzhVar.zzu(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzhVar.zzm(cursorQuery.getString(18));
                        zzhVar.zzY(cursorQuery.getLong(19));
                        zzhVar.zzW(cursorQuery.getLong(20));
                        zzhVar.zzab(cursorQuery.getString(21));
                        zzhVar.zzad(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        zzhVar.zzC(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.zzah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpgVar.zzB(str).zzo(zzjkVar)) {
                            zzhVar.zzi(cursorQuery.getString(28));
                        }
                        zzhVar.zzaj((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        zzhVar.zzaE(cursorQuery.getLong(39));
                        zzhVar.zzaz(cursorQuery.getString(36));
                        zzhVar.zzal(cursorQuery.getLong(30));
                        zzhVar.zzan(cursorQuery.getLong(31));
                        zzaif.zza();
                        zzic zzicVar = this.zzu;
                        if (zzicVar.zzc().zzp(str, zzfy.zzaO)) {
                            zzhVar.zzap(cursorQuery.getInt(32));
                            zzhVar.zzax(cursorQuery.getLong(35));
                        }
                        zzhVar.zzar((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            if (cursorQuery.getInt(34) == 0) {
                                z10 = false;
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        }
                        zzhVar.zzaf(boolValueOf);
                        zzhVar.zzaB(cursorQuery.getInt(37));
                        zzhVar.zzaD(cursorQuery.getInt(38));
                        zzhVar.zzaG(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            zzhVar.zzat(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzhVar.zzav(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        zzhVar.zzaI(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            zzhVar.zzaK(cursorQuery.getInt(44));
                        }
                        if (zzicVar.zzc().zzp(str, zzfy.zzbj) && !cursorQuery.isNull(45)) {
                            zzhVar.zzaM(cursorQuery.getLong(45));
                        }
                        zzhVar.zzb();
                        if (cursorQuery.moveToNext()) {
                            zzicVar.zzaW().zzb().zzb("Got multiple records for app, expected one. appId", zzgu.zzl(str));
                        }
                        cursorQuery.close();
                        return zzhVar;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.zzu.zzaW().zzb().zzc("Error querying app. appId", zzgu.zzl(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void zzv(zzh zzhVar, boolean z10, boolean z11) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzay();
        String strZzc = zzhVar.zzc();
        Preconditions.checkNotNull(strZzc);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzc);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        zzpg zzpgVar = this.zzg;
        if (zzpgVar.zzB(strZzc).zzo(zzjk.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpgVar.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzaif.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzaO)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        List listZzag = zzhVar.zzag();
        if (listZzag != null) {
            if (listZzag.isEmpty()) {
                zzicVar.zzaW().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzag));
            }
        }
        zzahk.zza();
        if (zzicVar.zzc().zzp(null, zzfy.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzbj)) {
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(zzhVar.zzaN()));
        }
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (sQLiteDatabaseZze.update("apps", contentValues, "app_id = ?", new String[]{strZzc}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert/update app (got -1). appId", zzgu.zzl(strZzc));
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing app. appId", zzgu.zzl(strZzc), e10);
        }
    }

    public final zzar zzw(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return zzx(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final zzar zzx(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                cursorQuery = sQLiteDatabaseZze.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        zzarVar.zzb = cursorQuery.getLong(1);
                        zzarVar.zza = cursorQuery.getLong(2);
                        zzarVar.zzc = cursorQuery.getLong(3);
                        zzarVar.zzd = cursorQuery.getLong(4);
                        zzarVar.zze = cursorQuery.getLong(5);
                        zzarVar.zzf = cursorQuery.getLong(6);
                        zzarVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        zzarVar.zzb += j11;
                    }
                    if (z11) {
                        zzarVar.zza += j11;
                    }
                    if (z12) {
                        zzarVar.zzc += j11;
                    }
                    if (z13) {
                        zzarVar.zzd += j11;
                    }
                    if (z14) {
                        zzarVar.zze += j11;
                    }
                    if (z15) {
                        zzarVar.zzf += j11;
                    }
                    if (z16) {
                        zzarVar.zzg += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    sQLiteDatabaseZze.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaW().zze().zzb("Not updating daily counts, app is not known. appId", zzgu.zzl(str));
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Error updating daily counts. appId", zzgu.zzl(str), e10);
            }
            return zzarVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0083: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:132), block:B:26:0x0083 */
    public final zzaq zzy(String str) throws Throwable {
        SQLiteException e10;
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaW().zzb().zzb("Got multiple records for app config, expected one. appId", zzgu.zzl(str));
                        }
                        if (blob != null) {
                            zzaq zzaqVar = new zzaq(blob, string, string2);
                            cursorQuery.close();
                            return zzaqVar;
                        }
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.zzu.zzaW().zzb().zzc("Error querying remote config. appId", zzgu.zzl(str), e10);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0045  */
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z10) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzidVar);
        Preconditions.checkNotEmpty(zzidVar.zzA());
        Preconditions.checkState(zzidVar.zzn());
        zzI();
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        long jZzo = zzidVar.zzo();
        zzicVar.zzc();
        if (jZzo >= jCurrentTimeMillis - zzal.zzI()) {
            long jZzo2 = zzidVar.zzo();
            zzicVar.zzc();
            if (jZzo2 > zzal.zzI() + jCurrentTimeMillis) {
                zzicVar.zzaW().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
            }
        } else {
            zzicVar.zzaW().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
        }
        try {
            byte[] bArrZzv = this.zzg.zzp().zzv(zzidVar.zzcd());
            zzic zzicVar2 = this.zzu;
            zzicVar2.zzaW().zzk().zzb("Saving bundle, size", Integer.valueOf(bArrZzv.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", bArrZzv);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (zze().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzicVar2.zzaW().zzb().zzb("Failed to insert bundle (got -1). appId", zzgu.zzl(zzidVar.zzA()));
                return false;
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Error storing bundle. appId", zzgu.zzl(zzidVar.zzA()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.zzu.zzaW().zzb().zzc("Data loss. Failed to serialize bundle. appId", zzgu.zzl(zzidVar.zzA()), e11);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03c3 A[LOOP:8: B:85:0x02ab->B:122:0x03c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x029b A[LOOP:7: B:55:0x01b7->B:83:0x029b, LOOP_END] */
    final void zzag(String str, List list) {
        Iterator it;
        Iterator it2;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i10 = 0;
        while (i10 < list.size()) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) list.get(i10)).zzco();
            if (zzfcVar.zzd() != 0) {
                int i11 = 0;
                while (i11 < zzfcVar.zzd()) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzfcVar.zze(i11).zzco();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    String strZzb = zzjm.zzb(zzfeVar.zza());
                    if (strZzb != null) {
                        zzfeVar2.zzb(strZzb);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i12 = 0;
                    while (i12 < zzfeVar.zzc()) {
                        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfeVar.zzd(i12);
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        String str3 = str2;
                        String strZzc = zzlt.zzc(zzfhVarZzd.zzi(), zzjn.zza, zzjn.zzb);
                        if (strZzc != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzfhVarZzd.zzco();
                            zzfgVar.zza(strZzc);
                            zzfeVar2.zze(i12, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzbd());
                            z12 = true;
                        }
                        i12++;
                        zzfeVar = zzfeVar3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z12) {
                        zzfcVar.zzf(i11, zzfeVar2);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbd());
                    }
                    i11++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (zzfcVar.zza() != 0) {
                for (int i13 = 0; i13 < zzfcVar.zza(); i13++) {
                    com.google.android.gms.internal.measurement.zzfn zzfnVarZzb = zzfcVar.zzb(i13);
                    String strZzc2 = zzlt.zzc(zzfnVarZzb.zzc(), zzjo.zza, zzjo.zzb);
                    if (strZzc2 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzfnVarZzb.zzco();
                        zzfmVar.zza(strZzc2);
                        zzfcVar.zzc(i13, zzfmVar);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbd());
                    }
                }
            }
            i10++;
            str2 = str5;
        }
        String str6 = str2;
        zzay();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        try {
            zzay();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZze2 = zze();
            sQLiteDatabaseZze2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZze2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) it3.next();
                zzay();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzfdVar);
                if (zzfdVar.zza()) {
                    int iZzb = zzfdVar.zzb();
                    Iterator it4 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff) it4.next()).zza()) {
                                this.zzu.zzaW().zze().zzc(cTJaRZ.sqZA, zzgu.zzl(str), Integer.valueOf(iZzb));
                                break;
                            }
                        } else {
                            Iterator it5 = zzfdVar.zzc().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    Iterator it6 = zzfdVar.zzf().iterator();
                                    while (true) {
                                        boolean zHasNext = it6.hasNext();
                                        String str7 = ykDFMuXDQMaR.qKXGBkeNhOj;
                                        if (!zHasNext) {
                                            it = it3;
                                            Iterator it7 = zzfdVar.zzc().iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    it3 = it;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                zzay();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(zzfnVar);
                                                if (zzfnVar.zzc().isEmpty()) {
                                                    it2 = it7;
                                                    this.zzu.zzaW().zze().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iZzb), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                                    z10 = false;
                                                } else {
                                                    it2 = it7;
                                                    byte[] bArrZzcd = zzfnVar.zzcd();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put(str7, Integer.valueOf(iZzb));
                                                    contentValues.put("filter_id", zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
                                                    contentValues.put("property_name", zzfnVar.zzc());
                                                    contentValues.put("session_scoped", zzfnVar.zzh() ? Boolean.valueOf(zzfnVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzcd);
                                                    try {
                                                        try {
                                                            if (zze().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                try {
                                                                    this.zzu.zzaW().zzb().zzb("Failed to insert property filter (got -1). appId", zzgu.zzl(str));
                                                                } catch (SQLiteException e10) {
                                                                    e = e10;
                                                                    this.zzu.zzaW().zzb().zzc("Error storing property filter. appId", zzgu.zzl(str), e);
                                                                }
                                                                z10 = false;
                                                            } else {
                                                                z10 = true;
                                                            }
                                                        } catch (SQLiteException e11) {
                                                            e = e11;
                                                            this.zzu.zzaW().zzb().zzc("Error storing property filter. appId", zzgu.zzl(str), e);
                                                            z10 = false;
                                                            if (z10) {
                                                                zzay();
                                                                zzg();
                                                                Preconditions.checkNotEmpty(str);
                                                                SQLiteDatabase sQLiteDatabaseZze3 = zze();
                                                                String str8 = str6;
                                                                sQLiteDatabaseZze3.delete("property_filters", str8, new String[]{str, String.valueOf(iZzb)});
                                                                sQLiteDatabaseZze3.delete("event_filters", str8, new String[]{str, String.valueOf(iZzb)});
                                                                str6 = str8;
                                                                it3 = it;
                                                                break;
                                                            }
                                                            it7 = it2;
                                                        }
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                    }
                                                }
                                                if (z10) {
                                                    it7 = it2;
                                                }
                                            }
                                        } else {
                                            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                            zzay();
                                            zzg();
                                            Preconditions.checkNotEmpty(str);
                                            Preconditions.checkNotNull(zzffVar);
                                            if (zzffVar.zzc().isEmpty()) {
                                                this.zzu.zzaW().zze().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iZzb), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
                                                it = it3;
                                            } else {
                                                byte[] bArrZzcd2 = zzffVar.zzcd();
                                                it = it3;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put(str7, Integer.valueOf(iZzb));
                                                contentValues2.put("filter_id", zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
                                                contentValues2.put("event_name", zzffVar.zzc());
                                                contentValues2.put("session_scoped", zzffVar.zzl() ? Boolean.valueOf(zzffVar.zzm()) : null);
                                                contentValues2.put("data", bArrZzcd2);
                                                try {
                                                    if (zze().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.zzu.zzaW().zzb().zzb(UyXgnuLGEkgnZE.JWQHg, zzgu.zzl(str));
                                                    }
                                                    z11 = true;
                                                } catch (SQLiteException e13) {
                                                    this.zzu.zzaW().zzb().zzc("Error storing event filter. appId", zzgu.zzl(str), e13);
                                                    z11 = false;
                                                }
                                                if (!z11) {
                                                    it3 = it;
                                                }
                                            }
                                            z11 = false;
                                            if (!z11) {
                                                it3 = it;
                                            }
                                        }
                                        zzay();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseZze4 = zze();
                                        String str9 = str6;
                                        sQLiteDatabaseZze4.delete("property_filters", str9, new String[]{str, String.valueOf(iZzb)});
                                        sQLiteDatabaseZze4.delete("event_filters", str9, new String[]{str, String.valueOf(iZzb)});
                                        str6 = str9;
                                        it3 = it;
                                        break;
                                    }
                                }
                                if (!((com.google.android.gms.internal.measurement.zzfn) it5.next()).zza()) {
                                    this.zzu.zzaW().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(iZzb));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzu.zzaW().zze().zzb("Audience with no ID. appId", zzgu.zzl(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar2 = (com.google.android.gms.internal.measurement.zzfd) it8.next();
                arrayList.add(zzfdVar2.zza() ? Integer.valueOf(zzfdVar2.zzb()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzay();
            zzg();
            SQLiteDatabase sQLiteDatabaseZze5 = zze();
            try {
                long jZzaA = zzaA("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzu.zzc().zzm(str, zzfy.zzU)));
                if (jZzaA > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZze5.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e14) {
                this.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str), e14);
            }
            sQLiteDatabaseZze.setTransactionSuccessful();
            sQLiteDatabaseZze.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseZze.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f1 A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0106 A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0121 A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0150  */
    /* JADX WARN: Code duplicated, block: B:45:0x0154  */
    /* JADX WARN: Code duplicated, block: B:46:0x0156 A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0161  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa A[Catch: SQLiteException -> 0x0076, all -> 0x0079, LOOP:0: B:58:0x01aa->B:90:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f7 A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe A[Catch: SQLiteException -> 0x0076, all -> 0x0079, TryCatch #1 {SQLiteException -> 0x0076, blocks: (B:16:0x006e, B:33:0x00c0, B:35:0x00f1, B:36:0x0106, B:37:0x010b, B:38:0x011b, B:40:0x0121, B:41:0x0135, B:52:0x016b, B:55:0x0173, B:56:0x0183, B:58:0x01aa, B:59:0x01b7, B:61:0x01c2, B:66:0x01f7, B:65:0x01e2, B:69:0x01fe, B:46:0x0156, B:71:0x0213), top: B:83:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e0 A[SYNTHETIC] */
    public final void zzav(String str, long j10, long j11, zzpc zzpcVar) {
        String string;
        String str2;
        String string2;
        long jZzaB;
        long j12;
        String[] strArr;
        String str3;
        long j13;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        Preconditions.checkNotNull(zzpcVar);
        zzg();
        zzay();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                if (TextUtils.isEmpty(str)) {
                    String[] strArr2 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                    str2 = j11 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb2 = new StringBuilder(str2.length() + 148);
                    sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb2.append(str2);
                    sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb2.toString(), strArr2);
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        try {
                            string2 = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                            cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                try {
                                    com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbd();
                                    if (cursorRawQuery.moveToNext()) {
                                        this.zzu.zzaW().zze().zzb(XDucgbzInpQa.gMSBl, zzgu.zzl(string));
                                    }
                                    cursorRawQuery.close();
                                    Preconditions.checkNotNull(zzidVar);
                                    zzpcVar.zza = zzidVar;
                                    jZzaB = zzaB("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{string, string2}, -1L);
                                    if (j11 == -1) {
                                        if (jZzaB != -1) {
                                            j12 = -1;
                                        } else {
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                            strArr = new String[]{string, string2};
                                        }
                                        cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data", "elapsed_time"}, str3, strArr, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j13 = cursorRawQuery.getLong(0);
                                                byte[] blob = cursorRawQuery.getBlob(3);
                                                long j14 = cursorRawQuery.getLong(4);
                                                try {
                                                    zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob);
                                                    zzhrVar.zzl(cursorRawQuery.getString(1));
                                                    zzhrVar.zzo(cursorRawQuery.getLong(2));
                                                    zzhrVar.zzw(j14);
                                                    if (!zzpcVar.zza(j13, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd())) {
                                                        break;
                                                    }
                                                } catch (IOException e10) {
                                                    this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(string), e10);
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(string));
                                        }
                                    } else {
                                        j12 = j11;
                                    }
                                    if (j12 == -1 && jZzaB != -1) {
                                        jZzaB = Math.min(j12, jZzaB);
                                    } else if (j12 != -1) {
                                        jZzaB = j12;
                                    }
                                    strArr = new String[]{string, string2, String.valueOf(jZzaB)};
                                    str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data", "elapsed_time"}, str3, strArr, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j13 = cursorRawQuery.getLong(0);
                                            byte[] blob2 = cursorRawQuery.getBlob(3);
                                            long j15 = cursorRawQuery.getLong(4);
                                            zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob2);
                                            zzhrVar.zzl(cursorRawQuery.getString(1));
                                            zzhrVar.zzo(cursorRawQuery.getLong(2));
                                            zzhrVar.zzw(j15);
                                            if (!zzpcVar.zza(j13, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(string));
                                    }
                                } catch (IOException e11) {
                                    this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(string), e11);
                                }
                            } else {
                                this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(string));
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            this.zzu.zzaW().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(string), e);
                        }
                    }
                } else {
                    String[] strArr3 = j11 != -1 ? new String[]{str, String.valueOf(j11)} : new String[]{str};
                    str2 = j11 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(str2.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str2);
                    sb3.append(" order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb3.toString(), strArr3);
                    if (cursorRawQuery.moveToFirst()) {
                        string2 = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        string = str;
                        cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
                        if (cursorRawQuery.moveToFirst()) {
                            this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(string));
                        } else {
                            com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbd();
                            if (cursorRawQuery.moveToNext()) {
                                this.zzu.zzaW().zze().zzb(XDucgbzInpQa.gMSBl, zzgu.zzl(string));
                            }
                            cursorRawQuery.close();
                            Preconditions.checkNotNull(zzidVar2);
                            zzpcVar.zza = zzidVar2;
                            jZzaB = zzaB("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{string, string2}, -1L);
                            if (j11 == -1) {
                                if (jZzaB != -1) {
                                    j12 = -1;
                                } else {
                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{string, string2};
                                }
                                cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data", "elapsed_time"}, str3, strArr, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j13 = cursorRawQuery.getLong(0);
                                        byte[] blob3 = cursorRawQuery.getBlob(3);
                                        long j16 = cursorRawQuery.getLong(4);
                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob3);
                                        zzhrVar.zzl(cursorRawQuery.getString(1));
                                        zzhrVar.zzo(cursorRawQuery.getLong(2));
                                        zzhrVar.zzw(j16);
                                        if (!zzpcVar.zza(j13, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(string));
                                }
                            } else {
                                j12 = j11;
                            }
                            if (j12 == -1) {
                                if (j12 != -1) {
                                    jZzaB = j12;
                                }
                            } else if (j12 != -1) {
                                jZzaB = j12;
                            }
                            strArr = new String[]{string, string2, String.valueOf(jZzaB)};
                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data", "elapsed_time"}, str3, strArr, null, null, "rowid", null);
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    j13 = cursorRawQuery.getLong(0);
                                    byte[] blob4 = cursorRawQuery.getBlob(3);
                                    long j17 = cursorRawQuery.getLong(4);
                                    zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob4);
                                    zzhrVar.zzl(cursorRawQuery.getString(1));
                                    zzhrVar.zzo(cursorRawQuery.getLong(2));
                                    zzhrVar.zzw(j17);
                                    if (!zzpcVar.zza(j13, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd())) {
                                        break;
                                        break;
                                    }
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(string));
                            }
                        }
                    }
                }
            } catch (SQLiteException e13) {
                e = e13;
                string = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    public final void zzi(String str) {
        zzbd zzbdVarZzaE;
        zzaG("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zze().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), VRfCTjjLv.YsNIjfAUf, new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbdVarZzaE = zzaE("events", str, string)) != null) {
                            zzaF("events_snapshot", zzbdVarZzaE);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Error creating snapshot. appId", zzgu.zzl(str), e10);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final void zzE(Long l10) {
        zzg();
        zzay();
        Preconditions.checkNotNull(l10);
        try {
            if (zze().delete(oqHAiWkeGzWld.ghxbAzMkpWqBaY, "rowid=?", new String[]{l10.toString()}) != 1) {
                this.zzu.zzaW().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    public final boolean zzU(String str, Long l10, long j10, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzhsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        zzic zzicVar = this.zzu;
        byte[] bArrZzcd = zzhsVar.zzcd();
        zzicVar.zzaW().zzk().zzc("Saving complex main event, appId, data size", zzicVar.zzl().zza(str), Integer.valueOf(bArrZzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put(vgmm.EMINYXhCdpnVYr, bArrZzcd);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert complex main event (got -1). appId", zzgu.zzl(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing complex main event. appId", zzgu.zzl(str), e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:132), block:B:26:0x0084 */
    public final Bundle zzV(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzu.zzaW().zzk().zza("Default event parameters not found");
                    } else {
                        try {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), cursorRawQuery.getBlob(0))).zzbd();
                            this.zzg.zzp();
                            Bundle bundleZzH = zzpk.zzH(zzhsVar.zza());
                            cursorRawQuery.close();
                            return bundleZzH;
                        } catch (IOException e10) {
                            this.zzu.zzaW().zzb().zzc("Failed to retrieve default event parameters. appId", zzgu.zzl(str), e10);
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.zzu.zzaW().zzb().zzb(vgmm.wPANvqZfLK, e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final boolean zzZ(String str, zzoh zzohVar) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzohVar);
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        zzfx zzfxVar = zzfy.zzau;
        long jLongValue = jCurrentTimeMillis - ((Long) zzfxVar.zzb(null)).longValue();
        long j10 = zzohVar.zzb;
        if (j10 < jLongValue || j10 > ((Long) zzfxVar.zzb(null)).longValue() + jCurrentTimeMillis) {
            zzicVar.zzaW().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        zzicVar.zzaW().zzk().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(VRfCTjjLv.OhdYng, str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put(ShareConstants.FEED_SOURCE_PARAM, Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (zze().insert("trigger_uris", null, contentValues) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert trigger URI (got -1). appId", zzgu.zzl(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzc("Error storing trigger URI. appId", zzgu.zzl(str), e10);
            return false;
        }
    }

    public final List zzn(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        List arrayList = new ArrayList();
        String str2 = EFLCCdIRcb.eGys;
        Cursor cursorQuery = null;
        try {
            try {
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = zze().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", str2);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j10 = cursorQuery.getLong(2);
                        Object objZzL = zzL(cursorQuery, 3);
                        if (objZzL == null) {
                            zzicVar.zzaW().zzb().zzb("Read invalid user property value, ignoring it. appId", zzgu.zzl(str));
                        } else {
                            arrayList.add(new zzpn(str, str3, string, j10, objZzL));
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.zzu.zzaW().zzb().zzc("Error querying user properties. appId", zzgu.zzl(str), e10);
                arrayList = Collections.emptyList();
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
