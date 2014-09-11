package com.nightscout.android.dexcom;

import android.content.Intent;

public class TransmitterRawData {

	public int Id;
	public int RawValue;
    public int FilteredValue;
    public int BatteryLife = 999;
    public int UploaderBatteryLife;
	public double Slope;
	public double Intercept;
	public double Decay;
	public double Scale;

    public void setUploaderBatteryLife(int uploaderBatteryLife) {
		UploaderBatteryLife = uploaderBatteryLife;
	}
	public int ReceivedSignalStrength;
    public long CaptureDateTime;
    
    public String DisplayDateTime;
    public String TransmitterId = "62EK4";
    
 
    
    public int getRawValue() {
		return RawValue;
	}
	public void setRawValue(int rawValue) {
		RawValue = rawValue;
	}
	public int getFilteredValue() {
		return FilteredValue;
	}
	public void setFilteredValue(int filteredValue) {
		FilteredValue = filteredValue;
	}
	public int getReceivedSignalStrength() {
		return ReceivedSignalStrength;
	}
	public void setReceivedSignalStrength(int receivedSignalStrength) {
		ReceivedSignalStrength = receivedSignalStrength;
	}
	public long getCaptureDateTime() {
		return CaptureDateTime;
	}
	public void setCaptureDateTime(long captureDateTime) {
		CaptureDateTime = captureDateTime;
		
	}
	public void setDisplayDateTime(String dateTime) {
		DisplayDateTime = dateTime;
		
	}



}
