package io.williamwu.springdb.serviceschool.dao;

import entity.Subject;

import java.util.List;

public interface SubjectMapper {

    List<Subject> getAll();

    List<Subject> get(Subject subject);

    int insert(Subject subject);

    int update(Subject subject);

    int delete(Subject subject);

    int updateTeacherId(Subject subject);

}