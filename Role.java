package com.demo;


import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	     
	    private String name;
	     
	    private String description;
}
