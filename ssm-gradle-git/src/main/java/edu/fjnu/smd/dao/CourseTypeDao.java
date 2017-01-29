/**
 * 
 */
package edu.fjnu.smd.dao;

import java.util.List;

import edu.fjnu.smd.domain.CourseType;

/**
 * @author xiaoze
 *
 */
public interface CourseTypeDao {
	
	void addCourseType(CourseType courseType);
	
	List<CourseType> loadAll();
	
	List<CourseType> loadPage(int pageindex,int rows);
	
	CourseType getCourseTypeById(Integer typeId);
	
	void removeCourseType(Integer typeId);
	
	void updateCourseType(CourseType courseType);
	
	int getpages(int rows);

}
