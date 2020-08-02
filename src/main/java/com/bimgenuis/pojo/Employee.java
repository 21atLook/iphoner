package com.bimgenuis.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@NoArgsConstructor
@Data
@Table(name = "employee")
public class Employee {

    @Id
    private Integer id;

    private String name;

    private String login;

    private Integer login_id;

    private String login_name;

    private String email;
    private String phone;
    private String wechat;
    private String qq;
    private String position;
    private String position_name;
    private String sculpture;
    private String professionalDirection;
    private Boolean isPublic;






}
