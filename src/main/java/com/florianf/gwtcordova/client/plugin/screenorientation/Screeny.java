package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
public class Screeny implements ScreenI{

    public void lockOrientation(String orientation) {
        Screen.lockOrientation(orientation);
    }

    public void unlockOrientation() {
        Screen.unlockOrientation();
    }

    public String getOrientation() {
        return Screen.getOrientation().getType();
    }
}