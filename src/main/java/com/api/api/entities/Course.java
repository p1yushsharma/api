

package com.api.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public  class Course {
@Id
@Column  
private long id;
@Column
private String title ;
@Column
private String description;
public Course() { }

public Course(long id, String title, String description) 
{
this.id = id;
this.title = title;
this.description = description;
}
public void setId(long id) {
this.id = id;
}
public long getId() {
return id;
}
public void setTitle(String title) {
this.title = title;
}
public String getTitle() {
return title;
}
public void setDescription(String description) {
this.description = description;
}
public String getDescription() {
return description;
} 
}  
