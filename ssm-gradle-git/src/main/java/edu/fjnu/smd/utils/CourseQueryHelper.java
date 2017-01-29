/**
 * 
 */
package edu.fjnu.smd.utils;

/**
 * 
 * 课程信息综合查询 助手类
 * @author xiaoze
 *
 */
public class CourseQueryHelper {
	
	private String qryCourseName;
	private Double qryStartPoint; //查询学分的开始范围
	private Double qryEndPoint;   //查询学分的结束范围
	private String qryCourseType;
	
	public String getQryCourseName() {
		return qryCourseName;
	}
	public void setQryCourseName(String qryCourseName) {
		this.qryCourseName = qryCourseName;
	}
	public Double getQryStartPoint() {
		return qryStartPoint;
	}
	public void setQryStartPoint(Double qryStartPoint) {
		this.qryStartPoint = qryStartPoint;
	}
	public Double getQryEndPoint() {
		return qryEndPoint;
	}
	public void setQryEndPoint(Double qryEndPoint) {
		this.qryEndPoint = qryEndPoint;
	}
	public String getQryCourseType() {
		return qryCourseType;
	}
	public void setQryCourseType(String qryCourseType) {
		this.qryCourseType = qryCourseType;
	}
	
	

}
