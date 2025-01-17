package org.KeepLearn.Spring.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Role")
public class Role {
    @Id
    private String id;

    private EmployeeRole name;

    public Role() {

    }


    public Role(EmployeeRole name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmployeeRole getName() {
        return name;
    }

    public void setName(EmployeeRole name) {
        this.name = name;
    }
}
