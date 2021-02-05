package com.qureshi.demoSpring3;

public class Hostel {
	private String blockNum;
	private String blockName;
	public Hostel(String blockNum, String blockName) {
		super();
		this.blockNum = blockNum;
		this.blockName = blockName;
	}
	public String getBlockNum() {
		return blockNum;
	}
	public void setBlockNum(String blockNum) {
		this.blockNum = blockNum;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	@Override
	public String toString() {
		return "Hostel [blockNum=" + blockNum + ", blockName=" + blockName + "]";
	}	

}
