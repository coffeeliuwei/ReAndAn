package com.coffee.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.coffee.annotation.Example;
import com.coffee.annotation.FieldInfo;
import com.coffee.annotation.TableInfo;

@TableInfo(name="student")
public class Student
{
	public Integer id;   
	public String name;
	public Boolean sex;//null
	public String phone;
	
	//@Example(name="liuwei")
	@FieldInfo(format = "yyyy年MM月dd日")
	public Date birthday;
	//Timestamp
	
	
	public  Student() {
		
	}
	public Student(int id, String name, boolean sex, String phone)
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
	}
	
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Boolean getSex()
	{
		return sex;
	}
	public void setSex(Boolean sex)
	{
		this.sex = sex;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", phone=" + phone + ", birthday=" + birthday + "]";
	}
	

	
}
