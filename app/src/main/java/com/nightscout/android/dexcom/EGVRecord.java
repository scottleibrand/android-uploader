package com.nightscout.android.dexcom;

import java.io.Serializable;

public class EGVRecord implements Serializable {
    public String displayTime = "---";
    public String bGValue = "---";
    public String trend ="---";
    public String trendArrow = "---";
    public String unfiltered = "---";
    public String noise = "---";
    public int raw;
    public int filtered;
    public int rssi;
    public double slope;
    public double intercept;
    public double decay;
    public double scale;
    public long tcal;
    public long tnow;


    public void setNoise(String noiseMode) {
        this.noise = noiseMode;
    }

    public long captureDateTime;

    public void setCaptureDateTime(long captureTime) {
        this.captureDateTime = captureTime;
    }


    public void setUnfiltered(String unfiltered) {
        this.unfiltered = unfiltered;
    }

    private static final long serialVersionUID = 4654897646L;

    public void setDisplayTime (String input) {
        this.displayTime = input;
    }

    public void setBGValue (String input) {
        this.bGValue = input;
    }

    public void setTrend (String input) {
        this.trend = input;
    }

    public void setTrendArrow (String input) {
        this.trendArrow = input;
    }
}

