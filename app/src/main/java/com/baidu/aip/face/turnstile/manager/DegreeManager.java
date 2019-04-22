package com.baidu.aip.face.turnstile.manager;

import com.baidu.aip.face.CameraImageSource;
import com.baidu.aip.face.FaceDetectManager;

public class DegreeManager {
    private static DegreeManager degreeManager;

    public static DegreeManager newInstance() {

        if (degreeManager == null) {
            synchronized (DegreeManager.class) {
                if (degreeManager == null) {
                    degreeManager = new DegreeManager();
                }
            }
        }

        return degreeManager;
    }

    public void handleDegree(FaceDetectManager faceDetectManager, CameraImageSource cameraImageSource, int faceDegree, int displayOrientation) {
        faceDetectManager.setPreviewDegree(faceDegree);
        cameraImageSource.getCameraControl().setDisplayOrientation(displayOrientation);
    }
}
