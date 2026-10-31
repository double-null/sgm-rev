package com.facebook.bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AppLink.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppLink {
    private final Uri sourceUrl;
    private final List<Target> targets;
    private final Uri webUrl;

    /* JADX INFO: compiled from: AppLink.kt */
    public static final class Target {
        private final String appName;
        private final String className;
        private final String packageName;
        private final Uri url;

        public Target(String packageName, String className, Uri url, String appName) {
            t.f(packageName, "packageName");
            t.f(className, "className");
            t.f(url, "url");
            t.f(appName, "appName");
            this.packageName = packageName;
            this.className = className;
            this.url = url;
            this.appName = appName;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final Uri getUrl() {
            return this.url;
        }
    }

    public AppLink(Uri sourceUrl, List<Target> list, Uri webUrl) {
        t.f(sourceUrl, "sourceUrl");
        t.f(webUrl, "webUrl");
        this.sourceUrl = sourceUrl;
        this.webUrl = webUrl;
        this.targets = list == null ? kotlin.collections.t.k() : list;
    }

    public final Uri getSourceUrl() {
        return this.sourceUrl;
    }

    public final List<Target> getTargets() {
        List<Target> listUnmodifiableList = Collections.unmodifiableList(this.targets);
        t.e(listUnmodifiableList, "unmodifiableList(field)");
        return listUnmodifiableList;
    }

    public final Uri getWebUrl() {
        return this.webUrl;
    }
}
