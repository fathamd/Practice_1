package com.qureshi.demoSpring4;

import org.springframework.stereotype.Component;

@Component
public class Hostel {
	private String blockNum;
	private String blockName;

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
