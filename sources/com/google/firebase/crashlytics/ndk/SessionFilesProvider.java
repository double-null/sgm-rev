package com.google.firebase.crashlytics.ndk;

import e3.h0;
import java.io.File;
import z2.g;

/* JADX INFO: loaded from: classes4.dex */
class SessionFilesProvider implements g {
    private final SessionFiles sessionFiles;

    SessionFilesProvider(SessionFiles sessionFiles) {
        this.sessionFiles = sessionFiles;
    }

    @Override // z2.g
    public File getAppFile() {
        return this.sessionFiles.app;
    }

    @Override // z2.g
    public h0.a getApplicationExitInto() {
        SessionFiles.NativeCore nativeCore = this.sessionFiles.nativeCore;
        if (nativeCore != null) {
            return nativeCore.applicationExitInfo;
        }
        return null;
    }

    public File getBinaryImagesFile() {
        return this.sessionFiles.binaryImages;
    }

    @Override // z2.g
    public File getDeviceFile() {
        return this.sessionFiles.device;
    }

    @Override // z2.g
    public File getMetadataFile() {
        return this.sessionFiles.metadata;
    }

    @Override // z2.g
    public File getMinidumpFile() {
        return this.sessionFiles.nativeCore.minidump;
    }

    @Override // z2.g
    public File getOsFile() {
        return this.sessionFiles.os;
    }

    @Override // z2.g
    public File getSessionFile() {
        return this.sessionFiles.session;
    }
}
