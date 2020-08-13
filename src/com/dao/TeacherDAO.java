package com.dao;

import org.hibernate.mapping.List;

import com.model.Teacher;

public interface TeacherDAO {
	
	public Teacher createTeacher(Teacher teacher);
    public Teacher getTeacherById(int teacherId);
    public List<Teacher> getAllTeachers();
    public Teacher updateTeacher(Teacher teacher);
    public void deleteTeacher(int teacherId);

}
