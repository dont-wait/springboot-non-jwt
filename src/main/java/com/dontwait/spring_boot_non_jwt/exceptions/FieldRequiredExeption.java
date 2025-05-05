package com.dontwait.spring_boot_non_jwt.exceptions;

public class FieldRequiredExeption extends RuntimeException{
	public FieldRequiredExeption(String s) {
		super(s);
	}
}
