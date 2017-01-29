/**
 * 
 */
package edu.fjnu.smd.mapper;

import edu.fjnu.smd.domain.Course;
import edu.fjnu.smd.domain.User;

/**
 * @author xiaoze
 *
 */
public interface UserMapper {

    User get(String userNo);

}
