package entity;

import enums.DayEnum;
import enums.PeriodEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private Integer id;
    private String subjectName;
    private DayEnum subjectDay;
    private PeriodEnum subjectPeriod;
    private Date createTime;
    private Date modifyTime;
    private Integer teacherId;

    public Subject() {
    }

    public Subject(Integer id, String subjectName, String day, String period) {
        this.id = id;
        this.subjectName = subjectName;
        if (day != null) {
            try {
                subjectDay = DayEnum.valueOf(day.toUpperCase());
            } catch (Exception ex) {
                subjectDay = DayEnum.UNKNOWN;
            }
        }
        if (period != null) {
            try {
                subjectPeriod = PeriodEnum.valueOf(period.toUpperCase());
            } catch (Exception ex) {
                subjectPeriod = PeriodEnum.UNKNOWN;
            }
        }
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

    public DayEnum getSubjectDay() {
        return subjectDay;
    }

    public void setSubjectDay(String day) {
        if (day != null) {
            try {
                subjectDay = DayEnum.valueOf(day.toUpperCase());
            } catch (Exception ex) {
                subjectDay = DayEnum.UNKNOWN;
            }
        }
    }

    public PeriodEnum getSubjectPeriod() {
        return subjectPeriod;
    }

    public void setSubjectPeriod(String period) {
        if (period != null) {
            try {
                subjectPeriod = PeriodEnum.valueOf(period.toUpperCase());
            } catch (Exception ex) {
                subjectPeriod = PeriodEnum.UNKNOWN;
            }
        }
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", subjectDay=" + subjectDay +
                ", subjectPeriod=" + subjectPeriod +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", teacherId=" + teacherId +
                '}';
    }
}