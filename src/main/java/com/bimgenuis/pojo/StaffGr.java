package com.bimgenuis.pojo;

import javax.persistence.Table;

@Table(name="employee_management")
public class StaffGr {
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    Long groupId;

    String name;

    public String getGroupScope() {
        return groupScope;
    }

    public void setGroupScope(String groupScope) {
        this.groupScope = groupScope;
    }

    String groupScope;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    private Long projectId;

}
