package com.qureshi.demoSpring7;

public class Mobile {

	private Snapdragon snapdragon;
	private Mediatek mediatek;
	
	public Snapdragon getSnapdragon() {
		return snapdragon;
	}
	public void setSnapdragon(Snapdragon snapdragon) {
		this.snapdragon = snapdragon;
	}
	public Mediatek getMediatek() {
		return mediatek;
	}
	public void setMediatek(Mediatek mediatek) {
		this.mediatek = mediatek;
	}
	@Override
	public String toString() {
		return "Mobile [snapdragon=" + snapdragon + ", mediatek=" + mediatek + "]";
	}

}
