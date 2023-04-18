/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components.mall;
import java.util.*;
/**
 *
 * @author hp
 */
public class Todo {
    Date endDate;
    Date joinDate;
    String name;
    String content;
    
    public Todo(Date joinDate, Date endDate, String name, String content) {
        super();
        this.joinDate = joinDate;
        this.endDate = endDate;
        this.content = content;
        this.name= name;
    }
    public Date getEndDate() {
	return endDate;
    }

    public void setEndDate(Date endDate) {
	this.endDate = endDate;
    }

    public Date getJoinDate() {
	return joinDate;
    }

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
    }
    
}
