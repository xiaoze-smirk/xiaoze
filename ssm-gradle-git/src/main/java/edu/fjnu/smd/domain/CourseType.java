/**
 * 
 */
package edu.fjnu.smd.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * 课程类型
 * @author xiaoze
 *
 */

@Component
public class CourseType extends ValueObject{
	
	
	private Integer typeId;
	private String  typeName;
	

	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "CourseType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}	

	
	
}
