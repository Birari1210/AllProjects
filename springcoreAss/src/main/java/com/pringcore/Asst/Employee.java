package com.pringcore.Asst;

public class Employee 
{
  private DepartmentBean departmentBean;
   
  private String fullName; 
  public DepartmentBean getDepartmentBean() {
    return departmentBean;
  }
  public void setDepartmentBean(DepartmentBean departmentBean) {
    this.departmentBean = departmentBean;
  }
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
}