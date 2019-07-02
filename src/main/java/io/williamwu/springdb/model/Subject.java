package io.williamwu.springdb.model;

import io.williamwu.springdb.enums.DayEnum;
import io.williamwu.springdb.enums.PeriodEnum;
import java.util.Date;

public class Subject {

    private Integer id;
    private String subjectName;
    private DayEnum classDay;
    private PeriodEnum classPeriod;
    private Date createTime;
    private Date modifyTime;
    private Integer teacherId;

    public Subject() {
    }

    public Subject(Integer id, String subjectName, DayEnum classDay, PeriodEnum classPeriod) {
        this.id = id;
        this.subjectName = subjectName;
        this.classDay = classDay;
        this.classPeriod = classPeriod;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public DayEnum getClassDay() {
        return classDay;
    }

    public void setClassDay(DayEnum classDay) {
        this.classDay = classDay;
    }

    public PeriodEnum getClassPeriod() {
        return classPeriod;
    }

    public void setClassPeriod(PeriodEnum classPeriod) {
        this.classPeriod = classPeriod;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", classDay=" + classDay +
                ", classPeriod=" + classPeriod +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", teacherId=" + teacherId +
                '}';
    }
}