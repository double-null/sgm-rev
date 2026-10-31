package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$1(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$2(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$3(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.b());
        arrayList.add(t3.f.f());
        arrayList.add(com.google.firebase.platforminfo.g.b(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.g.b(FIREBASE_COMMON, BuildConfig.VERSION_NAME));
        arrayList.add(com.google.firebase.platforminfo.g.b(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.g.b(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.g.b(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.g.c(TARGET_SDK, new com.google.firebase.platforminfo.g.a() { // from class: com.google.firebase.c
            @Override // com.google.firebase.platforminfo.g.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.g.c(MIN_SDK, new com.google.firebase.platforminfo.g.a() { // from class: com.google.firebase.d
            @Override // com.google.firebase.platforminfo.g.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.g.c(ANDROID_PLATFORM, new com.google.firebase.platforminfo.g.a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.platforminfo.g.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.g.c(ANDROID_INSTALLER, new com.google.firebase.platforminfo.g.a() { // from class: com.google.firebase.f
            @Override // com.google.firebase.platforminfo.g.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
            }
        }));
        String strA = com.google.firebase.platforminfo.d.a();
        if (strA != null) {
            arrayList.add(com.google.firebase.platforminfo.g.b(KOTLIN, strA));
        }
        return arrayList;
    }
}
