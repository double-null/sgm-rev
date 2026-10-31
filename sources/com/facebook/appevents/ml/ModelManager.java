package com.facebook.appevents.ml;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.internal.k;
import od.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;
import rd.f0;

/* JADX INFO: compiled from: ModelManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager {
    private static final String ASSET_URI_KEY = "asset_uri";
    private static final String CACHE_KEY_MODELS = "models";
    private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    public static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final String MTML_USE_CASE = "MTML";
    private static final String RULES_URI_KEY = "rules_uri";
    private static final String THRESHOLD_KEY = "thresholds";
    private static final String USE_CASE_KEY = "use_case";
    private static final String VERSION_ID_KEY = "version_id";
    public static final ModelManager INSTANCE = new ModelManager();
    private static final Map<String, TaskHandler> taskHandlers = new ConcurrentHashMap();
    private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION = t.n("other", AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, AppEventsConstants.EVENT_NAME_ADDED_TO_CART, AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT);
    private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = t.n("none", IntegrityManager.INTEGRITY_TYPE_ADDRESS, IntegrityManager.INTEGRITY_TYPE_HEALTH);

    /* JADX INFO: compiled from: ModelManager.kt */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: compiled from: ModelManager.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Task.values().length];
                try {
                    iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String toKey() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String toUseCase() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    public static final class TaskHandler {
        public static final Companion Companion = new Companion(null);
        private String assetUri;
        private Model model;
        private Runnable onPostExecute;
        private File ruleFile;
        private String ruleUri;
        private float[] thresholds;
        private String useCase;
        private int versionId;

        /* JADX INFO: compiled from: ModelManager.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final void deleteOldFiles(String str, int i10) {
                File[] fileArrListFiles;
                File mlDir = Utils.getMlDir();
                if (mlDir == null || (fileArrListFiles = mlDir.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    kotlin.jvm.internal.t.e(name, "name");
                    if (c0.O(name, str, false, 2, null) && !c0.O(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            private final void download(String str, String str2, FileDownloadTask.Callback callback) {
                File file = new File(Utils.getMlDir(), str2);
                if (str == null || file.exists()) {
                    callback.onComplete(file);
                } else {
                    new FileDownloadTask(str, file, callback).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void execute$lambda$1(List slaves, File file) {
                kotlin.jvm.internal.t.f(slaves, "$slaves");
                kotlin.jvm.internal.t.f(file, "file");
                final Model modelBuild = Model.Companion.build(file);
                if (modelBuild != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final TaskHandler taskHandler = (TaskHandler) it.next();
                        TaskHandler.Companion.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new FileDownloadTask.Callback() { // from class: s1.e
                            @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                            public final void onComplete(File file2) {
                                ModelManager.TaskHandler.Companion.execute$lambda$1$lambda$0(taskHandler, modelBuild, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void execute$lambda$1$lambda$0(TaskHandler slave, Model model, File file) {
                kotlin.jvm.internal.t.f(slave, "$slave");
                kotlin.jvm.internal.t.f(file, "file");
                slave.setModel(model);
                slave.setRuleFile(file);
                Runnable runnable = slave.onPostExecute;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final TaskHandler build(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString(ModelManager.USE_CASE_KEY);
                    String assetUri = jSONObject.getString(ModelManager.ASSET_URI_KEY);
                    String strOptString = jSONObject.optString(ModelManager.RULES_URI_KEY, null);
                    int i10 = jSONObject.getInt(ModelManager.VERSION_ID_KEY);
                    float[] fArrAccess$parseJsonArray = ModelManager.access$parseJsonArray(ModelManager.INSTANCE, jSONObject.getJSONArray(ModelManager.THRESHOLD_KEY));
                    kotlin.jvm.internal.t.e(useCase, "useCase");
                    kotlin.jvm.internal.t.e(assetUri, "assetUri");
                    return new TaskHandler(useCase, assetUri, strOptString, i10, fArrAccess$parseJsonArray);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void execute(TaskHandler handler) {
                kotlin.jvm.internal.t.f(handler, "handler");
                execute(handler, s.e(handler));
            }

            public final void execute(TaskHandler master, final List<TaskHandler> slaves) {
                kotlin.jvm.internal.t.f(master, "master");
                kotlin.jvm.internal.t.f(slaves, "slaves");
                deleteOldFiles(master.getUseCase(), master.getVersionId());
                download(master.getAssetUri(), master.getUseCase() + '_' + master.getVersionId(), new FileDownloadTask.Callback() { // from class: s1.d
                    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                    public final void onComplete(File file) {
                        ModelManager.TaskHandler.Companion.execute$lambda$1(slaves, file);
                    }
                });
            }
        }

        public TaskHandler(String useCase, String assetUri, String str, int i10, float[] fArr) {
            kotlin.jvm.internal.t.f(useCase, "useCase");
            kotlin.jvm.internal.t.f(assetUri, "assetUri");
            this.useCase = useCase;
            this.assetUri = assetUri;
            this.ruleUri = str;
            this.versionId = i10;
            this.thresholds = fArr;
        }

        public final String getAssetUri() {
            return this.assetUri;
        }

        public final Model getModel() {
            return this.model;
        }

        public final File getRuleFile() {
            return this.ruleFile;
        }

        public final String getRuleUri() {
            return this.ruleUri;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final String getUseCase() {
            return this.useCase;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setAssetUri(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.assetUri = str;
        }

        public final void setModel(Model model) {
            this.model = model;
        }

        public final TaskHandler setOnPostExecute(Runnable runnable) {
            this.onPostExecute = runnable;
            return this;
        }

        public final void setRuleFile(File file) {
            this.ruleFile = file;
        }

        public final void setRuleUri(String str) {
            this.ruleUri = str;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final void setUseCase(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.useCase = str;
        }

        public final void setVersionId(int i10) {
            this.versionId = i10;
        }
    }

    /* JADX INFO: compiled from: ModelManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Task.values().length];
            try {
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] access$parseJsonArray(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final void addModels(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    TaskHandler taskHandlerBuild = TaskHandler.Companion.build(jSONObject.getJSONObject(itKeys.next()));
                    if (taskHandlerBuild != null) {
                        taskHandlers.put(taskHandlerBuild.getUseCase(), taskHandlerBuild);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            Utility.runOnNonUiThread(new Runnable() { // from class: s1.a
                @Override // java.lang.Runnable
                public final void run() {
                    ModelManager.enable$lambda$0();
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0() {
        JSONObject jSONObject;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(MODEL_ASSERT_STORE, 0);
            String string = sharedPreferences.getString(CACHE_KEY_MODELS, null);
            if (string != null) {
                jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
            }
            long j10 = sharedPreferences.getLong(CACHE_KEY_REQUEST_TIMESTAMP, 0L);
            if (!FeatureManager.isEnabled(FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !INSTANCE.isValidTimestamp(j10)) {
                jSONObject = INSTANCE.fetchModels();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString(CACHE_KEY_MODELS, jSONObject.toString()).putLong(CACHE_KEY_REQUEST_TIMESTAMP, System.currentTimeMillis()).apply();
                }
            }
            ModelManager modelManager = INSTANCE;
            modelManager.addModels(jSONObject);
            modelManager.enableMTML();
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final void enableMTML() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String assetUri = null;
            int iMax = 0;
            for (Map.Entry<String, TaskHandler> entry : taskHandlers.entrySet()) {
                String key = entry.getKey();
                TaskHandler value = entry.getValue();
                if (kotlin.jvm.internal.t.a(key, Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    String assetUri2 = value.getAssetUri();
                    int iMax2 = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                        arrayList.add(value.setOnPostExecute(new Runnable() { // from class: s1.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.enableMTML$lambda$1();
                            }
                        }));
                    }
                    assetUri = assetUri2;
                    iMax = iMax2;
                }
                if (kotlin.jvm.internal.t.a(key, Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    assetUri = value.getAssetUri();
                    iMax = Math.max(iMax, value.getVersionId());
                    if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.setOnPostExecute(new Runnable() { // from class: s1.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                ModelManager.enableMTML$lambda$2();
                            }
                        }));
                    }
                }
            }
            if (assetUri == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            TaskHandler.Companion.execute(new TaskHandler(MTML_USE_CASE, assetUri, null, iMax, null), arrayList);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableMTML$lambda$1() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            SuggestedEventsManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableMTML$lambda$2() {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return;
        }
        try {
            IntegrityManager.enable();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
        }
    }

    private final JSONObject fetchModels() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, TextUtils.join(",", strArr));
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "app/model_asset", null);
            graphRequestNewGraphPathRequest.setParameters(bundle);
            JSONObject jSONObject = graphRequestNewGraphPathRequest.executeAndWait().getJSONObject();
            if (jSONObject == null) {
                return null;
            }
            return parseRawJsonObject(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final File getRuleFile(Task task) {
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(task, "task");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final boolean isLocaleEnglish() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Locale resourceLocale = Utility.getResourceLocale();
            if (resourceLocale != null) {
                String language = resourceLocale.getLanguage();
                kotlin.jvm.internal.t.e(language, "locale.language");
                if (!f0.U(language, "en", false, 2, null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isValidTimestamp(long j10) {
        if (CrashShieldHandler.isObjectCrashing(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(JSONArray jSONArray) {
        if (CrashShieldHandler.isObjectCrashing(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    kotlin.jvm.internal.t.e(string, "jsonArray.getString(i)");
                    fArr[i10] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final JSONObject parseRawJsonObject(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(VERSION_ID_KEY, jSONObject3.getString(VERSION_ID_KEY));
                    jSONObject4.put(USE_CASE_KEY, jSONObject3.getString(USE_CASE_KEY));
                    jSONObject4.put(THRESHOLD_KEY, jSONObject3.getJSONArray(THRESHOLD_KEY));
                    jSONObject4.put(ASSET_URI_KEY, jSONObject3.getString(ASSET_URI_KEY));
                    if (jSONObject3.has(RULES_URI_KEY)) {
                        jSONObject4.put(RULES_URI_KEY, jSONObject3.getString(RULES_URI_KEY));
                    }
                    jSONObject2.put(jSONObject3.getString(USE_CASE_KEY), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final String[] predict(Task task, float[][] denses, String[] texts) {
        Model model;
        if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.t.f(task, "task");
            kotlin.jvm.internal.t.f(denses, "denses");
            kotlin.jvm.internal.t.f(texts, "texts");
            TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler != null && (model = taskHandler.getModel()) != null) {
                float[] thresholds = taskHandler.getThresholds();
                int length = texts.length;
                int length2 = denses[0].length;
                MTensor mTensor = new MTensor(new int[]{length, length2});
                for (int i10 = 0; i10 < length; i10++) {
                    System.arraycopy(denses[i10], 0, mTensor.getData(), i10 * length2, length2);
                }
                MTensor mTensorPredictOnMTML = model.predictOnMTML(mTensor, texts, task.toKey());
                if (mTensorPredictOnMTML != null && thresholds != null) {
                    if (!(mTensorPredictOnMTML.getData().length == 0)) {
                        if (!(thresholds.length == 0)) {
                            int i11 = WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                            if (i11 == 1) {
                                return INSTANCE.processSuggestedEventResult(mTensorPredictOnMTML, thresholds);
                            }
                            if (i11 == 2) {
                                return INSTANCE.processIntegrityDetectionResult(mTensorPredictOnMTML, thresholds);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ModelManager.class);
            return null;
        }
    }

    private final String[] processIntegrityDetectionResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            h hVarN = od.k.n(0, shape);
            ArrayList arrayList = new ArrayList(u.u(hVarN, 10));
            Iterator<Integer> it = hVarN.iterator();
            while (it.hasNext()) {
                int iNextInt = ((j0) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (data[(iNextInt * shape2) + i11] >= fArr[i10]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final String[] processSuggestedEventResult(MTensor mTensor, float[] fArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape2 != fArr.length) {
                return null;
            }
            h hVarN = od.k.n(0, shape);
            ArrayList arrayList = new ArrayList(u.u(hVarN, 10));
            Iterator<Integer> it = hVarN.iterator();
            while (it.hasNext()) {
                int iNextInt = ((j0) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (data[(iNextInt * shape2) + i11] >= fArr[i10]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
