/**
 * 
 */
package edu.fjnu.smd.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.fjnu.smd.dao.CourseDao;
import edu.fjnu.smd.domain.Course;
import edu.fjnu.smd.service.CourseService;
import edu.fjnu.smd.utils.CourseQueryHelper;

/**
 * @author xiaoze
 *
 */
@Transactional
@Service("courseService")
public class CourseServiceJDBCImpl implements CourseService {

	@Autowired
	private CourseDao courseDao ;
	
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void addCourse(Course course) {

		courseDao.addCourse(course);


	}

	@Override
	public boolean removeCourseByNo(String courseNo) {

		courseDao.removeCourseByNo(courseNo) ;
		return true;
	
	}
	@Override
	public List<Course> loadAll() {

		return courseDao.loadAll();

	}

	@Override
	public Course loadCourseByNo(String courseNo) {

		List<Course> courseList=new ArrayList<Course>();
		int num=0;
		int t=1;
		
		num=courseDao.cntCoursesByHelper(new CourseQueryHelper());
		if(num!=0){
			courseList=courseDao.loadAll();
			for(Course course:courseList){
				if(courseNo.equals(course.getCourseNo()))
					t=2;
			}
		}
		if(t!=2)
			return null;
		
		return courseDao.loadCourseByNo(courseNo);


	}

	@Override
	public void updateCourse(Course course) {

		courseDao.updateCourse(course);

	}

	@Override
	public List<Course> loadCourses(CourseQueryHelper helper) {


		return courseDao.loadCourses(helper);

	}

	@Override
	public int cntCoursesByHelper(CourseQueryHelper helper) {
	
		return courseDao.cntCoursesByHelper(helper);
	}

	@Override
	public List<Course> loadScopedCourses(CourseQueryHelper helper,
			int startIdx, int fetchSize) {

		return courseDao.loadScopedCourses(helper, startIdx, fetchSize);

	}

	
	@Override
	public byte[] getTextbookPic(String courseNo) {



		return courseDao.getTextbookPic(courseNo);

	}

}